package wastewatertreatment.objects.secondarytreatment.secondaryclarifiers

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.secondarytreatment.secondaryclarifiers.SecondaryClarifiers._

/**
 * Created by kasonchan on 11/9/15.
 */
class SecondaryClarifiersSuite extends FlatSpec with Matchers {

  "Calculation 1" should "pass" in {
    val qo = 571269.64
    val qe = 90138.51

    val po = 362934.31

    val q = calQ(qo, qe)
    q shouldBe 481131.13

    val p = calP(po)
    p shouldBe 199613.87
  }

  "Calculation 2" should "pass" in {
    val qo = 1193464.87
    val qe = 165103.26

    val po = 3055242.73

    val q = calQ(qo, qe)
    q shouldBe 1028361.61

    val p = calP(po)
    p shouldBe 1680383.50
  }

}
