package wastewatertreatment.objects.secondarytreatment.aerationbasins

import wastewatertreatment.valueunit

/**
 * Created by ka-son on 10/31/15.
 */
object Unit extends valueunit.Unit {

  val aTUnits = volumeUnits

  val qPeakUnits = flowUnits

  val thetaUnits = dayUnits

  val bodLoadingUnits = generatePRUs(massUnits, "BOD", dayUnits)

}
