package wastewatertreatment.objects.pretreatment.primaryclarifiers

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.math.Math._
import wastewatertreatment.objects.pretreatment.primaryclarifiers.PrimaryClarifiers._

/**
 * Created by kasonchan on 11/17/15.
 */
class PrimaryClarifiersSuite extends FlatSpec with Matchers {

  "tssRemoval" should "= 63.00" in {
    tssRemoval shouldBe 63.00
  }

  "bodRemoval" should "= 35.00" in {
    bodRemoval shouldBe 35.00
  }

  "tss" should "= 40000.00" in {
    tss shouldBe 40000.00
  }

  "phosphorusRemoval" should "= 0.00" in {
    phosphorusRemoval shouldBe 0.00
  }

  "Train 0" should "pass" in {
    val q = 668063.99
    val tss = 122.99
    val vss = 98.39
    val bod5 = 141.82
    val cBOD5 = 128.93
    val bCOD = 226.91
    val bCODs = 115.14
    val bCODp = 111.77
    val nh3n = 25.24
    val tp = 4.67
    val p = 82165190.13

    val qe = q
    qe shouldBe q

    val tsse = solve(List(MX(Some(q), Some(tss), None)),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(tsse) shouldBe 122.99

    val vsse = calVSS(tsse)
    toXDecimals(vsse) shouldBe 98.39

    val bod5e = solve(List(MX(Some(q), Some(bod5), None)),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(bod5e) shouldBe 141.82

    val cBOD5e = calcBOD5(bod5e)
    toXDecimals(cBOD5e) shouldBe 128.93

    val bCODe = calbCOD(bod5e)
    toXDecimals(bCODe) shouldBe 226.91

    val bCODpe = calbCODp(vsse)
    toXDecimals(bCODpe) shouldBe 111.77

    val bCODse = calbCODs(bCODe, bCODpe)
    toXDecimals(bCODse) shouldBe 115.14

    val nh3ne = solve(List(MX(Some(q), Some(nh3n))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(nh3ne) shouldBe 25.24

    val tpe = solve(List(MX(Some(q), Some(tp))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(tpe) shouldBe 4.67

    val pe = calP(qe, tsse)
    toXDecimals(pe) shouldBe 82165190.13
  }

  "Train 1" should "pass" in {
    val q = 668063.99
    val tss = 122.99
    val vss = 98.392
    val bod5 = 141.82
    val cBOD5 = 128.93
    val bCOD = 226.912
    val bCODs = 115.14
    val bCODp = 111.77
    val nh3n = 25.24
    val tp = 4.67
    val p = 82165190.13

    val qe = q
    qe shouldBe q

    val tsse = solve(List(MX(Some(q), Some(tss), Some(tssRemoval))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(tsse) shouldBe 45.51

    val vsse = calVSS(tsse)
    toXDecimals(vsse) shouldBe 36.41

    val bod5e = solve(List(MX(Some(q), Some(bod5), Some(bodRemoval))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(bod5e) shouldBe 92.18

    val cBOD5e = calcBOD5(bod5e)
    toXDecimals(cBOD5e) shouldBe 83.8

    val bCODe = calbCOD(bod5e)
    toXDecimals(bCODe) shouldBe 147.49

    val bCODpe = calbCODp(vsse)
    toXDecimals(bCODpe) shouldBe 41.36

    val bCODse = calbCODs(bCODe, bCODpe)
    toXDecimals(bCODse) shouldBe 106.14

    val nh3ne = solve(List(MX(Some(q), Some(nh3n))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(nh3ne) shouldBe 25.24

    val tpe = solve(List(MX(Some(q), Some(tp))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(tpe) shouldBe 4.67

    val pe = calP(qe, tsse)
    toXDecimals(pe) shouldBe 30401120.35
  }

}
