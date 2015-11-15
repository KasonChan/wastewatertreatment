package wastewatertreatment.objects.secondarytreatment.aerationbasins

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.secondarytreatment.aerationbasins.AerationBasins._

/**
 * Created by kasonchan on 11/5/15.
 */
class NO3RemovedSpec extends FlatSpec with Matchers {

  "calNO3Removed(-1, -1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calNO3Removed(-1, -1, -1)
    }
  }

  "calNO3Removed(0, 0, 0)" should "fail" in {
    calNO3Removed(0, 0, 0) shouldBe 0.00
  }

  "calNO3Removed(q, iR, r)" should "= 944037.79" in {
    val forallAnoxic = 904000
    val xB = 58.58
    val sdnr = 0.33
    calNO3Removed(forallAnoxic, xB, sdnr) shouldBe 1.74755856E7
  }

}
