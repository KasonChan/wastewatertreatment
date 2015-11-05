package wastewatertreatment.objects.secondarytreatment.aerationbasins

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.secondarytreatment.aerationbasins.AerationBasins._

/**
 * Created by ka-son on 10/31/15.
 */
class AerationBasinsSuite extends FlatSpec with Matchers {

  "Calculation 1" should "pass" in {
    // Inputs
    val forallT = 423819
    val qPeak = 1393027
    val bod = 103
    val q = 242981

    val theta = calTheta(forallT, qPeak)
    theta shouldBe 0.30

    val bodLoading = calBODLoading(bod, q)
    bodLoading shouldBe 25027.04

    // Inputs
    val forallT2 = 2740000
    val forallAnoxic = 904000
    val q2 = 958414
    val s = 119

    val thetaAerobic = calThetaAerobic(forallT2, forallAnoxic, q2)
    thetaAerobic shouldBe 1.92

    val thetaC = calThetaC()
    thetaC shouldBe 6.18

    val xActiveMass = calXActiveBiomass(q2, S = s, ThetaC = thetaC)
    xActiveMass shouldBe 2.597447221E7

    val xAppPiecesAndParts = calXAppPiecesAndParts(thetaC, Xa = xActiveMass)
    xAppPiecesAndParts shouldBe 1926266.86

    val pXBio = calPXBio(xActiveMass, xAppPiecesAndParts)
    pXBio shouldBe 2.790073907E7

    val xB = calXb(q2, forallT2, thetaC, So = s)
    xB shouldBe 58.58

    val fmRatio = calFMRatio(q2, s, forallAnoxic, xB)
    fmRatio shouldBe 2.15

    val noR = calNOr(q2, 5.42, 0.49, noXE)
    noR shouldBe 944037.79
  }

}
