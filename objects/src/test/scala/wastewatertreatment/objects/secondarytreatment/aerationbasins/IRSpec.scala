package wastewatertreatment.objects.secondarytreatment.aerationbasins

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.secondarytreatment.aerationbasins.AerationBasins._

/**
 * Created by kasonchan on 11/4/15.
 */
class IRSpec extends FlatSpec with Matchers {

  "calIR(-1, -1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calIR(-1, -1, -1)
    }
  }

  "calIR(0, 0, 0)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calIR(0, 0, 0)
    }
  }

  "calIR(no3n, R = r)" should "= 5.42" in {
    val no3n = 41.47
    val r = 0.49
    calIR(no3n, R = r) shouldBe 5.42
  }

}
