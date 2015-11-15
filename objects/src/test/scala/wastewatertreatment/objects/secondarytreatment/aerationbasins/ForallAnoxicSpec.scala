package wastewatertreatment.objects.secondarytreatment.aerationbasins

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.secondarytreatment.aerationbasins.AerationBasins._

/**
 * Created by kasonchan on 11/5/15.
 */
class ForallAnoxicSpec extends FlatSpec with Matchers {

  "calForallAnoxic(-1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calForallAnoxic(-1, -1)
    }
  }

  "calForallAnoxic(0, 0)" should "= 0.00" in {
    calForallAnoxic(0, 0)
  }

  "calForallAnoxic(volumeOfBasins)" should "= 904200.00" in {
    val volumeOfBasins = 2740000.00
    calForallAnoxic(volumeOfBasins) shouldBe 904200.00
  }

}
