package wastewatertreatment.objects.pretreatment.screen

import wastewatertreatment.valueunit

/**
 * Created by kasonchan on 10/25/15.
 */
object Unit extends valueunit.Unit {

  val tssRemovalUnits = List("%")

  val bod5RemovalUnits = List("%")

  val qUnits = flowUnits

  val tssOUnits = concentrationUnits

  val tssEUnits = concentrationUnits

  val bod5OUnits = concentrationUnits

  val bod5EUnits = concentrationUnits

  val bod5cBOD5Units = generateRUs(massUnits, "BOD5", "cBOD5")

  val codBODUnits = generateRUs(massUnits, "COD", "BOD")

  val codVSSUnits = generateRUs(massUnits, "COD", "VSS")

  val vssTSSUnits = generateRUs(massUnits, "VSS", "TSS")

  val vsseUnits = concentrationUnits

  val cBOD5eUnits = concentrationUnits

  val bCODeUnits = concentrationUnits

  val bCODpeUnits = concentrationUnits

  val bCODsUnits = concentrationUnits

  val pUnits = generatePRUs(massUnits, "TSS", dayUnits)

}
