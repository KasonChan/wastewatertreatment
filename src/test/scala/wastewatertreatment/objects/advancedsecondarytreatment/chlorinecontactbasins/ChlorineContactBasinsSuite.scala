package wastewatertreatment.objects.advancedsecondarytreatment.chlorinecontactbasins

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.advancedsecondarytreatment.chlorinecontactbasins.ChlorineContactBasins._

/**
 * Created by kasonchan on 11/10/15.
 */
class ChlorineContactBasinsSuite extends FlatSpec with Matchers {

  "Calculation 1" should "pass" in {
    val fecalColiformo = 28389192.31
    val enterococcio = 100000

    val fecalColiforme = calFecalColiform(fecalColiformo)
    fecalColiforme shouldBe 2838.92

    val enterococcie = calEnterococci(enterococcio)
    enterococcie shouldBe 10
  }

  "Calculation 2" should "pass" in {
    val fecalColiformo = 28389192.31
    val enterococcio = 100000
    val bacterialRemovalRate = 99.99

    val fecalColiforme = calFecalColiform(fecalColiformo, bacterialRemovalRate)
    fecalColiforme shouldBe 2838.92

    val enterococcie = calEnterococci(enterococcio, bacterialRemovalRate)
    enterococcie shouldBe 10
  }

}
