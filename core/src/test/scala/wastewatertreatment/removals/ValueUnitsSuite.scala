package wastewatertreatment.removals

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by kasonchan on 12/2/15.
 */
class ValueUnitsSuite extends FlatSpec with Matchers with ValueUnits {

  "Default removals" should "pass" in {
    val defaultRemovals = MiscellaneousRemovals()
    defaultRemovals.tssRemoval shouldBe TSSRemoval(None, "")
    defaultRemovals.bod5Removal shouldBe BOD5Removal(None, "")
    defaultRemovals.nh3nRemoval shouldBe NH3NRemoval(None, "")
    defaultRemovals.tpRemoval shouldBe TPRemoval(None, "")
    defaultRemovals.fecalColiformRemoval shouldBe FecalColiformRemoval(None, "")
    defaultRemovals.enterococciRemoval shouldBe EnterococciRemoval(None, "")
  }

}
