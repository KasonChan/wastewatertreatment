package wastewatertreatment.ratios

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by kasonchan on 12/3/15.
 */
class RatiosSuite extends FlatSpec with Matchers with Ratios {

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

  "bvssVSSRatio" should "= 0.80" in {
    bvssVSSRatio shouldBe 0.80
  }

  "nbvssVSSRatio" should "= 0.20" in {
    nbvssVSSRatio shouldBe 0.20
  }

  "ntuTSSRatio" should "= 0.50" in {
    ntuTSSRatio shouldBe 0.50
  }

  "pVSSRatio" should "= 0.02" in {
    pVSSRatio shouldBe 0.02
  }

}
