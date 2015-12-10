package wastewatertreatment.core.calculations

import equations.massbalance.MassBalance.MX
import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.core.math.Math.toXDecimals

/**
 * Created by kasonchan on 11/15/15.
 */
class CalculationsSuite extends FlatSpec with Matchers with Calculations {

  "solveMX(inputs, outputs) 1" should "= 223.00" in {
    val inputs = List(MX(Some(1393027.2), Some(223), None))
    val outputs = List(MX(Some(1393027.2), None, None))
    val r = calMX(inputs, outputs).getOrElse(0.0)
    toXDecimals(r) shouldBe 223.00
  }

  "solveMX(inputs, outputs) 2" should "= 223.00" in {
    val inputs = List(MX(Some(1393027.2), Some(223), Some(0.0)))
    val outputs = List(MX(Some(1393027.2), None, None))
    val r = calMX(inputs, outputs).getOrElse(0.0)
    toXDecimals(r) shouldBe 223.00
  }

  "solveMX(inputs, outputs) 3" should "= 223.00" in {
    val inputs = List(MX(Some(1393027.2), Some(223), Some(50.0)))
    val outputs = List(MX(Some(1393027.2), None, None))
    val r = calMX(inputs, outputs).getOrElse(0.0)
    toXDecimals(r) shouldBe 111.50
  }

