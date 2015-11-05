package wastewatertreatment.objects.secondarytreatment.aerationbasins

import wastewatertreatment.valueunit

/**
 * Created by ka-son on 10/31/15.
 */
object Unit extends valueunit.Unit {

  val forallTUnits = volumeUnits

  val qPeakUnits = flowUnits

  val thetaUnits = dayUnits

  val bodUnits = concentrationUnits

  val qUnits = flowUnits

  val bodLoadingUnits = generatePRUs(massUnits, "BOD", dayUnits)

  val bodRemovalUnits = percentageUnits

  val tssRemovalUnits = percentageUnits

  val tknRemovalUnits = percentageUnits

  val nh3nRemovalUnits = percentageUnits

  val phosphorousRemovalUnits = percentageUnits

  val bCODsRemovalUnits = percentageUnits

  val forallAnoxicForallTotalUnits = noUnits

  val codBODUnits = noUnits

  val codVSSUnits = noUnits

  val vssTSSUnits = noUnits

  val sneUnits = concentrationUnits

  val xVSSUnits = concentrationUnits

  val seBODUnits = concentrationUnits

  val nbVSSVSSRatioUnits = noUnits

  val kOUnits = concentrationUnits

  val dOUnits = concentrationUnits

  val fndUnits = noUnits

  val factorOfSafetyUnits = noUnits

  val tknUnits = noUnits

  val xRUnits = concentrationUnits

  val xWUnits = concentrationUnits

  val xEUnits = concentrationUnits

  val noXEUnits = concentrationUnits

  val rbCODUnits = concentrationUnits

  val uUnits = perDayUnits

  val kSUnits = concentrationUnits

  val yUnits = noUnits

  val kDUnits = perDayUnits

  val forallAnoxicUnits = volumeUnits

  val thetaAerobicUnits = dayUnits

  val thetaCUnits = dayUnits

  val sUnits = generatePRUs(massUnits, "BOD", volumeUnits)

  val xActiveBiomassUnits = generatePRUs(massUnits, "", dayUnits)

  val xAppPiecesAndPartsUnits = generatePRUs(massUnits, "", dayUnits)

  val pXBioUnits = generatePRUs(massUnits, "", dayUnits)

  val xBUnits = concentrationUnits

  val fmRatioUnits = noUnits

  val sdnrUnits = noUnits

  val no3nUnits = concentrationUnits

  val qWUnits = flowUnits

  val qRUnits = flowUnits

  val rUnits = noUnits

  val iRUnits = noUnits

  val noRUnits = generatePRUs(massUnits, "", dayUnits)

  val no3RemovedUnits = generatePRUs(massUnits, "", dayUnits)

  val xAHeterotrophsUnits = generatePRUs(massUnits, "", dayUnits)

}
