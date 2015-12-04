package wastewatertreatment.objects.advancedsecondarytreatment.filters

import equations.massbalance.MassBalance.{MX, solveMX}
import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.math.Math._
import wastewatertreatment.objects.advancedsecondarytreatment.filters.Filters._

/**
 * Created by kasonchan on 11/16/15.
 */
class FiltersSuite extends FlatSpec with Matchers {

  "backwashRate" should "= 6.00" in {
    backwashRate shouldBe 6.00
  }

  "tssRemoval" should "= 70.00" in {
    tssRemoval shouldBe 70.00
  }

  "bod5Removal" should "= 70.00" in {
    bod5Removal shouldBe 70.00
  }

  "bacterialRemovalRate" should "= 76.00" in {
    bacterialRemovalRate shouldBe 76.00
  }

  "nh3nRemoval" should "= 21.00" in {
    nh3nRemoval shouldBe 21.00
  }

  "tpRemoval" should "= 33.00" in {
    tpRemoval shouldBe 33.00
  }

  "Train 1" should "pass" in {
    val q = 481131.12
    val tss = 0.41
    val vss = 0.33
    val bod5 = 0.75
    val cBOD5 = 0.68
    val bCOD = 0.38
    val bCODs = 0.00
    val bCODp = 0.38
    val nh3n = 2.97
    val tp = 0.64
    val p = 199613.87
    val fecalColiform = 1000000000

    val backwashRate = 6
    val area = 28925
    val time = 10
    val counts = 4

    val qeBackwash = calDailyBackwashRate(backwashRate, area = area, time = time, counts = counts)
    toXDecimals(qeBackwash) shouldBe 26278.32

    val qe = 406744.47

    val tsse = solveMX(List(MX(Some(q), Some(tss), Some(tssRemoval))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(tsse) shouldBe 0.15

    val vsse = calVSS(tsse)
    toXDecimals(vsse) shouldBe 0.12

    val bod5e = solveMX(List(MX(Some(q), Some(bod5), Some(bod5Removal))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(bod5e) shouldBe 0.27

    val cBOD5e = calcBOD5(bod5e)
    toXDecimals(cBOD5e) shouldBe 0.24

    val bCODe = calbCOD(bod5e)
    toXDecimals(bCODe) shouldBe 0.43

    val bCODpe = calbCODp(vsse)
    toXDecimals(bCODpe) shouldBe 0.13

    val bCODse = calbCODs(bCODe, bCODpe)
    toXDecimals(bCODse) shouldBe 0.29

    val nh3ne = solveMX(List(MX(Some(q), Some(nh3n), Some(nh3nRemoval))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(nh3ne) shouldBe 2.78

    val tpe = solveMX(List(MX(Some(q), Some(tp), Some(tpRemoval))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(tpe) shouldBe 0.51

    val felcalColiforme = solveMX(List(MX(Some(q), Some(fecalColiform), Some(bacterialRemovalRate))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(felcalColiforme) shouldBe 283891920.64
  }

  "Default removals" should "pass" in {
    val defaultRemovals = fDefaultRemovals
    defaultRemovals.tss shouldBe Some(70.00)
    defaultRemovals.bod5 shouldBe Some(70.00)
    defaultRemovals.nh3n shouldBe Some(21.00)
    defaultRemovals.tp shouldBe Some(33.00)
    defaultRemovals.fecalColiform shouldBe Some(76.00)
    defaultRemovals.enterococci shouldBe Some(76.00)
  }

}
