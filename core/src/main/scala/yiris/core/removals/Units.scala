package yiris.core.removals

import yiris.core.valueunit.Unit

/**
 * A trait contains all default removal units.
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
