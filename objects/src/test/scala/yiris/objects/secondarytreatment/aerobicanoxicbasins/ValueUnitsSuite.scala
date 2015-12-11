package yiris.objects.secondarytreatment.aerobicanoxicbasins

import org.scalatest.{FlatSpec, Matchers}
import yiris.core.valueunit.ValueUnit
import yiris.core.{fluent, ratios}
import yiris.objects.secondarytreatment.aerobicanoxicbasins.ValueUnits._

/**
 * Created by kasonchan on 11/17/15.
 */
class ValueUnitsSuite extends FlatSpec with Matchers with fluent.ValueUnits with ratios.ValueUnits {

  "ValueUnit(ForallT(Some(423819))" should "423819.00m^3" in {
    ValueUnit(ForallT(Some(423819))) shouldBe "423819.00m^3"
  }

  "ValueUnit(ForallT(Some(423819), \"xyz/abc\")" should "423819.00xyz/abc" in {
    ValueUnit(ForallT(Some(423819), "xyz/abc")) shouldBe "423819.00xyz/abc"
  }

  "ValueUnit(QPeak(Some(1393027))" should "1393027.00m^3/d" in {
    ValueUnit(QPeak(Some(1393027))) shouldBe "1393027.00m^3/d"
  }

  "ValueUnit(QPeak(Some(1393027), \"xyz/abc\")" should "1393027.00xyz/abc" in {
    ValueUnit(QPeak(Some(1393027), "xyz/abc")) shouldBe "1393027.00xyz/abc"
  }

  "ValueUnit(Theta(Some(0.30)))" should "0.30d" in {
    ValueUnit(Theta(Some(0.30))) shouldBe "0.30d"
  }

  "ValueUnit(Theta(Some(0.30), \"xyz/abc\"))" should "0.30xyz/abc" in {
    ValueUnit(Theta(Some(0.30), "xyz/abc")) shouldBe "0.30xyz/abc"
  }

  "ValueUnit(BOD(Some(103)))" should "103.00g/m^3" in {
    ValueUnit(BOD(Some(103))) shouldBe "103.00g/m^3"
  }

  "ValueUnit(BOD(Some(103), \"xyz/abc\"))" should "103.00xyz/abc" in {
    ValueUnit(BOD(Some(103), "xyz/abc")) shouldBe "103.00xyz/abc"
  }

  "ValueUnit(Q(Some(242981)))" should "242981.00m^3/d" in {
    ValueUnit(Q(Some(242981))) shouldBe "242981.00m^3/d"
  }

  "ValueUnit(Q(Some(242981), \"xyz/abc\"))" should "242981.00xyz/abc" in {
    ValueUnit(Q(Some(242981), "xyz/abc")) shouldBe "242981.00xyz/abc"
  }

  "ValueUnit(BODLoading(Some(25027.04)))" should "25027.04kg-BOD/d" in {
    ValueUnit(BODLoading(Some(25027.04))) shouldBe "25027.04kg-BOD/d"
  }

  "ValueUnit(BODLoading(Some(25027.04), \"xyz/abc\"))" should "25027.04xyz/abc" in {
    ValueUnit(BODLoading(Some(25027.04), "xyz/abc")) shouldBe "25027.04xyz/abc"
  }

  "ValueUnit(ForallAnoxicForallTotalRatio())" should "0.33" in {
    ValueUnit(ForallAnoxicForallTotalRatio()) shouldBe "0.33"
  }

  "ValueUnit(ForallAnoxicForallTotalRatio(Some(0.33)))" should "0.33" in {
    ValueUnit(ForallAnoxicForallTotalRatio(Some(0.33))) shouldBe "0.33"
  }

  "ValueUnit(ForallAnoxicForallTotalRatio(unit = \"xyz/abc\"))" should "0.33xyz/abc" in {
    ValueUnit(ForallAnoxicForallTotalRatio(unit = "xyz/abc")) shouldBe "0.33xyz/abc"
  }

