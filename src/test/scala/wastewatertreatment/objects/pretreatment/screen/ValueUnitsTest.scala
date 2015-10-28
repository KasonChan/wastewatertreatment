package wastewatertreatment.objects.pretreatment.screen

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.valueunit.ValueUnit

/**
 * Created by kasonchan on 10/27/15.
 */
class ValueUnitsTest extends FlatSpec with Matchers {

  "ValueUnit(TSSRemoval(27))" should "27.00%" in {
    ValueUnit(TSSRemoval(27)) shouldBe "27.00%"
  }

  "ValueUnit(BOD5Removal(27))" should "27.00%" in {
    ValueUnit(BOD5Removal(27)) shouldBe "27.00%"
  }

  "ValueUnit(Q(1090195))" should "1090195.00m^3/d" in {
    ValueUnit(Q(1090195)) shouldBe "1090195.00m^3/d"
  }

  "ValueUnit(TSSo(223))" should "223.00g/m^3" in {
    ValueUnit(TSSo(223)) shouldBe "223.00g/m^3"
  }

  "ValueUnit(TSSe(162.8))" should "162.80g/m^3" in {
    ValueUnit(TSSe(162.8)) shouldBe "162.80g/m^3"
  }

  "ValueUnit(BOD5o(257.5))" should "257.50g/m^3" in {
    ValueUnit(BOD5o(257.5)) shouldBe "257.50g/m^3"
  }

  "ValueUnit(BOD5e(189))" should "189.00g/m^3" in {
    ValueUnit(BOD5e(189)) shouldBe "189.00g/m^3"
  }

  "ValueUnit(BOD5CBOD5Ratio(1.1))" should "1.10g-BOD5/g-cBOD5" in {
    ValueUnit(BOD5CBOD5Ratio(1.1)) shouldBe "1.10g-BOD5/g-cBOD5"
  }

  "ValueUnit(CODBODRatio(1.6))" should "1.60g-COD/g-BOD" in {
    ValueUnit(CODBODRatio(1.6)) shouldBe "1.60g-COD/g-BOD"
  }

  "ValueUnit(CODVSSRatio(1.42))" should "1.42g-COD/g-VSS" in {
    ValueUnit(CODVSSRatio(1.42)) shouldBe "1.42g-COD/g-VSS"
  }

  "ValueUnit(VSSTSSRatio(0.8))" should "0.80g-VSS/g-TSS" in {
    ValueUnit(VSSTSSRatio(0.8)) shouldBe "0.80g-VSS/g-TSS"
  }

  "ValueUnit(VSSe(130))" should "130.00g/m^3" in {
    ValueUnit(VSSe(130)) shouldBe "130.00g/m^3"
  }

  "ValueUnit(CBOD5e(171))" should "171.00g/m^3" in {
    ValueUnit(CBOD5e(171)) shouldBe "171.00g/m^3"
  }

  "ValueUnit(BCODe(301))" should "301.00g/m^3" in {
    ValueUnit(BCODe(301)) shouldBe "301.00g/m^3"
  }

  "ValueUnit(BCODpe(148.464))" should "148.46g/m^3" in {
    ValueUnit(BCODpe(148.464)) shouldBe "148.46g/m^3"
  }

  "ValueUnit(BCODs(153.295))" should "153.30g/m^3" in {
    ValueUnit(BCODs(153.295)) shouldBe "153.30g/m^3"
  }

  "ValueUnit(P(1.41))" should "1.41g-TSS/d" in {
    ValueUnit(P(1.41)) shouldBe "1.41g-TSS/d"
  }

}
