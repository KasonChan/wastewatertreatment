package wastewatertreatment.core

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by kasonchan on 11/15/15.
 */
class CoreSuite extends FlatSpec with Matchers with Core {

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

}
