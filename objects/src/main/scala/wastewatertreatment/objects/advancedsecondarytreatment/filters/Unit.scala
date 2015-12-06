package wastewatertreatment.objects.advancedsecondarytreatment.filters

import wastewatertreatment.{fluent, ratios, removals}

/**
 * Created by ka-son on 11/7/15.
 */
object Unit extends fluent.Units with ratios.Units with removals.Units {

  val dailyBackwashRateUnits = generateUs(rateUnits, areaUnits)

}
