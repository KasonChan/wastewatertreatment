package wastewatertreatment.objects.secondarytreatment.aerationbasins

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.secondarytreatment.aerationbasins.AerationBasins._

/**
 * Created by kasonchan on 11/4/15.
 */
class QwSpec extends FlatSpec with Matchers {

  "calQw(-1, -1, -1, -1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calQw(-1, -1, -1, -1, -1)
    }
  }

  "calQw(0, 0, 0, 0, 0)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calQw(0, 0, 0, 0, 0)
    }
  }

  "calQw(forallT, ThetaC = thetaC, Q = q)" should "= 164976.53" in {
    val forallT = 2740000.00
    val thetaC = 6.18
    val q = 1193464.87
    calQw(forallT, ThetaC = thetaC, Q = q) shouldBe 164976.53
  }

}
