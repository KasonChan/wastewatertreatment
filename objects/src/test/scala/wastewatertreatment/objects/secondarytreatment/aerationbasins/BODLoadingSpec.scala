package wastewatertreatment.objects.secondarytreatment.aerationbasins

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.secondarytreatment.aerationbasins.AerationBasins.calBODLoading

/**
 * Created by ka-son on 10/31/15.
 */
class BODLoadingSpec extends FlatSpec with Matchers {

  "calBODLoading(-1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calBODLoading(-1, -1)
    }
  }

  "calBODLoading(-1, 0)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calBODLoading(-1, 0)
    }
  }

  "calBODLoading(0, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calBODLoading(0, -1)
    }
  }

  "calBODLoading(0, 0)" should "= 0.00" in {
    calBODLoading(0, 0) shouldBe 0.00
  }

  "calBODLoading(103, 242981)" should "= 25027.04" in {
    calBODLoading(103, 242981) shouldBe 25027.04
  }

}
