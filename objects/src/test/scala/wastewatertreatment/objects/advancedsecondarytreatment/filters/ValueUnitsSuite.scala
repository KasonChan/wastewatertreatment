package wastewatertreatment.objects.advancedsecondarytreatment.filters

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.advancedsecondarytreatment.filters.ValueUnits._
import wastewatertreatment.valueunit.ValueUnit

/**
 * Created by kasonchan on 11/17/15.
 */
class ValueUnitsSuite extends FlatSpec with Matchers {

  "ValueUnit(DailyBackwashRate(Some(26240.76)))" should "26240.76GPM/ft^2" in {
    ValueUnit(DailyBackwashRate(Some(26240.76))) shouldBe "26240.76GPM/ft^2"
  }

  "ValueUnit(DailyBackwashRate(Some(26240.76), \"xyz/abc\"))" should "26240.76xyz/abc" in {
    ValueUnit(DailyBackwashRate(Some(26240.76), "xyz/abc")) shouldBe "26240.76xyz/abc"
  }

  "ValueUnit(BODRemoval(Some(70.0)))" should "70.00%" in {
    ValueUnit(BODRemoval(Some(70.0))) shouldBe "70.00%"
  }

  "ValueUnit(BODRemoval())" should "70.00%" in {
    ValueUnit(BODRemoval()) shouldBe "70.00%"
  }

  "ValueUnit(BODRemoval(Some(70.0), \"xyz/abc\"))" should "70.00xyz/abc" in {
    ValueUnit(BODRemoval(Some(70.0), "xyz/abc")) shouldBe "70.00xyz/abc"
  }

  "ValueUnit(BODRemoval(unit = \"xyz/abc\"))" should "70.00xyz/abc" in {
    ValueUnit(BODRemoval(unit = "xyz/abc")) shouldBe "70.00xyz/abc"
  }

  "ValueUnit(TSSRemoval(Some(70.0)))" should "70.00%" in {
    ValueUnit(TSSRemoval(Some(70.0))) shouldBe "70.00%"
  }

  "ValueUnit(TSSRemoval())" should "70.00%" in {
    ValueUnit(TSSRemoval()) shouldBe "70.00%"
  }

  "ValueUnit(TSSRemoval(Some(70.0), \"xyz/abc\"))" should "70.00xyz/abc" in {
    ValueUnit(TSSRemoval(Some(70.0), "xyz/abc")) shouldBe "70.00xyz/abc"
  }

  "ValueUnit(TSSRemoval(unit = \"xyz/abc\"))" should "70.00xyz/abc" in {
    ValueUnit(TSSRemoval(unit = "xyz/abc")) shouldBe "70.00xyz/abc"
  }

  "ValueUnit(TOCRemoval(Some(48.0)))" should "48.00%" in {
    ValueUnit(TOCRemoval(Some(48.0))) shouldBe "48.00%"
  }

  "ValueUnit(TOCRemoval())" should "48.00%" in {
    ValueUnit(TOCRemoval()) shouldBe "48.00%"
  }

  "ValueUnit(TOCRemoval(Some(48.0), \"xyz/abc\"))" should "48.00xyz/abc" in {
    ValueUnit(TOCRemoval(Some(48.0), "xyz/abc")) shouldBe "48.00xyz/abc"
  }

  "ValueUnit(TOCRemoval(unit = \"xyz/abc\"))" should "48.00xyz/abc" in {
    ValueUnit(TOCRemoval(unit = "xyz/abc")) shouldBe "48.00xyz/abc"
  }

  "ValueUnit(FecalColiformRemoval(Some(76.0)))" should "76.00%" in {
    ValueUnit(FecalColiformRemoval(Some(76.0))) shouldBe "76.00%"
  }

  "ValueUnit(FecalColiformRemoval())" should "76.00%" in {
    ValueUnit(FecalColiformRemoval()) shouldBe "76.00%"
  }

  "ValueUnit(FecalColiformRemoval(Some(76.0), \"xyz/abc\"))" should "76.00xyz/abc" in {
    ValueUnit(FecalColiformRemoval(Some(76.0), "xyz/abc")) shouldBe "76.00xyz/abc"
  }

  "ValueUnit(FecalColiformRemoval(unit = \"xyz/abc\"))" should "76.00xyz/abc" in {
    ValueUnit(FecalColiformRemoval(unit = "xyz/abc")) shouldBe "76.00xyz/abc"
  }

  "ValueUnit(TPRemoval(Some(33.0)))" should "33.00%" in {
    ValueUnit(TPRemoval(Some(33.0))) shouldBe "33.00%"
  }

  "ValueUnit(TPRemoval())" should "33.00%" in {
    ValueUnit(TPRemoval()) shouldBe "33.00%"
  }

  "ValueUnit(TPRemoval(Some(33.0), \"xyz/abc\"))" should "33.00xyz/abc" in {
    ValueUnit(TPRemoval(Some(33.0), "xyz/abc")) shouldBe "33.00xyz/abc"
  }

  "ValueUnit(TPRemoval(unit = \"xyz/abc\"))" should "33.00xyz/abc" in {
    ValueUnit(TPRemoval(unit = "xyz/abc")) shouldBe "33.00xyz/abc"
  }

  "ValueUnit(TKNRemoval(Some(46.0)))" should "46.00%" in {
    ValueUnit(TKNRemoval(Some(46.0))) shouldBe "46.00%"
  }

  "ValueUnit(TKNRemoval())" should "46.00%" in {
    ValueUnit(TKNRemoval()) shouldBe "46.00%"
  }

  "ValueUnit(TKNRemoval(Some(46.0), \"xyz/abc\"))" should "46.00xyz/abc" in {
    ValueUnit(TKNRemoval(Some(46.0), "xyz/abc")) shouldBe "46.00xyz/abc"
  }

  "ValueUnit(TKNRemoval(unit = \"xyz/abc\"))" should "46.00xyz/abc" in {
    ValueUnit(TKNRemoval(unit = "xyz/abc")) shouldBe "46.00xyz/abc"
  }

  "ValueUnit(NH3NRemoval(Some(21.0)))" should "21.00%" in {
    ValueUnit(NH3NRemoval(Some(21.0))) shouldBe "21.00%"
  }

  "ValueUnit(NH3NRemoval())" should "21.00%" in {
    ValueUnit(NH3NRemoval()) shouldBe "21.00%"
  }

  "ValueUnit(NH3NRemoval(Some(21.0), \"xyz/abc\"))" should "21.00xyz/abc" in {
    ValueUnit(NH3NRemoval(Some(21.0), "xyz/abc")) shouldBe "21.00xyz/abc"
  }

  "ValueUnit(NH3NRemoval(unit = \"xyz/abc\"))" should "21.00xyz/abc" in {
    ValueUnit(NH3NRemoval(unit = "xyz/abc")) shouldBe "21.00xyz/abc"
  }

}
