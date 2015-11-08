package wastewatertreatment.objects.secondarytreatment.aerationbasins

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.secondarytreatment.aerationbasins.AerationBasins._

/**
 * Created by kasonchan on 11/8/15.
 */
class BODLoadingRateSpec extends FlatSpec with Matchers {

  "calBODLoadingRate(-1, -1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calBODLoadingRate(-1, -1, -1)
    }
  }

  "calBODLoadingRate(0, 0, 0)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calBODLoadingRate(0, 0, 0)
    }
  }

  "calBODLoadingRate(lorg, forall, q)" should "= 301.25" in {
    val lorg = 84
    val forall = 4967750
    val q = 166000000
    calBODLoadingRate(lorg, forall, q) shouldBe 301.25
  }

}
