package wastewatertreatment.removals

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by kasonchan on 12/2/15.
 */
class RemovalsSuite extends FlatSpec with Matchers {

  "Default removals" should "pass" in {
    val defaultRemovals = Removals()
    defaultRemovals.tssRemoval shouldBe None
    defaultRemovals.bod5Removal shouldBe None
    defaultRemovals.nh3nRemoval shouldBe None
    defaultRemovals.tpRemoval shouldBe None
    defaultRemovals.fecalColiformRemoval shouldBe None
    defaultRemovals.enterococciRemoval shouldBe None
  }

}
