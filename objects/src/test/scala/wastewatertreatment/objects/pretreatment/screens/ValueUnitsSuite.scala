package wastewatertreatment.objects.pretreatment.screens

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.pretreatment.screens.ValueUnits._

/**
 * Created by kasonchan on 10/27/15.
 */
class ValueUnitsSuite extends FlatSpec with Matchers {

  "sDefaultRemovals" should "pass" in {
    sDefaultRemovals shouldBe MiscellaneousRemovals(tss = TSSRemoval(Some(27.00)),
      bod5 = BOD5Removal(Some(27.00)))
  }

}
