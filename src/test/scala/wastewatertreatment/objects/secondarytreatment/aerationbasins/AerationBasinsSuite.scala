package wastewatertreatment.objects.secondarytreatment.aerationbasins

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.secondarytreatment.aerationbasins.AerationBasins._

/**
 * Created by ka-son on 10/31/15.
 */
class AerationBasinsSuite extends FlatSpec with Matchers {

  "Calculation 1" should "pass" in {
    // Inputs
    val forallT = 423819
    val qPeak = 1393027
    val bod = 103
    val q = 242981

    val theta = calTheta(forallT, qPeak)
    theta shouldBe 0.30

    val bodLoading = calBODLoading(bod, q)
    bodLoading shouldBe 25027.04
  }

}
