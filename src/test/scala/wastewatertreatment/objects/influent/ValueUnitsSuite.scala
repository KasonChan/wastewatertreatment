package wastewatertreatment.objects.influent

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.valueunit.ValueUnit

/**
 * Created by kasonchan on 11/8/15.
 */
class ValueUnitsSuite extends FlatSpec with Matchers {

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

  "ValueUnit(BOD5CBOD5Ratio(1.1))" should "1.10" in {
    ValueUnit(BOD5CBOD5Ratio(1.1)) shouldBe "1.10"
  }

  "ValueUnit(BOD5CBOD5Ratio())" should "1.10" in {
    ValueUnit(BOD5CBOD5Ratio()) shouldBe "1.10"
  }

  "ValueUnit(BOD5CBOD5Ratio(1.1,\"xyz/abc\"))" should "1.10xyz/abc" in {
    ValueUnit(BOD5CBOD5Ratio(1.1, "xyz/abc")) shouldBe "1.10xyz/abc"
  }

  "ValueUnit(BOD5CBOD5Ratio(unit = \"xyz/abc\"))" should "1.10xyz/abc" in {
    ValueUnit(BOD5CBOD5Ratio(unit = "xyz/abc")) shouldBe "1.10xyz/abc"
  }

  "ValueUnit(CODBODRatio(1.6))" should "1.60" in {
    ValueUnit(CODBODRatio(1.6)) shouldBe "1.60"
  }

  "ValueUnit(CODBODRatio())" should "1.60" in {
    ValueUnit(CODBODRatio()) shouldBe "1.60"
  }

  "ValueUnit(CODBODRatio(1.6, \"xyz/abc\"))" should "1.60xyz/abc" in {
    ValueUnit(CODBODRatio(1.6, "xyz/abc")) shouldBe "1.60xyz/abc"
  }

  "ValueUnit(CODBODRatio(unit = \"xyz/abc\"))" should "1.60xyz/abc" in {
    ValueUnit(CODBODRatio(unit = "xyz/abc")) shouldBe "1.60xyz/abc"
  }

  "ValueUnit(CODVSSRatio(1.42))" should "1.42" in {
    ValueUnit(CODVSSRatio(1.42)) shouldBe "1.42"
  }

  "ValueUnit(CODVSSRatio())" should "1.42" in {
    ValueUnit(CODVSSRatio()) shouldBe "1.42"
  }

  "ValueUnit(CODVSSRatio(1.42,\"xyz/abc\"))" should "1.42xyz/abc" in {
    ValueUnit(CODVSSRatio(1.42, "xyz/abc")) shouldBe "1.42xyz/abc"
  }

  "ValueUnit(CODVSSRatio(unit = \"xyz/abc\"))" should "1.42xyz/abc" in {
    ValueUnit(CODVSSRatio(unit = "xyz/abc")) shouldBe "1.42xyz/abc"
  }

  "ValueUnit(VSSTSSRatio(0.8))" should "0.80" in {
    ValueUnit(VSSTSSRatio(0.8)) shouldBe "0.80"
  }

  "ValueUnit(VSSTSSRatio())" should "0.80" in {
    ValueUnit(VSSTSSRatio()) shouldBe "0.80"
  }

  "ValueUnit(VSSTSSRatio(0.8,\"xyz/abc\"))" should "0.80xyz/abc" in {
    ValueUnit(VSSTSSRatio(0.8, "xyz/abc")) shouldBe "0.80xyz/abc"
  }

  "ValueUnit(VSSTSSRatio(unit = \"xyz/abc\"))" should "0.80xyz/abc" in {
    ValueUnit(VSSTSSRatio(unit = "xyz/abc")) shouldBe "0.80xyz/abc"
  }

  "ValueUnit(TN(40.0))" should "40.00g/m^3" in {
    ValueUnit(TN(40.0)) shouldBe "40.00g/m^3"
  }

  "ValueUnit(TN())" should "40.00g/m^3" in {
    ValueUnit(TN()) shouldBe "40.00g/m^3"
  }

  "ValueUnit(TN(40,\"xyz/abc\"))" should "40.00xyz/abc" in {
    ValueUnit(TN(40, "xyz/abc")) shouldBe "40.00xyz/abc"
  }

  "ValueUnit(TN(unit = \"xyz/abc\"))" should "40.00xyz/abc" in {
    ValueUnit(TN(unit = "xyz/abc")) shouldBe "40.00xyz/abc"
  }

  "ValueUnit(BVSS(0.8))" should "0.80" in {
    ValueUnit(BVSS(0.8)) shouldBe "0.80"
  }

  "ValueUnit(BVSS())" should "0.80" in {
    ValueUnit(BVSS()) shouldBe "0.80"
  }

  "ValueUnit(BVSS(0.8,\"xyz/abc\"))" should "0.80xyz/abc" in {
    ValueUnit(BVSS(0.8, "xyz/abc")) shouldBe "0.80xyz/abc"
  }

  "ValueUnit(BVSS(unit = \"xyz/abc\"))" should "0.80xyz/abc" in {
    ValueUnit(BVSS(unit = "xyz/abc")) shouldBe "0.80xyz/abc"
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

}
