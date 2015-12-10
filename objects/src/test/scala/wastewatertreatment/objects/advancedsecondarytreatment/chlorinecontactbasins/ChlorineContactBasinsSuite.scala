package wastewatertreatment.objects.advancedsecondarytreatment.chlorinecontactbasins

import equations.massbalance.MassBalance.{MX, solveMX}
import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.core.math.Math._
import wastewatertreatment.objects.advancedsecondarytreatment.chlorinecontactbasins.ChlorineContactBasins._

/**
 * Created by kasonchan on 11/16/15.
 */
class ChlorineContactBasinsSuite extends FlatSpec with Matchers {

  "Train 1" should "pass" in {
    val q = 406744.47
    val tss = 0.15
    val vss = 0.12
    val bod5 = 0.27
    val cBOD5 = 0.25
    val bCOD = 0.43
    val bCODs = 0.30
    val bCODp = 0.14
    val nh3n = 2.78
    val tp = 0.51
    val p = 61011.67
    val fecalColiform = 28389192.31
    val enterococci = 100000

    val qe = q
    qe shouldBe q

    val tsse = calMX(List(MX(Some(q), Some(tss))), List(MX(Some(qe), None))).getOrElse(0.0)
    toXDecimals(tsse) shouldBe 0.15

    val vsse = calVSSTSS(TSS = Some(tsse)).getOrElse(0.0)
    toXDecimals(vsse) shouldBe 0.12

    val bod5e = solveMX(List(MX(Some(q), Some(bod5), None)),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(bod5e) shouldBe 0.27

    val cBOD5e = calcBOD5BOD5(BOD5 = Some(bod5e)).getOrElse(0.0)
    toXDecimals(cBOD5e) shouldBe 0.25

    val bCODe = calbCODBOD5(BOD5 = Some(bod5e)).getOrElse(0.0)
    toXDecimals(bCODe) shouldBe 0.43

    val bCODpe = calbCODpVSS(VSS = Some(vsse)).getOrElse(0.0)
    toXDecimals(bCODpe) shouldBe 0.14

    val bCODse = calbCODsbCODpbCOD(bCOD = Some(bCODe), bCODp = Some(bCODpe)).getOrElse(0.0)
    toXDecimals(bCODse) shouldBe 0.30

    val nh3ne = calMX(List(MX(Some(q), Some(nh3n))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(nh3ne) shouldBe 2.78

    val tpe = calMX(List(MX(Some(q), Some(tp))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(tpe) shouldBe 0.51

    val pe = calPQTSS(Q = Some(qe), TSS = Some(tsse))
    toXDecimals(pe.getOrElse(0.0)) shouldBe 61011.67

    val felcalColiforme = calMX(List(MX(Some(q), Some(fecalColiform), Some(bacterialRemovalRate))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(felcalColiforme) shouldBe 2838.92

    val enterococcie = calMX(List(MX(Some(q), Some(enterococci), Some(bacterialRemovalRate))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(enterococcie) shouldBe 10.00
  }

  "Default removals" should "pass" in {
    val defaultRemovals = ccbDefaultRemovals
    defaultRemovals.tss shouldBe None
    defaultRemovals.bod5 shouldBe None
    defaultRemovals.nh3n shouldBe None
    defaultRemovals.tp shouldBe None
    defaultRemovals.fecalColiform shouldBe Some(99.99)
    defaultRemovals.enterococci shouldBe Some(99.99)
  }

}
