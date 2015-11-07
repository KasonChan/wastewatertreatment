package wastewatertreatment.objects.advancedsecondarytreatment.filter

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.advancedsecondarytreatment.filter.Filter.calDailyBackwashRate

/**
 * Created by kasonchan on 11/6/15.
 */
class DailyBackwashRateSpec extends FlatSpec with Matchers {

  "calDailyBackwashRate(-1, -1, -1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calDailyBackwashRate(-1, -1, -1, -1)
    }
  }

  "calDailyBackwashRate(0, 0, 0, 0)" should "= 0.00" in {
    calDailyBackwashRate(0, 0, 0, 0) shouldBe 0.00
  }

  "calDailyBackwashRate(backwashRate, areaOfSandfilters, timeOfBackwash, times)" should "= 26240.76" in {
    val backwashRate = 6
    val areaOfSandfilters = 28925
    val timeOfBackwash = 10
    val times = 4
    calDailyBackwashRate(backwashRate, areaOfSandfilters, timeOfBackwash, times) shouldBe 26278.32
  }

}
