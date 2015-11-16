package wastewatertreatment.objects.secondarytreatment.secondaryclarifiers

import wastewatertreatment.valueunit

/**
 * Created by kasonchan on 11/9/15.
 */
object Unit extends wastewatertreatment.valueunit.Unit {

  val tssRemovalUnits = percentageUnits

  val bodRemovalUnits = percentageUnits

  val tssUnits = concentrationUnits

  val pVSSRatioUnits = noUnits

  val qUnits = flowUnits

  val vssTSSRatioUnits = noUnits

  val vssUnits = concentrationUnits

  val bod5Units = concentrationUnits

  val pUnits = generatePRUs(massUnits, "TSS", dayUnits)

  val cBOD5Units = concentrationUnits

  val bCODsUnits = concentrationUnits

  val bCODpUnits = concentrationUnits

  val bCODUnits = concentrationUnits

  val tpUnits = concentrationUnits

}
