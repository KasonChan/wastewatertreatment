package wastewatertreatment.objects.secondarytreatment.aerationbasins

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.secondarytreatment.aerationbasins.AerationBasins._

/**
 * Created by kasonchan on 11/4/15.
 */
class NO3NSpec extends FlatSpec with Matchers {

  "calNO3N(-1, -1, -1, -1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calNO3N(-1, -1, -1, -1, -1)
    }
  }

  "calNO3N(0, 0, 0, 0, 0)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calNO3N(0, 0, 0, 0, 0)
    }
  }

  "calNO3N(no3n, R = r)" should "= 41.47" in {
    val xAHeterotrophs = 28016748.06
    val xAPartsHeterotrophs = 2076141.49
    val q = 1193464.87
    calNO3N(XaHeterotrophs = xAHeterotrophs, XaPartsHeterotrophs = xAPartsHeterotrophs, Q = q) shouldBe 41.47
  }

}
