package wastewatertreatment.objects.secondarytreatment.aerobicanoxicbasins

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.core.math.Math._
import wastewatertreatment.objects.secondarytreatment.aerobicanoxicbasins.AerobicAnoxicBasins._

/**
 * Created by kasonchan on 11/17/15.
 */
class AerobicAnoxicBasinsSuite extends FlatSpec with Matchers {

  "bod5Removal" should "= 97.00" in {
    bod5Removal shouldBe 97.00
  }

  "tssRemoval" should "= 94.00" in {
    tssRemoval shouldBe 94.00
  }

  "nh3nRemoval" should "= 97.00" in {
    nh3nRemoval shouldBe 97.00
  }

  "forallAnoxicForallTotalRatio" should "= 0.33" in {
    forallAnoxicForallTotalRatio shouldBe 0.33
  }

  "sne" should "= 0.50" in {
    sne shouldBe 0.50
  }

  "xVSS" should "= 3000.00" in {
    xVSS shouldBe 3000.00
  }

  "seBOD" should "= 1.00" in {
    seBOD shouldBe 1.00
  }

  "kO" should "= 0.50" in {
    kO shouldBe 0.50
  }

  "dO" should "= 2.00" in {
    dO shouldBe 2.00
  }

  "fnd" should "= 0.10" in {
    fnd shouldBe 0.10
  }

  "factorOfSafety" should "= 2.00" in {
    factorOfSafety shouldBe 2.00
  }

  "tkn" should "= 45.00" in {
    tkn shouldBe 45.00
  }

  "xR" should "= 8000.00" in {
    xR shouldBe 8000.00
  }

  "xW" should "= 8000.00" in {
    xW shouldBe 8000.00
  }

  "xE" should "= 10.00" in {
    xE shouldBe 10.00
  }

  "noXE" should "= 6.00" in {
    noXE shouldBe 6.00
  }

  "hU" should "= 6.00" in {
    hU shouldBe 6.00
  }

  "hKs" should "= 20.00" in {
    hKs shouldBe 20.00
  }

  "hY" should "= 0.40" in {
    hY shouldBe 0.40
  }

  "hKd" should "= 0.12" in {
    hKd shouldBe 0.12
  }

  "nU" should "= 0.75" in {
    nU shouldBe 0.75
  }

  "nKs" should "= 0.74" in {
    nKs shouldBe 0.74
  }

  "nY" should "= 0.12" in {
    nY shouldBe 0.12
  }

  "nKd" should "= 0.08" in {
    nKd shouldBe 0.08
  }

  "Train 0" should "pass" in {
    // Inputs
    val forallT = 423819
    val qPeak = 1393027
    val bod = 103
    val q = 242981

    val theta = calTheta(forallT, qPeak)
    toXDecimals(theta) shouldBe 0.30

    val bodLoading = calBODLoading(bod, q)
    toXDecimals(bodLoading) shouldBe 25027.04

    // Inputs
    val forallT2 = 2740000
    val forallAnoxic = 904000
    val q2 = 958414
    val s = 119

    val thetaAerobic = calThetaAerobic(forallT2, forallAnoxic, q2)
    toXDecimals(thetaAerobic) shouldBe 1.92

    val thetaC = calThetaC()
    toXDecimals(thetaC) shouldBe 6.18

    val xB = calXb(q2, forallT2, thetaC, So = s)
    toXDecimals(xB) shouldBe 58.58

    val fmRatio = calFMRatio(q2, s, forallAnoxic, xB)
    toXDecimals(fmRatio) shouldBe 2.15

    // Inputs
    val q3 = 1193464.87
    val q4 = 912991.90
    val sdnr = 0.33

    val bod5o = 103.16
    val bod5e = 0.99
    val vsso = 34.13

    val xAHeterotrophs = calXaHeterotrophs(q3, BOD5o = bod5o, BOD5e = bod5e, ThetaC = thetaC)
    toXDecimals(xAHeterotrophs) shouldBe 28005582.40

    val xAHeterotrophsParts = calXaHeterotrophsParts(thetaC, Xa = xAHeterotrophs)
    toXDecimals(xAHeterotrophsParts) shouldBe 2076893.99

    val pXBio = calPXBio(xAHeterotrophs, xAHeterotrophsParts)
    toXDecimals(pXBio) shouldBe 30082476.39

    val no3n = calNO3N(XaHeterotrophs = xAHeterotrophs, XaPartsHeterotrophs = xAHeterotrophsParts, Q = q3)
    toXDecimals(no3n) shouldBe 41.48

    val qW = calQw(forallT2, ThetaC = thetaC, Q = q3)
    toXDecimals(qW) shouldBe 164976.53

    val qR = calQr(q3, qW)
    toXDecimals(qR) shouldBe 450059.5

    val r = calR(qR, q4)
    toXDecimals(r) shouldBe 0.49

    val iR = calIR(no3n, R = r)
    toXDecimals(iR) shouldBe 5.42

    val noR = calNOr(q2, iR, r, noXE)
    toXDecimals(noR) shouldBe 944037.79

    val no3Removed = calNO3Removed(forallAnoxic, xB, sdnr)
    toXDecimals(no3Removed) shouldBe 17475585.60

    val xANitrifiers = calXaNitrifiers(q2, NO3N = no3n, ThetaC = thetaC)
    toXDecimals(xANitrifiers) shouldBe 3192319.01

    val xANitrifiersParts = calXaNitrifiersParts(thetaC, Xa = xANitrifiers)
    toXDecimals(xANitrifiersParts) shouldBe 157828.25

    val pXBioNitrifiers = calPXBio(xANitrifiers, xANitrifiersParts)
    toXDecimals(pXBioNitrifiers) shouldBe 3350147.26

    val pXvsso = calPXvsso(q3, vsso)
    toXDecimals(pXvsso) shouldBe 8146591.20

    val pXvss = calPXvss(pXBio, pXBioNitrifiers, pXvsso)
    toXDecimals(pXvss) shouldBe 41579214.85

    // Inputs
    val count = 3
    val length = 250
    val width = 125
    val depth = 15

    val volume = calAerationTankVolumes(count, length, width, depth)
    toXDecimals(volume) shouldBe 1406250.00

    val bodL = calBOD(84, 166000000, 4967750)
    toXDecimals(bodL) shouldBe 301.25
  }

