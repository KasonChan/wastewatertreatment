package wastewatertreatment.objects.influent

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.influent.Influent._

/**
 * Created by kasonchan on 11/8/15.
 */
class bCODsSpec extends FlatSpec with Matchers {

  "calBCODs(-1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calBCODs(-1, -1)
    }
  }

  "calBCODs(0, 0)" should "= 0.0" in {
    calBCODs(0, 0) shouldBe 0
  }

  "calBCODs(bCOD, 1.1)" should "= 209.18" in {
    val bCOD = 411.84
    val bCODp = 202.66
    calBCODs(bCOD, bCODp) shouldBe 209.18
  }

}
