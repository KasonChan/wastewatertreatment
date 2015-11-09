package wastewatertreatment.objects.influent

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.influent.Influent._

/**
 * Created by kasonchan on 11/8/15.
 */
class BOD5Spec extends FlatSpec with Matchers {

  "calBOD5(-1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calBOD5(-1, -1)
    }
  }

  "calBOD5(0, 0)" should "= 0.0" in {
    calBOD5(0, 0) shouldBe 0
  }

  "calBOD5(cBOD5, 1.1)" should "= 257.40" in {
    val cBOD5 = 234
    val bod5cBOD5Ratio = 1.1
    calBOD5(cBOD5, bod5cBOD5Ratio) shouldBe 257.40
  }

  "calBOD5(cBOD5)" should "= 257.40" in {
    val cBOD5 = 234
    calBOD5(cBOD5) shouldBe 257.40
  }

}
