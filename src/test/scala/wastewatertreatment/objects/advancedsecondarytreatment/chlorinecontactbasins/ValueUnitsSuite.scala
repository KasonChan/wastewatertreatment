package wastewatertreatment.objects.advancedsecondarytreatment.chlorinecontactbasins

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.valueunit.ValueUnit

/**
 * Created by kasonchan on 11/10/15.
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

  "ValueUnit(FecalColiform(2838.92))" should "2838.92MPN/100mL" in {
    ValueUnit(FecalColiform(2838.92)) shouldBe "2838.92MPN/100mL"
  }

  "ValueUnit(FecalColiform(2838.92, \"xyz/abc\"))" should "2838.92xyz/abc" in {
    ValueUnit(FecalColiform(2838.92, "xyz/abc")) shouldBe "2838.92xyz/abc"
  }

}