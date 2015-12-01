package wastewatertreatment.objects.secondarytreatment.secondaryclarifiers

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.secondarytreatment.secondaryclarifiers.ValueUnits._
import wastewatertreatment.valueunit.ValueUnit

/**
 * Created by kasonchan on 11/17/15.
 */
class ValueUnitsSuite extends FlatSpec with Matchers {

  "ValueUnit(TSSRemoval(Some(45.0)))" should "45.00%" in {
    ValueUnit(TSSRemoval(Some(45.0))) shouldBe "45.00%"
  }

  "ValueUnit(TSSRemoval())" should "45.00%" in {
    ValueUnit(TSSRemoval()) shouldBe "45.00%"
  }

  "ValueUnit(TSSRemoval(Some(45.0), \"xyz/abc\"))" should "45.00xyz/abc" in {
    ValueUnit(TSSRemoval(Some(45.0), "xyz/abc")) shouldBe "45.00xyz/abc"
  }

  "ValueUnit(TSSRemoval(unit = \"xyz/abc\"))" should "45.00xyz/abc" in {
    ValueUnit(TSSRemoval(unit = "xyz/abc")) shouldBe "45.00xyz/abc"
  }

  "ValueUnit(BODRemoval(Some(25.0)))" should "25.00%" in {
    ValueUnit(BODRemoval(Some(25.0))) shouldBe "25.00%"
  }

  "ValueUnit(BODRemoval())" should "25.00%" in {
    ValueUnit(BODRemoval()) shouldBe "25.00%"
  }

  "ValueUnit(BODRemoval(Some(25.0), \"xyz/abc\"))" should "25.00xyz/abc" in {
    ValueUnit(BODRemoval(Some(25.0), "xyz/abc")) shouldBe "25.00xyz/abc"
  }

  "ValueUnit(BODRemoval(unit = \"xyz/abc\"))" should "25.00xyz/abc" in {
    ValueUnit(BODRemoval(unit = "xyz/abc")) shouldBe "25.00xyz/abc"
  }

  "ValueUnit(TSS(Some(8000.0)))" should "8000.00g/m^3" in {
    ValueUnit(TSS(Some(8000.0))) shouldBe "8000.00g/m^3"
  }

  "ValueUnit(TSS(Some(8000.0), \"xyz/abc\"))" should "8000.00xyz/abc" in {
    ValueUnit(TSS(Some(8000.0), "xyz/abc")) shouldBe "8000.00xyz/abc"
  }

  "ValueUnit(PVSSRatio(Some(0.02)))" should "0.02" in {
    ValueUnit(PVSSRatio(Some(0.02))) shouldBe "0.02"
  }

  "ValueUnit(PVSSRatio())" should "0.02" in {
    ValueUnit(PVSSRatio()) shouldBe "0.02"
  }

  "ValueUnit(PVSSRatio(Some(0.02), \"xyz/abc\"))" should "0.02xyz/abc" in {
    ValueUnit(PVSSRatio(Some(0.02), "xyz/abc")) shouldBe "0.02xyz/abc"
  }

  "ValueUnit(PVSSRatio(unit = \"xyz/abc\"))" should "0.02xyz/abc" in {
    ValueUnit(PVSSRatio(unit = "xyz/abc")) shouldBe "0.02xyz/abc"
  }

}
