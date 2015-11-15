package wastewatertreatment.objects.influent

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.influent.Influent.calVSS

/**
 * Created by kasonchan on 11/8/15.
 */
class VSSSpec extends FlatSpec with Matchers {

  "calVSS(-1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calVSS(-1, -1)
    }
  }

  "calVSS(0, 0)" should "= 0.0" in {
    calVSS(0, 0) shouldBe 0
  }

  "calVSS(223, 0.8)" should "= 178.40" in {
    calVSS(223, 0.8) shouldBe 178.40
  }

  "calVSS(223)" should "= 178.40" in {
    calVSS(223) shouldBe 178.40
  }

}
