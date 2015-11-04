package wastewatertreatment.objects.secondarytreatment.aerationbasins

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.secondarytreatment.aerationbasins.AerationBasins._

/**
 * Created by kasonchan on 11/4/15.
 */
class FMRatioSpec extends FlatSpec with Matchers {

  "calFMRatio(-1, -1, -1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calFMRatio(-1, -1, -1, -1)
    }
  }

  "calFMRatio(0, 0, 0, 0)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calFMRatio(0, 0, 0, 0)
    }
  }

  "calFMRatio(q, sO, forallAnoxic, xB)" should "= 2.15" in {
    val q = 958414.00
    val sO = 119
    val forallAnoxic = 904000
    val xB = 58.58
    calFMRatio(q, sO, forallAnoxic, xB) shouldBe 2.15
  }

}
