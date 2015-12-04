package wastewatertreatment.objects.secondarytreatment.secondaryclarifiers

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.secondarytreatment.secondaryclarifiers.ValueUnits._

/**
 * Created by kasonchan on 12/3/15.
 */
class ValueUnitsSuite extends FlatSpec with Matchers {

  "scDefaultMiscRemovals" should "pass" in {
    scDefaultMiscRemovals shouldBe MiscellaneousRemovals(tss = TSSRemoval(Some(45.00)),
      bod5 = BOD5Removal(Some(25.00))
    )
  }

}
