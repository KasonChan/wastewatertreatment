package wastewatertreatment.core

import equations.massbalance.MassBalance.MX
import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.math.Math.toXDecimals

/**
 * Created by kasonchan on 11/15/15.
 */
class CoreSuite extends FlatSpec with Matchers with Core {

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
      calVSSTSS(TSS = Some(-1), vssTSS = Some(-1))
    }
  }

  "calVSSTSS(TSS = Some(0.0), vssTSS = Some(0.0)" should "= 0.0" in {
    calVSSTSS(TSS = Some(0.0), vssTSS = Some(0.0)) shouldBe 0
  }

  "calVSSTSS(TSS = Some(147.13), vssTSS = Some(0.8)" should "= 117.70400000000001" in {
    calVSSTSS(TSS = Some(147.13), vssTSS = Some(0.8)) shouldBe 117.70400000000001
  }

  "calVSSTSS(TSS = Some(147.13))" should "= 117.70400000000001" in {
    calVSSTSS(TSS = Some(147.13)) shouldBe 117.70400000000001
  }

  "calcBOD5BOD5(BOD5 = Some(-1), bod5cBOD5 = Some(-1))" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calcBOD5BOD5(BOD5 = Some(-1), bod5cBOD5 = Some(-1))
    }
  }

  "calcBOD5BOD5(BOD5 = Some(0.0), bod5cBOD5 = Some(0.0))" should "= 0.0" in {
    intercept[java.lang.IllegalArgumentException] {
      calcBOD5BOD5(BOD5 = Some(0.0), bod5cBOD5 = Some(0.0))
    }
  }

  "calcBOD5BOD5(cBOD5, 1.1)" should "= 154.23636363636362" in {
    val bod5 = Some(169.66)
    val bod5cBOD5Ratio = Some(1.1)
    calcBOD5BOD5(BOD5 = bod5, bod5cBOD5 = bod5cBOD5Ratio) shouldBe 154.23636363636362
  }

  "calcBOD5BOD5(cBOD5)" should "= 154.23636363636362" in {
    val bod5 = Some(169.66)
    calcBOD5BOD5(BOD5 = bod5) shouldBe 154.23636363636362
  }

  "calbCODBOD5(BOD5 = Some(-1), codBOD = Some(-1))" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calbCODBOD5(BOD5 = Some(-1), codBOD = Some(-1))
    }
  }

  "calbCODBOD5(BOD5 = Some(0), codBOD = Some(0))" should "= 0.0" in {
    calbCODBOD5(BOD5 = Some(0), codBOD = Some(0)) shouldBe 0
  }

  "calbCODBOD5(bod5, 1.6)" should "= 271.456" in {
    val bod5 = Some(169.66)
    val codBODRatio = Some(1.6)
    calbCODBOD5(BOD5 = bod5, codBOD = codBODRatio) shouldBe 271.456
  }

  "calbCODBOD5(bod5)" should "= 271.456" in {
    val bod5 = Some(169.66)
    calbCODBOD5(BOD5 = bod5) shouldBe 271.456
  }

  "calbCODpVSS(VSS = Some(-1), codVSS = Some(-1), bvssVSS = Some(-1))" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calbCODpVSS(VSS = Some(-1), codVSS = Some(-1), bvssVSS = Some(-1))
    }
  }

  "calbCODpVSS(VSS = Some(0), codVSS = Some(0), bvssVSS = Some(0))" should "= 0.0" in {
    calbCODpVSS(VSS = Some(0), codVSS = Some(0), bvssVSS = Some(0)) shouldBe 0
  }

  "calbCODpVSS(vss, codVSSRatio, bVSS)" should "= 133.71856" in {
    val vss = Some(117.71)
    val codVSSRatio = Some(1.42)
    val bVSS = Some(0.8)
    calbCODpVSS(VSS = vss, codVSS = codVSSRatio, bvssVSS = bVSS) shouldBe 133.71856
  }

  "calbCODsbCODpbCOD(bCOD = Some(-1), bCODp = Some(-1))" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calbCODsbCODpbCOD(bCOD = Some(-1), bCODp = Some(-1))
    }
  }

  "calbCODsbCODpbCOD(bCOD = Some(0), bCODp = Some(0))" should "= 0.0" in {
    calbCODsbCODpbCOD(bCOD = Some(0), bCODp = Some(0)) shouldBe 0
  }

  "calbCODsbCODpbCOD(bCOD = Some(bCOD), bCODp = bCODp)" should "= 137.74999999999997" in {
    val bCOD = Some(271.46)
    val bCODp = Some(133.71)
    calbCODsbCODpbCOD(bCOD = bCOD, bCODp = bCODp) shouldBe 137.74999999999997
  }

  "calPQTSS(Q = Some(-1), TSS = Some(-1))" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calPQTSS(Q = Some(-1), TSS = Some(-1))
    }
  }

  "calPQTSS(Q = Some(0), TSS = Some(0))" should "= 0.0" in {
    calPQTSS(Q = Some(0), TSS = Some(0)) shouldBe 0
  }

  "calPQTSS(Q = q, tss)" should "= 1.8258438838729998E8" in {
    val q = Some(1240973.21)
    val tss = Some(147.13)
    calPQTSS(Q = q, TSS = tss) shouldBe 1.8258438838729998E8
  }

  "calXPercentage(-1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calXPercentage(-1, -1)
    }
  }

  "calXPercentage(0, 0)" should "= 0.0" in {
    calXPercentage(0, 0) shouldBe 0
  }

  "calXPercentage(p, percentage)" should "= 60255012.99599999" in {
    val q = 140127937.20
    val percentage = 43
    calXPercentage(q, percentage) shouldBe 60255012.99599999
  }

  "calPQTSS(P = Some(-1), TSS = Some(-1))" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calPQTSS(P = Some(-1), TSS = Some(-1))
    }
  }

  "calPQTSS(P = Some(0), TSS = Some(0))" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calPQTSS(P = Some(0), TSS = Some(0))
    }
  }

  "calPQTSS(p, tss)" should "= 1996.8231050000002" in {
    val p = Some(79872924.20)
    val tss = Some(40000.0)
    calPQTSS(P = p, TSS = tss) shouldBe 1996.8231050000002
  }

  "calPQTSS(P = Some(-1), Q = Some(-1))" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calPQTSS(P = Some(-1), Q = Some(-1))
    }
  }

  "calPQTSS(P = Some(0), Q= Some(0))" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calPQTSS(P = Some(0), Q= Some(0))
    }
  }

  "calPQTSS(P = p, Q = q)" should "= 222.99999999999997" in {
    val p = Some(140127937.20)
    val q = Some(628376.40)
    calPQTSS(P = p, Q = q) shouldBe 222.99999999999997
  }

  "calNTUTSS(TSS = Some(-1), ntuTSS = Some(-1))" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calNTUTSS(TSS = Some(-1), ntuTSS = Some(-1))
    }
  }

  "calNTUTSS(TSS = Some(0), ntuTSS = Some(0))" should "fail" in {
    calNTUTSS(TSS = Some(0), ntuTSS = Some(0)) shouldBe 0
  }

  "calNTUTSS(TSS = tss)" should "= " in {
    val tss = Some(0.94)
    calNTUTSS(TSS = tss) shouldBe 0.47
  }

}
