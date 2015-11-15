package wastewatertreatment.assumptions

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.valueunit.ValueUnit

/**
 * Created by kasonchan on 11/15/15.
 */
class ValueUnitsSuite extends FlatSpec with Matchers with ValueUnits {

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

  "ValueUnit(NbVSS(0.2))" should "0.20" in {
    ValueUnit(NbVSS(0.2)) shouldBe "0.20"
  }

  "ValueUnit(NbVSS())" should "0.20" in {
    ValueUnit(NbVSS()) shouldBe "0.20"
  }

  "ValueUnit(NbVSS(0.2,\"xyz/abc\"))" should "0.20xyz/abc" in {
    ValueUnit(NbVSS(0.2, "xyz/abc")) shouldBe "0.20xyz/abc"
  }

  "ValueUnit(NbVSS(unit = \"xyz/abc\"))" should "0.20xyz/abc" in {
    ValueUnit(NbVSS(unit = "xyz/abc")) shouldBe "0.20xyz/abc"
  }

}
