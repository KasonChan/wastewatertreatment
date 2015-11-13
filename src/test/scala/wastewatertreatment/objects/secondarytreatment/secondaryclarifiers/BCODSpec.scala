package wastewatertreatment.objects.secondarytreatment.secondaryclarifiers

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.secondarytreatment.secondaryclarifiers.SecondaryClarifiers._

/**
 * Created by kasonchan on 11/13/15.
 */
class BCODSpec extends FlatSpec with Matchers {

  "calBCOD(-1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calBCOD(-1, -1)
    }
  }

  "calBCOD(-1, 0)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calBCOD(-1, 0)
    }
  }

  "calBCOD(0, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calBCOD(0, -1)
    }
  }

  "calBCOD(0, 0)" should "= 0" in {
    calBCOD(0, 0) shouldBe 0
  }

  "calBCOD(bCODs, bCODp)" should "= 0.38" in {
    val bCODs = 0
    val bCODp = 0.38
    calBCOD(bCODs, bCODp) shouldBe 0.38
  }

}
