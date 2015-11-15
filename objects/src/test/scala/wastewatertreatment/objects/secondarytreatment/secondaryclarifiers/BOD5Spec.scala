package wastewatertreatment.objects.secondarytreatment.secondaryclarifiers

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.secondarytreatment.secondaryclarifiers.SecondaryClarifiers._

/**
 * Created by kasonchan on 11/12/15.
 */
class BOD5Spec extends FlatSpec with Matchers {

  "calBOD5(-1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calBOD5(-1, -1)
    }
  }

  "calBOD5(-1, 0)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calBOD5(-1, 0)
    }
  }

  "calBOD5(0, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calBOD5(0, -1)
    }
  }

  "calBOD5(0, 0)" should "= 0" in {
    calBOD5(0, 0) shouldBe 0
  }

  "calBOD5(bod5o)" should "= 0.75" in {
    val bod5o = 1
    calBOD5(bod5o) shouldBe 0.75
  }

  "calBOD5(bod5o, bodRemoval)" should "= 0.75" in {
    val bod5o = 1
    val bodRemoval = 25
    calBOD5(bod5o, bodRemoval) shouldBe 0.75
  }

}
