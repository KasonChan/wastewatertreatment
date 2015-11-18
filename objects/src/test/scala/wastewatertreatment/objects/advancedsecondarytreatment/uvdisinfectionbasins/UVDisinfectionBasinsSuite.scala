package wastewatertreatment.objects.advancedsecondarytreatment.uvdisinfectionbasins

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.math.Math._
import wastewatertreatment.objects.advancedsecondarytreatment.uvdisinfectionbasins.UVDisinfectionBasins._

/**
 * Created by kasonchan on 11/17/15.
 */
class UVDisinfectionBasinsSuite extends FlatSpec with Matchers {

  "bacterialRemovalRate" should "= 99.99" in {
    bacterialRemovalRate shouldBe 99.99
  }

  "ntuTSSRatio" should "= 0.50" in {
    ntuTSSRatio shouldBe 0.50
  }

  "Train 0" should "pass" in {
    val q = 37854.00
    val tss = 0.94
    val vss = 0.75
    val bod5 = 2.26
    val cBOD5 = 2.05
    val bCOD = 3.62
    val bCODs = 2.76
    val bCODp = 0.85
    val nh3n = 0.98
    val tp = 0.28
    val p = 35582.76
    val fecalColiform = 10000.00
    val enterococci = 10.00

    val qe = q
    qe shouldBe q

    val tsse = solve(List(MX(Some(q), Some(tss), None)),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(tsse) shouldBe tss

    val vsse = calVSS(tsse)
    toXDecimals(vsse) shouldBe vss

    val bod5e = solve(List(MX(Some(q), Some(bod5), None)),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(bod5e) shouldBe bod5

    val cBOD5e = calcBOD5(bod5e)
    toXDecimals(cBOD5e) shouldBe cBOD5

    val bCODe = calbCOD(bod5e)
    toXDecimals(bCODe) shouldBe bCOD

    val bCODpe = calbCODp(vsse)
    toXDecimals(bCODpe) shouldBe bCODp

    val bCODse = calbCODs(bCODe, bCODpe)
    toXDecimals(bCODse) shouldBe bCODs

    val nh3ne = solve(List(MX(Some(q), Some(nh3n))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(nh3ne) shouldBe nh3n

    val tpe = solve(List(MX(Some(q), Some(tp))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(tpe) shouldBe tp

    val pe = calP(qe, tsse)
    toXDecimals(pe) shouldBe p

    val felcalColiforme = solve(List(MX(Some(q), Some(fecalColiform), Some(bacterialRemovalRate))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(felcalColiforme) shouldBe 1.00

    val enterococcie = solve(List(MX(Some(q), Some(enterococci), Some(bacterialRemovalRate))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(enterococcie) shouldBe 0.00

    val ntue = calNTU(tsse)
    toXDecimals(ntue) shouldBe 0.47
  }

}
