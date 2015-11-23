package wastewatertreatment.objects.pretreatment.screens

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

    val tsse = solve(List(MX(Some(q), Some(tss), None)),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(tsse) shouldBe 201.55

    val vsse = calVSS(tsse)
    toXDecimals(vsse) shouldBe 161.24

    val bod5e = solve(List(MX(Some(q), Some(bod5), None)),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(bod5e) shouldBe 232.42

    val cBOD5e = calcBOD5(bod5e)
    toXDecimals(cBOD5e) shouldBe 211.29

    val bCODe = calbCOD(bod5e)
    toXDecimals(bCODe) shouldBe 371.87

    val bCODpe = calbCODp(vsse)
    toXDecimals(bCODpe) shouldBe 183.17

    val bCODse = calbCODs(bCODe, bCODpe)
    toXDecimals(bCODse) shouldBe 188.70

    val nh3ne = solve(List(MX(Some(q), Some(nh3n))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(nh3ne) shouldBe 30.20

    val tpe = solve(List(MX(Some(q), Some(tp))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(tpe) shouldBe 5.59

    val pe = calP(qe, tsse)
    toXDecimals(pe) shouldBe 250118150.48
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

  "Train S" should "pass" in {
    // Assumptions
    val q = 628376.40
    val tss = 223
    val vss = 178.40
    val bod5 = 234
    val tn = 40.00

    val tss3 = 40000
    val codBODRatio = 1.6
    val solidRemoval = 0.63
    val codVSSRatio = 1.42
    val vssTSSRatio = 0.80

    val cBOD5 = 75
    val bCOD = calbCOD(bod5, codBODRatio)
    val bCODp = calbCODp(VSS = vss, codVSSRatio = codVSSRatio, bVSS = vssTSSRatio)
    val bCODs = calbCODs(bCOD, bCODp)
    val p = calP(q, tss)

    // Line 1
    val qo = q
    toXDecimals(qo) shouldBe 628376.40

    val tsso = tss
    toXDecimals(tsso) shouldBe 223.00

    val vsso = vss
    toXDecimals(vsso) shouldBe 178.40

    val bod5o = bod5
    toXDecimals(bod5) shouldBe 234.00

    val bCODo = bCOD
    toXDecimals(bCODo) shouldBe 374.40

    val bCODpo = bCODp
    toXDecimals(bCODpo) shouldBe 202.66

    val bCODso = bCODs
    toXDecimals(bCODso) shouldBe 171.74

    val tno = tn
    toXDecimals(tno) shouldBe 40.00

    val po = p
    toXDecimals(po) shouldBe 140127937.20

    // Line 2
    val pe2 = calXPercentage(po, 43)
    toXDecimals(pe2) shouldBe 60255013.00

    // Line 3
    val pe3 = po - pe2
    toXDecimals(pe3) shouldBe 79872924.20
  }

}
