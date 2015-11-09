package wastewatertreatment.objects.advancedsecondarytreatment.filter

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.valueunit.ValueUnit

/**
 * Created by ka-son on 11/7/15.
 */
class ValueUnitsSuite extends FlatSpec with Matchers {

  "ValueUnit(DailyBackwashRate(26240.76))" should "26240.76gpm/ft^2" in {
    ValueUnit(DailyBackwashRate(26240.76)) shouldBe "26240.76gpm/ft^2"
  }

  "ValueUnit(DailyBackwashRate(26240.76, \"xyz/abc\"))" should "26240.76xyz/abc" in {
    ValueUnit(DailyBackwashRate(26240.76, "xyz/abc")) shouldBe "26240.76xyz/abc"
  }

}
