package wastewatertreatment.objects.pretreatment.screens

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.pretreatment.screens.Screens._

/**
 * Created by ka-son on 10/24/15.
 */
class ScreensSuite extends FlatSpec with Matchers {

  "Calculation 1" should "pass" in {
    // Assumed
    val tssRemoval = 27
    val bod5Removal = 27

    // Inputs
    val q = 1090195
    val tssO = 223
    val bod5O = 257.5

    // Assumptions
    val bod5cBOD5Ratio = 1.1
    val codBODRatio = 1.6
    val codVSSRatio = 1.42
    val vssTSSRatio = 0.8

    val tssE = calTSSe(tssO, tssRemoval)
    tssE shouldBe 162.79

    val bod5E = calBOD5e(bod5O, bod5Removal)
    bod5E shouldBe 187.98

    val vssE = calVSSe(tssE, vssTSSRatio)
    vssE shouldBe 130.23

    val cBOD5e = calcBOD5e(bod5E, bod5cBOD5Ratio)
    cBOD5e shouldBe 170.89

    val bCODe = calbCODe(bod5E, codBODRatio)
    bCODe shouldBe 300.77

    val bCODpe = calbCODpe(vssE, codVSSRatio, vssTSSRatio)
    bCODpe shouldBe 147.94

    val bCODs = calbCODs(bCODe, bCODpe)
    bCODs shouldBe 152.83

    val p = calP(q, vssE)
    p shouldBe 1.4197609485E8
  }

  "Calculation 2" should "pass" in {
    // Inputs
    val q = 1090195
    val tssO = 223
    val bod5O = 257.5

    val tssE = calTSSe(tssO)
    tssE shouldBe 162.79

    val bod5E = calBOD5e(bod5O)
    bod5E shouldBe 187.98

    val vssE = calVSSe(tssE)
    vssE shouldBe 130.23

    val cBOD5e = calcBOD5e(bod5E)
    cBOD5e shouldBe 170.89

    val bCODe = calbCODe(bod5E)
    bCODe shouldBe 300.77

    val bCODpe = calbCODpe(vssE)
    bCODpe shouldBe 147.94

    val bCODs = calbCODs(bCODe, bCODpe)
    bCODs shouldBe 152.83

    val p = calP(q, vssE)
    p shouldBe 1.4197609485E8
  }

}
