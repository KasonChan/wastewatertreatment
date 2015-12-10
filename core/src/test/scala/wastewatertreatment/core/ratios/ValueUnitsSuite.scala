package wastewatertreatment.core.ratios

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.core.valueunit.ValueUnit

/**
 * Created by kasonchan on 12/3/15.
 */
class ValueUnitsSuite extends FlatSpec with Matchers with ValueUnits {

  "ValueUnit(BOD5CBOD5Ratio(Some(1.1)))" should "1.10" in {
    ValueUnit(BOD5CBOD5Ratio(Some(1.1))) shouldBe "1.10"
  }

  "ValueUnit(BOD5CBOD5Ratio())" should "1.10" in {
    ValueUnit(BOD5CBOD5Ratio()) shouldBe "1.10"
  }

  "ValueUnit(BOD5CBOD5Ratio(Some(1.1,\"xyz/abc\"))" should "1.10xyz/abc" in {
    ValueUnit(BOD5CBOD5Ratio(Some(1.1), "xyz/abc")) shouldBe "1.10xyz/abc"
  }

  "ValueUnit(BOD5CBOD5Ratio(unit = \"xyz/abc\"))" should "1.10xyz/abc" in {
    ValueUnit(BOD5CBOD5Ratio(unit = "xyz/abc")) shouldBe "1.10xyz/abc"
  }

  "ValueUnit(CODBODRatio(Some(1.6)))" should "1.60" in {
    ValueUnit(CODBODRatio(Some(1.6))) shouldBe "1.60"
  }

  "ValueUnit(CODBODRatio())" should "1.60" in {
    ValueUnit(CODBODRatio()) shouldBe "1.60"
  }

  "ValueUnit(CODBODRatio(Some(1.6), \"xyz/abc\"))" should "1.60xyz/abc" in {
    ValueUnit(CODBODRatio(Some(1.6), "xyz/abc")) shouldBe "1.60xyz/abc"
  }

  "ValueUnit(CODBODRatio(unit = \"xyz/abc\"))" should "1.60xyz/abc" in {
    ValueUnit(CODBODRatio(unit = "xyz/abc")) shouldBe "1.60xyz/abc"
  }

  "ValueUnit(CODVSSRatio(Some(1.42)))" should "1.42" in {
    ValueUnit(CODVSSRatio(Some(1.42))) shouldBe "1.42"
  }

  "ValueUnit(CODVSSRatio())" should "1.42" in {
    ValueUnit(CODVSSRatio()) shouldBe "1.42"
  }

  "ValueUnit(CODVSSRatio(Some(1.42),\"xyz/abc\"))" should "1.42xyz/abc" in {
    ValueUnit(CODVSSRatio(Some(1.42), "xyz/abc")) shouldBe "1.42xyz/abc"
  }

  "ValueUnit(CODVSSRatio(unit = \"xyz/abc\"))" should "1.42xyz/abc" in {
    ValueUnit(CODVSSRatio(unit = "xyz/abc")) shouldBe "1.42xyz/abc"
  }

  "ValueUnit(VSSTSSRatio(Some(0.8)))" should "0.80" in {
    ValueUnit(VSSTSSRatio(Some(0.8))) shouldBe "0.80"
  }

  "ValueUnit(VSSTSSRatio())" should "0.80" in {
    ValueUnit(VSSTSSRatio()) shouldBe "0.80"
  }

  "ValueUnit(VSSTSSRatio(Some(0.8),\"xyz/abc\"))" should "0.80xyz/abc" in {
    ValueUnit(VSSTSSRatio(Some(0.8), "xyz/abc")) shouldBe "0.80xyz/abc"
  }

  "ValueUnit(VSSTSSRatio(unit = \"xyz/abc\"))" should "0.80xyz/abc" in {
    ValueUnit(VSSTSSRatio(unit = "xyz/abc")) shouldBe "0.80xyz/abc"
  }

  "ValueUnit(BVSSVSSRatio(Some(0.8)))" should "0.80" in {
    ValueUnit(BVSSVSSRatio(Some(0.8))) shouldBe "0.80"
  }

  "ValueUnit(BVSSVSSRatio())" should "0.80" in {
    ValueUnit(BVSSVSSRatio()) shouldBe "0.80"
  }

  "ValueUnit(BVSSVSSRatio(Some(0.8),\"xyz/abc\"))" should "0.80xyz/abc" in {
    ValueUnit(BVSSVSSRatio(Some(0.8), "xyz/abc")) shouldBe "0.80xyz/abc"
  }

  "ValueUnit(BVSSVSSRatio(unit = \"xyz/abc\"))" should "0.80xyz/abc" in {
    ValueUnit(BVSSVSSRatio(unit = "xyz/abc")) shouldBe "0.80xyz/abc"
  }

  "ValueUnit(NBVSSVSSRatio(Some(0.2)))" should "0.20" in {
    ValueUnit(NBVSSVSSRatio(Some(0.2))) shouldBe "0.20"
  }

  "ValueUnit(NBVSSVSSRatio())" should "0.20" in {
    ValueUnit(NBVSSVSSRatio()) shouldBe "0.20"
  }

  "ValueUnit(NBVSSVSSRatio(Some(0.2),\"xyz/abc\"))" should "0.20xyz/abc" in {
    ValueUnit(NBVSSVSSRatio(Some(0.2), "xyz/abc")) shouldBe "0.20xyz/abc"
  }

  "ValueUnit(NBVSSVSSRatio(unit = \"xyz/abc\"))" should "0.20xyz/abc" in {
    ValueUnit(NBVSSVSSRatio(unit = "xyz/abc")) shouldBe "0.20xyz/abc"
  }

  "ValueUnit(NTUTSSRatio(Some(0.5)))" should "0.50" in {
    ValueUnit(NTUTSSRatio(Some(0.5))) shouldBe "0.50"
  }

  "ValueUnit(NTUTSSRatio())" should "0.50" in {
    ValueUnit(NTUTSSRatio()) shouldBe "0.50"
  }

  "ValueUnit(NTUTSSRatio(Some(0.5),\"xyz/abc\"))" should "0.50xyz/abc" in {
    ValueUnit(NTUTSSRatio(Some(0.5), "xyz/abc")) shouldBe "0.50xyz/abc"
  }

  "ValueUnit(NTUTSSRatio(unit = \"xyz/abc\"))" should "0.50xyz/abc" in {
    ValueUnit(NTUTSSRatio(unit = "xyz/abc")) shouldBe "0.50xyz/abc"
  }

  "Default removals" should "pass" in {
    val defaultRatios = MiscellaneousRatios()
    defaultRatios.bod5CBOD5 shouldBe BOD5CBOD5Ratio(Some(1.10), "")
    defaultRatios.codBOD shouldBe CODBODRatio(Some(1.60), "")
    defaultRatios.codVSS shouldBe CODVSSRatio(Some(1.42), "")
    defaultRatios.vssTSS shouldBe VSSTSSRatio(Some(0.80), "")
    defaultRatios.bvssVSS shouldBe BVSSVSSRatio(Some(0.80), "")
    defaultRatios.nbvssVSS shouldBe NBVSSVSSRatio(Some(0.20), "")
    defaultRatios.ntuTSS shouldBe NTUTSSRatio(Some(0.50), "")
    defaultRatios.pVSS shouldBe PVSSRatio(Some(0.02), "")
  }

}
