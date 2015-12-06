package wastewatertreatment.objects.secondarytreatment.aerobicbasins

import wastewatertreatment.{fluent, ratios, removals}

/**
 * Created by ka-son on 11/22/15.
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
