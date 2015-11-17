package wastewatertreatment.objects.pretreatment.screens

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.math.Math.toXDecimals
import wastewatertreatment.objects.pretreatment.screens.Screens._

/**
 * Created by ka-son on 10/24/15.
 */
class ScreensSuite extends FlatSpec with Matchers {

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

    val tsse = solve(List(MX(Some(q), Some(tss), Some(tssRemoval))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(tsse) shouldBe 147.13

    val vsse = calVSS(tsse)
    toXDecimals(vsse) shouldBe 117.71

    val bod5e = solve(List(MX(Some(q), Some(bod5), Some(bod5Removal))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(bod5e) shouldBe 169.67

    val cBOD5e = calcBOD5(bod5e)
    toXDecimals(cBOD5e) shouldBe 154.24

    val bCODe = calbCOD(bod5e)
    toXDecimals(bCODe) shouldBe 271.47

    val bCODpe = calbCODp(vsse)
    toXDecimals(bCODpe) shouldBe 133.71

    val bCODse = calbCODs(bCODe, bCODpe)
    toXDecimals(bCODse) shouldBe 137.75

    val nh3ne = solve(List(MX(Some(q), Some(nh3n))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(nh3ne) shouldBe 30.20

    val tpe = solve(List(MX(Some(q), Some(tp))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(tpe) shouldBe 5.59

    val pe = calP(qe, tsse)
    toXDecimals(pe) shouldBe 182586249.85
  }

}
