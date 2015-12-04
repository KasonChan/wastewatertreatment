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

  "calVSS(-1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calVSS(-1, -1)
    }
  }

  "calVSS(0, 0)" should "= 0.0" in {
    calVSS(0, 0) shouldBe 0
  }

  "calVSS(147.13, 0.8)" should "= 117.70400000000001" in {
    calVSS(147.13, 0.8) shouldBe 117.70400000000001
  }

  "calVSS(147.13)" should "= 117.70400000000001" in {
    calVSS(147.13) shouldBe 117.70400000000001
  }

  "calcBOD5(-1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calcBOD5(-1, -1)
    }
  }

  "calcBOD5(0, 0)" should "= 0.0" in {
    intercept[java.lang.IllegalArgumentException] {
      calcBOD5(0, 0)
    }
  }

  "calcBOD5(cBOD5, 1.1)" should "= 154.23636363636362" in {
    val cBOD5 = 169.66
    val bod5cBOD5Ratio = 1.1
    calcBOD5(cBOD5, bod5cBOD5Ratio) shouldBe 154.23636363636362
  }

  "calcBOD5(cBOD5)" should "= 154.23636363636362" in {
    val cBOD5 = 169.66
    calcBOD5(cBOD5) shouldBe 154.23636363636362
  }

  "calbCOD(-1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calbCOD(-1, -1)
    }
  }

  "calbCOD(0, 0)" should "= 0.0" in {
    calbCOD(0, 0) shouldBe 0
  }

  "calbCOD(bod5, 1.6)" should "= 271.456" in {
    val bod5 = 169.66
    val codBODRatio = 1.6
    calbCOD(bod5, codBODRatio) shouldBe 271.456
  }

  "calbCOD(bod5)" should "= 271.456" in {
    val bod5 = 169.66
    calbCOD(bod5) shouldBe 271.456
  }

  "calbCODp(-1, -1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calbCODp(-1, -1, -1)
    }
  }

  "calbCODp(0, 0, 0)" should "= 0.0" in {
    calbCODp(0, 0, 0) shouldBe 0
  }

  "calbCODp(vss, codVSSRatio, bVSS)" should "= 133.71856" in {
    val vss = 117.71
    val codVSSRatio = 1.42
    val bVSS = 0.8
    calbCODp(vss, codVSSRatio, bVSS) shouldBe 133.71856
  }

  "calbCODp(vss)" should "= 133.71856" in {
    val vss = 117.71
    calbCODp(vss) shouldBe 133.71856
  }

  "calbCODs(-1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calbCODs(-1, -1)
    }
  }

  "calbCODs(0, 0)" should "= 0.0" in {
    calbCODs(0, 0) shouldBe 0
  }

  "calbCODs(bCOD, bCODp)" should "= 137.74999999999997" in {
    val bCOD = 271.46
    val bCODp = 133.71
    calbCODs(bCOD, bCODp) shouldBe 137.74999999999997
  }

  "calP(-1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calP(-1, -1)
    }
  }

  "calP(0, 0)" should "= 0.0" in {
    calP(0, 0) shouldBe 0
  }

  "calP(q, tss)" should "= 1.8258438838729998E8" in {
    val q = 1240973.21
    val tss = 147.13
    calP(q, tss) shouldBe 1.8258438838729998E8
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

  "calQ(-1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calQ(-1, -1)
    }
  }

  "calQ(0, 0)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calQ(0, 0)
    }
  }

  "calQ(p, tss)" should "= 1996.8231050000002" in {
    val p = 79872924.20
    val tss = 40000
    calQ(p, tss) shouldBe 1996.8231050000002
  }

  "calTSS(-1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calTSS(-1, -1)
    }
  }

  "calTSS(0, 0)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calTSS(0, 0)
    }
  }

  "calTSS(p, q)" should "= 222.99999999999997" in {
    val p = 140127937.20
    val q = 628376.40
    calTSS(p, q) shouldBe 222.99999999999997
  }

  "calNTU(-1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calNTU(-1, -1)
    }
  }

  "calNTU(0, 0)" should "fail" in {
    calNTU(0, 0) shouldBe 0
  }

  "calNTU(tss)" should "= " in {
    val tss = 0.94
    calNTU(tss) shouldBe 0.47
  }

}
