package helper

import helper.Helper.to2Decimals
import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by kasonchan on 10/26/15.
 */
class HelperTest extends FlatSpec with Matchers {

  "to2Decimals(-1.549)" should "= -1.549" in {
    to2Decimals(-1.549) shouldBe -1.55
  }

  "to2Decimals(-1.545)" should "= -1.545" in {
    to2Decimals(-1.545) shouldBe -1.55
  }

  "to2Decimals(-1.544)" should "= -1.544" in {
    to2Decimals(-1.544) shouldBe -1.54
  }

  "to2Decimals(-1.541)" should "= -1.541" in {
    to2Decimals(-1.541) shouldBe -1.54
  }

  "to2Decimals(-1.51)" should "= -1.51" in {
    to2Decimals(-1.51) shouldBe -1.51
  }

  "to2Decimals(-1.5)" should "= -1.50" in {
    to2Decimals(-1.5) shouldBe -1.50
  }

  "to2Decimals(-1.4)" should "= -1.40" in {
    to2Decimals(-1.4) shouldBe -1.40
  }

  "to2Decimals(0)" should "= 0.00" in {
    to2Decimals(0) shouldBe 0.00
  }

  "to2Decimals(1.4)" should "= 1.40" in {
    to2Decimals(1.4) shouldBe 1.40
  }

  "to2Decimals(1.5)" should "= 1.50" in {
    to2Decimals(1.5) shouldBe 1.50
  }

  "to2Decimals(1.51)" should "= 1.51" in {
    to2Decimals(1.51) shouldBe 1.51
  }

  "to2Decimals(1.541)" should "= 1.541" in {
    to2Decimals(1.541) shouldBe 1.54
  }

  "to2Decimals(1.544)" should "= 1.544" in {
    to2Decimals(1.544) shouldBe 1.54
  }

  "to2Decimals(1.545)" should "= 1.545" in {
    to2Decimals(1.545) shouldBe 1.55
  }

  "to2Decimals(1.549)" should "= 1.549" in {
    to2Decimals(1.549) shouldBe 1.55
  }

}
