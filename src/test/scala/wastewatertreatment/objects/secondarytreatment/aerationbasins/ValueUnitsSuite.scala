package wastewatertreatment.objects.secondarytreatment.aerationbasins

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.valueunit.ValueUnit

/**
 * Created by ka-son on 10/31/15.
 */
class ValueUnitsSuite extends FlatSpec with Matchers {

  "ValueUnit(ForallT(423819, \"xyz/abc\")" should "423819.00xyz/abc" in {
    ValueUnit(ForallT(423819, "xyz/abc")) shouldBe "423819.00xyz/abc"
  }

  "ValueUnit(ForallT(423819)" should "423819.00m^3" in {
    ValueUnit(ForallT(423819)) shouldBe "423819.00m^3"
  }

  "ValueUnit(ForallT(unit = \"xyz/abc\")" should "423819.00xyz/abc" in {
    ValueUnit(ForallT(unit = "xyz/abc")) shouldBe "423819.00xyz/abc"
  }

  "ValueUnit(ForallT())" should "423819.00m^3" in {
    ValueUnit(ForallT()) shouldBe "423819.00m^3"
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

  "ValueUnit(BODRemoval())" should "97.00%" in {
    ValueUnit(BODRemoval()) shouldBe "97.00%"
  }

  "ValueUnit(BODRemoval(97))" should "97.00%" in {
    ValueUnit(BODRemoval(97)) shouldBe "97.00%"
  }

  "ValueUnit(BODRemoval(unit = \"xyz/abc\"))" should "97.00xyz/abc" in {
    ValueUnit(BODRemoval(unit = "xyz/abc")) shouldBe "97.00xyz/abc"
  }

  "ValueUnit(BODRemoval(97,\"xyz/abc\"))" should "97.00xyz/abc" in {
    ValueUnit(BODRemoval(97, "xyz/abc")) shouldBe "97.00xyz/abc"
  }

  "ValueUnit(TSSRemoval())" should "94.00%" in {
    ValueUnit(TSSRemoval()) shouldBe "94.00%"
  }

  "ValueUnit(TSSRemoval(94))" should "94.00%" in {
    ValueUnit(TSSRemoval(94)) shouldBe "94.00%"
  }

  "ValueUnit(TSSRemoval(unit = \"xyz/abc\"))" should "94.00xyz/abc" in {
    ValueUnit(TSSRemoval(unit = "xyz/abc")) shouldBe "94.00xyz/abc"
  }

  "ValueUnit(TSSRemoval(94, \"xyz/abc\"))" should "94.00xyz/abc" in {
    ValueUnit(TSSRemoval(94, "xyz/abc")) shouldBe "94.00xyz/abc"
  }

  "ValueUnit(TKNRemoval())" should "88.00%" in {
    ValueUnit(TKNRemoval()) shouldBe "88.00%"
  }

  "ValueUnit(TKNRemoval(88))" should "88.00%" in {
    ValueUnit(TKNRemoval(88)) shouldBe "88.00%"
  }

  "ValueUnit(TKNRemoval(unit = \"xyz/abc\"))" should "88.00xyz/abc" in {
    ValueUnit(TKNRemoval(unit = "xyz/abc")) shouldBe "88.00xyz/abc"
  }

  "ValueUnit(TKNRemoval(88, \"xyz/abc\"))" should "88.00xyz/abc" in {
    ValueUnit(TKNRemoval(88, "xyz/abc")) shouldBe "88.00xyz/abc"
  }

  "ValueUnit(NH3NRemoval())" should "97.00%" in {
    ValueUnit(NH3NRemoval()) shouldBe "97.00%"
  }

  "ValueUnit(NH3NRemoval(97))" should "97.00%" in {
    ValueUnit(NH3NRemoval(97)) shouldBe "97.00%"
  }

  "ValueUnit(NH3NRemoval(unit = \"xyz/abc\"))" should "97.00xyz/abc" in {
    ValueUnit(NH3NRemoval(unit = "xyz/abc")) shouldBe "97.00xyz/abc"
  }

  "ValueUnit(NH3NRemoval(97,\"xyz/abc\"))" should "97.00xyz/abc" in {
    ValueUnit(NH3NRemoval(97, "xyz/abc")) shouldBe "97.00xyz/abc"
  }

  "ValueUnit(PhosphorousRemoval())" should "98.00%" in {
    ValueUnit(PhosphorousRemoval()) shouldBe "98.00%"
  }

  "ValueUnit(PhosphorousRemoval(98))" should "98.00%" in {
    ValueUnit(PhosphorousRemoval(98)) shouldBe "98.00%"
  }

  "ValueUnit(PhosphorousRemoval(unit = \"xyz/abc\"))" should "98.00xyz/abc" in {
    ValueUnit(PhosphorousRemoval(unit = "xyz/abc")) shouldBe "98.00xyz/abc"
  }

  "ValueUnit(PhosphorousRemoval(98, \"xyz/abc\"))" should "98.00xyz/abc" in {
    ValueUnit(PhosphorousRemoval(98, "xyz/abc")) shouldBe "98.00xyz/abc"
  }

  "ValueUnit(BCOD5Removal())" should "100.00%" in {
    ValueUnit(BCOD5Removal()) shouldBe "100.00%"
  }

  "ValueUnit(BCOD5Removal(100))" should "100.00%" in {
    ValueUnit(BCOD5Removal(100)) shouldBe "100.00%"
  }

  "ValueUnit(BCOD5Removal(unit = \"xyz/abc\"))" should "100.00xyz/abc" in {
    ValueUnit(BCOD5Removal(unit = "xyz/abc")) shouldBe "100.00xyz/abc"
  }

  "ValueUnit(BCOD5Removal(100, \"xyz/abc\"))" should "100.00xyz/abc" in {
    ValueUnit(BCOD5Removal(100, "xyz/abc")) shouldBe "100.00xyz/abc"
  }

  "ValueUnit(ForallAnoxicForallTotalRatio())" should "0.33" in {
    ValueUnit(ForallAnoxicForallTotalRatio()) shouldBe "0.33"
  }

  "ValueUnit(ForallAnoxicForallTotalRatio(0.33))" should "0.33" in {
    ValueUnit(ForallAnoxicForallTotalRatio(0.33)) shouldBe "0.33"
  }

  "ValueUnit(ForallAnoxicForallTotalRatio(unit = \"xyz/abc\"))" should "0.33xyz/abc" in {
    ValueUnit(ForallAnoxicForallTotalRatio(unit = "xyz/abc")) shouldBe "0.33xyz/abc"
  }

  "ValueUnit(ForallAnoxicForallTotalRatio(0.33, \"xyz/abc\"))" should "0.33xyz/abc" in {
    ValueUnit(ForallAnoxicForallTotalRatio(0.33, "xyz/abc")) shouldBe "0.33xyz/abc"
  }

  "ValueUnit(Snc())" should "0.50g/m^3" in {
    ValueUnit(Snc()) shouldBe "0.50g/m^3"
  }

  "ValueUnit(Snc(0.5))" should "0.50g/m^3" in {
    ValueUnit(Snc(0.5)) shouldBe "0.50g/m^3"
  }

  "ValueUnit(Snc(unit = \"xyz/abc\"))" should "0.50xyz/abc" in {
    ValueUnit(Snc(unit = "xyz/abc")) shouldBe "0.50xyz/abc"
  }

  "ValueUnit(Snc(0.5, \"xyz/abc\"))" should "0.50xyz/abc" in {
    ValueUnit(Snc(0.5, "xyz/abc")) shouldBe "0.50xyz/abc"
  }

  "ValueUnit(Xvss())" should "3000.00g/m^3" in {
    ValueUnit(Xvss()) shouldBe "3000.00g/m^3"
  }

  "ValueUnit(Xvss(3000))" should "3000.00g/m^3" in {
    ValueUnit(Xvss(3000)) shouldBe "3000.00g/m^3"
  }

  "ValueUnit(Xvss(unit = \"xyz/abc\"))" should "3000.00xyz/abc" in {
    ValueUnit(Xvss(unit = "xyz/abc")) shouldBe "3000.00xyz/abc"
  }

  "ValueUnit(Xvss(3000, \"xyz/abc\"))" should "3000.00xyz/abc" in {
    ValueUnit(Xvss(3000, "xyz/abc")) shouldBe "3000.00xyz/abc"
  }

  "ValueUnit(SeBOD())" should "1.00g/m^3" in {
    ValueUnit(SeBOD()) shouldBe "1.00g/m^3"
  }

  "ValueUnit(SeBOD(1))" should "1.00g/m^3" in {
    ValueUnit(SeBOD(1)) shouldBe "1.00g/m^3"
  }

  "ValueUnit(SeBOD(unit = \"xyz/abc\"))" should "1.00xyz/abc" in {
    ValueUnit(SeBOD(unit = "xyz/abc")) shouldBe "1.00xyz/abc"
  }

  "ValueUnit(SeBOD(1, \"xyz/abc\"))" should "1.00xyz/abc" in {
    ValueUnit(SeBOD(1, "xyz/abc")) shouldBe "1.00xyz/abc"
  }

  "ValueUnit(NbvssVSSRatio())" should "0.20" in {
    ValueUnit(NbvssVSSRatio()) shouldBe "0.20"
  }

  "ValueUnit(NbvssVSSRatio(0.2))" should "0.20" in {
    ValueUnit(NbvssVSSRatio(0.2)) shouldBe "0.20"
  }

  "ValueUnit(NbvssVSSRatio(unit = \"xyz/abc\"))" should "0.20xyz/abc" in {
    ValueUnit(NbvssVSSRatio(unit = "xyz/abc")) shouldBe "0.20xyz/abc"
  }

  "ValueUnit(NbvssVSSRatio(0.2, \"xyz/abc\"))" should "0.20xyz/abc" in {
    ValueUnit(NbvssVSSRatio(0.2, "xyz/abc")) shouldBe "0.20xyz/abc"
  }

  "ValueUnit(Ko())" should "0.50g/m^3" in {
    ValueUnit(Ko()) shouldBe "0.50g/m^3"
  }

  "ValueUnit(Ko(0.5))" should "0.50g/m^3" in {
    ValueUnit(Ko(0.5)) shouldBe "0.50g/m^3"
  }

  "ValueUnit(Ko(unit = \"xyz/abc\"))" should "0.50xyz/abc" in {
    ValueUnit(Ko(unit = "xyz/abc")) shouldBe "0.50xyz/abc"
  }

  "ValueUnit(Ko(0.5, \"xyz/abc\"))" should "0.50xyz/abc" in {
    ValueUnit(Ko(0.5, "xyz/abc")) shouldBe "0.50xyz/abc"
  }

  "ValueUnit(Do())" should "2.00g/m^3" in {
    ValueUnit(Do()) shouldBe "2.00g/m^3"
  }

  "ValueUnit(Do(2))" should "2.00g/m^3" in {
    ValueUnit(Do(2)) shouldBe "2.00g/m^3"
  }

  "ValueUnit(Do(unit = \"xyz/abc\"))" should "2.00xyz/abc" in {
    ValueUnit(Do(unit = "xyz/abc")) shouldBe "2.00xyz/abc"
  }

  "ValueUnit(Do(2, \"xyz/abc\"))" should "2.00xyz/abc" in {
    ValueUnit(Do(2, "xyz/abc")) shouldBe "2.00xyz/abc"
  }

  "ValueUnit(Fnd())" should "0.10" in {
    ValueUnit(Fnd()) shouldBe "0.10"
  }

  "ValueUnit(Fnd(0.1))" should "0.10" in {
    ValueUnit(Fnd(0.1)) shouldBe "0.10"
  }

  "ValueUnit(Fnd(unit = \"xyz/abc\"))" should "0.10xyz/abc" in {
    ValueUnit(Fnd(unit = "xyz/abc")) shouldBe "0.10xyz/abc"
  }

  "ValueUnit(Fnd(0.1, \"xyz/abc\"))" should "0.10xyz/abc" in {
    ValueUnit(Fnd(0.1, "xyz/abc")) shouldBe "0.10xyz/abc"
  }

  "ValueUnit(FactorOfSafety())" should "2.00" in {
    ValueUnit(FactorOfSafety()) shouldBe "2.00"
  }

  "ValueUnit(FactorOfSafety(2))" should "2.00" in {
    ValueUnit(FactorOfSafety(2)) shouldBe "2.00"
  }

  "ValueUnit(FactorOfSafety(unit = \"xyz/abc\"))" should "2.00xyz/abc" in {
    ValueUnit(FactorOfSafety(unit = "xyz/abc")) shouldBe "2.00xyz/abc"
  }

  "ValueUnit(FactorOfSafety(2, \"xyz/abc\"))" should "2.00xyz/abc" in {
    ValueUnit(FactorOfSafety(2, "xyz/abc")) shouldBe "2.00xyz/abc"
  }

  "ValueUnit(Xr())" should "8000.00g/m^3" in {
    ValueUnit(Xr()) shouldBe "8000.00g/m^3"
  }

  "ValueUnit(Xr(8000))" should "8000.00g/m^3" in {
    ValueUnit(Xr(8000)) shouldBe "8000.00g/m^3"
  }

  "ValueUnit(Xr(unit = \"xyz/abc\"))" should "8000.00xyz/abc" in {
    ValueUnit(Xr(unit = "xyz/abc")) shouldBe "8000.00xyz/abc"
  }

  "ValueUnit(Xr(8000, \"xyz/abc\"))" should "8000.00xyz/abc" in {
    ValueUnit(Xr(8000, "xyz/abc")) shouldBe "8000.00xyz/abc"
  }

  "ValueUnit(Xn())" should "8000.00g/m^3" in {
    ValueUnit(Xn()) shouldBe "8000.00g/m^3"
  }

  "ValueUnit(Xn(8000))" should "8000.00g/m^3" in {
    ValueUnit(Xn(8000)) shouldBe "8000.00g/m^3"
  }

  "ValueUnit(Xn(unit = \"xyz/abc\"))" should "8000.00xyz/abc" in {
    ValueUnit(Xn(unit = "xyz/abc")) shouldBe "8000.00xyz/abc"
  }

  "ValueUnit(Xn(8000, \"xyz/abc\"))" should "8000.00xyz/abc" in {
    ValueUnit(Xn(8000, "xyz/abc")) shouldBe "8000.00xyz/abc"
  }

  "ValueUnit(Xe())" should "10.00g/m^3" in {
    ValueUnit(Xe()) shouldBe "10.00g/m^3"
  }

  "ValueUnit(Xe(10))" should "10.00g/m^3" in {
    ValueUnit(Xe(10)) shouldBe "10.00g/m^3"
  }

  "ValueUnit(Xe(unit = \"xyz/abc\"))" should "10.00xyz/abc" in {
    ValueUnit(Xe(unit = "xyz/abc")) shouldBe "10.00xyz/abc"
  }

  "ValueUnit(Xe(10, \"xyz/abc\"))" should "10.00xyz/abc" in {
    ValueUnit(Xe(10, "xyz/abc")) shouldBe "10.00xyz/abc"
  }

  "ValueUnit(NOxe())" should "6.00g/m^3" in {
    ValueUnit(NOxe()) shouldBe "6.00g/m^3"
  }

  "ValueUnit(NOxe(6))" should "6.00g/m^3" in {
    ValueUnit(NOxe(6)) shouldBe "6.00g/m^3"
  }

  "ValueUnit(NOxe(unit = \"xyz/abc\"))" should "6.00xyz/abc" in {
    ValueUnit(NOxe(unit = "xyz/abc")) shouldBe "6.00xyz/abc"
  }

  "ValueUnit(NOxe(6, \"xyz/abc\"))" should "6.00xyz/abc" in {
    ValueUnit(NOxe(6, "xyz/abc")) shouldBe "6.00xyz/abc"
  }

  "ValueUnit(RbCOD())" should "0.30g/m^3" in {
    ValueUnit(RbCOD()) shouldBe "0.30g/m^3"
  }

  "ValueUnit(RbCOD(0.3))" should "0.30g/m^3" in {
    ValueUnit(RbCOD(0.3)) shouldBe "0.30g/m^3"
  }

  "ValueUnit(RbCOD(unit = \"xyz/abc\"))" should "0.30xyz/abc" in {
    ValueUnit(RbCOD(unit = "xyz/abc")) shouldBe "0.30xyz/abc"
  }

  "ValueUnit(RbCOD(0.3, \"xyz/abc\"))" should "0.30xyz/abc" in {
    ValueUnit(RbCOD(0.3, "xyz/abc")) shouldBe "0.30xyz/abc"
  }

}
