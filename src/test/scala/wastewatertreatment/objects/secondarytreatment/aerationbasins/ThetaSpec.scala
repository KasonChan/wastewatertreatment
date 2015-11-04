package wastewatertreatment.objects.secondarytreatment.aerationbasins

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.secondarytreatment.aerationbasins.AerationBasins.calTheta

/**
 * Created by ka-son on 10/31/15.
 */
class ThetaSpec extends FlatSpec with Matchers {

  "calTheta(-1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calTheta(-1, -1)
    }
  }

  "calTheta(-1, 0)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calTheta(-1, 0)
    }
  }

  "calTheta(0, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calTheta(0, -1)
    }
  }

  "calTheta(0, 0)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calTheta(0, 0)
    }
  }

  "calTheta(423819, 1393027)" should "= 0.30" in {
    calTheta(423819, 1393027) shouldBe 0.30
  }

}
