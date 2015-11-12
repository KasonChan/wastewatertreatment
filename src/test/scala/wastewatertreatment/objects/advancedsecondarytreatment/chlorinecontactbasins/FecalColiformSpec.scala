package wastewatertreatment.objects.advancedsecondarytreatment.chlorinecontactbasins

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.advancedsecondarytreatment.chlorinecontactbasins.ChlorineContactBasins.calFecalColiform

/**
 * Created by kasonchan on 11/11/15.
 */
class FecalColiformSpec extends FlatSpec with Matchers {

  "calFecalColiform(-1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calFecalColiform(-1, -1)
    }
  }

  "calFecalColiform(0, 0)" should "= 0.00" in {
    calFecalColiform(0, 0) shouldBe 0.00
  }

  "calFecalColiform(fecalColiformo)" should "= 2838.92" in {
    val fecalColiformo = 28389192.31
    calFecalColiform(fecalColiformo) shouldBe 2838.92
  }

  "calFecalColiform(fecalColiformo, bacterialRemovalRate)" should "= 2838.92" in {
    val fecalColiformo = 28389192.31
    val bacterialRemovalRate = 99.99
    calFecalColiform(fecalColiformo, bacterialRemovalRate) shouldBe 2838.92
  }

}
