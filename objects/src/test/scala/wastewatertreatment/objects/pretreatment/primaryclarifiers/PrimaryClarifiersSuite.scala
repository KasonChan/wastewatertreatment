package wastewatertreatment.objects.pretreatment.primaryclarifiers

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.pretreatment.primaryclarifiers.PrimaryClarifiers._

/**
 * Created by kasonchan on 11/17/15.
 */
class PrimaryClarifiersSuite extends FlatSpec with Matchers {

  "tssRemoval" should "= 63.00" in {
    tssRemoval shouldBe 63.00
  }

  "bodRemoval" should "= 35.00" in {
    bodRemoval shouldBe 35.00
  }

  "tss" should "= 40000.00" in {
    tss shouldBe 40000.00
  }

  "phosphorusRemoval" should "= 0.00" in {
    phosphorusRemoval shouldBe 0.00
  }

}
