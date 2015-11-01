package wastewatertreatment.objects.secondarytreatment.aerationbasins

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.valueunit.ValueUnit

/**
 * Created by ka-son on 10/31/15.
 */
class ValueUnitsSuite extends FlatSpec with Matchers {

  "ValueUnit(AT(423819, \"xyz/abc\")" should "423819.00xyz/abc" in {
    ValueUnit(AT(423819, "xyz/abc")) shouldBe "423819.00xyz/abc"
  }

  "ValueUnit(AT(423819)" should "423819.00m^3" in {
    ValueUnit(AT(423819)) shouldBe "423819.00m^3"
  }

  "ValueUnit(AT(unit = \"xyz/abc\")" should "423819.00xyz/abc" in {
    ValueUnit(AT(unit = "xyz/abc")) shouldBe "423819.00xyz/abc"
  }

  "ValueUnit(AT())" should "423819.00m^3" in {
    ValueUnit(AT()) shouldBe "423819.00m^3"
  }

  "ValueUnit(QPeak(1393027, \"xyz/abc\")" should "1393027.00xyz/abc" in {
    ValueUnit(QPeak(1393027, "xyz/abc")) shouldBe "1393027.00xyz/abc"
  }

  "ValueUnit(QPeak(1393027)" should "1393027.00m^3/d" in {
    ValueUnit(QPeak(1393027)) shouldBe "1393027.00m^3/d"
  }

  "ValueUnit(QPeak(unit = \"xyz/abc\")" should "1393027.00xyz/abc" in {
    ValueUnit(QPeak(unit = "xyz/abc")) shouldBe "1393027.00xyz/abc"
  }

  "ValueUnit(QPeak())" should "1393027.00m^3/d" in {
    ValueUnit(QPeak()) shouldBe "1393027.00m^3/d"
  }

  "ValueUnit(Theta(0.30))" should "0.30d" in {
    ValueUnit(Theta(0.30)) shouldBe "0.30d"
  }

  "ValueUnit(Theta(0.30, \"xyz/abc\"))" should "0.30xyz/abc" in {
    ValueUnit(Theta(0.30, "xyz/abc")) shouldBe "0.30xyz/abc"
  }

  "ValueUnit(BODLoading(25027.04))" should "25027.04kg-BOD/d" in {
    ValueUnit(BODLoading(25027.04)) shouldBe "25027.04kg-BOD/d"
  }

  "ValueUnit(BODLoading(25027.04, \"xyz/abc\"))" should "25027.04xyz/abc" in {
    ValueUnit(BODLoading(25027.04, "xyz/abc")) shouldBe "25027.04xyz/abc"
  }

  "ValueUnit(BODRemoval())" should "97.00%" in {
    ValueUnit(BODRemoval()) shouldBe "97.00%"
  }

  "ValueUnit(BODRemoval(97))" should "97.00%" in {
    ValueUnit(BODRemoval(97)) shouldBe "97.00%"
  }

  "ValueUnit(BODRemoval(unit = \"xyz/abc\"))" should "97.00xyz/abc" in {
    ValueUnit(BODRemoval(unit = "xyz/abc")) shouldBe "97.00xyz/abc"
  }

  "ValueUnit(BODRemoval(97,\"xyz/abc\"))" should "97.00xyz/abc" in {
    ValueUnit(BODRemoval(97, "xyz/abc")) shouldBe "97.00xyz/abc"
  }

  "ValueUnit(TSSRemoval())" should "94.00%" in {
    ValueUnit(TSSRemoval()) shouldBe "94.00%"
  }

  "ValueUnit(TSSRemoval(94))" should "94.00%" in {
    ValueUnit(TSSRemoval(94)) shouldBe "94.00%"
  }

  "ValueUnit(TSSRemoval(unit = \"xyz/abc\"))" should "94.00xyz/abc" in {
    ValueUnit(TSSRemoval(unit = "xyz/abc")) shouldBe "94.00xyz/abc"
  }

  "ValueUnit(TSSRemoval(94, \"xyz/abc\"))" should "94.00xyz/abc" in {
    ValueUnit(TSSRemoval(94, "xyz/abc")) shouldBe "94.00xyz/abc"
  }

  "ValueUnit(TKNRemoval())" should "88.00%" in {
    ValueUnit(TKNRemoval()) shouldBe "88.00%"
  }

  "ValueUnit(TKNRemoval(88))" should "88.00%" in {
    ValueUnit(TKNRemoval(88)) shouldBe "88.00%"
  }

