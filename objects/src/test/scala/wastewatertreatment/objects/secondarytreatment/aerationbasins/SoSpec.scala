package wastewatertreatment.objects.secondarytreatment.aerationbasins

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.secondarytreatment.aerationbasins.AerationBasins._

/**
 * Created by kasonchan on 11/8/15.
 */
class SoSpec extends FlatSpec with Matchers {

  "calBOD(-1, -1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calBOD(-1, -1, -1)
    }
  }

  "calBOD(0, 0, 0)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calBOD(0, 0, 0)
    }
  }

  "calBOD(lorg, forall, q)" should "= 301.25" in {
    val lorg = 84
    val forall = 4967750
    val q = 166000000
    calBOD(lorg, forall, q) shouldBe 301.25
  }

}
