package wastewatertreatment.objects.pretreatment.screens

import equations.massbalance.MassBalance.MX
import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.math.Math.toXDecimals
import wastewatertreatment.objects.pretreatment.screens.Screens._

/**
 * Created by ka-son on 10/24/15.
 */
class ScreensSuite extends FlatSpec with Matchers {

  "Train 0" should "pass" in {
    val q = 1240973.21
    val tss = 201.55
    val vss = 161.24
    val bod5 = 232.42
    val cBOD5 = 211.29
    val bCOD = 371.87
    val bCODs = 188.70
    val bCODp = 183.17
    val nh3n = 30.20
    val tp = 5.59
    val p = 250118150.48

    val qe = q
    qe shouldBe q

    val tsse = calMX(List(MX(Some(q), Some(tss), None)),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(tsse) shouldBe 201.55

    val vsse = calVSSTSS(TSS = Some(tsse))
    toXDecimals(vsse.getOrElse(0.0)) shouldBe 161.24

    val bod5e = calMX(List(MX(Some(q), Some(bod5), None)),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(bod5e) shouldBe 232.42

    val cBOD5e = calcBOD5BOD5(BOD5 = Some(bod5e))
    toXDecimals(cBOD5e.getOrElse(0.0)) shouldBe 211.29

    val bCODe = calbCODBOD5(BOD5 = Some(bod5e))
    toXDecimals(bCODe.getOrElse(0.0)) shouldBe 371.87

    val bCODpe = calbCODpVSS(VSS = vsse)
    toXDecimals(bCODpe.getOrElse(0.0)) shouldBe 183.17

    val bCODse = calbCODsbCODpbCOD(bCOD = bCODe, bCODp = bCODpe)
    toXDecimals(bCODse.getOrElse(0.0)) shouldBe 188.70

    val nh3ne = calMX(List(MX(Some(q), Some(nh3n))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(nh3ne) shouldBe 30.20

    val tpe = calMX(List(MX(Some(q), Some(tp))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(tpe) shouldBe 5.59

    val pe = calPQTSS(Q = Some(qe), TSS = Some(tsse))
    toXDecimals(pe.getOrElse(0.0)) shouldBe 250118150.48
  }

  "Train 1" should "pass" in {
    val q = 1240973.21
    val tss = 201.55
    val vss = 161.24
    val bod5 = 232.42
    val cBOD5 = 211.29
    val bCOD = 371.92
    val bCODs = 188.75
    val bCODp = 183.17
    val nh3n = 30.20
    val tp = 5.59
    val p = 243624747.24

    val qe = q
    qe shouldBe q

    val tsse = calMX(List(MX(Some(q), Some(tss), Some(tssRemoval))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(tsse) shouldBe 147.13

    val vsse = calVSSTSS(TSS = Some(tsse))
    toXDecimals(vsse.getOrElse(0.0)) shouldBe 117.71

    val bod5e = calMX(List(MX(Some(q), Some(bod5), Some(bod5Removal))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(bod5e) shouldBe 169.67

    val cBOD5e = calcBOD5BOD5(BOD5 = Some(bod5e))
    toXDecimals(cBOD5e.getOrElse(0.0)) shouldBe 154.24

    val bCODe = calbCODBOD5(BOD5 = Some(bod5e))
    toXDecimals(bCODe.getOrElse(0.0)) shouldBe 271.47

    val bCODpe = calbCODpVSS(VSS = vsse)
    toXDecimals(bCODpe.getOrElse(0.0)) shouldBe 133.71

    val bCODse = calbCODsbCODpbCOD(bCOD = bCODe, bCODp = bCODpe)
    toXDecimals(bCODse.getOrElse(0.0)) shouldBe 137.75

    val nh3ne = calMX(List(MX(Some(q), Some(nh3n))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(nh3ne) shouldBe 30.20

    val tpe = calMX(List(MX(Some(q), Some(tp))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(tpe) shouldBe 5.59

    val pe = calPQTSS(Q = Some(qe), TSS = Some(tsse))
    toXDecimals(pe.getOrElse(0.0)) shouldBe 182586249.85
  }

  "Default removals" should "pass" in {
    val defaultRemovals = sDefaultRemovals
    defaultRemovals.tss shouldBe Some(27.00)
    defaultRemovals.bod5 shouldBe Some(27.00)
    defaultRemovals.nh3n shouldBe None
    defaultRemovals.tp shouldBe None
    defaultRemovals.fecalColiform shouldBe None
    defaultRemovals.enterococci shouldBe None
  }

}
