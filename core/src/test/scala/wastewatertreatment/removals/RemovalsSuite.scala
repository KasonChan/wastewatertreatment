package wastewatertreatment.removals

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by kasonchan on 12/2/15.
 */
class RemovalsSuite extends FlatSpec with Matchers with Removals {

  "Default removals" should "pass" in {
    val defaultRemovals = Removals()
    defaultRemovals.tss shouldBe None
    defaultRemovals.bod5 shouldBe None
    defaultRemovals.nh3n shouldBe None
    defaultRemovals.tp shouldBe None
    defaultRemovals.fecalColiform shouldBe None
    defaultRemovals.enterococci shouldBe None
  }

}
