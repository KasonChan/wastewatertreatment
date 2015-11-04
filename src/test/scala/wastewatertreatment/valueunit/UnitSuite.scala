package wastewatertreatment.valueunit

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by kasonchan on 11/2/15.
 */
class UnitSuite extends FlatSpec with Matchers with Unit {

  "generateUs(massUnits, volumeUnits)" should "= List(\"g/m^3\", \"kg/m^3\")" in {
    generateUs(massUnits, volumeUnits) shouldBe List("g/m^3", "kg/m^3")
  }

  "generateUs(volumeUnits, dayUnits)" should "= List(\"m^3/d\")" in {
    generateUs(volumeUnits, dayUnits) shouldBe List("m^3/d")
  }

  "generateRUs(massUnits, \"BOD5\", \"cBOD5\")" should "= List(\"g-BOD5/g-cBOD5\", \"kg-BOD5/kg-cBOD5\")" in {
    generateRUs(massUnits, "BOD5", "cBOD5") shouldBe List("g-BOD5/g-cBOD5", "kg-BOD5/kg-cBOD5")
  }

  "generateRUs(volumeUnits, \"\", \"\")" should "= List(\"m^3-/m^3-\")" in {
    generateRUs(volumeUnits, "", "") shouldBe List("m^3-/m^3-")
  }

  "generatePRUs(massUnits, \"TSS\", dayUnits)" should "= List(\"g-TSS/d\", \"kg-TSS/d\")" in {
    generatePRUs(massUnits, "TSS", dayUnits) shouldBe List("g-TSS/d", "kg-TSS/d")
  }

  "generatePRUs(noUnits, \"\", noUnits)" should "= List(\"-/\")" in {
    generatePRUs(noUnits, "", noUnits) shouldBe List("/")
  }

}