  "Train 1" should "pass" in {
    // Inputs
    val volumeOfBasins = 2740000.00
    val sO = 103.16
    val rbCOD = 0.30
    val sdnr = 0.33

    val q = 1193464.87

    // Fluent
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
    toXDecimals(forallAnoxic) shouldBe 904200.00

    val thetaC = calThetaC()
    toXDecimals(thetaC) shouldBe 6.18

    val thetaAerobic = calThetaAerobic(volumeOfBasins, forallAnoxic, q)
    toXDecimals(thetaAerobic) shouldBe 1.54

    val xB = calXb(q, volumeOfBasins, thetaC, So = sO)
    toXDecimals(xB) shouldBe 63.16

    val fmRatio = calFMRatio(q, sO, forallAnoxic, xB)
    toXDecimals(fmRatio) shouldBe 2.16

    val xAHeterotrophs = calXaHeterotrophs(q, BOD5o = bod5o, BOD5e = bod5e, ThetaC = thetaC)
    toXDecimals(xAHeterotrophs) shouldBe 28005582.40

    val xAHeterotrophsParts = calXaHeterotrophsParts(thetaC, Xa = xAHeterotrophs)
    toXDecimals(xAHeterotrophsParts) shouldBe 2076893.99

    val pXBioHeterotrophs = calPXBio(xAHeterotrophs, xAHeterotrophsParts)
    toXDecimals(pXBioHeterotrophs) shouldBe 30082476.39

    val no3n = calNO3N(XaHeterotrophs = xAHeterotrophs, XaPartsHeterotrophs = xAHeterotrophsParts, Q = q)
    toXDecimals(no3n) shouldBe 41.48

    val qW = calQw(volumeOfBasins, ThetaC = thetaC, Q = q)
    toXDecimals(qW) shouldBe 164976.53

    val qR = calQr(q, qW)
    toXDecimals(qR) shouldBe 450059.50

    val r = calR(qR, q)
    toXDecimals(r) shouldBe 0.38

    val iR = calIR(no3n, R = r)
    toXDecimals(iR) shouldBe 5.53

    val noR = calNOr(q, iR, r, noXE)
    toXDecimals(noR) shouldBe 1175562.9

    val no3Removed = calNO3Removed(forallAnoxic, xB, sdnr)
    toXDecimals(no3Removed) shouldBe 18846059.76

    val xANitrifiers = calXaNitrifiers(q, NO3N = no3n, ThetaC = thetaC)
    toXDecimals(xANitrifiers) shouldBe 3975234.70

    val xANitrifiersParts = calXaNitrifiersParts(thetaC, Xa = xANitrifiers)
    toXDecimals(xANitrifiersParts) shouldBe 196535.60

    val pXBioNitrifiers = calPXBio(xANitrifiers, xANitrifiersParts)
    toXDecimals(pXBioNitrifiers) shouldBe 4171770.3

    val pXvsso = calPXvsso(q, vsso)
    toXDecimals(pXvsso) shouldBe 8146591.2

    val pXvss = calPXvss(pXBioHeterotrophs, pXBioNitrifiers, pXvsso)
    toXDecimals(pXvss) shouldBe 42400837.89

    // Inputs
    val count = 4
    val length = 250
    val width = 54.83
    val depth = 15

    val volume = calAerationTankVolumes(count, length, width, depth)
    toXDecimals(volume) shouldBe 822450.00

    val bodL = calBOD(84, 166000000, 4967750)
    toXDecimals(bodL) shouldBe 301.25
  }

  "Default removals" should "pass" in {
    val defaultRemovals = aabDefaultRemovals
    defaultRemovals.tss shouldBe Some(94.00)
    defaultRemovals.bod5 shouldBe Some(97.00)
    defaultRemovals.nh3n shouldBe Some(97.00)
    defaultRemovals.tp shouldBe None
    defaultRemovals.fecalColiform shouldBe None
    defaultRemovals.enterococci shouldBe None
  }

}
