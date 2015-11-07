package wastewatertreatment.objects.advancedsecondarytreatment.filter

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.advancedsecondarytreatment.filter.Filter._

/**
 * Created by ka-son on 11/7/15.
 */
class FilterSuite extends FlatSpec with Matchers {

  "Calculation 1" should "pass" in {
    // Inputs
    val backwashRate = 6
    val areaOfSandfilters = 28925
    val timeOfBackwash = 10
    val times = 4

    val dailyBackwashRate = calDailyBackwashRate(backwashRate, areaOfSandfilters, timeOfBackwash, times)
    dailyBackwashRate shouldBe 26278.32
  }

}
