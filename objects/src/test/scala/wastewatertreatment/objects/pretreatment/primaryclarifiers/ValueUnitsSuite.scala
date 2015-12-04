package wastewatertreatment.objects.pretreatment.primaryclarifiers

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.pretreatment.primaryclarifiers.ValueUnits._

/**
 * Created by kasonchan on 11/17/15.
 */
class ValueUnitsSuite extends FlatSpec with Matchers {

  "pcDefaultRemovals" should "pass" in {
    pcDefaultRemovals shouldBe MiscellaneousRemovals(tss = TSSRemoval(Some(63.00)),
      bod5 = BOD5Removal(Some(35.00)))
  }

}
