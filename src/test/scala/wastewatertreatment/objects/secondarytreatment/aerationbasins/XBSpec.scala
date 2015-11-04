package wastewatertreatment.objects.secondarytreatment.aerationbasins

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.secondarytreatment.aerationbasins.AerationBasins._

/**
 * Created by kasonchan on 11/4/15.
 */
class XBSpec extends FlatSpec with Matchers {

  "calXb(-1, -1, -1, -1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calXb(-1, -1, -1, -1, -1)
    }
  }

  "calXb(0, 0, 0, 0, 0)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calXb(0, 0, 0, 0, 0)
    }
  }

  "calXb(q2, forallT2, thetaC, So = s)" should "= 58.58" in {
    val q = 958414.00
    val forallT = 2740000.00
    val thetaC = 6.18
    val sO = 119
    calXb(q, forallT, thetaC, So = sO) shouldBe 58.58
  }

}
