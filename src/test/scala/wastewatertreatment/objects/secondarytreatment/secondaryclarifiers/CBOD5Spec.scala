package wastewatertreatment.objects.secondarytreatment.secondaryclarifiers

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.secondarytreatment.secondaryclarifiers.SecondaryClarifiers._

/**
 * Created by kasonchan on 11/13/15.
 */
class CBOD5Spec extends FlatSpec with Matchers {

  "calCBOD5(-1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calCBOD5(-1, -1)
    }
  }

  "calCBOD5(-1, 0)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calCBOD5(-1, 0)
    }
  }

  "calCBOD5(0, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calCBOD5(0, -1)
    }
  }

  "calCBOD5(0, 0)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calCBOD5(0, 0)
    }
  }

  "calCBOD5(bod5)" should "= 0.68" in {
    val bod5 = 0.75
    calCBOD5(bod5) shouldBe 0.68
  }

  "calCBOD5(bod5, bod5cBOD5Ratio)" should "= 0.68" in {
    val bod5 = 0.75
    val bod5cBOD5Ratio = 1.1
    calCBOD5(bod5, bod5cBOD5Ratio) shouldBe 0.68
  }

}
