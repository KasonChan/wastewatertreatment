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
    val vsso = 34.13

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

    val pXBioNitrifiers = calPXBio(xANitrifiers, xANitrifiersParts)
    pXBioNitrifiers shouldBe 3350147.26

    val pXvsso = calPXvsso(q3, vsso)
    pXvsso shouldBe 8146591.2

    val pXvss = calPXvss(pXBio, pXBioNitrifiers, pXvsso)
    pXvss shouldBe 39397477.53

    // Inputs
    val count = 3
    val length = 250
    val width = 125
    val depth = 15

    calAerationTankVolumes(count, length, width, depth) shouldBe 1406250.00
  }

  "Calculation 2" should "pass" in {
    // Inputs
    val volumeOfBasins = 2740000.00
    val sO = 103.16
    val rbCOD = 0.30
    val sdnr = 0.33

    val q = 1193464.87

    // Influent
    val tsso = 42.67
    val vsso = 34.13
    val bod5o = 103.16
    val cBOD5o = 93.79
    val bCODo = 165.06
    val bCOD5o = 126.29
    val bCODpo = 38.78
    val nh3o = 25.16
    val tpo = 0.83
    val po = 50920712.22

    // Effluent
    val tsse = 2.56
    val vsse = 2.05
    val bod5e = 0.99
    val cBOD5e = 0.90
    val bCODe = 2.33
    val bCOD5e = 0.00
    val bCODpe = 2.33
    val nh3e = 0.50
    val tpe = 0.24
    val pe = 3055242.73

    val forallAnoxic = calForallAnoxic(volumeOfBasins)
    forallAnoxic shouldBe 904200.00

    val thetaC = calThetaC()
    thetaC shouldBe 6.18

    val thetaAerobic = calThetaAerobic(volumeOfBasins, forallAnoxic, q)
    thetaAerobic shouldBe 1.54

    val xB = calXb(q, volumeOfBasins, thetaC, So = sO)
    xB shouldBe 63.16

    val fmRatio = calFMRatio(q, sO, forallAnoxic, xB)
    fmRatio shouldBe 2.16

    val xAHeterotrophs = calXaHeterotrophs(q, BOD5o = bod5o, BOD5e = bod5e, ThetaC = thetaC)
    xAHeterotrophs shouldBe 2.80055824E7

    val xAHeterotrophsParts = calXaHeterotrophsParts(thetaC, Xa = xAHeterotrophs)
    xAHeterotrophsParts shouldBe 2076893.99

    val pXBioHeterotrophs = calPXBio(xAHeterotrophs, xAHeterotrophsParts)
    pXBioHeterotrophs shouldBe 30082476.39

    val no3n = calNO3N(XaHeterotrophs = xAHeterotrophs, XaPartsHeterotrophs = xAHeterotrophsParts, Q = q)
    no3n shouldBe 41.48

    val qW = calQw(volumeOfBasins, ThetaC = thetaC, Q = q)
    qW shouldBe 164976.53

    val qR = calQr(q, qW)
    qR shouldBe 450059.50

    val r = calR(qR, q)
    r shouldBe 0.38

    val iR = calIR(no3n, R = r)
    iR shouldBe 5.53

    val noR = calNOr(q, iR, r, noXE)
    noR shouldBe 1175562.9

    val no3Removed = calNO3Removed(forallAnoxic, xB, sdnr)
    no3Removed shouldBe 18846059.76

    val xANitrifiers = calXaNitrifiers(q, NO3N = no3n, ThetaC = thetaC)
    xANitrifiers shouldBe 3975234.70

    val xANitrifiersParts = calXaNitrifiersParts(thetaC, Xa = xANitrifiers)
    xANitrifiersParts shouldBe 196535.60

    val pXBioNitrifiers = calPXBio(xANitrifiers, xANitrifiersParts)
    pXBioNitrifiers shouldBe 4171770.3

    val pXvsso = calPXvsso(q, vsso)
    pXvsso shouldBe 8146591.2

    val pXvss = calPXvss(pXBioHeterotrophs, pXBioNitrifiers, pXvsso)
    pXvss shouldBe 42400837.89

    // Inputs
    val count = 4
    val length = 250
    val width = 54.83
    val depth = 15

    calAerationTankVolumes(count, length, width, depth) shouldBe 822450.00
  }

}
