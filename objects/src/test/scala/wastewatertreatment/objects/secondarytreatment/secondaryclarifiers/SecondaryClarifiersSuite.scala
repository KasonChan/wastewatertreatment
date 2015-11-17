package wastewatertreatment.objects.secondarytreatment.secondaryclarifiers

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.secondarytreatment.secondaryclarifiers.SecondaryClarifiers._

/**
 * Created by kasonchan on 11/17/15.
 */
class SecondaryClarifiersSuite extends FlatSpec with Matchers {

  "tssRemoval" should "= 45.00" in {
    tssRemoval shouldBe 45.00
  }

  "bodRemoval" should "= 25.00" in {
    bodRemoval shouldBe 25.00
  }

  "tss" should "= 8000.00" in {
    tss shouldBe 8000.00
  }

  "pVSSRatio" should "= 0.02" in {
    pVSSRatio shouldBe 0.02
  }

}
