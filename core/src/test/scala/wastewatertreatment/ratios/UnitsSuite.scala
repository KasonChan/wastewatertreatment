package wastewatertreatment.ratios

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by kasonchan on 12/3/15.
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

  "bvssVSSRatioUnits" should "= noUnits" in {
    bvssVSSRatioUnits shouldBe noUnits
  }

  "nbvssVSSRatioUnits" should "= noUnits" in {
    nbvssVSSRatioUnits shouldBe noUnits
  }

  "ntuTSSRatioUnits" should "= noUnits" in {
    ntuTSSRatioUnits shouldBe noUnits
  }

}
