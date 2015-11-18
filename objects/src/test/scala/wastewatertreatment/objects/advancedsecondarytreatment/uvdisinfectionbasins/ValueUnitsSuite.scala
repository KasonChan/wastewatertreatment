package wastewatertreatment.objects.advancedsecondarytreatment.uvdisinfectionbasins

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.advancedsecondarytreatment.uvdisinfectionbasins.ValueUnits._
import wastewatertreatment.valueunit.ValueUnit

/**
 * Created by kasonchan on 11/17/15.
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

  "ValueUnit(NTUTSSRatio(0.50))" should "0.50" in {
    ValueUnit(NTUTSSRatio(0.50)) shouldBe "0.50"
  }

  "ValueUnit(NTUTSSRatio())" should "0.50" in {
    ValueUnit(NTUTSSRatio()) shouldBe "0.50"
  }

  "ValueUnit(NTUTSSRatio(0.50, \"xyz/abc\"))" should "0.50xyz/abc" in {
    ValueUnit(NTUTSSRatio(0.50, "xyz/abc")) shouldBe "0.50xyz/abc"
  }

  "ValueUnit(NTUTSSRatio(unit = \"xyz/abc\"))" should "0.50xyz/abc" in {
    ValueUnit(NTUTSSRatio(unit = "xyz/abc")) shouldBe "0.50xyz/abc"
  }

}
