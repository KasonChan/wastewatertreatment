package wastewatertreatment.core

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by kasonchan on 11/16/15.
 */
class UnitsSuite extends FlatSpec with Matchers with Units {

  "bod5cBOD5RatioUnits" should "= noUnits" in {
    bod5cBOD5RatioUnits shouldBe noUnits
  }

  "codBODRatioUnits" should "= noUnits" in {
    codBODRatioUnits shouldBe noUnits
  }

  "codVSSRatioUnits" should "= noUnits" in {
    codVSSRatioUnits shouldBe noUnits
  }

  "vssTSSRatioUnits" should "= noUnits" in {
    vssTSSRatioUnits shouldBe noUnits
  }

  "tnUnits" should "= concentrationUnits" in {
    tnUnits shouldBe concentrationUnits
  }

  "bVSSVSSRatioUnits" should "= noUnits" in {
    bVSSVSSRatioUnits shouldBe noUnits
  }

  "nbVSSVSSRatioUnits" should "= noUnits" in {
    nbVSSVSSRatioUnits shouldBe noUnits
  }

  "qUnits" should "List(\"MGD\", \"m^3/d\", \"ft^3/d\")" in {
    qUnits shouldBe List("MGD", "m^3/d", "ft^3/d")
  }

  "tssUnits" should "List(\"g/m^3\", \"g/ft^3\", \"kg/m^3\", \"kg/ft^3\")" in {
    tssUnits shouldBe List("g/m^3", "g/ft^3", "kg/m^3", "kg/ft^3")
  }

  "vssUnits" should "List(\"g/m^3\", \"g/ft^3\", \"kg/m^3\", \"kg/ft^3\")" in {
    vssUnits shouldBe List("g/m^3", "g/ft^3", "kg/m^3", "kg/ft^3")
  }

  "bod5Units" should "List(\"g/m^3\", \"g/ft^3\", \"kg/m^3\", \"kg/ft^3\")" in {
    bod5Units shouldBe List("g/m^3", "g/ft^3", "kg/m^3", "kg/ft^3")
  }

  "cBOD5Units" should "List(\"g/m^3\", \"g/ft^3\", \"kg/m^3\", \"kg/ft^3\")" in {
    cBOD5Units shouldBe List("g/m^3", "g/ft^3", "kg/m^3", "kg/ft^3")
  }

  "bCODUnits" should "List(\"g/m^3\", \"g/ft^3\", \"kg/m^3\", \"kg/ft^3\")" in {
    bCODUnits shouldBe List("g/m^3", "g/ft^3", "kg/m^3", "kg/ft^3")
  }

  "bCODsUnits" should "List(\"g/m^3\", \"g/ft^3\", \"kg/m^3\", \"kg/ft^3\")" in {
    bCODsUnits shouldBe List("g/m^3", "g/ft^3", "kg/m^3", "kg/ft^3")
  }

  "bCODpUnits" should "List(\"g/m^3\", \"g/ft^3\", \"kg/m^3\", \"kg/ft^3\")" in {
    bCODpUnits shouldBe List("g/m^3", "g/ft^3", "kg/m^3", "kg/ft^3")
  }

  "nh3nUnits" should "List(\"g/m^3\", \"g/ft^3\", \"kg/m^3\", \"kg/ft^3\")" in {
    nh3nUnits shouldBe List("g/m^3", "g/ft^3", "kg/m^3", "kg/ft^3")
  }

  "tpUnits" should "List(\"g/m^3\", \"g/ft^3\", \"kg/m^3\", \"kg/ft^3\")" in {
    tpUnits shouldBe List("g/m^3", "g/ft^3", "kg/m^3", "kg/ft^3")
  }

  "pUnits" should "List(\"g-TSS/d\", \"kg-TSS/d\")" in {
    pUnits shouldBe List("g-TSS/d", "kg-TSS/d")
  }

  "fecalColiformUnits" should "List(\"MPN/100mL\")" in {
    fecalColiformUnits shouldBe List("MPN/100mL")
  }

  "enterococciUnits" should "List(\"MPN/100mL\")" in {
    enterococciUnits shouldBe List("MPN/100mL")
  }

  "turbidityUnits" should "List(\"NTU\")" in {
    turbidityUnits shouldBe List("NTU")
  }

}
