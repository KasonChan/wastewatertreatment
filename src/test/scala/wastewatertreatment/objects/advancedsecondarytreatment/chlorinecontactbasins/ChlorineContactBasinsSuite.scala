package wastewatertreatment.objects.advancedsecondarytreatment.chlorinecontactbasins

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.advancedsecondarytreatment.chlorinecontactbasins.ChlorineContactBasins.calFecalColiform

/**
 * Created by kasonchan on 11/10/15.
 */
class ChlorineContactBasinsSuite extends FlatSpec with Matchers {

  "Calculation 1" should "pass" in {
    val fecalColiformo = 28389192.31

    val fecalColiforme = calFecalColiform(fecalColiformo)
    fecalColiforme shouldBe 2838.92
  }

}
