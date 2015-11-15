package wastewatertreatment.objects.secondarytreatment.aerationbasins

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.secondarytreatment.aerationbasins.AerationBasins._

/**
 * Created by kasonchan on 11/5/15.
 */
class XaHeterotrophsSpec extends FlatSpec with Matchers {

  "calXaHeterotrophs(-1, -1, -1, -1, -1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calXaHeterotrophs(-1, -1, -1, -1, -1, -1)
    }
  }

  "calXaHeterotrophs(0, 0, 0, 0, 0, 0)" should "= 0.00" in {
    calXaHeterotrophs(0, 0, 0, 0, 0, 0) shouldBe 0.00
  }

  "calXaHeterotrophs(q2, forallT2, thetaC, So = s)" should "= 58.58" in {
    val q = 1193464.87
    val bod5o = 103.16
    val bod5e = 0.99
    val thetaC = 6.18
    calXaHeterotrophs(q, BOD5o = bod5o, BOD5e = bod5e, ThetaC = thetaC) shouldBe 2.80055824E7
  }

}
