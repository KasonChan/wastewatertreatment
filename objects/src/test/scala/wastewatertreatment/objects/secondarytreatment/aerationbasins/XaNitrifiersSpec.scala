package wastewatertreatment.objects.secondarytreatment.aerationbasins

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.secondarytreatment.aerationbasins.AerationBasins._

/**
 * Created by kasonchan on 11/5/15.
 */
class XaNitrifiersSpec extends FlatSpec with Matchers {

  "calXaHeterotrophs(-1, -1, -1, -1, -1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calXaHeterotrophs(-1, -1, -1, -1, -1, -1)
    }
  }

  "calXaHeterotrophs(0, 0, 0, 0, 0, 0)" should "= 0.00" in {
    calXaHeterotrophs(0, 0, 0, 0, 0, 0) shouldBe 0.00
  }

  "calXaHeterotrophs(q2, forallT2, thetaC, So = s)" should "= 58.58" in {
    val q = 9581414
    val no3n = 41.48
    val thetaC = 6.18
    calXaNitrifiers(q, NO3N = no3n, ThetaC = thetaC) shouldBe 3.191411023E7
  }

}
