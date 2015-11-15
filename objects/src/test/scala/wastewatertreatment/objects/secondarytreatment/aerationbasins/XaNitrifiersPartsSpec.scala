package wastewatertreatment.objects.secondarytreatment.aerationbasins

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.secondarytreatment.aerationbasins.AerationBasins._

/**
 * Created by kasonchan on 11/5/15.
 */
class XaNitrifiersPartsSpec extends FlatSpec with Matchers {

  "calXaNitrifiersParts(-1, -1, -1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calXaNitrifiersParts(-1, -1, -1, -1)
    }
  }

  "calXaNitrifiersParts(0, 0, 0, 0)" should "= 0" in {
    calXaNitrifiersParts(0, 0, 0, 0) shouldBe 0
  }

  "calXaNitrifiersParts(thetaC, Xa = xANitrifiers)" should "= 157828.25" in {
    val thetaC = 6.18
    val xANitrifiers = 3192319.01
    calXaNitrifiersParts(thetaC, Xa = xANitrifiers) shouldBe 157828.25
  }

}
