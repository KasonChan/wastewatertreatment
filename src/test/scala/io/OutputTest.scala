package io

import objects.pretreatment.screen._
import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by kasonchan on 10/26/15.
 */
class OutputTest extends FlatSpec with Matchers {

  "OutputTest(TSSRemoval(27))" should "27.00%" in {
    Output(TSSRemoval(27)) shouldBe "27.00%"
  }

  "OutputTest(BOD5Removal(27))" should "27.00%" in {
    Output(BOD5Removal(27)) shouldBe "27.00%"
  }

  "OutputTest(Q(1090195))" should "1090195.00m^3/d" in {
    Output(Q(1090195)) shouldBe "1090195.00m^3/d"
  }

  "OutputTest(TSSo(223))" should "223.00g/m^3" in {
    Output(TSSo(223)) shouldBe "223.00g/m^3"
  }

  "OutputTest(TSSe(162.8))" should "162.80g/m^3" in {
    Output(TSSe(162.8)) shouldBe "162.80g/m^3"
  }

  "OutputTest(BOD5o(257.5))" should "257.50g/m^3" in {
    Output(BOD5o(257.5)) shouldBe "257.50g/m^3"
  }

  "OutputTest(BOD5e(189))" should "189.00g/m^3" in {
    Output(BOD5e(189)) shouldBe "189.00g/m^3"
  }

  "OutputTest(BOD5CBOD5Ratio(1.1))" should "1.10g-BOD5/g-cBOD5" in {
    Output(BOD5CBOD5Ratio(1.1)) shouldBe "1.10g-BOD5/g-cBOD5"
  }

  "OutputTest(CODBODRatio(1.6))" should "1.60g-COD/g-BOD" in {
    Output(CODBODRatio(1.6)) shouldBe "1.60g-COD/g-BOD"
  }

  "OutputTest(CODVSSRatio(1.42))" should "1.42g-COD/g-VSS" in {
    Output(CODVSSRatio(1.42)) shouldBe "1.42g-COD/g-VSS"
  }

  "OutputTest(VSSTSSRatio(0.8))" should "0.80g-VSS/g-TSS" in {
    Output(VSSTSSRatio(0.8)) shouldBe "0.80g-VSS/g-TSS"
  }

  "OutputTest(VSSe(130))" should "130.00g/m^3" in {
    Output(VSSe(130)) shouldBe "130.00g/m^3"
  }

  "OutputTest(CBOD5e(171))" should "171.00g/m^3" in {
    Output(CBOD5e(171)) shouldBe "171.00g/m^3"
  }

  "OutputTest(BCODe(301))" should "301.00g/m^3" in {
    Output(BCODe(301)) shouldBe "301.00g/m^3"
  }

  "OutputTest(BCODpe(148.464))" should "148.46g/m^3" in {
    Output(BCODpe(148.464)) shouldBe "148.46g/m^3"
  }

  "OutputTest(BCODs(153.295))" should "153.30g/m^3" in {
    Output(BCODs(153.295)) shouldBe "153.30g/m^3"
  }

  "OutputTest(P(1.41))" should "1.41g-TSS/d" in {
    Output(P(1.41)) shouldBe "1.41g-TSS/d"
  }

}
