package wastewatertreatment.objects.pretreatment.primaryclarifiers

import equations.massbalance.MassBalance.MX
import equations.monooperation.MonoOperation.solveM
import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.math.Math._
import wastewatertreatment.objects.pretreatment.primaryclarifiers.PrimaryClarifiers._

/**
 * Created by kasonchan on 11/17/15.
 */
class PrimaryClarifiersSuite extends FlatSpec with Matchers {

  "tssRemoval" should "= 63.00" in {
    tssRemoval shouldBe 63.00
  }

  "bod5Removal" should "= 35.00" in {
    bod5Removal shouldBe 35.00
  }

  "tss" should "= 40000.00" in {
    tss shouldBe 40000.00
  }

  "Train 0" should "pass" in {
    val q = 668063.99
    val tss = 122.99
    val vss = 98.39
    val bod5 = 141.82
    val cBOD5 = 128.93
    val bCOD = 226.91
    val bCODs = 115.14
    val bCODp = 111.77
    val nh3n = 25.24
    val tp = 4.67
    val p = 82165190.13

    val qe = q
    qe shouldBe q

    val tsse = calMX(List(MX(Some(q), Some(tss), None)),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(tsse) shouldBe 122.99

    val vsse = calVSSTSS(TSS = Some(tsse))
    toXDecimals(vsse) shouldBe 98.39

    val bod5e = calMX(List(MX(Some(q), Some(bod5), None)),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(bod5e) shouldBe 141.82

    val cBOD5e = calcBOD5BOD5(BOD5 = Some(bod5e))
    toXDecimals(cBOD5e) shouldBe 128.93

    val bCODe = calbCODBOD5(BOD5 = Some(bod5e))
    toXDecimals(bCODe) shouldBe 226.91

    val bCODpe = calbCODpVSS(VSS = Some(vsse))
    toXDecimals(bCODpe) shouldBe 111.77

    val bCODse = calbCODsbCODpbCOD(bCOD = Some(bCODe), bCODp = Some(bCODpe))
    toXDecimals(bCODse) shouldBe 115.14

    val nh3ne = calMX(List(MX(Some(q), Some(nh3n))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(nh3ne) shouldBe 25.24

    val tpe = calMX(List(MX(Some(q), Some(tp))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(tpe) shouldBe 4.67

    val pe = calPQTSS(Q = Some(qe), TSS = Some(tsse))
    toXDecimals(pe) shouldBe 82165190.13
  }

  "Train 1" should "pass" in {
    val q = 668063.99
    val tss = 122.99
    val vss = 98.392
    val bod5 = 141.82
    val cBOD5 = 128.93
    val bCOD = 226.912
    val bCODs = 115.14
    val bCODp = 111.77
    val nh3n = 25.24
    val tp = 4.67
    val p = 82165190.13

    val qe = q
    qe shouldBe q

    val tsse = calMX(List(MX(Some(q), Some(tss), Some(tssRemoval))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(tsse) shouldBe 45.51

    val vsse = calVSSTSS(TSS = Some(tsse))
    toXDecimals(vsse) shouldBe 36.41

    val bod5e = calMX(List(MX(Some(q), Some(bod5), Some(bod5Removal))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(bod5e) shouldBe 92.18

    val cBOD5e = calcBOD5BOD5(BOD5 = Some(bod5e))
    toXDecimals(cBOD5e) shouldBe 83.8

    val bCODe = calbCODBOD5(BOD5 = Some(bod5e))
    toXDecimals(bCODe) shouldBe 147.49

    val bCODpe = calbCODpVSS(VSS = Some(vsse))
    toXDecimals(bCODpe) shouldBe 41.36

    val bCODse = calbCODsbCODpbCOD(bCOD = Some(bCODe), bCODp = Some(bCODpe))
    toXDecimals(bCODse) shouldBe 106.14

    val nh3ne = calMX(List(MX(Some(q), Some(nh3n))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(nh3ne) shouldBe 25.24

    val tpe = calMX(List(MX(Some(q), Some(tp))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(tpe) shouldBe 4.67

    val pe = calPQTSS(Q = Some(qe), TSS = Some(tsse))
    toXDecimals(pe) shouldBe 30401120.35
  }

  "Train S" should "pass" in {
    // Assumptions
    val q = 628376.40
    val tss = 223
    val vss = 178.40
    val bod5 = 234
    val tn = 40.00

    val tss3 = 40000
    val codBODRatio = 1.6
    val solidRemoval = 0.63
    val codVSSRatio = 1.42
    val vssTSSRatio = 0.80

    val cBOD5 = 75
    val bCOD = calbCODBOD5(BOD5 = Some(bod5), codBOD = Some(codBODRatio))
    val bCODp = calbCODpVSS(VSS = Some(vss), codVSS = Some(codVSSRatio), bvssVSS = Some(vssTSSRatio))
    val bCODs = calbCODsbCODpbCOD(bCOD = Some(bCOD), bCODp = Some(bCODp))
    val p = calPQTSS(Q = Some(q), TSS = Some(tss))

    // Line 1
    val qo = q
    toXDecimals(qo) shouldBe 628376.40

    val tsso = tss
    toXDecimals(tsso) shouldBe 223.00

    val vsso = vss
    toXDecimals(vsso) shouldBe 178.40

    val bod5o = bod5
    toXDecimals(bod5) shouldBe 234.00

    val bCODo = bCOD
    toXDecimals(bCODo) shouldBe 374.40

    val bCODpo = bCODp
    toXDecimals(bCODpo) shouldBe 202.66

    val bCODso = bCODs
    toXDecimals(bCODso) shouldBe 171.74

    val tno = tn
    toXDecimals(tno) shouldBe 40.00

    val po = p
    toXDecimals(po) shouldBe 140127937.20

    val qe = qo
    toXDecimals(qe) shouldBe 628376.40

    // Line 2
    val pe2 = calXPercentage(po, 43)
    toXDecimals(pe2) shouldBe 60255013.00

    // Line 3
    val pe3 = solveM(List(Some(po)),
      List(Some(pe2), None), 'add).getOrElse(0.00)
    toXDecimals(pe3) shouldBe 79872924.20

    val qe3 = calPQTSS(P = Some(pe3), TSS = Some(tss3))
    toXDecimals(qe3) shouldBe 1996.82

    val tsse3 = tss3
    toXDecimals(tsse3) shouldBe 40000

    val vsse3 = calVSSTSS(TSS = Some(tsse3), vssTSS = Some(vssTSSRatio))
    toXDecimals(vsse3) shouldBe 32000.00

    val bod5e3 = calMX(List(MX(Some(qo), Some(bod5o))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(bod5e3) shouldBe 234.00

    val bCODpe3 = calbCODpVSS(VSS = Some(vsse3), codVSS = Some(codVSSRatio), bvssVSS = Some(vssTSSRatio))
    toXDecimals(bCODpe3) shouldBe 36352.00

    // Line 2
    val qe2 = solveM(List(Some(qo)),
      List(None, Some(qe3)), 'add).getOrElse(0.00)
    toXDecimals(qe2) shouldBe 626379.58

    val tsse2 = calPQTSS(P = Some(pe2), Q = Some(qe2))
    toXDecimals(tsse2) shouldBe 96.20

    val vsse2 = calVSSTSS(TSS = Some(tsse2), vssTSS = Some(vssTSSRatio))
    toXDecimals(vsse2) shouldBe 76.96

    val bod5e2 = calMX(List(MX(Some(qo), Some(bod5o))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(bod5e2) shouldBe 234.00

    val bCODpe2 = calbCODpVSS(VSS = Some(vsse2), codVSS = Some(codVSSRatio), bvssVSS = Some(vssTSSRatio))
    toXDecimals(bCODpe2) shouldBe 87.42
  }

  "Default removals" should "pass" in {
    val defaultRemovals = pcDefaultRemovals
    defaultRemovals.tss shouldBe Some(63.00)
    defaultRemovals.bod5 shouldBe Some(35.00)
    defaultRemovals.nh3n shouldBe None
    defaultRemovals.tp shouldBe None
    defaultRemovals.fecalColiform shouldBe None
    defaultRemovals.enterococci shouldBe None
  }

}
