package wastewatertreatment.objects.advancedsecondarytreatment.chlorinecontactbasins

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.advancedsecondarytreatment.chlorinecontactbasins.ChlorineContactBasins._

/**
 * Created by kasonchan on 11/11/15.
 */
class EnterococciSpec extends FlatSpec with Matchers {

  "calEnterococci(-1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calEnterococci(-1, -1)
    }
  }

  "calEnterococci(0, 0)" should "= 0.00" in {
    calEnterococci(0, 0) shouldBe 0.00
  }

  "calEnterococci(enterococcio)" should "= 10.00" in {
    val enterococcio = 100000
    calEnterococci(enterococcio) shouldBe 10.00
  }

  "calEnterococci(enterococcio, bacterialRemovalRate)" should "= 10.00" in {
    val enterococcio = 100000
    val bacterialRemovalRate = 99.99
    calEnterococci(enterococcio, bacterialRemovalRate) shouldBe 10.00
  }

}
