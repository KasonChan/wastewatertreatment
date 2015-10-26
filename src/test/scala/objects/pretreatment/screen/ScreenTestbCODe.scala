package objects.pretreatment.screen

import objects.pretreatment.Screen.calbCODe
import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by kasonchan on 10/26/15.
 */
class ScreenTestbCODe extends FlatSpec with Matchers {

  "calbCODe(-1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
    calbCODe(-1, -1)
    }
  }

  "calbCODe(-1, 0)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
    calbCODe(-1, 0)
    }
  }

  "calbCODe(0, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
    calbCODe(0, -1)
    }
  }

  "calbCODe(0, 0)" should "= 0.0" in {
    calbCODe(0, 0) shouldBe 0
  }

  "calbCODe(187.98, 1.6)" should "= 300.77" in {
    calbCODe(187.98, 1.6) shouldBe 300.77
  }

}
