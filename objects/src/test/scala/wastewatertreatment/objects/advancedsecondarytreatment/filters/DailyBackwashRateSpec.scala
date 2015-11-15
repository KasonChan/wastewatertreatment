package wastewatertreatment.objects.advancedsecondarytreatment.filters

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.advancedsecondarytreatment.filters.Filters.calDailyBackwashRate

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

  "calDailyBackwashRate(backwashRate, area, time, counts)" should "= 26240.76" in {
    val backwashRate = 6
    val area = 28925
    val time = 10
    val counts = 4
    calDailyBackwashRate(backwashRate, area, time, counts) shouldBe 26278.32
  }

}
