package wastewatertreatment.objects.secondarytreatment.aerobicbasins

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.secondarytreatment.aerobicbasins.ValueUnits._
import wastewatertreatment.valueunit.ValueUnit

/**
 * Created by ka-son on 11/22/15.
 */
class ValueUnitsSuite extends FlatSpec with Matchers {

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

  "ValueUnit(TSSRemoval())" should "95.00%" in {
    ValueUnit(TSSRemoval()) shouldBe "95.00%"
  }

  "ValueUnit(TSSRemoval(95))" should "95.00%" in {
    ValueUnit(TSSRemoval(95)) shouldBe "95.00%"
  }

  "ValueUnit(TSSRemoval(unit = \"xyz/abc\"))" should "95.00xyz/abc" in {
    ValueUnit(TSSRemoval(unit = "xyz/abc")) shouldBe "95.00xyz/abc"
  }

  "ValueUnit(TSSRemoval(95, \"xyz/abc\"))" should "95.00xyz/abc" in {
    ValueUnit(TSSRemoval(95, "xyz/abc")) shouldBe "95.00xyz/abc"
  }

  "ValueUnit(CODRemoval())" should "100.00%" in {
    ValueUnit(CODRemoval()) shouldBe "100.00%"
  }

  "ValueUnit(CODRemoval(100))" should "100.00%" in {
    ValueUnit(CODRemoval(100)) shouldBe "100.00%"
  }

  "ValueUnit(CODRemoval(unit = \"xyz/abc\"))" should "100.00xyz/abc" in {
    ValueUnit(CODRemoval(unit = "xyz/abc")) shouldBe "100.00xyz/abc"
  }

  "ValueUnit(CODRemoval(100, \"xyz/abc\"))" should "100.00xyz/abc" in {
    ValueUnit(CODRemoval(100, "xyz/abc")) shouldBe "100.00xyz/abc"
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

  "ValueUnit(Xw())" should "8000.00g/m^3" in {
    ValueUnit(Xw()) shouldBe "8000.00g/m^3"
  }

  "ValueUnit(Xw(8000))" should "8000.00g/m^3" in {
    ValueUnit(Xw(8000)) shouldBe "8000.00g/m^3"
  }

  "ValueUnit(Xw(unit = \"xyz/abc\"))" should "8000.00xyz/abc" in {
    ValueUnit(Xw(unit = "xyz/abc")) shouldBe "8000.00xyz/abc"
  }

  "ValueUnit(Xw(8000, \"xyz/abc\"))" should "8000.00xyz/abc" in {
    ValueUnit(Xw(8000, "xyz/abc")) shouldBe "8000.00xyz/abc"
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


  "Default Heterotrophs()" should "pass" in {
    val h = Heterotrophs()

    h.u shouldBe U(6.00, "d^-1")
    h.kS shouldBe Ks(20.00, "g/m^3")
    h.y shouldBe Y(0.40, "")
    h.kD shouldBe Kd(0.12, "d^-1")
    ValueUnit(h.u) shouldBe "6.00d^-1"
    ValueUnit(h.kS) shouldBe "20.00g/m^3"
    ValueUnit(h.y) shouldBe "0.40"
    ValueUnit(h.kD) shouldBe "0.12d^-1"
  }

  "Heterotrophs(U(1, \"a\"), Ks(2, \"b\"), kD = Kd(3, \"c\"))" should "pass" in {
    val h = Heterotrophs(U(1, "a"), Ks(2, "b"), kD = Kd(3, "c"))

    h.u shouldBe U(1.00, "a")
    h.kS shouldBe Ks(2.00, "b")
    h.y shouldBe Y(0.40, "")
    h.kD shouldBe Kd(3.00, "c")
    ValueUnit(h.u) shouldBe "1.00a"
    ValueUnit(h.kS) shouldBe "2.00b"
    ValueUnit(h.y) shouldBe "0.40"
    ValueUnit(h.kD) shouldBe "3.00c"
  }

}
