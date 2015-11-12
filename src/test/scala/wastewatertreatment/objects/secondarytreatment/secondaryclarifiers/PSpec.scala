package wastewatertreatment.objects.secondarytreatment.secondaryclarifiers

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.secondarytreatment.secondaryclarifiers.SecondaryClarifiers._

/**
 * Created by kasonchan on 11/11/15.
 */
class PSpec extends FlatSpec with Matchers {

  "calP(-1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calP(-1, -1)
    }
  }

  "calP(-1, 0)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calP(-1, 0)
    }
  }

  "calP(0, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calP(0, -1)
    }
  }

  "calP(0, 0)" should "= 0" in {
    calP(0, 0) shouldBe 0.0
  }

  "calP(po, pe)" should "= 199613.87" in {
    val po = 362934.31
    val pe = 163320.44
    calP(po, pe) shouldBe 199613.87
  }

}
