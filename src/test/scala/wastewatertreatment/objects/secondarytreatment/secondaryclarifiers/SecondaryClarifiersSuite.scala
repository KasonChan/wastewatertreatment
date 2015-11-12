package wastewatertreatment.objects.secondarytreatment.secondaryclarifiers

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.secondarytreatment.secondaryclarifiers.SecondaryClarifiers._

/**
 * Created by kasonchan on 11/9/15.
 */
class SecondaryClarifiersSuite extends FlatSpec with Matchers {

  "Calculation 1" should "pass" in {
    val po = 362934.31
    val pe = 163320.44

    val p = calP(po, pe)
    p shouldBe 199613.87
  }

}
