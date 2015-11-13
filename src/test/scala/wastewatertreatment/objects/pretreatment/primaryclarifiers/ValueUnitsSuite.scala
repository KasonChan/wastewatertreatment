package wastewatertreatment.objects.pretreatment.primaryclarifiers

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.pretreatment.primaryclarifiers.ValueUnits._
import wastewatertreatment.valueunit.ValueUnit

/**
 * Created by kasonchan on 11/9/15.
 */
class ValueUnitsSuite extends FlatSpec with Matchers {

  "ValueUnit(TSSRemoval(63))" should "63.00%" in {
    ValueUnit(TSSRemoval(63)) shouldBe "63.00%"
  }

  "ValueUnit(TSSRemoval())" should "63.00%" in {
    ValueUnit(TSSRemoval()) shouldBe "63.00%"
  }

  "ValueUnit(TSSRemoval(63, \"xyz/abc\"))" should "63.00xyz/abc" in {
    ValueUnit(TSSRemoval(63, "xyz/abc")) shouldBe "63.00xyz/abc"
  }

  "ValueUnit(TSSRemoval(unit = \"xyz/abc\"))" should "63.00xyz/abc" in {
    ValueUnit(TSSRemoval(unit = "xyz/abc")) shouldBe "63.00xyz/abc"
  }

  "ValueUnit(BODRemoval(35))" should "35.00%" in {
    ValueUnit(BODRemoval(35)) shouldBe "35.00%"
  }

  "ValueUnit(BODRemoval())" should "35.00%" in {
    ValueUnit(BODRemoval()) shouldBe "35.00%"
  }

  "ValueUnit(BODRemoval(35, \"xyz/abc\"))" should "35.00xyz/abc" in {
    ValueUnit(BODRemoval(35, "xyz/abc")) shouldBe "35.00xyz/abc"
  }

  "ValueUnit(BODRemoval(unit = \"xyz/abc\"))" should "35.00xyz/abc" in {
    ValueUnit(BODRemoval(unit = "xyz/abc")) shouldBe "35.00xyz/abc"
  }

  "ValueUnit(TSS(40000))" should "40000.00g/m^3" in {
    ValueUnit(TSS(40000)) shouldBe "40000.00g/m^3"
  }

  "ValueUnit(TSS())" should "40000.00g/m^3" in {
    ValueUnit(TSS()) shouldBe "40000.00g/m^3"
  }

  "ValueUnit(TSS(40000, \"xyz/abc\"))" should "40000.00xyz/abc" in {
    ValueUnit(TSS(40000, "xyz/abc")) shouldBe "40000.00xyz/abc"
  }

  "ValueUnit(TSS(unit = \"xyz/abc\"))" should "40000.00xyz/abc" in {
    ValueUnit(TSS(unit = "xyz/abc")) shouldBe "40000.00xyz/abc"
  }

  "ValueUnit(PhosphorousRemoval(0))" should "0.00%" in {
    ValueUnit(PhosphorousRemoval(0)) shouldBe "0.00%"
  }

  "ValueUnit(PhosphorousRemoval())" should "0.00%" in {
    ValueUnit(PhosphorousRemoval()) shouldBe "0.00%"
  }

  "ValueUnit(PhosphorousRemoval(0, \"xyz/abc\"))" should "0.00xyz/abc" in {
    ValueUnit(PhosphorousRemoval(0, "xyz/abc")) shouldBe "0.00xyz/abc"
  }

  "ValueUnit(PhosphorousRemoval(unit = \"xyz/abc\"))" should "0.00xyz/abc" in {
    ValueUnit(PhosphorousRemoval(unit = "xyz/abc")) shouldBe "0.00xyz/abc"
  }

}
