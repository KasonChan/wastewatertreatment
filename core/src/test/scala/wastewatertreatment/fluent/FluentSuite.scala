package wastewatertreatment.fluent

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by kasonchan on 12/3/15.
 */
class FluentSuite extends FlatSpec with Matchers with Fluent {

  "Default fluent" should "pass" in {
    val defaultInfluent = Fluent()
    defaultInfluent.flow shouldBe None
    defaultInfluent.tss shouldBe None
    defaultInfluent.vss shouldBe None
    defaultInfluent.bod5 shouldBe None
    defaultInfluent.cBOD5 shouldBe None
    defaultInfluent.bCOD shouldBe None
    defaultInfluent.bCODs shouldBe None
    defaultInfluent.bCODp shouldBe None
    defaultInfluent.nh3n shouldBe None
    defaultInfluent.tp shouldBe None
    defaultInfluent.p shouldBe None
    defaultInfluent.fecalColiform shouldBe None
    defaultInfluent.enterococci shouldBe None
    defaultInfluent.turbidity shouldBe None
  }

}
