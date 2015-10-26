package objects.pretreatment.screen

import objects.pretreatment.screen.Screen.calBOD5e
import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by kasonchan on 10/26/15.
 */
class ScreenTestBOD5e extends FlatSpec with Matchers {

  "calBOD5e(-1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
    calBOD5e(-1, -1)
    }
  }

  "calBOD5e(-1, 0)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
    calBOD5e(-1, 0)
    }
  }

  "calBOD5e(0, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
    calBOD5e(0, -1)
    }
  }

  "calBOD5e(0, 0)" should "= 0" in {
    calBOD5e(0, 0) shouldBe 0.0
  }

  "calBOD5e(257.5, 27)" should "= 187.98" in {
    calBOD5e(257.5, 27) shouldBe 187.98
  }

}
