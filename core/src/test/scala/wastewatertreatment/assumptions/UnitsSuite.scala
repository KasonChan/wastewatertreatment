package wastewatertreatment.assumptions

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.assumptions.Units._

/**
 * Created by kasonchan on 11/15/15.
 */
class UnitsSuite extends FlatSpec with Matchers {

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

}
