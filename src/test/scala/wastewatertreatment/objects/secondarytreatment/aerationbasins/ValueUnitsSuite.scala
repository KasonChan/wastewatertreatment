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

}
