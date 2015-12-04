package wastewatertreatment.objects.advancedsecondarytreatment.filters

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.advancedsecondarytreatment.filters.ValueUnits._

/**
 * Created by kasonchan on 11/17/15.
 */
class ValueUnitsSuite extends FlatSpec with Matchers {

  "fDefaultMiscRemovals" should "pass" in {
    fDefaultMiscRemovals shouldBe MiscellaneousRemovals(TSSRemoval(Some(70.00)),
      BOD5Removal(Some(70.00)),
      NH3NRemoval(Some(21.00)),
      TPRemoval(Some(33.00)),
      FecalColiformRemoval(Some(76.00)),
      EnterococciRemoval(Some(76.00)))
  }

}
