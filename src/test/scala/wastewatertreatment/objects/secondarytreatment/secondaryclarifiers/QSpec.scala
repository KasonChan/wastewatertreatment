package wastewatertreatment.objects.secondarytreatment.secondaryclarifiers

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.secondarytreatment.secondaryclarifiers.SecondaryClarifiers._

/**
 * Created by kasonchan on 11/12/15.
 */
class QSpec extends FlatSpec with Matchers {

  "calQ(-1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calQ(-1, -1)
    }
  }

  "calQ(-1, 0)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calQ(-1, 0)
    }
  }

  "calQ(0, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calQ(0, -1)
    }
  }

  "calQ(0, 0)" should "= 0" in {
    calQ(0, 0) shouldBe 0.0
  }

  "calQ(qo, qe)" should "= 481131.13" in {
    val qo = 571269.64
    val qe = 90138.51
    calQ(qo, qe) shouldBe 481131.13
  }

}
