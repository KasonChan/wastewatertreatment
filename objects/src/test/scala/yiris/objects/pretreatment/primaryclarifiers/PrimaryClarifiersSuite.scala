package yiris.objects.pretreatment.primaryclarifiers

import equations.massbalance.MassBalance.MX
import equations.monooperation.MonoOperation.solveM
import org.scalatest.{FlatSpec, Matchers}
import yiris.core.math.Math._
import yiris.objects.pretreatment.primaryclarifiers.PrimaryClarifiers._

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
    toXDecimals(vsse.getOrElse(0.0)) shouldBe 98.39

    val bod5e = calMX(List(MX(Some(q), Some(bod5), None)),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(bod5e) shouldBe 141.82

    val cBOD5e = calcBOD5BOD5(BOD5 = Some(bod5e))
    toXDecimals(cBOD5e.getOrElse(0.0)) shouldBe 128.93

    val bCODe = calbCODBOD5(BOD5 = Some(bod5e))
    toXDecimals(bCODe.getOrElse(0.0)) shouldBe 226.91

    val bCODpe = calbCODpVSS(VSS = vsse)
    toXDecimals(bCODpe.getOrElse(0.0)) shouldBe 111.77

    val bCODse = calbCODsbCODpbCOD(bCOD = bCODe, bCODp = bCODpe)
    toXDecimals(bCODse.getOrElse(0.0)) shouldBe 115.14

    val nh3ne = calMX(List(MX(Some(q), Some(nh3n))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(nh3ne) shouldBe 25.24

    val tpe = calMX(List(MX(Some(q), Some(tp))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(tpe) shouldBe 4.67

    val pe = calPQTSS(Q = Some(qe), TSS = Some(tsse))
    toXDecimals(pe.getOrElse(0.0)) shouldBe 82165190.13
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
    toXDecimals(vsse.getOrElse(0.0)) shouldBe 36.41

    val bod5e = calMX(List(MX(Some(q), Some(bod5), Some(bod5Removal))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(bod5e) shouldBe 92.18

    val cBOD5e = calcBOD5BOD5(BOD5 = Some(bod5e))
    toXDecimals(cBOD5e.getOrElse(0.0)) shouldBe 83.8

    val bCODe = calbCODBOD5(BOD5 = Some(bod5e))
    toXDecimals(bCODe.getOrElse(0.0)) shouldBe 147.49

    val bCODpe = calbCODpVSS(VSS = vsse)
    toXDecimals(bCODpe.getOrElse(0.0)) shouldBe 41.36

    val bCODse = calbCODsbCODpbCOD(bCOD = bCODe, bCODp = bCODpe)
    toXDecimals(bCODse.getOrElse(0.0)) shouldBe 106.14

    val nh3ne = calMX(List(MX(Some(q), Some(nh3n))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(nh3ne) shouldBe 25.24

    val tpe = calMX(List(MX(Some(q), Some(tp))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(tpe) shouldBe 4.67

    val pe = calPQTSS(Q = Some(qe), TSS = Some(tsse))
    toXDecimals(pe.getOrElse(0.0)) shouldBe 30401120.35
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
    val bCODs = calbCODsbCODpbCOD(bCOD = bCOD, bCODp = bCODp)
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
    toXDecimals(bCODo.getOrElse(0.0)) shouldBe 374.40

    val bCODpo = bCODp
    toXDecimals(bCODpo.getOrElse(0.0)) shouldBe 202.66

    val bCODso = bCODs
    toXDecimals(bCODso.getOrElse(0.0)) shouldBe 171.74

    val tno = tn
    toXDecimals(tno) shouldBe 40.00

    val po = p
    toXDecimals(po.getOrElse(0.0)) shouldBe 140127937.20

    val qe = qo
    toXDecimals(qe) shouldBe 628376.40

    // Line 2
    val pe2 = calXPercentage(po, Some(43.0))
    toXDecimals(pe2.getOrElse(0.0)) shouldBe 60255013.00

    // Line 3
    val pe3 = solveM(List(po),
      List(pe2, None), 'add).getOrElse(0.00)
    toXDecimals(pe3) shouldBe 79872924.20

    val qe3 = calPQTSS(P = Some(pe3), TSS = Some(tss3))
    toXDecimals(qe3.getOrElse(0.0)) shouldBe 1996.82

    val tsse3 = tss3
    toXDecimals(tsse3) shouldBe 40000

    val vsse3 = calVSSTSS(TSS = Some(tsse3), vssTSS = Some(vssTSSRatio))
    toXDecimals(vsse3.getOrElse(0.0)) shouldBe 32000.00

    val bod5e3 = calMX(List(MX(Some(qo), Some(bod5o))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(bod5e3) shouldBe 234.00

    val bCODpe3 = calbCODpVSS(VSS = vsse3, codVSS = Some(codVSSRatio), bvssVSS = Some(vssTSSRatio))
    toXDecimals(bCODpe3.getOrElse(0.0)) shouldBe 36352.00

    // Line 2
    val qe2 = solveM(List(Some(qo)),
      List(None, qe3), 'add).getOrElse(0.00)
    toXDecimals(qe2) shouldBe 626379.58

    val tsse2 = calPQTSS(P = pe2, Q = Some(qe2))
    toXDecimals(tsse2.getOrElse(0.0)) shouldBe 96.20

    val vsse2 = calVSSTSS(TSS = tsse2, vssTSS = Some(vssTSSRatio))
    toXDecimals(vsse2.getOrElse(0.0)) shouldBe 76.96

    val bod5e2 = calMX(List(MX(Some(qo), Some(bod5o))),
      List(MX(Some(qe), None))).getOrElse(0.00)
    toXDecimals(bod5e2) shouldBe 234.00

    val bCODpe2 = calbCODpVSS(VSS = vsse2, codVSS = Some(codVSSRatio), bvssVSS = Some(vssTSSRatio))
    toXDecimals(bCODpe2.getOrElse(0.0)) shouldBe 87.42
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

  "Train N1" should "pass" in {
    val influent = List(Fluent(
      flow = Some(1393027.2),
      tss = Some(223),
      cBOD5 = Some(234),
      nh3n = Some(33),
      tp = Some(6),
      fecalColiform = Some(10000.0),
      enterococci = Some(10.0)))
    val effluent = List(Fluent())
    val ratios = Ratios()
    val removals = pcDefaultRemovals

    val pc = cal(influent, effluent, ratios, removals)
    val i = pc._1.headOption.getOrElse(Fluent())
    val e = pc._2.headOption.getOrElse(Fluent())

    i shouldBe Fluent(Some(1393027.2),
      Some(223.0),
      Some(178.4),
      Some(257.40000000000003),
      Some(234.0),
      Some(411.8400000000001),
      Some(209.17760000000007),
      Some(202.66240000000002),
      Some(33.0),
      Some(6.0),
      Some(310645065.59999996),
      Some(10000.0),
      Some(10.0),
      Some(111.5))

    e shouldBe Fluent(Some(1393027.2),
      Some(82.50999999999999),
      Some(66.008),
      Some(167.31000000000003),
      Some(152.10000000000002),
      Some(267.6960000000001),
      Some(192.71091200000006),
      Some(74.985088),
      Some(33.0),
      Some(6.0),
      Some(114938674.27199998),
      Some(10000.0),
      Some(10.0),
      Some(41.254999999999995))
  }

}
