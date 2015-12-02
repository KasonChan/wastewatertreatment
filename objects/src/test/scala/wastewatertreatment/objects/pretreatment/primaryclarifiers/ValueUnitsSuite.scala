package wastewatertreatment.objects.pretreatment.primaryclarifiers

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.pretreatment.primaryclarifiers.ValueUnits._
import wastewatertreatment.valueunit.ValueUnit

/**
 * Created by kasonchan on 11/17/15.
 */
class ValueUnitsSuite extends FlatSpec with Matchers {

  "ValueUnit(TSSRemoval(Some(63.0)))" should "63.00%" in {
    ValueUnit(TSSRemoval(Some(63.0))) shouldBe "63.00%"
  }

  "ValueUnit(TSSRemoval())" should "63.00%" in {
    ValueUnit(TSSRemoval()) shouldBe "63.00%"
  }

  "ValueUnit(TSSRemoval(Some(63.0), \"xyz/abc\"))" should "63.00xyz/abc" in {
    ValueUnit(TSSRemoval(Some(63.0), "xyz/abc")) shouldBe "63.00xyz/abc"
  }

  "ValueUnit(TSSRemoval(unit = \"xyz/abc\"))" should "63.00xyz/abc" in {
    ValueUnit(TSSRemoval(unit = "xyz/abc")) shouldBe "63.00xyz/abc"
  }

  "ValueUnit(BOD5Removal(Some(35.0)))" should "35.00%" in {
    ValueUnit(BOD5Removal(Some(35.0))) shouldBe "35.00%"
  }

  "ValueUnit(BOD5Removal())" should "35.00%" in {
    ValueUnit(BOD5Removal()) shouldBe "35.00%"
  }

  "ValueUnit(BOD5Removal(Some(35.0), \"xyz/abc\"))" should "35.00xyz/abc" in {
    ValueUnit(BOD5Removal(Some(35.0), "xyz/abc")) shouldBe "35.00xyz/abc"
  }

  "ValueUnit(BOD5Removal(unit = \"xyz/abc\"))" should "35.00xyz/abc" in {
    ValueUnit(BOD5Removal(unit = "xyz/abc")) shouldBe "35.00xyz/abc"
  }

  "ValueUnit(TSS(Some(40000)))" should "40000.00g/m^3" in {
    ValueUnit(TSS(Some(40000))) shouldBe "40000.00g/m^3"
  }

  "ValueUnit(TSS(Some(40000), \"xyz/abc\"))" should "40000.00xyz/abc" in {
    ValueUnit(TSS(Some(40000), "xyz/abc")) shouldBe "40000.00xyz/abc"
  }

}
