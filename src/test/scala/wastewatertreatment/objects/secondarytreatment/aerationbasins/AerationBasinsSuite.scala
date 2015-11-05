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

    // Inputs
    val q3 = 1193464.87
    val q4 = 912991.90
    val sdnr = 0.33

    val bod5o = 103.16
    val bod5e = 0.99

    val xAHeterotrophs = calXaHeterotrophs(q3, BOD5o = bod5o, BOD5e = bod5e, ThetaC = thetaC)
    xAHeterotrophs shouldBe 2.80055824E7

    val xAHeterotrophsParts = calXaHeterotrophsParts(thetaC, Xa = xAHeterotrophs)
    xAHeterotrophsParts shouldBe 2076893.99

    val no3n = calNO3N(XaHeterotrophs = xAHeterotrophs, XaPartsHeterotrophs = xAHeterotrophsParts, Q = q3)
    no3n shouldBe 41.48

    val qW = calQw(forallT2, ThetaC = thetaC, Q = q3)
    qW shouldBe 164976.53

    val qR = calQr(q3, qW)
    qR shouldBe 450059.5

    val r = calR(qR, q4)
    r shouldBe 0.49

    val iR = calIR(no3n, R = r)
    iR shouldBe 5.42

    val noR = calNOr(q2, iR, r, noXE)
    noR shouldBe 944037.79

    val no3Removed = calNO3Removed(forallAnoxic, xB, sdnr)
    no3Removed shouldBe 1.74755856E7

    val xANitrifiers = calXaNitrifiers(q2, NO3N = no3n, ThetaC = thetaC)
    xANitrifiers shouldBe 3192319.01

    val xANitrifiersParts = calXaNitrifiersParts(thetaC, Xa = xANitrifiers)
    xANitrifiersParts shouldBe 157828.25
  }

  "Calculation 2" should "pass" in {
    // Inputs
    val volumeOfBasins = 2740000.00

    val forallAnoxic = calForallAnoxic(volumeOfBasins)
    forallAnoxic shouldBe 904200.00
  }

}
