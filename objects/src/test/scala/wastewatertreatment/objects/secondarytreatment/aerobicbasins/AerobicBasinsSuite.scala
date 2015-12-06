package wastewatertreatment.objects.secondarytreatment.aerobicbasins

import equations.massbalance.MassBalance.MX
import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.math.Math._
import wastewatertreatment.objects.secondarytreatment.aerobicbasins.AerobicBasins._


/**
 * Created by ka-son on 11/22/15.
 */
class AerobicBasinsSuite extends FlatSpec with Matchers {

  "Train 0" should "pass" in {
    val thetaC = calThetaC()
    toXDecimals(thetaC) shouldBe 9.21

    val volumeOfBasins = 2228700

    val q = 571269.64
    val tss = 72
    val vss = 57.6
    val bod5 = 118.66
    val cBOD5 = 107.87
    val bCOD = 189.86
    val bCODs = 124.42
    val bCODp = 65.44
    val nh3n = 25.24
    val tp = 4.65
    val p = 7258686.11

    val qe = q
    qe shouldBe q

    val tsse = calMX(List(MX(Some(q), Some(tss), Some(tssRemoval))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(tsse) shouldBe 3.60

    val vsse = calVSSTSS(TSS = Some(tsse))
    toXDecimals(vsse) shouldBe 2.88

    val bod5e = calMX(List(MX(Some(q), Some(bod5), Some(bod5Removal))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(bod5e) shouldBe 3.56

    val cBOD5e = calcBOD5BOD5(BOD5 = Some(bod5e))
    toXDecimals(cBOD5e) shouldBe 3.24

    val bCODe = calbCODBOD5(BOD5 = Some(bod5e))
    toXDecimals(bCODe) shouldBe 5.70

    val bCODpe = calbCODpVSS(VSS = Some(vsse))
    toXDecimals(bCODpe) shouldBe 3.27

    val bCODse = calbCODsbCODpbCOD(bCOD = Some(bCODe), bCODp = Some(bCODpe))
    toXDecimals(bCODse) shouldBe 2.42

    val nh3ne = calMX(List(MX(Some(q), Some(nh3n))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(nh3ne) shouldBe 25.24

    val tpe = calMX(List(MX(Some(q), Some(tp))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(tpe) shouldBe 4.65

    val pe = calPQTSS(Q = Some(qe), TSS = Some(tsse))
    toXDecimals(pe) shouldBe 2056570.7


    val xA = calXaHeterotrophs(q, BOD5o = bod5, BOD5e = bod5e, ThetaC = thetaC)
    toXDecimals(xA) shouldBe 12493117.47

    val xAParts = calXaHeterotrophsParts(thetaC, Xa = xA)
    toXDecimals(xAParts) shouldBe 1380818.25

    val pxBio = calPXBio(xA, xAParts)
    toXDecimals(pxBio) shouldBe 13873935.71

    val pXVSSo = calPXvsso(q, vss)
    toXDecimals(pXVSSo) shouldBe 6581026.25

    val pXVSS = calPXvss(pxBio, pXVSSo)
    toXDecimals(pXVSS) shouldBe 20454961.96

    val qw = calQw(volumeOfBasins, ThetaC = thetaC, Q = q)
    toXDecimals(qw) shouldBe 90138.51

    val qr = calQr(q, qw)
    toXDecimals(qr) shouldBe 197577.90
  }

  "Default removals" should "pass" in {
    val defaultRemovals = abDefaultRemovals
    defaultRemovals.tss shouldBe Some(95.00)
    defaultRemovals.bod5 shouldBe Some(97.00)
    defaultRemovals.nh3n shouldBe Some(97.00)
    defaultRemovals.tp shouldBe None
    defaultRemovals.fecalColiform shouldBe None
    defaultRemovals.enterococci shouldBe None
  }

}
