package wastewatertreatment.objects.advancedsecondarytreatment.chlorinecontactbasins

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.advancedsecondarytreatment.chlorinecontactbasins.ValueUnits._
import wastewatertreatment.valueunit.ValueUnit

/**
 * Created by kasonchan on 11/16/15.
 */
class ValueUnitsSuite extends FlatSpec with Matchers {

  "ValueUnit(BacterialRemovalRate(99.99))" should "99.99" in {
    ValueUnit(BacterialRemovalRate(99.99)) shouldBe "99.99"
  }

  "ValueUnit(BacterialRemovalRate())" should "99.99" in {
    ValueUnit(BacterialRemovalRate()) shouldBe "99.99"
  }

  "ValueUnit(BacterialRemovalRate(99.99, \"xyz/abc\"))" should "99.99xyz/abc" in {
    ValueUnit(BacterialRemovalRate(99.99, "xyz/abc")) shouldBe "99.99xyz/abc"
  }

  "ValueUnit(BacterialRemovalRate(unit = \"xyz/abc\"))" should "99.99xyz/abc" in {
    ValueUnit(BacterialRemovalRate(unit = "xyz/abc")) shouldBe "99.99xyz/abc"
  }

}
