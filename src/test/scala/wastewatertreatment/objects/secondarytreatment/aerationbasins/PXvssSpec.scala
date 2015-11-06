package wastewatertreatment.objects.secondarytreatment.aerationbasins

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.secondarytreatment.aerationbasins.AerationBasins._

/**
 * Created by kasonchan on 11/5/15.
 */
class PXvssSpec extends FlatSpec with Matchers {

  "calPXvss(-1, -1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calPXvss(-1, -1, -1)
    }
  }

  "calPXvss(0, 0, 0)" should "= 0.00" in {
    calPXvss(0, 0, 0) shouldBe 0.00
  }

  "calPXvss(pXBioHeterotrophs, pXBioNitrifiers, pXvsso)" should "= 23084101.66" in {
    val pXBioHeterotrophs = 3002889.55
    val pXBioNitrifiers = 11933898.15
    val pXvsso = 8147313.96
    calPXvss(pXBioHeterotrophs, pXBioNitrifiers, pXvsso) shouldBe 23084101.66
  }

}
