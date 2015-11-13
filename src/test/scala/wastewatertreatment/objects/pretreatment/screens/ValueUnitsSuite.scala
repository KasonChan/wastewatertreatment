package wastewatertreatment.objects.pretreatment.screens

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.pretreatment.screens.ValueUnits._
import wastewatertreatment.valueunit.ValueUnit

/**
 * Created by kasonchan on 10/27/15.
 */
class ValueUnitsSuite extends FlatSpec with Matchers {

  "ValueUnit(TSSRemoval(27))" should "27.00%" in {
    ValueUnit(TSSRemoval(27)) shouldBe "27.00%"
  }

  "ValueUnit(TSSRemoval())" should "27.00%" in {
    ValueUnit(TSSRemoval()) shouldBe "27.00%"
  }

  "ValueUnit(TSSRemoval(27, \"xyz/abc\"))" should "27.00xyz/abc" in {
    ValueUnit(TSSRemoval(27, "xyz/abc")) shouldBe "27.00xyz/abc"
  }

  "ValueUnit(TSSRemoval(unit = \"xyz/abc\"))" should "27.00xyz/abc" in {
    ValueUnit(TSSRemoval(unit = "xyz/abc")) shouldBe "27.00xyz/abc"
  }

  "ValueUnit(BOD5Removal(27))" should "27.00%" in {
    ValueUnit(BOD5Removal(27)) shouldBe "27.00%"
  }

  "ValueUnit(BOD5Removal())" should "27.00%" in {
    ValueUnit(BOD5Removal()) shouldBe "27.00%"
  }

  "ValueUnit(BOD5Removal(27, \"xyz/abc\"))" should "27.00xyz/abc" in {
    ValueUnit(BOD5Removal(27, "xyz/abc")) shouldBe "27.00xyz/abc"
  }

  "ValueUnit(BOD5Removal(unit = \"xyz/abc\"))" should "27.00xyz/abc" in {
    ValueUnit(BOD5Removal(unit = "xyz/abc")) shouldBe "27.00xyz/abc"
  }

  "ValueUnit(Q(1090195))" should "1090195.00m^3/d" in {
    ValueUnit(Q(1090195)) shouldBe "1090195.00m^3/d"
  }

  "ValueUnit(Q(1090195, \"xyz/abc\"))" should "1090195.00xyz/abc" in {
    ValueUnit(Q(1090195, "xyz/abc")) shouldBe "1090195.00xyz/abc"
  }

  "ValueUnit(TSSo(223))" should "223.00g/m^3" in {
    ValueUnit(TSSo(223)) shouldBe "223.00g/m^3"
  }

  "ValueUnit(TSSo(223, \"xyz/abc\"))" should "223.00xyz/abc" in {
    ValueUnit(TSSo(223, "xyz/abc")) shouldBe "223.00xyz/abc"
  }

  "ValueUnit(TSSe(162.8))" should "162.80g/m^3" in {
    ValueUnit(TSSe(162.8)) shouldBe "162.80g/m^3"
  }

  "ValueUnit(TSSe(162.8, \"xyz/abc\"))" should "162.80xyz/abc" in {
    ValueUnit(TSSe(162.8, "xyz/abc")) shouldBe "162.80xyz/abc"
  }

  "ValueUnit(BOD5o(257.5))" should "257.50g/m^3" in {
    ValueUnit(BOD5o(257.5)) shouldBe "257.50g/m^3"
  }

  "ValueUnit(BOD5o(257.5, \"xyz/abc\"))" should "257.50xyz/abc" in {
    ValueUnit(BOD5o(257.5, "xyz/abc")) shouldBe "257.50xyz/abc"
  }

  "ValueUnit(BOD5e(189))" should "189.00g/m^3" in {
    ValueUnit(BOD5e(189)) shouldBe "189.00g/m^3"
  }

  "ValueUnit(BOD5e(189,\"xyz/abc\"))" should "189.00xyz/abc" in {
    ValueUnit(BOD5e(189, "xyz/abc")) shouldBe "189.00xyz/abc"
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

  "ValueUnit(VSSe(130))" should "130.00g/m^3" in {
    ValueUnit(VSSe(130)) shouldBe "130.00g/m^3"
  }

  "ValueUnit(VSSe(130,\"xyz/abc\"))" should "130.00xyz/abc" in {
    ValueUnit(VSSe(130, "xyz/abc")) shouldBe "130.00xyz/abc"
  }

  "ValueUnit(CBOD5e(171))" should "171.00g/m^3" in {
    ValueUnit(CBOD5e(171)) shouldBe "171.00g/m^3"
  }

  "ValueUnit(CBOD5e(171,\"xyz/abc\"))" should "171.00xyz/abc" in {
    ValueUnit(CBOD5e(171, "xyz/abc")) shouldBe "171.00xyz/abc"
  }

  "ValueUnit(BCODe(301))" should "301.00g/m^3" in {
    ValueUnit(BCODe(301)) shouldBe "301.00g/m^3"
  }

  "ValueUnit(BCODe(301, \"xyz/abc\"))" should "301.00xyz/abc" in {
    ValueUnit(BCODe(301, "xyz/abc")) shouldBe "301.00xyz/abc"
  }

  "ValueUnit(BCODpe(148.464))" should "148.46g/m^3" in {
    ValueUnit(BCODpe(148.464)) shouldBe "148.46g/m^3"
  }

  "ValueUnit(BCODpe(148.464, \"xyz/abc\"))" should "148.46xyz/abc" in {
    ValueUnit(BCODpe(148.464, "xyz/abc")) shouldBe "148.46xyz/abc"
  }

  "ValueUnit(BCODs(153.295))" should "153.30g/m^3" in {
    ValueUnit(BCODs(153.295)) shouldBe "153.30g/m^3"
  }

  "ValueUnit(BCODs(153.295, \"xyz/abc\"))" should "153.30xyz/abc" in {
    ValueUnit(BCODs(153.295, "xyz/abc")) shouldBe "153.30xyz/abc"
  }

  "ValueUnit(P(1.41))" should "1.41g-TSS/d" in {
    ValueUnit(P(1.41)) shouldBe "1.41g-TSS/d"
  }

  "ValueUnit(P(1.41, \"xyz/abc\"))" should "1.41xyz/abc" in {
    ValueUnit(P(1.41, "xyz/abc")) shouldBe "1.41xyz/abc"
  }

}
