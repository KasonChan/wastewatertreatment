package wastewatertreatment.core.removals

import wastewatertreatment.core.valueunit.Unit

/**
 * Created by kasonchan on 12/2/15.
 */
trait Units extends Unit {

  val tssRemovalUnits = percentageUnits

  val bod5RemovalUnits = percentageUnits

  val nh3nRemovalUnits = percentageUnits

  val tpRemovalUnits = percentageUnits

  val fecalColiformRemovalUnits = percentageUnits

  val enterococciRemovalUnits = percentageUnits

  val bacterialRemovalRateUnits = percentageUnits

}
