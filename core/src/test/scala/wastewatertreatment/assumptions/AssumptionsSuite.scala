package wastewatertreatment.assumptions

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by kasonchan on 11/15/15.
 */
class AssumptionsSuite extends FlatSpec with Matchers with Assumptions {

  "bod5cBOD5Ratio" should "= 1.10" in {
    bod5cBOD5Ratio shouldBe 1.10
  }

  "codBODRatio" should "= 1.60" in {
    codBODRatio shouldBe 1.60
  }

  "codVSSRatio" should "= 1.42" in {
    codVSSRatio shouldBe 1.42
  }

  "vssTSSRatio" should "= 0.80" in {
    vssTSSRatio shouldBe 0.80
  }

  "tn" should "= 40.00" in {
    tn shouldBe 40.00
  }

  "bVSS" should "= 0.80" in {
    bVSS shouldBe 0.80
  }

  "nbVSS" should "= 0.20" in {
    nbVSS shouldBe 0.20
  }

}
