package wastewatertreatment.objects.advancedsecondarytreatment.filter

import wastewatertreatment.objects.advancedsecondarytreatment.filter.Unit._
import wastewatertreatment.valueunit.ValueUnit

/**
 * Created by ka-son on 11/7/15.
 */

/**
 * Daily backwash rate
 * @param unit Default unit is '''m^3^/d'''.
 */
case class DailyBackwashRate(value: Double,
                             unit: String = dailyBackwashRateUnits.drop(1).headOption.getOrElse("m^3/d")) extends ValueUnit
