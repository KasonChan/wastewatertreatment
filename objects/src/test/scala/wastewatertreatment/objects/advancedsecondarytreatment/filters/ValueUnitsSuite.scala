package wastewatertreatment.objects.advancedsecondarytreatment.filters

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.advancedsecondarytreatment.filters.ValueUnits._
import wastewatertreatment.core.valueunit.ValueUnit

/**
 * Created by kasonchan on 11/17/15.
 */
class ValueUnitsSuite extends FlatSpec with Matchers {

  "ValueUnit(DailyBackwashRate(26240.76))" should "26240.76GPM/ft^2" in {
    ValueUnit(DailyBackwashRate(Some(26240.76))) shouldBe "26240.76GPM/ft^2"
  }

  "ValueUnit(DailyBackwashRate())" should "6.00GPM/ft^2" in {
    ValueUnit(DailyBackwashRate()) shouldBe "6.00GPM/ft^2"
  }

  "ValueUnit(DailyBackwashRate(26240.76, \"xyz/abc\"))" should "26240.76xyz/abc" in {
    ValueUnit(DailyBackwashRate(Some(26240.76), "xyz/abc")) shouldBe "26240.76xyz/abc"
  }

  "ValueUnit(DailyBackwashRate(unit = \"xyz/abc\"))" should "6.00xyz/abc" in {
    ValueUnit(DailyBackwashRate(unit = "xyz/abc")) shouldBe "6.00xyz/abc"
  }

  "fDefaultMiscRemovals" should "pass" in {
    fDefaultMiscRemovals shouldBe MiscellaneousRemovals(TSSRemoval(Some(70.00)),
      BOD5Removal(Some(70.00)),
      NH3NRemoval(Some(21.00)),
      TPRemoval(Some(33.00)),
      FecalColiformRemoval(Some(76.00)),
      EnterococciRemoval(Some(76.00)))
  }

}
