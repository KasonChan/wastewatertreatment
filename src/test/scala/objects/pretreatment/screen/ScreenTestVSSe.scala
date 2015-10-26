package objects.pretreatment.screen

import Screen.calVSSe
import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by kasonchan on 10/26/15.
 */
class ScreenTestVSSe extends FlatSpec with Matchers {

  "calVSSe(-1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
    calVSSe(-1, -1)
    }
  }

  "calVSSe(-1, 0)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
    calVSSe(-1, 0)
    }
  }

  "calVSSe(0, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
    calVSSe(0, -1)
    }
  }

  "calVSSe(0, 0)" should "= 0" in {
    calVSSe(0, 0) shouldBe 0.0
  }

  "calVSSe(162.79, 0.8)" should "= 130.23" in {
    calVSSe(162.79, 0.8) shouldBe 130.23
  }

}
