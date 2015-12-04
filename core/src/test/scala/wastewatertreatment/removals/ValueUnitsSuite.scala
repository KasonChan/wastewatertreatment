package wastewatertreatment.removals

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by kasonchan on 12/2/15.
 */
class ValueUnitsSuite extends FlatSpec with Matchers with ValueUnits {

  "Default removals" should "pass" in {
    val defaultRemovals = MiscellaneousRemovals()
    defaultRemovals.tss shouldBe TSSRemoval(None, "%")
    defaultRemovals.bod5 shouldBe BOD5Removal(None, "%")
    defaultRemovals.nh3n shouldBe NH3NRemoval(None, "%")
    defaultRemovals.tp shouldBe TPRemoval(None, "%")
    defaultRemovals.fecalColiform shouldBe FecalColiformRemoval(None, "%")
    defaultRemovals.enterococci shouldBe EnterococciRemoval(None, "%")
  }

}
