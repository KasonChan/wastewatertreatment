package wastewatertreatment.objects.influent

import wastewatertreatment.valueunit

/**
 * Created by kasonchan on 11/6/15.
 */
object Unit extends valueunit.Unit {

  val qUnits = flowUnits

  val tssUnits = concentrationUnits

  val cBOD5Units = concentrationUnits

  val nh3Units = concentrationUnits

  val tpUnits = concentrationUnits

  val vssUnits = concentrationUnits

  val bod5Units = concentrationUnits

  val bCODUnits = concentrationUnits

  val bCODpUnits = concentrationUnits

  val bCODsUnits = concentrationUnits

  val pUnits = generatePRUs(massUnits, "TSS", dayUnits)

}
