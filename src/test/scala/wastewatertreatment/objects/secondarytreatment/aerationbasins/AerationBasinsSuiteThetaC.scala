package wastewatertreatment.objects.secondarytreatment.aerationbasins

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.secondarytreatment.aerationbasins.AerationBasins._

/**
 * Created by kasonchan on 11/3/15.
 */
class AerationBasinsSuiteThetaC extends FlatSpec with Matchers {

  "calThetaC(-1, -1, -1, -1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calThetaC(-1, -1, -1, -1, -1)
    }
  }

  "calThetaC(0, 0, 0, 0, 0)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calThetaC(0, 0, 0, 0, 0)
    }
  }

  "calThetaC()" should "= 6.18" in {
    calThetaC() shouldBe 6.18
  }

}