  "ValueUnit(TKNRemoval(unit = \"xyz/abc\"))" should "88.00xyz/abc" in {
    ValueUnit(TKNRemoval(unit = "xyz/abc")) shouldBe "88.00xyz/abc"
  }

  "ValueUnit(TKNRemoval(88, \"xyz/abc\"))" should "88.00xyz/abc" in {
    ValueUnit(TKNRemoval(88, "xyz/abc")) shouldBe "88.00xyz/abc"
  }

  "ValueUnit(NH3NRemoval())" should "97.00%" in {
    ValueUnit(NH3NRemoval()) shouldBe "97.00%"
  }

  "ValueUnit(NH3NRemoval(97))" should "97.00%" in {
    ValueUnit(NH3NRemoval(97)) shouldBe "97.00%"
  }

  "ValueUnit(NH3NRemoval(unit = \"xyz/abc\"))" should "97.00xyz/abc" in {
    ValueUnit(NH3NRemoval(unit = "xyz/abc")) shouldBe "97.00xyz/abc"
  }

  "ValueUnit(NH3NRemoval(97,\"xyz/abc\"))" should "97.00xyz/abc" in {
    ValueUnit(NH3NRemoval(97, "xyz/abc")) shouldBe "97.00xyz/abc"
  }

  "ValueUnit(PhosphorousRemoval())" should "98.00%" in {
    ValueUnit(PhosphorousRemoval()) shouldBe "98.00%"
  }

  "ValueUnit(PhosphorousRemoval(98))" should "98.00%" in {
    ValueUnit(PhosphorousRemoval(98)) shouldBe "98.00%"
  }

  "ValueUnit(PhosphorousRemoval(unit = \"xyz/abc\"))" should "98.00xyz/abc" in {
    ValueUnit(PhosphorousRemoval(unit = "xyz/abc")) shouldBe "98.00xyz/abc"
  }

  "ValueUnit(PhosphorousRemoval(98, \"xyz/abc\"))" should "98.00xyz/abc" in {
    ValueUnit(PhosphorousRemoval(98, "xyz/abc")) shouldBe "98.00xyz/abc"
  }

  "ValueUnit(BCOD5Removal())" should "100.00%" in {
    ValueUnit(BCOD5Removal()) shouldBe "100.00%"
  }

  "ValueUnit(BCOD5Removal(100))" should "100.00%" in {
    ValueUnit(BCOD5Removal(100)) shouldBe "100.00%"
  }

  "ValueUnit(BCOD5Removal(unit = \"xyz/abc\"))" should "100.00xyz/abc" in {
    ValueUnit(BCOD5Removal(unit = "xyz/abc")) shouldBe "100.00xyz/abc"
  }

  "ValueUnit(BCOD5Removal(100, \"xyz/abc\"))" should "100.00xyz/abc" in {
    ValueUnit(BCOD5Removal(100, "xyz/abc")) shouldBe "100.00xyz/abc"
  }

  "ValueUnit(ForallAnoxicForallTotalRatio())" should "0.33" in {
    ValueUnit(ForallAnoxicForallTotalRatio()) shouldBe "0.33"
  }

  "ValueUnit(ForallAnoxicForallTotalRatio(0.33))" should "0.33" in {
    ValueUnit(ForallAnoxicForallTotalRatio(0.33)) shouldBe "0.33"
  }

  "ValueUnit(ForallAnoxicForallTotalRatio(unit = \"xyz/abc\"))" should "0.33xyz/abc" in {
    ValueUnit(ForallAnoxicForallTotalRatio(unit = "xyz/abc")) shouldBe "0.33xyz/abc"
  }

  "ValueUnit(ForallAnoxicForallTotalRatio(0.33, \"xyz/abc\"))" should "0.33xyz/abc" in {
    ValueUnit(ForallAnoxicForallTotalRatio(0.33, "xyz/abc")) shouldBe "0.33xyz/abc"
  }

  "ValueUnit(Snc())" should "0.50g/m^3" in {
    ValueUnit(Snc()) shouldBe "0.50g/m^3"
  }

  "ValueUnit(Snc(0.5))" should "0.50g/m^3" in {
    ValueUnit(Snc(0.5)) shouldBe "0.50g/m^3"
  }

  "ValueUnit(Snc(unit = \"xyz/abc\"))" should "0.50xyz/abc" in {
    ValueUnit(Snc(unit = "xyz/abc")) shouldBe "0.50xyz/abc"
  }

  "ValueUnit(Snc(0.5, \"xyz/abc\"))" should "0.50xyz/abc" in {
    ValueUnit(Snc(0.5, "xyz/abc")) shouldBe "0.50xyz/abc"
  }

}
