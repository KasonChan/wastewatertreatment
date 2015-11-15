package wastewatertreatment.objects.secondarytreatment.aerationbasins

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.secondarytreatment.aerationbasins.AerationBasins._

/**
 * Created by kasonchan on 11/5/15.
 */
class PXvssoSpec extends FlatSpec with Matchers {

  "calPXvsso(-1, -1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calPXvsso(-1, -1, -1)
    }
  }

  "calPXvsso(0, 0, 0)" should "= 0.00" in {
    calPXvsso(0, 0, 0) shouldBe 0.00
  }

  "calPXvsso(q, vss)" should "= 7430512.28" in {
    val q = 1193464.87
    val vss = 31.13
    calPXvsso(q, vss) shouldBe 7430512.28
  }

}
