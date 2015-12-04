package wastewatertreatment.objects.secondarytreatment.secondaryclarifiers

import equations.massbalance.MassBalance.{MX, solveMX}
import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.math.Math._
import wastewatertreatment.objects.secondarytreatment.secondaryclarifiers.SecondaryClarifiers._

/**
 * Created by kasonchan on 11/17/15.
 */
class SecondaryClarifiersSuite extends FlatSpec with Matchers {

  "tssRemoval" should "= 45.00" in {
    tssRemoval shouldBe 45.00
  }

  "bod5Removal" should "= 25.00" in {
    bod5Removal shouldBe 25.00
  }

  "tss" should "= 8000.00" in {
    tss shouldBe 8000.00
  }

  "pVSSRatio" should "= 0.02" in {
    pVSSRatio shouldBe 0.02
  }

  "Train 0" should "pass" in {
    val q = 481131.12
    val tss = 0.41
    val vss = 0.33
    val bod5 = 0.75
    val cBOD5 = 0.68
    val bCOD = 1.2
    val bCODs = 0.83
    val bCODp = 0.37
    val nh3n = 2.97
    val tp = 0.64
    val p = 197263.76

    val qe = q
    qe shouldBe q

    val tsse = solveMX(List(MX(Some(q), Some(tss), None)),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(tsse) shouldBe 0.41

    val vsse = calVSS(tsse)
    toXDecimals(vsse) shouldBe 0.33

    val bod5e = solveMX(List(MX(Some(q), Some(bod5), None)),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(bod5e) shouldBe 0.75

    val cBOD5e = calcBOD5(bod5e)
    toXDecimals(cBOD5e) shouldBe 0.68

    val bCODe = calbCOD(bod5e)
    toXDecimals(bCODe) shouldBe 1.2

    val bCODpe = calbCODp(vsse)
    toXDecimals(bCODpe) shouldBe 0.37

    val bCODse = calbCODs(bCODe, bCODpe)
    toXDecimals(bCODse) shouldBe 0.83

    val nh3ne = solveMX(List(MX(Some(q), Some(nh3n))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(nh3ne) shouldBe 2.97

    val tpe = solveMX(List(MX(Some(q), Some(tp))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(tpe) shouldBe 0.64

    val pe = calP(qe, tsse)
    toXDecimals(pe) shouldBe 197263.76
  }

  "Train 1" should "pass" in {
    val q = 481131.12
    val tss = 0.41000000000000003
    val vss = 0.32800000000000007
    val bod5 = 0.7499999999999999
    val cBOD5 = 0.6818181818181817
    val bCOD = 1.2
    val bCODs = 0.8273919999999999
    val bCODp = 0.37260800000000005
    val nh3n = 2.97
    val tp = 0.64
    val p = 197263.7592

    val qe = q
    qe shouldBe q

    val tsse = solveMX(List(MX(Some(q), Some(tss), Some(tssRemoval))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(tsse) shouldBe 0.23

    val vsse = calVSS(tsse)
    toXDecimals(vsse) shouldBe 0.18

    val bod5e = solveMX(List(MX(Some(q), Some(bod5), Some(bod5Removal))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(bod5e) shouldBe 0.56

    val cBOD5e = calcBOD5(bod5e)
    toXDecimals(cBOD5e) shouldBe 0.51

    val bCODe = calbCOD(bod5e)
    toXDecimals(bCODe) shouldBe 0.9

    val bCODpe = calbCODp(vsse)
    toXDecimals(bCODpe) shouldBe 0.20

    val bCODse = calbCODs(bCODe, bCODpe)
    toXDecimals(bCODse) shouldBe 0.70

    val nh3ne = solveMX(List(MX(Some(q), Some(nh3n))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(nh3ne) shouldBe 2.97

    val tpe = solveMX(List(MX(Some(q), Some(tp))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(tpe) shouldBe 0.64

    val pe = calP(qe, tsse)
    toXDecimals(pe) shouldBe 108495.07
  }

  "Default removals" should "pass" in {
    val defaultRemovals = scDefaultRemovals
    defaultRemovals.tss shouldBe Some(45.00)
    defaultRemovals.bod5 shouldBe Some(25.00)
    defaultRemovals.nh3n shouldBe None
    defaultRemovals.tp shouldBe None
    defaultRemovals.fecalColiform shouldBe None
    defaultRemovals.enterococci shouldBe None
  }

}
