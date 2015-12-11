package yiris.objects.advancedsecondarytreatment.uvdisinfectionbasins

import org.scalatest.{FlatSpec, Matchers}
import yiris.objects.advancedsecondarytreatment.uvdisinfectionbasins.ValueUnits._

/**
 * Created by kasonchan on 11/17/15.
 */
class ValueUnitsSuite extends FlatSpec with Matchers {

  "Default misc removals" should "pass" in {
    val defaultRemovals = uvdbDefaultRemovals
    defaultRemovals.tss shouldBe TSSRemoval()
    defaultRemovals.bod5 shouldBe BOD5Removal()
    defaultRemovals.nh3n shouldBe NH3NRemoval()
    defaultRemovals.tp shouldBe TPRemoval()
    defaultRemovals.fecalColiform shouldBe FecalColiformRemoval(Some(99.99))
    defaultRemovals.enterococci shouldBe EnterococciRemoval(Some(99.99))
  }

}
