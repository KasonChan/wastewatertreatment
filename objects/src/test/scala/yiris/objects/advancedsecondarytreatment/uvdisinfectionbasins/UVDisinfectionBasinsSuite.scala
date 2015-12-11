package yiris.objects.advancedsecondarytreatment.uvdisinfectionbasins

import equations.massbalance.MassBalance.MX
import org.scalatest.{FlatSpec, Matchers}
import yiris.core.math.Math._
import yiris.objects.advancedsecondarytreatment.uvdisinfectionbasins.UVDisinfectionBasins._

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

    val tsse = calMX(List(MX(Some(q), Some(tss), None)),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(tsse) shouldBe tss

    val vsse = calVSSTSS(TSS = Some(tsse)).getOrElse(0.0)
    toXDecimals(vsse) shouldBe vss

    val bod5e = calMX(List(MX(Some(q), Some(bod5), None)),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(bod5e) shouldBe bod5

    val cBOD5e = calcBOD5BOD5(BOD5 = Some(bod5e)).getOrElse(0.0)
    toXDecimals(cBOD5e) shouldBe cBOD5

    val bCODe = calbCODBOD5(BOD5 = Some(bod5e)).getOrElse(0.0)
    toXDecimals(bCODe) shouldBe bCOD

    val bCODpe = calbCODpVSS(VSS = Some(vsse)).getOrElse(0.0)
    toXDecimals(bCODpe) shouldBe bCODp

    val bCODse = calbCODsbCODpbCOD(bCOD = Some(bCODe), bCODp = Some(bCODpe)).getOrElse(0.0)
    toXDecimals(bCODse) shouldBe bCODs

    val nh3ne = calMX(List(MX(Some(q), Some(nh3n))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(nh3ne) shouldBe nh3n

    val tpe = calMX(List(MX(Some(q), Some(tp))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(tpe) shouldBe tp

    val pe = calPQTSS(Q = Some(qe), TSS = Some(tsse)).getOrElse(0.0)
    toXDecimals(pe) shouldBe p

    val felcalColiforme = calMX(List(MX(Some(q), Some(fecalColiform), Some(bacterialRemovalRate))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(felcalColiforme) shouldBe 1.00

    val enterococcie = calMX(List(MX(Some(q), Some(enterococci), Some(bacterialRemovalRate))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(enterococcie) shouldBe 0.00

    val ntue = calNTUTSS(TSS = Some(tsse)).getOrElse(0.0)
    toXDecimals(ntue) shouldBe 0.47
  }

  "Default removals" should "pass" in {
    val defaultRemovals = uvdbDefaultRemovals
    defaultRemovals.tss shouldBe None
    defaultRemovals.bod5 shouldBe None
    defaultRemovals.nh3n shouldBe None
    defaultRemovals.tp shouldBe None
    defaultRemovals.fecalColiform shouldBe Some(99.99)
    defaultRemovals.enterococci shouldBe Some(99.99)
  }

}
