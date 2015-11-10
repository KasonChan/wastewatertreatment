package wastewatertreatment.objects.secondarytreatment.secondaryclarifiers

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.valueunit.ValueUnit

/**
 * Created by kasonchan on 11/9/15.
 */
class ValueUnitsSuite extends FlatSpec with Matchers {

  "ValueUnit(TSSRemoval(45))" should "45.00%" in {
    ValueUnit(TSSRemoval(45)) shouldBe "45.00%"
  }

  "ValueUnit(TSSRemoval())" should "45.00%" in {
    ValueUnit(TSSRemoval()) shouldBe "45.00%"
  }

  "ValueUnit(TSSRemoval(45, \"xyz/abc\"))" should "45.00xyz/abc" in {
    ValueUnit(TSSRemoval(45, "xyz/abc")) shouldBe "45.00xyz/abc"
  }

  "ValueUnit(TSSRemoval(unit = \"xyz/abc\"))" should "45.00xyz/abc" in {
    ValueUnit(TSSRemoval(unit = "xyz/abc")) shouldBe "45.00xyz/abc"
  }

  "ValueUnit(BODRemoval(25))" should "25.00%" in {
    ValueUnit(BODRemoval(25)) shouldBe "25.00%"
  }

  "ValueUnit(BODRemoval())" should "25.00%" in {
    ValueUnit(BODRemoval()) shouldBe "25.00%"
  }

  "ValueUnit(BODRemoval(25, \"xyz/abc\"))" should "25.00xyz/abc" in {
    ValueUnit(BODRemoval(25, "xyz/abc")) shouldBe "25.00xyz/abc"
  }

  "ValueUnit(BODRemoval(unit = \"xyz/abc\"))" should "25.00xyz/abc" in {
    ValueUnit(BODRemoval(unit = "xyz/abc")) shouldBe "25.00xyz/abc"
  }

  "ValueUnit(TSS(8000))" should "8000.00g/m^3" in {
    ValueUnit(TSS(8000)) shouldBe "8000.00g/m^3"
  }

  "ValueUnit(TSS())" should "8000.00g/m^3" in {
    ValueUnit(TSS()) shouldBe "8000.00g/m^3"
  }

  "ValueUnit(TSS(8000, \"xyz/abc\"))" should "8000.00xyz/abc" in {
    ValueUnit(TSS(8000, "xyz/abc")) shouldBe "8000.00xyz/abc"
  }

  "ValueUnit(TSS(unit = \"xyz/abc\"))" should "8000.00xyz/abc" in {
    ValueUnit(TSS(unit = "xyz/abc")) shouldBe "8000.00xyz/abc"
  }

  "ValueUnit(PVSSRatio(0.02))" should "0.02" in {
    ValueUnit(PVSSRatio(0.02)) shouldBe "0.02"
  }

  "ValueUnit(PVSSRatio())" should "0.02" in {
    ValueUnit(PVSSRatio()) shouldBe "0.02"
  }

  "ValueUnit(PVSSRatio(0.02, \"xyz/abc\"))" should "0.02xyz/abc" in {
    ValueUnit(PVSSRatio(0.02, "xyz/abc")) shouldBe "0.02xyz/abc"
  }

  "ValueUnit(PVSSRatio(unit = \"xyz/abc\"))" should "0.02xyz/abc" in {
    ValueUnit(PVSSRatio(unit = "xyz/abc")) shouldBe "0.02xyz/abc"
  }

}
