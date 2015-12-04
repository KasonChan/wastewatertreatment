package wastewatertreatment.objects.secondarytreatment.aerobicbasins

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.secondarytreatment.aerobicbasins.ValueUnits._
import wastewatertreatment.valueunit.ValueUnit

/**
 * Created by ka-son on 11/22/15.
 */
class ValueUnitsSuite extends FlatSpec with Matchers {

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

  "abDefaultRemovals" should "pass" in {
    abDefaultRemovals shouldBe MiscellaneousRemovals(tss = TSSRemoval(Some(95.00)),
      bod5 = BOD5Removal(Some(97.00)),
      nh3n = NH3NRemoval(Some(97.00)))
  }

}
