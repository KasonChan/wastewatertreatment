package wastewatertreatment.objects.secondarytreatment.aerationbasins

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.secondarytreatment.aerationbasins.AerationBasins._

/**
 * Created by kasonchan on 11/4/15.
 */
class RSpec extends FlatSpec with Matchers {

  "calR(-1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calR(-1, -1)
    }
  }

  "calR(0, 0)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calR(0, 0)
    }
  }

  "calR(qR, q)" should "= 0.49" in {
    val qR = 449856.99
    val q = 912991.90
    calR(qR, q) shouldBe 0.49
  }

}
