package wastewatertreatment.objects.secondarytreatment.aerationbasins

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.secondarytreatment.aerationbasins.AerationBasins._

/**
 * Created by kasonchan on 11/4/15.
 */
class NOrSpec extends FlatSpec with Matchers {

  "calNOr(-1, -1, -1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calNOr(-1, -1, -1, -1)
    }
  }

  "calNOr(0, 0, 0, 0)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calNOr(0, 0, 0, 0)
    }
  }

  "calNOr(q, iR, r)" should "= 931753" in {
    val q = 958414.00
    val iR = 5.42
    val r = 0.49
    calNOr(q, iR, r) shouldBe 944037.79
  }

}
