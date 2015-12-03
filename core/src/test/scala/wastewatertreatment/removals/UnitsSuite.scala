package wastewatertreatment.removals

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by kasonchan on 12/2/15.
 */
class UnitsSuite extends FlatSpec with Matchers with Units {

  "tssRemovalUnits" should "= noUnits" in {
    tssRemovalUnits shouldBe noUnits
  }

  "bod5RemovalUnits" should "= noUnits" in {
    bod5RemovalUnits shouldBe noUnits
  }

  "nh3nRemovalUnits" should "= noUnits" in {
    nh3nRemovalUnits shouldBe noUnits
  }

  "tpRemovalUnits" should "= noUnits" in {
    tpRemovalUnits shouldBe noUnits
  }

  "fecalColiformRemovalUnits" should "= noUnits" in {
    fecalColiformRemovalUnits shouldBe noUnits
  }

  "enterococciRemovalUnits" should "= noUnits" in {
    enterococciRemovalUnits shouldBe noUnits
  }

}
