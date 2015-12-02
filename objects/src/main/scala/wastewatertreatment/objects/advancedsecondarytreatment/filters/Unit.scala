package wastewatertreatment.objects.advancedsecondarytreatment.filters

import wastewatertreatment.core.Units

/**
 * Created by ka-son on 11/7/15.
 */
object Unit extends Units {

  val dailyBackwashRateUnits = generateUs(rateUnits, areaUnits)

  val bod5RemovalUnits = percentageUnits

  val tssRemovalUnits = percentageUnits

  val bacterialRemovalRateUnits = percentageUnits

  val tpRemovalUnits = percentageUnits

  val nh3nRemovalUnits = percentageUnits

}
