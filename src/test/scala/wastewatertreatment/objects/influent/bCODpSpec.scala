package wastewatertreatment.objects.influent

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.influent.Influent._

/**
 * Created by kasonchan on 11/8/15.
 */
class bCODpSpec extends FlatSpec with Matchers {

  "calBCODp(-1, -1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calBCODp(-1, -1, -1)
    }
  }

  "calBCODp(0, 0,0)" should "= 0.0" in {
    calBCODp(0, 0, 0) shouldBe 0
  }

  "calBCODp(vss, 1.6)" should "= 202.66" in {
    val vss = 178.4
    val codVSSRatio = 1.42
    val bVSS = 0.8
    calBCODp(vss, codVSSRatio, bVSS) shouldBe 202.66
  }

  "calBCODp(vss)" should "= 202.66" in {
    val vss = 178.4
    calBCODp(vss) shouldBe 202.66
  }

}
