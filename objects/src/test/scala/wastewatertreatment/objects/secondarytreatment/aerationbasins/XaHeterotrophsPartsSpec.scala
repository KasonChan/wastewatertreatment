package wastewatertreatment.objects.secondarytreatment.aerationbasins

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.secondarytreatment.aerationbasins.AerationBasins._

/**
 * Created by kasonchan on 11/5/15.
 */
class XaHeterotrophsPartsSpec extends FlatSpec with Matchers {

  "calXaHeterotrophsParts(-1, -1, -1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calXaHeterotrophsParts(-1, -1, -1, -1)
    }
  }

  "calXaHeterotrophsParts(0, 0, 0, 0)" should "= 0" in {
    calXaHeterotrophsParts(0, 0, 0, 0) shouldBe 0
  }

  "calXaHeterotrophsParts(thetaC, Xa = xANitrifiers)" should "= 1926930.65" in {
    val thetaC = 6.18
    val xAHeterotrophs = 25983423
    calXaHeterotrophsParts(thetaC, Xa = xAHeterotrophs) shouldBe 1926930.65
  }

}
