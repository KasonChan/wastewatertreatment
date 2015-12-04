package wastewatertreatment.removals

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by kasonchan on 12/2/15.
 */
class UnitsSuite extends FlatSpec with Matchers with Units {

  "tssRemovalUnits" should "= percentageUnits" in {
    tssRemovalUnits shouldBe percentageUnits
  }

  "bod5RemovalUnits" should "= percentageUnits" in {
    bod5RemovalUnits shouldBe percentageUnits
  }

  "nh3nRemovalUnits" should "= percentageUnits" in {
    nh3nRemovalUnits shouldBe percentageUnits
  }

  "tpRemovalUnits" should "= percentageUnits" in {
    tpRemovalUnits shouldBe percentageUnits
  }

  "fecalColiformRemovalUnits" should "= percentageUnits" in {
    fecalColiformRemovalUnits shouldBe percentageUnits
  }

  "enterococciRemovalUnits" should "= percentageUnits" in {
    enterococciRemovalUnits shouldBe percentageUnits
  }

}
