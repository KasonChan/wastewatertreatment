package wastewatertreatment.objects.advancedsecondarytreatment.filters

import wastewatertreatment.core.{fluent, ratios, removals}

/**
 * An object to represents filters units.
 */
object Unit extends fluent.Units with ratios.Units with removals.Units {

  val dailyBackwashRateUnits = generateUs(rateUnits, areaUnits)

}
