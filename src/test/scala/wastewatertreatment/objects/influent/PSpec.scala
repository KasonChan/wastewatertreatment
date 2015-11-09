package wastewatertreatment.objects.influent

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.influent.Influent._

/**
 * Created by kasonchan on 11/8/15.
 */
class PSpec extends FlatSpec with Matchers {

  "calP(-1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calP(-1, -1)
    }
  }

  "calP(0, 0)" should "= 0.0" in {
    calP(0, 0) shouldBe 0
  }

  "calP(q, 1.1)" should "= 310645886.24" in {
    val q = 1393030.88
    val tss = 223
    calP(q, tss) shouldBe 310645886.24
  }

}
