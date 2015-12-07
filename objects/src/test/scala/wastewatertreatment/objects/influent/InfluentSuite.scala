package wastewatertreatment.objects.influent

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.math.Math._
import wastewatertreatment.objects.influent.Influent._

/**
 * Created by kasonchan on 12/6/15.
 */
class InfluentSuite extends FlatSpec with Matchers {

  "Train N" should "pass" in {
    val q = 368
    val tss = 223
    val cBOD5 = 234.00
    val nh3n = 33
    val tp = 6
    val fecalColiform = 100000000
    val enterococci = 100000

    val qo = tom3d(368)
    toXDecimals(qo) shouldBe 1393030.88

    val tsso = 223
    toXDecimals(tsso) shouldBe 223.00

    val vsso = calVSSTSS(TSS = Some(tsso))
    toXDecimals(vsso.getOrElse(0.0)) shouldBe 178.40

    val bod5o = calcBOD5BOD5(cBOD5 = Some(cBOD5))
    toXDecimals(bod5o.getOrElse(0.0)) shouldBe 257.40

    val cBOD5o = cBOD5
    toXDecimals(cBOD5o) shouldBe 234.00

    val bCODo = calbCODBOD5(BOD5 = bod5o)
    toXDecimals(bCODo.getOrElse(0.0)) shouldBe 411.84

    val bCODpo = calbCODpVSS(VSS = vsso)
    toXDecimals(bCODpo.getOrElse(0.0)) shouldBe 202.66

    val bCODso = calbCODsbCODpbCOD(bCODp = bCODpo, bCOD = bCODo)
    toXDecimals(bCODso.getOrElse(0.0)) shouldBe 209.18

    val nh3no = nh3n
    toXDecimals(nh3no) shouldBe 33.00

    val tpo = tp
    toXDecimals(tpo) shouldBe 6.00

    val po = calPQTSS(Q = Some(qo), TSS = Some(tsso))
    toXDecimals(po.getOrElse(0.0)) shouldBe 310645886.24

    val fecalColiformo = fecalColiform
    toXDecimals(fecalColiformo) shouldBe 100000000.00

    val enterococcio = enterococci
    toXDecimals(enterococcio) shouldBe 100000.00

    val turbido = calNTUTSS(TSS = Some(tsso))
    toXDecimals(turbido.getOrElse(0.0)) shouldBe 111.50

    val effluent = Fluent(Some(qo),
      Some(tsso),
      vsso,
      bod5o,
      Some(cBOD5o),
      bCODo,
      bCODso,
      bCODpo,
      Some(nh3no),
      Some(tpo),
      po,
      Some(fecalColiformo),
      Some(enterococcio),
      turbido)
    toXDecimals(effluent.flow.getOrElse(0.0)) shouldBe 1393030.88
    toXDecimals(effluent.tss.getOrElse(0.0)) shouldBe 223.00
    toXDecimals(effluent.vss.getOrElse(0.0)) shouldBe 178.4
    toXDecimals(effluent.bod5.getOrElse(0.0)) shouldBe 257.40
    toXDecimals(effluent.cBOD5.getOrElse(0.0)) shouldBe 234.0
    toXDecimals(effluent.bCOD.getOrElse(0.0)) shouldBe 411.84
    toXDecimals(effluent.bCODs.getOrElse(0.0)) shouldBe 209.18
    toXDecimals(effluent.bCODp.getOrElse(0.0)) shouldBe 202.66
    toXDecimals(effluent.nh3n.getOrElse(0.0)) shouldBe 33.0
    toXDecimals(effluent.tp.getOrElse(0.0)) shouldBe 6.0
    toXDecimals(effluent.p.getOrElse(0.0)) shouldBe 310645886.24
    toXDecimals(effluent.fecalColiform.getOrElse(0.0)) shouldBe 100000000.00
    toXDecimals(effluent.enterococci.getOrElse(0.0)) shouldBe 100000.00
    toXDecimals(effluent.turbidity.getOrElse(0.0)) shouldBe 111.50
  }

}
