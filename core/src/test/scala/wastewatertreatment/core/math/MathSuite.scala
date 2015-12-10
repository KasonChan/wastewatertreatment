package wastewatertreatment.core.math

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.core.math.Math._

/**
 * Created by kasonchan on 10/26/15.
 */
class MathSuite extends FlatSpec with Matchers {

  "toXDecimals(-1.549)" should "= -1.549" in {
    toXDecimals(-1.549) shouldBe -1.55
  }

  "toXDecimals(-1.545)" should "= -1.545" in {
    toXDecimals(-1.545) shouldBe -1.55
  }

  "toXDecimals(-1.544)" should "= -1.544" in {
    toXDecimals(-1.544) shouldBe -1.54
  }

  "toXDecimals(-1.541)" should "= -1.541" in {
    toXDecimals(-1.541) shouldBe -1.54
  }

  "toXDecimals(-1.51)" should "= -1.51" in {
    toXDecimals(-1.51) shouldBe -1.51
  }

  "toXDecimals(-1.5)" should "= -1.50" in {
    toXDecimals(-1.5) shouldBe -1.50
  }

  "toXDecimals(-1.4)" should "= -1.40" in {
    toXDecimals(-1.4) shouldBe -1.40
  }

  "toXDecimals(0)" should "= 0.00" in {
    toXDecimals(0) shouldBe 0.00
  }

  "toXDecimals(1.4)" should "= 1.40" in {
    toXDecimals(1.4) shouldBe 1.40
  }

  "toXDecimals(1.5)" should "= 1.50" in {
    toXDecimals(1.5) shouldBe 1.50
  }

  "toXDecimals(1.51)" should "= 1.51" in {
    toXDecimals(1.51) shouldBe 1.51
  }

  "toXDecimals(1.541)" should "= 1.541" in {
    toXDecimals(1.541) shouldBe 1.54
  }

  "toXDecimals(1.544)" should "= 1.544" in {
    toXDecimals(1.544) shouldBe 1.54
  }

  "toXDecimals(1.545)" should "= 1.545" in {
    toXDecimals(1.545) shouldBe 1.55
  }

  "toXDecimals(1.549)" should "= 1.549" in {
    toXDecimals(1.549) shouldBe 1.55
  }

  "toXDecimals(1.5494, 3)" should "= 1.549" in {
    toXDecimals(1.5494, 3) shouldBe 1.549
  }

  "toXDecimals(1.54949, 4)" should "= 1.5495" in {
    toXDecimals(1.54949, 4) shouldBe 1.5495
  }

  "toXDecimals(Some(1.54949), 4)" should "= Some(1.5495)" in {
    toXODecimals(Some(1.54949), 4) shouldBe Some(1.5495)
  }

  "toXDecimals(None, 4)" should "= None" in {
    toXODecimals(None, 4) shouldBe None
  }

  "tom3d(368)" should "= 1393030.88" in {
    tom3d(368) shouldBe 1393030.88
  }

}
