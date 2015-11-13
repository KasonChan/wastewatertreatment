package wastewatertreatment.objects.secondarytreatment.secondaryclarifiers

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.secondarytreatment.secondaryclarifiers.SecondaryClarifiers._

/**
 * Created by kasonchan on 11/13/15.
 */
class TPSpec extends FlatSpec with Matchers {

  "calTP(-1, -1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calTP(-1, -1, -1)
    }
  }

  "calTP(-1, 0, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calTP(-1, 0, -1)
    }
  }

  "calTP(0, -1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calTP(0, -1, -1)
    }
  }

  "calTP(0, 0, 0)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calTP(0, 0, 0)
    }
  }

  "calTP(tp, q)" should "= 0.64" in {
    val tp = 0.64
    val q = 571269.64
    calTP(tp, q) shouldBe 0.64
  }

  "calTP(tp, q, pVSSRatio)" should "= 0.64" in {
    val tp = 0.64
    val q = 571269.64
    val pVSSRatio = 0.02
    calTP(tp, q, pVSSRatio) shouldBe 0.64
  }

}
