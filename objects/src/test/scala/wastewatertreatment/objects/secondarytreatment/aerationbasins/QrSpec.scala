package wastewatertreatment.objects.secondarytreatment.aerationbasins

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.secondarytreatment.aerationbasins.AerationBasins._

/**
 * Created by kasonchan on 11/4/15.
 */
class QrSpec extends FlatSpec with Matchers {

  "calQr(-1, -1, -1, -1, -1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calQr(-1, -1, -1, -1, -1, -1)
    }
  }

  "calQr(0, 0, 0, 0, 0, 0)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calQr(0, 0, 0, 0, 0, 0)
    }
  }

  "calQr(q, qW)" should "= 449856.98 " in {
    val q = 1193464.87
    val qW = 165103.26
    calQr(q, qW) shouldBe 449856.98
  }

}