  "ValueUnit(ForallAnoxicForallTotalRatio(Some(0.33), \"xyz/abc\"))" should "0.33xyz/abc" in {
    ValueUnit(ForallAnoxicForallTotalRatio(Some(0.33), "xyz/abc")) shouldBe "0.33xyz/abc"
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

  "ValueUnit(Sne())" should "0.50g/m^3" in {
    ValueUnit(Sne()) shouldBe "0.50g/m^3"
  }

  "ValueUnit(Sne(Some(0.5)))" should "0.50g/m^3" in {
    ValueUnit(Sne(Some(0.5))) shouldBe "0.50g/m^3"
  }

  "ValueUnit(Sne(unit = \"xyz/abc\"))" should "0.50xyz/abc" in {
    ValueUnit(Sne(unit = "xyz/abc")) shouldBe "0.50xyz/abc"
  }

  "ValueUnit(Sne(Some(0.5), \"xyz/abc\"))" should "0.50xyz/abc" in {
    ValueUnit(Sne(Some(0.5), "xyz/abc")) shouldBe "0.50xyz/abc"
  }

  "ValueUnit(Xvss())" should "3000.00g/m^3" in {
    ValueUnit(Xvss()) shouldBe "3000.00g/m^3"
  }

  "ValueUnit(Xvss(Some(3000)))" should "3000.00g/m^3" in {
    ValueUnit(Xvss(Some(3000))) shouldBe "3000.00g/m^3"
  }

  "ValueUnit(Xvss(unit = \"xyz/abc\"))" should "3000.00xyz/abc" in {
    ValueUnit(Xvss(unit = "xyz/abc")) shouldBe "3000.00xyz/abc"
  }

  "ValueUnit(Xvss(Some(3000), \"xyz/abc\"))" should "3000.00xyz/abc" in {
    ValueUnit(Xvss(Some(3000), "xyz/abc")) shouldBe "3000.00xyz/abc"
  }

  "ValueUnit(SeBOD())" should "1.00g/m^3" in {
    ValueUnit(SeBOD()) shouldBe "1.00g/m^3"
  }

  "ValueUnit(SeBOD(Some(1)))" should "1.00g/m^3" in {
    ValueUnit(SeBOD(Some(1))) shouldBe "1.00g/m^3"
  }

  "ValueUnit(SeBOD(unit = \"xyz/abc\"))" should "1.00xyz/abc" in {
    ValueUnit(SeBOD(unit = "xyz/abc")) shouldBe "1.00xyz/abc"
  }

  "ValueUnit(SeBOD(Some(1), \"xyz/abc\"))" should "1.00xyz/abc" in {
    ValueUnit(SeBOD(Some(1), "xyz/abc")) shouldBe "1.00xyz/abc"
  }

  "ValueUnit(Ko())" should "0.50g/m^3" in {
    ValueUnit(Ko()) shouldBe "0.50g/m^3"
  }

  "ValueUnit(Ko(Some(0.5)))" should "0.50g/m^3" in {
    ValueUnit(Ko(Some(0.5))) shouldBe "0.50g/m^3"
  }

  "ValueUnit(Ko(unit = \"xyz/abc\"))" should "0.50xyz/abc" in {
    ValueUnit(Ko(unit = "xyz/abc")) shouldBe "0.50xyz/abc"
  }

  "ValueUnit(Ko(Some(0.5), \"xyz/abc\"))" should "0.50xyz/abc" in {
    ValueUnit(Ko(Some(0.5), "xyz/abc")) shouldBe "0.50xyz/abc"
  }

  "ValueUnit(Do())" should "2.00g/m^3" in {
    ValueUnit(Do()) shouldBe "2.00g/m^3"
  }

  "ValueUnit(Do(Some(2)))" should "2.00g/m^3" in {
    ValueUnit(Do(Some(2))) shouldBe "2.00g/m^3"
  }

  "ValueUnit(Do(unit = \"xyz/abc\"))" should "2.00xyz/abc" in {
    ValueUnit(Do(unit = "xyz/abc")) shouldBe "2.00xyz/abc"
  }

  "ValueUnit(Do(Some(2), \"xyz/abc\"))" should "2.00xyz/abc" in {
    ValueUnit(Do(Some(2), "xyz/abc")) shouldBe "2.00xyz/abc"
  }

  "ValueUnit(Fnd())" should "0.10" in {
    ValueUnit(Fnd()) shouldBe "0.10"
  }

  "ValueUnit(Fnd(Some(0.1)))" should "0.10" in {
    ValueUnit(Fnd(Some(0.1))) shouldBe "0.10"
  }

  "ValueUnit(Fnd(unit = \"xyz/abc\"))" should "0.10xyz/abc" in {
    ValueUnit(Fnd(unit = "xyz/abc")) shouldBe "0.10xyz/abc"
  }

  "ValueUnit(Fnd(Some(0.1), \"xyz/abc\"))" should "0.10xyz/abc" in {
    ValueUnit(Fnd(Some(0.1), "xyz/abc")) shouldBe "0.10xyz/abc"
  }

  "ValueUnit(FactorOfSafety())" should "2.00" in {
    ValueUnit(FactorOfSafety()) shouldBe "2.00"
  }

  "ValueUnit(FactorOfSafety(Some(2)))" should "2.00" in {
    ValueUnit(FactorOfSafety(Some(2))) shouldBe "2.00"
  }

  "ValueUnit(FactorOfSafety(unit = \"xyz/abc\"))" should "2.00xyz/abc" in {
    ValueUnit(FactorOfSafety(unit = "xyz/abc")) shouldBe "2.00xyz/abc"
  }

  "ValueUnit(FactorOfSafety(Some(2), \"xyz/abc\"))" should "2.00xyz/abc" in {
    ValueUnit(FactorOfSafety(Some(2), "xyz/abc")) shouldBe "2.00xyz/abc"
  }

  "ValueUnit(TKN())" should "45.00" in {
    ValueUnit(TKN()) shouldBe "45.00"
  }

  "ValueUnit(TKN(Some(45)))" should "45.00" in {
    ValueUnit(TKN(Some(45))) shouldBe "45.00"
  }

  "ValueUnit(TKN(unit = \"xyz/abc\"))" should "45.00xyz/abc" in {
    ValueUnit(TKN(unit = "xyz/abc")) shouldBe "45.00xyz/abc"
  }

  "ValueUnit(TKN(Some(45), \"xyz/abc\"))" should "45.00xyz/abc" in {
    ValueUnit(TKN(Some(45), "xyz/abc")) shouldBe "45.00xyz/abc"
  }

  "ValueUnit(Xr())" should "8000.00g/m^3" in {
    ValueUnit(Xr()) shouldBe "8000.00g/m^3"
  }

  "ValueUnit(Xr(Some(8000)))" should "8000.00g/m^3" in {
    ValueUnit(Xr(Some(8000))) shouldBe "8000.00g/m^3"
  }

  "ValueUnit(Xr(unit = \"xyz/abc\"))" should "8000.00xyz/abc" in {
    ValueUnit(Xr(unit = "xyz/abc")) shouldBe "8000.00xyz/abc"
  }

  "ValueUnit(Xr(Some(8000), \"xyz/abc\"))" should "8000.00xyz/abc" in {
    ValueUnit(Xr(Some(8000), "xyz/abc")) shouldBe "8000.00xyz/abc"
  }

  "ValueUnit(Xw())" should "8000.00g/m^3" in {
    ValueUnit(Xw()) shouldBe "8000.00g/m^3"
  }

  "ValueUnit(Xw(Some(8000)))" should "8000.00g/m^3" in {
    ValueUnit(Xw(Some(8000))) shouldBe "8000.00g/m^3"
  }

  "ValueUnit(Xw(unit = \"xyz/abc\"))" should "8000.00xyz/abc" in {
    ValueUnit(Xw(unit = "xyz/abc")) shouldBe "8000.00xyz/abc"
  }

  "ValueUnit(Xw(Some(8000), \"xyz/abc\"))" should "8000.00xyz/abc" in {
    ValueUnit(Xw(Some(8000), "xyz/abc")) shouldBe "8000.00xyz/abc"
  }

  "ValueUnit(Xe())" should "10.00g/m^3" in {
    ValueUnit(Xe()) shouldBe "10.00g/m^3"
  }

  "ValueUnit(Xe(Some(10)))" should "10.00g/m^3" in {
    ValueUnit(Xe(Some(10))) shouldBe "10.00g/m^3"
  }

  "ValueUnit(Xe(unit = \"xyz/abc\"))" should "10.00xyz/abc" in {
    ValueUnit(Xe(unit = "xyz/abc")) shouldBe "10.00xyz/abc"
  }

  "ValueUnit(Xe(Some(10), \"xyz/abc\"))" should "10.00xyz/abc" in {
    ValueUnit(Xe(Some(10), "xyz/abc")) shouldBe "10.00xyz/abc"
  }

  "ValueUnit(NOxe())" should "6.00g/m^3" in {
    ValueUnit(NOxe()) shouldBe "6.00g/m^3"
  }

  "ValueUnit(NOxe(Some(6)))" should "6.00g/m^3" in {
    ValueUnit(NOxe(Some(6))) shouldBe "6.00g/m^3"
  }

  "ValueUnit(NOxe(unit = \"xyz/abc\"))" should "6.00xyz/abc" in {
    ValueUnit(NOxe(unit = "xyz/abc")) shouldBe "6.00xyz/abc"
  }

  "ValueUnit(NOxe(Some(6), \"xyz/abc\"))" should "6.00xyz/abc" in {
    ValueUnit(NOxe(Some(6), "xyz/abc")) shouldBe "6.00xyz/abc"
  }

  "ValueUnit(RbCOD(Some(0.3)))" should "0.30g/m^3" in {
    ValueUnit(RbCOD(Some(0.3))) shouldBe "0.30g/m^3"
  }

  "ValueUnit(RbCOD(Some(0.3), \"xyz/abc\"))" should "0.30xyz/abc" in {
    ValueUnit(RbCOD(Some(0.3), "xyz/abc")) shouldBe "0.30xyz/abc"
  }



  "ValueUnit(U(Some(6)))" should "6.00d^-1" in {
    ValueUnit(U(Some(6))) shouldBe "6.00d^-1"
  }

  "ValueUnit(U(Some(6), \"xyz/abc\"))" should "6.00xyz/abc" in {
    ValueUnit(U(Some(6), "xyz/abc")) shouldBe "6.00xyz/abc"
  }

  "ValueUnit(Ks(Some(20)))" should "20.00g/m^3" in {
    ValueUnit(Ks(Some(20))) shouldBe "20.00g/m^3"
  }

  "ValueUnit(Ks(Some(20), \"xyz/abc\"))" should "20.00xyz/abc" in {
    ValueUnit(Ks(Some(20), "xyz/abc")) shouldBe "20.00xyz/abc"
  }

  "ValueUnit(Y(Some(0.12)))" should "0.12" in {
    ValueUnit(Y(Some(0.12))) shouldBe "0.12"
  }

  "ValueUnit(Y(Some(0.12), \"xyz/abc\"))" should "0.12xyz/abc" in {
    ValueUnit(Y(Some(0.12), "xyz/abc")) shouldBe "0.12xyz/abc"
  }

  "ValueUnit(Kd(Some(6)))" should "6.00d^-1" in {
    ValueUnit(Kd(Some(6))) shouldBe "6.00d^-1"
  }

  "ValueUnit(Kd(Some(6), \"xyz/abc\"))" should "6.00xyz/abc" in {
    ValueUnit(Kd(Some(6), "xyz/abc")) shouldBe "6.00xyz/abc"
  }

  "Default Heterotrophs()" should "pass" in {
    val h = Heterotrophs()

    h.u shouldBe U(Some(6.00), "d^-1")
    h.kS shouldBe Ks(Some(20.00), "g/m^3")
    h.y shouldBe Y(Some(0.40), "")
    h.kD shouldBe Kd(Some(0.12), "d^-1")
    ValueUnit(h.u) shouldBe "6.00d^-1"
    ValueUnit(h.kS) shouldBe "20.00g/m^3"
    ValueUnit(h.y) shouldBe "0.40"
    ValueUnit(h.kD) shouldBe "0.12d^-1"
  }

  "Heterotrophs(U(1, \"a\"), Ks(2, \"b\"), kD = Kd(3, \"c\"))" should "pass" in {
    val h = Heterotrophs(U(Some(1), "a"), Ks(Some(2), "b"), kD = Kd(Some(3), "c"))

    h.u shouldBe U(Some(1.00), "a")
    h.kS shouldBe Ks(Some(2.00), "b")
    h.y shouldBe Y(Some(0.40), "")
    h.kD shouldBe Kd(Some(3.00), "c")
    ValueUnit(h.u) shouldBe "1.00a"
    ValueUnit(h.kS) shouldBe "2.00b"
    ValueUnit(h.y) shouldBe "0.40"
    ValueUnit(h.kD) shouldBe "3.00c"
  }

  "Default Nitrifiers()" should "pass" in {
    val n = Nitrifiers()

    n.u shouldBe U(Some(0.75), "d^-1")
    n.kS shouldBe Ks(Some(0.74), "g/m^3")
    n.y shouldBe Y(Some(0.12), "")
    n.kD shouldBe Kd(Some(0.08), "d^-1")
    ValueUnit(n.u) shouldBe "0.75d^-1"
    ValueUnit(n.kS) shouldBe "0.74g/m^3"
    ValueUnit(n.y) shouldBe "0.12"
    ValueUnit(n.kD) shouldBe "0.08d^-1"
  }

  "Nitrifiers(kS = Ks(2, \"b\"), y = Y(1, \"a\"), kD = Kd(3, \"c\"))" should "pass" in {
    val h = Nitrifiers(kS = Ks(Some(2), "b"), y = Y(Some(1), "a"), kD = Kd(Some(3), "c"))

    h.u shouldBe U(Some(0.75), "d^-1")
    h.kS shouldBe Ks(Some(2.00), "b")
    h.y shouldBe Y(Some(1.00), "a")
    h.kD shouldBe Kd(Some(3.00), "c")
    ValueUnit(h.u) shouldBe "0.75d^-1"
    ValueUnit(h.kS) shouldBe "2.00b"
    ValueUnit(h.y) shouldBe "1.00a"
    ValueUnit(h.kD) shouldBe "3.00c"
  }

  "ValueUnit(ForallAnoxic(Some(904000)))" should "904000.00m^3" in {
    ValueUnit(ForallAnoxic(Some(904000))) shouldBe "904000.00m^3"
  }

  "ValueUnit(ForallAnoxic(Some(904000), \"xyz/abc\"))" should "904000.00xyz/abc" in {
    ValueUnit(ForallAnoxic(Some(904000), "xyz/abc")) shouldBe "904000.00xyz/abc"
  }

  "ValueUnit(ThetaAerobic(Some(1.92)))" should "1.92d" in {
    ValueUnit(ThetaAerobic(Some(1.92))) shouldBe "1.92d"
  }

  "ValueUnit(ThetaAerobic(Some(1.92), \"xyz/abc\"))" should "1.92xyz/abc" in {
    ValueUnit(ThetaAerobic(Some(1.92), "xyz/abc")) shouldBe "1.92xyz/abc"
  }

  "ValueUnit(ThetaC(Some(6.18)))" should "6.18d" in {
    ValueUnit(ThetaC(Some(6.18))) shouldBe "6.18d"
  }

  "ValueUnit(ThetaC(Some(6.18), \"xyz/abc\"))" should "6.18xyz/abc" in {
    ValueUnit(ThetaC(Some(6.18), "xyz/abc")) shouldBe "6.18xyz/abc"
  }

  "ValueUnit(S(Some(119)))" should "119.00g-BOD/m^3" in {
    ValueUnit(S(Some(119))) shouldBe "119.00g-BOD/m^3"
  }

  "ValueUnit(S(Some(119), \"xyz/abc\"))" should "119.00xyz/abc" in {
    ValueUnit(S(Some(119), "xyz/abc")) shouldBe "119.00xyz/abc"
  }

  "ValueUnit(PXBio(Some(27900739.07)))" should "27900739.07g/d" in {
    ValueUnit(PXBio(Some(27900739.07))) shouldBe "27900739.07g/d"
  }

  "ValueUnit(PXBio(Some(27900739.07), \"xyz/abc\"))" should "27900739.07xyz/abc" in {
    ValueUnit(PXBio(Some(27900739.07), "xyz/abc")) shouldBe "27900739.07xyz/abc"
  }

  "ValueUnit(Xb(Some(58.58)))" should "58.58g/m^3" in {
    ValueUnit(Xb(Some(58.58))) shouldBe "58.58g/m^3"
  }

  "ValueUnit(Xb(Some(58.58), \"xyz/abc\"))" should "58.58xyz/abc" in {
    ValueUnit(Xb(Some(58.58), "xyz/abc")) shouldBe "58.58xyz/abc"
  }

  "ValueUnit(FMRatio(Some(2.15)))" should "2.15" in {
    ValueUnit(FMRatio(Some(2.15))) shouldBe "2.15"
  }

  "ValueUnit(FMRatio(Some(2.15), \"xyz/abc\"))" should "2.15xyz/abc" in {
    ValueUnit(FMRatio(Some(2.15), "xyz/abc")) shouldBe "2.15xyz/abc"
  }

  "ValueUnit(SDNR(Some(0.33)))" should "0.33" in {
    ValueUnit(SDNR(Some(0.33))) shouldBe "0.33"
  }

  "ValueUnit(SDNR(Some(0.33), \"xyz/abc\"))" should "0.33xyz/abc" in {
    ValueUnit(SDNR(Some(0.33), "xyz/abc")) shouldBe "0.33xyz/abc"
  }

  "ValueUnit(NO3N(Some(41.47)))" should "41.47g/m^3" in {
    ValueUnit(NO3N(Some(41.47))) shouldBe "41.47g/m^3"
  }

  "ValueUnit(NO3N(Some(41.47), \"xyz/abc\"))" should "41.47xyz/abc" in {
    ValueUnit(NO3N(Some(41.47), "xyz/abc")) shouldBe "41.47xyz/abc"
  }

  "ValueUnit(Qw(Some(165103.26)))" should "165103.26m^3/d" in {
    ValueUnit(Qw(Some(165103.26))) shouldBe "165103.26m^3/d"
  }

  "ValueUnit(Qw(Some(165103.26), \"xyz/abc\"))" should "165103.26xyz/abc" in {
    ValueUnit(Qw(Some(165103.26), "xyz/abc")) shouldBe "165103.26xyz/abc"
  }

  "ValueUnit(Qr(Some(449856.99)))" should "449856.99m^3/d" in {
    ValueUnit(Qr(Some(449856.99))) shouldBe "449856.99m^3/d"
  }

  "ValueUnit(Qr(Some(449856.99), \"xyz/abc\"))" should "449856.99xyz/abc" in {
    ValueUnit(Qr(Some(449856.99), "xyz/abc")) shouldBe "449856.99xyz/abc"
  }

  "ValueUnit(R(Some(0.49)))" should "0.49" in {
    ValueUnit(R(Some(0.49))) shouldBe "0.49"
  }

  "ValueUnit(R(Some(0.49), \"xyz/abc\"))" should "0.49xyz/abc" in {
    ValueUnit(R(Some(0.49), "xyz/abc")) shouldBe "0.49xyz/abc"
  }

  "ValueUnit(IR(Some(5.42)))" should "5.42" in {
    ValueUnit(IR(Some(5.42))) shouldBe "5.42"
  }

  "ValueUnit(IR(Some(5.42), \"xyz/abc\"))" should "5.42xyz/abc" in {
    ValueUnit(IR(Some(5.42), "xyz/abc")) shouldBe "5.42xyz/abc"
  }

  "ValueUnit(NOr(Some(931753.00)))" should "931753.00g/d" in {
    ValueUnit(NOr(Some(931753.00))) shouldBe "931753.00g/d"
  }

  "ValueUnit(NOr(Some(931753.00), \"xyz/abc\"))" should "931753.00xyz/abc" in {
    ValueUnit(NOr(Some(931753.00), "xyz/abc")) shouldBe "931753.00xyz/abc"
  }

  "ValueUnit(NO3Removed(Some(17500000.00)))" should "17500000.00g/d" in {
    ValueUnit(NO3Removed(Some(17500000.00))) shouldBe "17500000.00g/d"
  }

  "ValueUnit(NO3Removed(Some(17500000.00), \"xyz/abc\"))" should "17500000.00xyz/abc" in {
    ValueUnit(NO3Removed(Some(17500000.00), "xyz/abc")) shouldBe "17500000.00xyz/abc"
  }

  "ValueUnit(XaHeterotrophs(Some(28016748.06)))" should "28016748.06g/d" in {
    ValueUnit(XaHeterotrophs(Some(28016748.06))) shouldBe "28016748.06g/d"
  }

  "ValueUnit(XaHeterotrophs(Some(28016748.06), \"xyz/abc\"))" should "28016748.06xyz/abc" in {
    ValueUnit(XaHeterotrophs(Some(28016748.06), "xyz/abc")) shouldBe "28016748.06xyz/abc"
  }

  "ValueUnit(XaHeterotrophsParts(Some(25983423.00)))" should "25983423.00g/d" in {
    ValueUnit(XaHeterotrophsParts(Some(25983423.00))) shouldBe "25983423.00g/d"
  }

  "ValueUnit(XaHeterotrophsParts(Some(25983423.00), \"xyz/abc\"))" should "25983423.00xyz/abc" in {
    ValueUnit(XaHeterotrophsParts(Some(25983423.00), "xyz/abc")) shouldBe "25983423.00xyz/abc"
  }

  "ValueUnit(PxBioHeterotrophs(Some(30092889.55)))" should "30092889.55g/d" in {
    ValueUnit(PxBioHeterotrophs(Some(30092889.55))) shouldBe "30092889.55g/d"
  }

  "ValueUnit(PxBioHeterotrophs(Some(30092889.55), \"xyz/abc\"))" should "30092889.55xyz/abc" in {
    ValueUnit(PxBioHeterotrophs(Some(30092889.55), "xyz/abc")) shouldBe "30092889.55xyz/abc"
  }

  "ValueUnit(XaNitrifiers(Some(3156062.00)))" should "3156062.00g/d" in {
    ValueUnit(XaNitrifiers(Some(3156062.00))) shouldBe "3156062.00g/d"
  }

  "ValueUnit(XaNitrifiers(Some(3156062.00), \"xyz/abc\"))" should "3156062.00xyz/abc" in {
    ValueUnit(XaNitrifiers(Some(3156062.00), "xyz/abc")) shouldBe "3156062.00xyz/abc"
  }

  "ValueUnit(XaNitrifiersParts(Some(155917.00)))" should "155917.00g/d" in {
    ValueUnit(XaNitrifiersParts(Some(155917.00))) shouldBe "155917.00g/d"
  }

  "ValueUnit(XaNitrifiersParts(Some(155917.00), \"xyz/abc\"))" should "155917.00xyz/abc" in {
    ValueUnit(XaNitrifiersParts(Some(155917.00), "xyz/abc")) shouldBe "155917.00xyz/abc"
  }

  "ValueUnit(PxBioNitrifiers(Some(11933898.15)))" should "11933898.15g/d" in {
    ValueUnit(PxBioNitrifiers(Some(11933898.15))) shouldBe "11933898.15g/d"
  }

  "ValueUnit(PxBioNitrifiers(Some(11933898.15), \"xyz/abc\"))" should "11933898.15xyz/abc" in {
    ValueUnit(PxBioNitrifiers(Some(11933898.15), "xyz/abc")) shouldBe "11933898.15xyz/abc"
  }

  "ValueUnit(PXvss(Some(8147313.96)))" should "8147313.96g/d" in {
    ValueUnit(PXvss(Some(8147313.96))) shouldBe "8147313.96g/d"
  }

  "ValueUnit(PXvss(Some(8147313.96), \"xyz/abc\"))" should "8147313.96xyz/abc" in {
    ValueUnit(PXvss(Some(8147313.96), "xyz/abc")) shouldBe "8147313.96xyz/abc"
  }

  "aabDefaultRemovals" should "pass" in {
    aabDefaultRemovals shouldBe MiscellaneousRemovals(tss = TSSRemoval(Some(94.00)),
      bod5 = BOD5Removal(Some(97.00)),
      nh3n = NH3NRemoval(Some(97.00)))
  }

}
