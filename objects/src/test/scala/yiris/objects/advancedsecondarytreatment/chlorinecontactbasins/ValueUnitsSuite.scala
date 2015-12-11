package yiris.objects.advancedsecondarytreatment.chlorinecontactbasins

import org.scalatest.{FlatSpec, Matchers}
import yiris.objects.advancedsecondarytreatment.chlorinecontactbasins.ValueUnits._

/**
 * Created by kasonchan on 11/16/15.
 */
class ValueUnitsSuite extends FlatSpec with Matchers {

  "ccbDefaultMiscRemovals" should "pass" in {
    ccbDefaultMiscRemovals shouldBe MiscellaneousRemovals(fecalColiform = FecalColiformRemoval(Some(99.99)),
      enterococci = EnterococciRemoval(Some(99.99)))
  }

}
