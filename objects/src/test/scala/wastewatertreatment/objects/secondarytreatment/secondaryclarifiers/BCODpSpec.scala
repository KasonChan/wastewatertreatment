package wastewatertreatment.objects.secondarytreatment.secondaryclarifiers

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.secondarytreatment.secondaryclarifiers.SecondaryClarifiers._

/**
 * Created by kasonchan on 11/13/15.
 */
class BCODpSpec extends FlatSpec with Matchers {

  "calBCODp(-1, -1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calBCODp(-1, -1, -1)
    }
  }

  "calBCODp(-1, 0, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calBCODp(-1, 0, -1)
    }
  }

  "calBCODp(0, -1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calBCODp(0, -1, -1)
    }
  }

  "calBCODp(0, 0, 0)" should "= 0" in {
    calBCODp(0, 0, 0) shouldBe 0
  }

  "calBCODp(vss)" should "= 0.37" in {
    val vss = 0.33
    calBCODp(VSS = vss) shouldBe 0.37
  }

  "calBCODp(bVSS, codVSSRatio, vss)" should "= 0.37" in {
    val bVSS = 0.8
    val codVSSRatio = 1.42
    val vss = 0.33
    calBCODp(bVSS, codVSSRatio, vss) shouldBe 0.37
  }

}
