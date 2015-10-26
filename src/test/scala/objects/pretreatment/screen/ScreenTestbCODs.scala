package objects.pretreatment.screen

import objects.pretreatment.Screen.calbCODs
import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by kasonchan on 10/26/15.
 */
class ScreenTestbCODs extends FlatSpec with Matchers {

  "calbCODs(-1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
    calbCODs(-1, -1)
    }
  }

  "calbCODs(-1, 0)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
    calbCODs(-1, 0)
    }
  }

  "calbCODs(0, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
    calbCODs(0, -1)
    }
  }

  "calbCODs(0, 0)" should "= 0" in {
    calbCODs(0, 0) shouldBe 0.0
  }

  "calbCODs(300.77, 147.94)" should "= 152.83" in {
    calbCODs(300.77, 147.94) shouldBe 152.83
  }

}
