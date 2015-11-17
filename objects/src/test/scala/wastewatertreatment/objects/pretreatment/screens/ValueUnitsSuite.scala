package wastewatertreatment.objects.pretreatment.screens

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.pretreatment.screens.ValueUnits._
import wastewatertreatment.valueunit.ValueUnit

/**
 * Created by kasonchan on 10/27/15.
 */
class ValueUnitsSuite extends FlatSpec with Matchers {

  "ValueUnit(TSSRemoval(27))" should "27.00%" in {
    ValueUnit(TSSRemoval(27)) shouldBe "27.00%"
  }

  "ValueUnit(TSSRemoval())" should "27.00%" in {
    ValueUnit(TSSRemoval()) shouldBe "27.00%"
  }

  "ValueUnit(TSSRemoval(27, \"xyz/abc\"))" should "27.00xyz/abc" in {
    ValueUnit(TSSRemoval(27, "xyz/abc")) shouldBe "27.00xyz/abc"
  }

  "ValueUnit(TSSRemoval(unit = \"xyz/abc\"))" should "27.00xyz/abc" in {
    ValueUnit(TSSRemoval(unit = "xyz/abc")) shouldBe "27.00xyz/abc"
  }

  "ValueUnit(BOD5Removal(27))" should "27.00%" in {
    ValueUnit(BOD5Removal(27)) shouldBe "27.00%"
  }

  "ValueUnit(BOD5Removal())" should "27.00%" in {
    ValueUnit(BOD5Removal()) shouldBe "27.00%"
  }

  "ValueUnit(BOD5Removal(27, \"xyz/abc\"))" should "27.00xyz/abc" in {
    ValueUnit(BOD5Removal(27, "xyz/abc")) shouldBe "27.00xyz/abc"
  }

  "ValueUnit(BOD5Removal(unit = \"xyz/abc\"))" should "27.00xyz/abc" in {
    ValueUnit(BOD5Removal(unit = "xyz/abc")) shouldBe "27.00xyz/abc"
  }

}
