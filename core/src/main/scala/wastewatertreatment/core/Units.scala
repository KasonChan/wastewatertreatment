package wastewatertreatment.core

import wastewatertreatment.valueunit.Unit

/**
 * Created by kasonchan on 11/16/15.
 */
trait Units extends Unit {

  val bod5cBOD5RatioUnits = noUnits

  val codBODRatioUnits = noUnits

  val codVSSRatioUnits = noUnits

  val vssTSSRatioUnits = noUnits

  val tnUnits = concentrationUnits

  val bVSSVSSRatioUnits = noUnits

  val nbVSSVSSRatioUnits = noUnits

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
