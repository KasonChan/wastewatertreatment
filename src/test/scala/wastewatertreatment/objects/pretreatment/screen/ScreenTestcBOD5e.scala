package wastewatertreatment.objects.pretreatment.screen

import Screen.calcBOD5e
import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by kasonchan on 10/26/15.
 */
class ScreenTestcBOD5e extends FlatSpec with Matchers {

  "calcBOD5e(-1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
    calcBOD5e(-1, -1)
    }
  }

  "calcBOD5e(-1, 0)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
    calcBOD5e(-1, 0)
    }
  }

  "calcBOD5e(0, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
    calcBOD5e(0, -1)
    }
  }

  "calcBOD5e(0, 0)" should "= 0.0" in {
    intercept[java.lang.NumberFormatException] {
    calcBOD5e(0, 0)
    }
  }

  "calcBOD5e(187.98, 1.1)" should "= 170.89" in {
    calcBOD5e(187.98, 1.1) shouldBe 170.89
  }

}
