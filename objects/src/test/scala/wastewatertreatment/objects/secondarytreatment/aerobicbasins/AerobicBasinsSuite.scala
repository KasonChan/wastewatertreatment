package wastewatertreatment.objects.secondarytreatment.aerobicbasins

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

    val tsse = solve(List(MX(Some(q), Some(tss), Some(tssRemoval))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(tsse) shouldBe 3.60

    val vsse = calVSS(tsse)
    toXDecimals(vsse) shouldBe 2.88

    val bod5e = solve(List(MX(Some(q), Some(bod5), Some(bodRemoval))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(bod5e) shouldBe 3.56

    val cBOD5e = calcBOD5(bod5e)
    toXDecimals(cBOD5e) shouldBe 3.24

    val bCODe = calbCOD(bod5e)
    toXDecimals(bCODe) shouldBe 5.70

    val bCODpe = calbCODp(vsse)
    toXDecimals(bCODpe) shouldBe 3.27

    val bCODse = calbCODs(bCODe, bCODpe)
    toXDecimals(bCODse) shouldBe 2.42

    val nh3ne = solve(List(MX(Some(q), Some(nh3n))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(nh3ne) shouldBe 25.24

    val tpe = solve(List(MX(Some(q), Some(tp))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(tpe) shouldBe 4.65

    val pe = calP(qe, tsse)
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

}
