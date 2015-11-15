package wastewatertreatment.objects.influent

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.influent.ValueUnits._
import wastewatertreatment.valueunit.ValueUnit

/**
 * Created by kasonchan on 11/8/15.
 */
class ValueUnitsSuite extends FlatSpec with Matchers with wastewatertreatment.assumptions.ValueUnits {

  "ValueUnit(Q(368))" should "368.00MGD" in {
    ValueUnit(Q(368)) shouldBe "368.00MGD"
  }

  "ValueUnit(Q(368, \"xyz/abc\"))" should "368.00xyz/abc" in {
    ValueUnit(Q(368, "xyz/abc")) shouldBe "368.00xyz/abc"
  }

  "ValueUnit(TSS(223))" should "223.00g/m^3" in {
    ValueUnit(TSS(223)) shouldBe "223.00g/m^3"
  }

  "ValueUnit(TSS(223, \"xyz/abc\"))" should "223.00xyz/abc" in {
    ValueUnit(TSS(223, "xyz/abc")) shouldBe "223.00xyz/abc"
  }

  "ValueUnit(CBOD5(234))" should "234.00g/m^3" in {
    ValueUnit(CBOD5(234)) shouldBe "234.00g/m^3"
  }

  "ValueUnit(CBOD5(234, \"xyz/abc\"))" should "234.00xyz/abc" in {
    ValueUnit(CBOD5(234, "xyz/abc")) shouldBe "234.00xyz/abc"
  }

  "ValueUnit(NH3(33))" should "33.00g/m^3" in {
    ValueUnit(NH3(33)) shouldBe "33.00g/m^3"
  }

  "ValueUnit(NH3(33, \"xyz/abc\"))" should "33.00xyz/abc" in {
    ValueUnit(NH3(33, "xyz/abc")) shouldBe "33.00xyz/abc"
  }

  "ValueUnit(TP(6))" should "6.00g/m^3" in {
    ValueUnit(TP(6)) shouldBe "6.00g/m^3"
  }

  "ValueUnit(TP(6, \"xyz/abc\"))" should "6.00xyz/abc" in {
    ValueUnit(TP(6, "xyz/abc")) shouldBe "6.00xyz/abc"
  }

  "ValueUnit(VSS(178.4))" should "178.40g/m^3" in {
    ValueUnit(VSS(178.4)) shouldBe "178.40g/m^3"
  }

  "ValueUnit(VSS(178.4, \"xyz/abc\"))" should "178.40xyz/abc" in {
    ValueUnit(VSS(178.4, "xyz/abc")) shouldBe "178.40xyz/abc"
  }

  "ValueUnit(BOD5(257.4))" should "257.40g/m^3" in {
    ValueUnit(BOD5(257.4)) shouldBe "257.40g/m^3"
  }

  "ValueUnit(BOD5(257.4, \"xyz/abc\"))" should "257.40xyz/abc" in {
    ValueUnit(BOD5(257.4, "xyz/abc")) shouldBe "257.40xyz/abc"
  }

  "ValueUnit(BCOD(411.84))" should "411.84g/m^3" in {
    ValueUnit(BCOD(411.84)) shouldBe "411.84g/m^3"
  }

  "ValueUnit(BCOD(411.84, \"xyz/abc\"))" should "411.84xyz/abc" in {
    ValueUnit(BCOD(411.84, "xyz/abc")) shouldBe "411.84xyz/abc"
  }

  "ValueUnit(BCODp(202.66))" should "202.66g/m^3" in {
    ValueUnit(BCODp(202.66)) shouldBe "202.66g/m^3"
  }

  "ValueUnit(BCODp(202.66, \"xyz/abc\"))" should "202.66xyz/abc" in {
    ValueUnit(BCODp(202.66, "xyz/abc")) shouldBe "202.66xyz/abc"
  }

  "ValueUnit(BCODs(209.18))" should "209.18g/m^3" in {
    ValueUnit(BCODs(209.18)) shouldBe "209.18g/m^3"
  }

  "ValueUnit(BCODs(209.18, \"xyz/abc\"))" should "209.18xyz/abc" in {
    ValueUnit(BCODs(209.18, "xyz/abc")) shouldBe "209.18xyz/abc"
  }

  "ValueUnit(P(310645065.60))" should "310645065.60g/m^3" in {
    ValueUnit(P(310645065.60)) shouldBe "310645065.60g/m^3"
  }

  "ValueUnit(P(310645065.60, \"xyz/abc\"))" should "310645065.60xyz/abc" in {
    ValueUnit(P(310645065.60, "xyz/abc")) shouldBe "310645065.60xyz/abc"
  }

}
