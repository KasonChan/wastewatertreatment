package wastewatertreatment.objects.secondarytreatment.secondaryclarifiers

import wastewatertreatment.valueunit

/**
 * Created by kasonchan on 11/9/15.
 */
object Unit extends valueunit.Unit {

  val tssRemovalUnits = percentageUnits

  val bodRemovalUnits = percentageUnits

  val tssUnits = concentrationUnits

  val pVSSRatioUnits = noUnits

  val qUnits = flowUnits

  val vssTSSRatioUnits = noUnits

  val vssUnits = concentrationUnits

  val pUnits = generatePRUs(massUnits, "TSS", dayUnits)

}
