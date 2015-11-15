package wastewatertreatment.objects.secondarytreatment.secondaryclarifiers

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.secondarytreatment.secondaryclarifiers.SecondaryClarifiers._

/**
 * Created by kasonchan on 11/12/15.
 */
class TSSSpec extends FlatSpec with Matchers {

  "calTSS(-1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calTSS(-1, -1)
    }
  }

  "calTSS(-1, 0)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calTSS(-1, 0)
    }
  }

  "calTSS(0, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calTSS(0, -1)
    }
  }

  "calTSS(0, 0)" should "= 0" in {
    intercept[java.lang.IllegalArgumentException] {
      calTSS(0, 0)
    }
  }

  "calTSS(p, q)" should "= 0.41" in {
    val p = 199613.87
    val q = 481131.12
    calTSS(p, q) shouldBe 0.41
  }

}
