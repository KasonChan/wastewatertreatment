package wastewatertreatment.objects.secondarytreatment.aerationbasins

import wastewatertreatment.valueunit

/**
 * Created by ka-son on 10/31/15.
 */
object Unit extends valueunit.Unit {

  val forallTUnits = volumeUnits

  val qPeakUnits = flowUnits

  val thetaUnits = dayUnits

  val bodLoadingUnits = generatePRUs(massUnits, "BOD", dayUnits)

  val bodRemovalUnits = percentageUnits

  val tssRemovalUnits = percentageUnits

  val tknRemovalUnits = percentageUnits

  val nh3nRemovalUnits = percentageUnits

  val phosphorousRemovalUnits = percentageUnits

  val bCOD5RemovalUnits = percentageUnits

  val forallAnoxicForallTotalUnits = noUnits

  val sncUnits = concentrationUnits

  val xVSSUnits = concentrationUnits

  val seBODUnits = concentrationUnits

  val nbVSSVSSRatioUnits = noUnits

  val kOUnits = concentrationUnits

  val dOUnits = concentrationUnits

  val fndUnits = noUnits

  val factorOfSafetyUnits = noUnits

  val xRUnits = concentrationUnits

  val xNUnits = concentrationUnits

  val xEUnits = concentrationUnits

  val noXEUnits = concentrationUnits

  val rbCODUnits = concentrationUnits

}