  "calVSSTSS(TSS = Some(-1), vssTSS = Some(-1))" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calVSSTSS(TSS = Some(-1), vssTSS = Some(-1)).getOrElse(0.0)
    }
  }

  "calVSSTSS(TSS = Some(0.0), vssTSS = Some(0.0)" should "= 0.0" in {
    calVSSTSS(TSS = Some(0.0), vssTSS = Some(0.0)).getOrElse(0.0) shouldBe 0
  }

  "calVSSTSS(TSS = Some(147.13), vssTSS = Some(0.8)" should "= 117.70400000000001" in {
    calVSSTSS(TSS = Some(147.13), vssTSS = Some(0.8)).getOrElse(0.0) shouldBe 117.70400000000001
  }

  "calVSSTSS(TSS = Some(147.13))" should "= 117.70400000000001" in {
    calVSSTSS(TSS = Some(147.13)).getOrElse(0.0) shouldBe 117.70400000000001
  }

  "calcBOD5BOD5(BOD5 = Some(-1), bod5cBOD5 = Some(-1))" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calcBOD5BOD5(BOD5 = Some(-1), bod5cBOD5 = Some(-1)).getOrElse(0.0)
    }
  }

  "calcBOD5BOD5(BOD5 = Some(0.0), bod5cBOD5 = Some(0.0))" should "= 0.0" in {
    intercept[java.lang.IllegalArgumentException] {
      calcBOD5BOD5(BOD5 = Some(0.0), bod5cBOD5 = Some(0.0)).getOrElse(0.0)
    }
  }

  "calcBOD5BOD5(cBOD5, 1.1)" should "= 154.23636363636362" in {
    val bod5 = Some(169.66)
    val bod5cBOD5Ratio = Some(1.1)
    calcBOD5BOD5(BOD5 = bod5, bod5cBOD5 = bod5cBOD5Ratio).getOrElse(0.0) shouldBe 154.23636363636362
  }

  "calcBOD5BOD5(cBOD5)" should "= 154.23636363636362" in {
    val bod5 = Some(169.66)
    calcBOD5BOD5(BOD5 = bod5).getOrElse(0.0) shouldBe 154.23636363636362
  }

  "calbCODBOD5(BOD5 = Some(-1), codBOD = Some(-1))" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calbCODBOD5(BOD5 = Some(-1), codBOD = Some(-1)).getOrElse(0.0)
    }
  }

  "calbCODBOD5(BOD5 = Some(0), codBOD = Some(0))" should "= 0.0" in {
    calbCODBOD5(BOD5 = Some(0), codBOD = Some(0)).getOrElse(0.0) shouldBe 0
  }

  "calbCODBOD5(bod5, 1.6)" should "= 271.456" in {
    val bod5 = Some(169.66)
    val codBODRatio = Some(1.6)
    calbCODBOD5(BOD5 = bod5, codBOD = codBODRatio).getOrElse(0.0) shouldBe 271.456
  }

  "calbCODBOD5(bod5)" should "= 271.456" in {
    val bod5 = Some(169.66)
    calbCODBOD5(BOD5 = bod5).getOrElse(0.0) shouldBe 271.456
  }

  "calbCODpVSS(VSS = Some(-1), codVSS = Some(-1), bvssVSS = Some(-1))" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calbCODpVSS(VSS = Some(-1), codVSS = Some(-1), bvssVSS = Some(-1)).getOrElse(0.0)
    }
  }

  "calbCODpVSS(VSS = Some(0), codVSS = Some(0), bvssVSS = Some(0))" should "= 0.0" in {
    calbCODpVSS(VSS = Some(0), codVSS = Some(0), bvssVSS = Some(0)).getOrElse(0.0) shouldBe 0
  }

  "calbCODpVSS(vss, codVSSRatio, bVSS)" should "= 133.71856" in {
    val vss = Some(117.71)
    val codVSSRatio = Some(1.42)
    val bVSS = Some(0.8)
    calbCODpVSS(VSS = vss, codVSS = codVSSRatio, bvssVSS = bVSS).getOrElse(0.0) shouldBe 133.71856
  }

  "calbCODsbCODpbCOD(bCOD = Some(-1), bCODp = Some(-1))" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calbCODsbCODpbCOD(bCOD = Some(-1), bCODp = Some(-1)).getOrElse(0.0)
    }
  }

  "calbCODsbCODpbCOD(bCOD = Some(0), bCODp = Some(0))" should "= 0.0" in {
    calbCODsbCODpbCOD(bCOD = Some(0), bCODp = Some(0)).getOrElse(0.0) shouldBe 0
  }

  "calbCODsbCODpbCOD(bCOD = Some(bCOD), bCODp = bCODp)" should "= 137.74999999999997" in {
    val bCOD = Some(271.46)
    val bCODp = Some(133.71)
    calbCODsbCODpbCOD(bCOD = bCOD, bCODp = bCODp).getOrElse(0.0) shouldBe 137.74999999999997
  }

  "calPQTSS(Q = Some(-1), TSS = Some(-1))" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calPQTSS(Q = Some(-1), TSS = Some(-1)).getOrElse(0.0)
    }
  }

  "calPQTSS(Q = Some(0), TSS = Some(0))" should "= 0.0" in {
    calPQTSS(Q = Some(0), TSS = Some(0)).getOrElse(0.0) shouldBe 0
  }

  "calPQTSS(Q = q, tss)" should "= 1.8258438838729998E8" in {
    val q = Some(1240973.21)
    val tss = Some(147.13)
    calPQTSS(Q = q, TSS = tss).getOrElse(0.0) shouldBe 1.8258438838729998E8
  }

  "calXPercentage(-1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calXPercentage(Some(-1), Some(-1)).getOrElse(0.0)
    }
  }

  "calXPercentage(0, 0)" should "= 0.0" in {
    calXPercentage(Some(0), Some(0)).getOrElse(0.0) shouldBe 0
  }

  "calXPercentage(p, percentage)" should "= 60255012.99599999" in {
    val q = Some(140127937.20)
    val percentage = Some(43.0)
    calXPercentage(q, percentage).getOrElse(0.0) shouldBe 60255012.99599999
  }

  "calPQTSS(P = Some(-1), TSS = Some(-1))" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calPQTSS(P = Some(-1), TSS = Some(-1)).getOrElse(0.0)
    }
  }

  "calPQTSS(P = Some(0), TSS = Some(0))" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calPQTSS(P = Some(0), TSS = Some(0)).getOrElse(0.0)
    }
  }

  "calPQTSS(p, tss)" should "= 1996.8231050000002" in {
    val p = Some(79872924.20)
    val tss = Some(40000.0)
    calPQTSS(P = p, TSS = tss).getOrElse(0.0) shouldBe 1996.8231050000002
  }

  "calPQTSS(P = Some(-1), Q = Some(-1))" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calPQTSS(P = Some(-1), Q = Some(-1)).getOrElse(0.0)
    }
  }

  "calPQTSS(P = Some(0), Q= Some(0))" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calPQTSS(P = Some(0), Q= Some(0)).getOrElse(0.0)
    }
  }

  "calPQTSS(P = p, Q = q)" should "= 222.99999999999997" in {
    val p = Some(140127937.20)
    val q = Some(628376.40)
    calPQTSS(P = p, Q = q).getOrElse(0.0) shouldBe 222.99999999999997
  }

  "calNTUTSS(TSS = Some(-1), ntuTSS = Some(-1))" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calNTUTSS(TSS = Some(-1), ntuTSS = Some(-1)).getOrElse(0.0)
    }
  }

  "calNTUTSS(TSS = Some(0), ntuTSS = Some(0))" should "fail" in {
    calNTUTSS(TSS = Some(0), ntuTSS = Some(0)).getOrElse(0.0) shouldBe 0
  }

  "calNTUTSS(TSS = tss)" should "= " in {
    val tss = Some(0.94)
    calNTUTSS(TSS = tss).getOrElse(0.0) shouldBe 0.47
  }

  "cal" should "pass" in {
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
    val removals = Removals(tss = Some(63),
      bod5 = Some(35),
      nh3n = Some(21),
      tp = Some(50),
      fecalColiform = Some(99.99),
      enterococci = Some(99.99))

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
      Some(26.070000000000004),
      Some(3.0),
      Some(114938674.27199998),
      Some(1.0000000000005116),
      Some(0.0010000000000005118),
      Some(41.254999999999995))
  }

}
