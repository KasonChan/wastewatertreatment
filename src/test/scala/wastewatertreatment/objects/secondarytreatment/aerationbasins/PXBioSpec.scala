package wastewatertreatment.objects.secondarytreatment.aerationbasins

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.secondarytreatment.aerationbasins.AerationBasins._

/**
 * Created by kasonchan on 11/3/15.
 */
class PXBioSpec extends FlatSpec with Matchers {

  "calPXBio(-1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calPXBio(-1, -1)
    }
  }

  "calPXBio(0, 0)" should "= 0" in {
    calPXBio(0, 0) shouldBe 0
  }

  "calPXBio(2.597447221E7, 1926266.86)" should "= 2.790073907E7" in {
    calPXBio(2.597447221E7, 1926266.86) shouldBe 2.790073907E7
  }

}
