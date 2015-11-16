package wastewatertreatment.core

/**
 * Created by kasonchan on 11/16/15.
 */
object Units extends wastewatertreatment.valueunit.Unit {

  val qUnits = flowUnits

  val tssUnits = concentrationUnits

  val vssUnits = concentrationUnits

  val bod5Units = concentrationUnits

  val cBOD5Units = concentrationUnits

  val bCODUnits = concentrationUnits

  val bCODsUnits = concentrationUnits

  val bCODpUnits = concentrationUnits

  val nh3nUnits = concentrationUnits

  val tpUnits = concentrationUnits

  val pUnits = generatePRUs(massUnits, "TSS", dayUnits)

  val fecalColiformUnits = generatePRUs(colonyFormingUnits, "", List("100mL"))

  val enterococciUnits = generatePRUs(colonyFormingUnits, "", List("100mL"))

  val turbidityUnits = hazeUnits

}
