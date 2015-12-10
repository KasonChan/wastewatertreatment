package wastewatertreatment.objects.secondarytreatment.aerobicbasins

import wastewatertreatment.core.{fluent, ratios, removals}

/**
 * An object to represents aerobic basins units.
 */
object Unit extends fluent.Units with ratios.Units with removals.Units {

  val xVSSUnits = concentrationUnits

  val seBODUnits = concentrationUnits

  val kOUnits = concentrationUnits

  val dOUnits = concentrationUnits

  val fndUnits = noUnits


  val xRUnits = concentrationUnits

  val xWUnits = concentrationUnits

  val xEUnits = concentrationUnits


  val uUnits = perDayUnits

  val kSUnits = concentrationUnits

  val yUnits = noUnits

  val kDUnits = perDayUnits

  val thetaCUnits = dayUnits

}
