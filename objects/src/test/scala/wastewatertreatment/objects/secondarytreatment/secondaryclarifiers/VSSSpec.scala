package wastewatertreatment.objects.secondarytreatment.secondaryclarifiers

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.secondarytreatment.secondaryclarifiers.SecondaryClarifiers._

/**
 * Created by kasonchan on 11/12/15.
 */
class VSSSpec extends FlatSpec with Matchers {

  "calVSS(-1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calVSS(-1, -1)
    }
  }

  "calVSS(-1, 0)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calVSS(-1, 0)
    }
  }

  "calVSS(0, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calVSS(0, -1)
    }
  }

  "calVSS(0, 0)" should "= 0" in {
    intercept[java.lang.IllegalArgumentException] {
      calVSS(0, 0)
    }
  }

  "calVSS(tss)" should "= 0.33" in {
    val tss = 0.41
    calVSS(tss) shouldBe 0.33
  }

  "calVSS(tss, vssTSSRatio)" should "= 0.33" in {
    val tss = 0.41
    val vssTSSRatio = 0.80
    calVSS(tss, vssTSSRatio) shouldBe 0.33
  }

}
