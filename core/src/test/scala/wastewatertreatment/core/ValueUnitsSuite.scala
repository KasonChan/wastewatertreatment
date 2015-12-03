package wastewatertreatment.core

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.valueunit.ValueUnit

/**
 * Created by kasonchan on 11/16/15.
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

  "ValueUnit(TN(Some(40.0)))" should "40.00g/m^3" in {
    ValueUnit(TN(Some(40.0))) shouldBe "40.00g/m^3"
  }

  "ValueUnit(TN())" should "40.00g/m^3" in {
    ValueUnit(TN()) shouldBe "40.00g/m^3"
  }

  "ValueUnit(TN(Some(40.0),\"xyz/abc\"))" should "40.00xyz/abc" in {
    ValueUnit(TN(Some(40.0), "xyz/abc")) shouldBe "40.00xyz/abc"
  }

  "ValueUnit(TN(unit = \"xyz/abc\"))" should "40.00xyz/abc" in {
    ValueUnit(TN(unit = "xyz/abc")) shouldBe "40.00xyz/abc"
  }

  "ValueUnit(BVSS(Some(0.8)))" should "0.80" in {
    ValueUnit(BVSS(Some(0.8))) shouldBe "0.80"
  }

  "ValueUnit(BVSS())" should "0.80" in {
    ValueUnit(BVSS()) shouldBe "0.80"
  }

  "ValueUnit(BVSS(Some(0.8),\"xyz/abc\"))" should "0.80xyz/abc" in {
    ValueUnit(BVSS(Some(0.8), "xyz/abc")) shouldBe "0.80xyz/abc"
  }

  "ValueUnit(BVSS(unit = \"xyz/abc\"))" should "0.80xyz/abc" in {
    ValueUnit(BVSS(unit = "xyz/abc")) shouldBe "0.80xyz/abc"
  }

  "ValueUnit(NbVSS(Some(0.2)))" should "0.20" in {
    ValueUnit(NbVSS(Some(0.2))) shouldBe "0.20"
  }

  "ValueUnit(NbVSS())" should "0.20" in {
    ValueUnit(NbVSS()) shouldBe "0.20"
  }

  "ValueUnit(NbVSS(Some(0.2),\"xyz/abc\"))" should "0.20xyz/abc" in {
    ValueUnit(NbVSS(Some(0.2), "xyz/abc")) shouldBe "0.20xyz/abc"
  }

  "ValueUnit(NbVSS(unit = \"xyz/abc\"))" should "0.20xyz/abc" in {
    ValueUnit(NbVSS(unit = "xyz/abc")) shouldBe "0.20xyz/abc"
  }

  "ValueUnit(Q(Some(1240973.21)))" should "1240973.21m^3/d" in {
    ValueUnit(Q(Some(1240973.21))) shouldBe "1240973.21m^3/d"
  }

  "ValueUnit(Q(Some(1240973.21),\"xyz/abc\"))" should "1240973.21xyz/abc" in {
    ValueUnit(Q(Some(1240973.21), "xyz/abc")) shouldBe "1240973.21xyz/abc"
  }

  "ValueUnit(TSS(Some(201.55)))" should "201.55g/m^3" in {
    ValueUnit(TSS(Some(201.55))) shouldBe "201.55g/m^3"
  }

  "ValueUnit(TSS(Some(201.55),\"xyz/abc\"))" should "201.55xyz/abc" in {
    ValueUnit(TSS(Some(201.55), "xyz/abc")) shouldBe "201.55xyz/abc"
  }

  "ValueUnit(VSS(Some(161.24)))" should "161.24g/m^3" in {
    ValueUnit(VSS(Some(161.24))) shouldBe "161.24g/m^3"
  }

  "ValueUnit(VSS(Some(161.24),\"xyz/abc\"))" should "161.24xyz/abc" in {
    ValueUnit(VSS(Some(161.24), "xyz/abc")) shouldBe "161.24xyz/abc"
  }

  "ValueUnit(BOD5(Some(232.42)))" should "232.42g/m^3" in {
    ValueUnit(BOD5(Some(232.42))) shouldBe "232.42g/m^3"
  }

  "ValueUnit(BOD5(Some(232.42),\"xyz/abc\"))" should "232.42xyz/abc" in {
    ValueUnit(BOD5(Some(232.42), "xyz/abc")) shouldBe "232.42xyz/abc"
  }

  "ValueUnit(CBOD5(Some(211.29)))" should "211.29g/m^3" in {
    ValueUnit(CBOD5(Some(211.29))) shouldBe "211.29g/m^3"
  }

  "ValueUnit(CBOD5(Some(211.29),\"xyz/abc\"))" should "211.29xyz/abc" in {
    ValueUnit(CBOD5(Some(211.29), "xyz/abc")) shouldBe "211.29xyz/abc"
  }

  "ValueUnit(BCOD(Some(371.92)))" should "371.92g/m^3" in {
    ValueUnit(BCOD(Some(371.92))) shouldBe "371.92g/m^3"
  }

  "ValueUnit(BCOD(Some(371.92),\"xyz/abc\"))" should "371.92xyz/abc" in {
    ValueUnit(BCOD(Some(371.92), "xyz/abc")) shouldBe "371.92xyz/abc"
  }

  "ValueUnit(BCODs(Some(188.75)))" should "188.75g/m^3" in {
    ValueUnit(BCODs(Some(188.75))) shouldBe "188.75g/m^3"
  }

  "ValueUnit(BCODs(Some(188.75),\"xyz/abc\"))" should "188.75xyz/abc" in {
    ValueUnit(BCODs(Some(188.75), "xyz/abc")) shouldBe "188.75xyz/abc"
  }

  "ValueUnit(BCODp(Some(183.17)))" should "183.17g/m^3" in {
    ValueUnit(BCODp(Some(183.17))) shouldBe "183.17g/m^3"
  }

  "ValueUnit(BCODp(Some(183.17),\"xyz/abc\"))" should "183.17xyz/abc" in {
    ValueUnit(BCODp(Some(183.17), "xyz/abc")) shouldBe "183.17xyz/abc"
  }

  "ValueUnit(NH3N(Some(30.20)))" should "30.20g/m^3" in {
    ValueUnit(NH3N(Some(30.20))) shouldBe "30.20g/m^3"
  }

  "ValueUnit(NH3N(Some(30.20),\"xyz/abc\"))" should "30.20xyz/abc" in {
    ValueUnit(NH3N(Some(30.20), "xyz/abc")) shouldBe "30.20xyz/abc"
  }

  "ValueUnit(TP(Some(5.59)))" should "5.59g/m^3" in {
    ValueUnit(TP(Some(5.59))) shouldBe "5.59g/m^3"
  }

  "ValueUnit(TP(Some(5.59),\"xyz/abc\"))" should "5.59xyz/abc" in {
    ValueUnit(TP(Some(5.59), "xyz/abc")) shouldBe "5.59xyz/abc"
  }

  "ValueUnit(P(Some(243624747.24)))" should "243624747.24g-TSS/d" in {
    ValueUnit(P(Some(243624747.24))) shouldBe "243624747.24g-TSS/d"
  }

  "ValueUnit(P(Some(243624747.24),\"xyz/abc\"))" should "243624747.24xyz/abc" in {
    ValueUnit(P(Some(243624747.24), "xyz/abc")) shouldBe "243624747.24xyz/abc"
  }

  "ValueUnit(FecalColiform(Some(28389192.31)))" should "28389192.31MPN/100mL" in {
    ValueUnit(FecalColiform(Some(28389192.31))) shouldBe "28389192.31MPN/100mL"
  }

  "ValueUnit(FecalColiform(Some(28389192.31),\"xyz/abc\"))" should "28389192.31xyz/abc" in {
    ValueUnit(FecalColiform(Some(28389192.31), "xyz/abc")) shouldBe "28389192.31xyz/abc"
  }

  "ValueUnit(Enterococci(Some(10000.00)))" should "10000.00MPN/100mL" in {
    ValueUnit(Enterococci(Some(10000.00))) shouldBe "10000.00MPN/100mL"
  }

  "ValueUnit(Enterococci(Some(10000.00),\"xyz/abc\"))" should "10000.00xyz/abc" in {
    ValueUnit(Enterococci(Some(10000.00), "xyz/abc")) shouldBe "10000.00xyz/abc"
  }

  "ValueUnit(Turbidity(Some(365.00)))" should "365.00NTU" in {
    ValueUnit(Turbidity(Some(365.00))) shouldBe "365.00NTU"
  }

  "ValueUnit(Turbidity(Some(365.00),\"xyz/abc\"))" should "365.00xyz/abc" in {
    ValueUnit(Turbidity(Some(365.00), "xyz/abc")) shouldBe "365.00xyz/abc"
  }



}
