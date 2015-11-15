package wastewatertreatment.objects.secondarytreatment.aerationbasins

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.secondarytreatment.aerationbasins.AerationBasins._

/**
 * Created by kasonchan on 11/3/15.
 */
class ThetaAerobicSpec extends FlatSpec with Matchers {

  "calThetaAerobic(-1, -1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calThetaAerobic(-1, -1, -1)
    }
  }

  "calThetaAerobic(-1, -1, 0)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calThetaAerobic(-1, -1, 0)
    }
  }

  "calThetaAerobic(-1, 0, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calThetaAerobic(-1, 0, -1)
    }
  }

  "calThetaAerobic(-1, 0, 0)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calThetaAerobic(-1, 0, 0)
    }
  }

  "calThetaAerobic(0, -1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calThetaAerobic(0, -1, -1)
    }
  }

  "calThetaAerobic(0, -1, 0)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calThetaAerobic(0, -1, 0)
    }
  }

  "calThetaAerobic(0, 0, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calThetaAerobic(0, 0, -1)
    }
  }

  "calThetaAerobic(0, 0, 0)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calThetaAerobic(0, 0, 0)
    }
  }

  "calThetaAerobic(2740000, 904000, 958414)" should "= 1.92" in {
    calThetaAerobic(2740000, 904000, 958414) shouldBe 1.92
  }

}