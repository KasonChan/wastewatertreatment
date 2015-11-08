package wastewatertreatment.objects.secondarytreatment.aerationbasins

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.secondarytreatment.aerationbasins.AerationBasins._

/**
 * Created by kasonchan on 11/8/15.
 */
class AerationTankVolumesSpec extends FlatSpec with Matchers {

  "calAerationTankVolumes(-1, -1, -1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calAerationTankVolumes(-1, -1, -1, -1)
    }
  }

  "calAerationTankVolumes(0, 0, 0, 0)" should "= 0.00" in {
    calAerationTankVolumes(0, 0, 0, 0) shouldBe 0.00
  }

  "calAerationTankVolumes(count, length, width, depth)" should "= 2738340.00" in {
    val count = 6
    val length = 275
    val width = 120
    val depth = 13.83
    calAerationTankVolumes(count, length, width, depth) shouldBe 2738340.00
  }

  "calAerationTankVolumes(count, length, width, depth)" should "= 1406250.00" in {
    val count = 3
    val length = 250
    val width = 125
    val depth = 15
    calAerationTankVolumes(count, length, width, depth) shouldBe 1406250.00
  }

  "calAerationTankVolumes(count, length, width, depth)" should "= 822450.00" in {
    val count = 4
    val length = 250
    val width = 54.83
    val depth = 15
    calAerationTankVolumes(count, length, width, depth) shouldBe 822450.00
  }

}
