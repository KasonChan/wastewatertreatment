package wastewatertreatment.objects.pretreatment.primaryclarifiers

import wastewatertreatment.core.calculations.Calculations
import wastewatertreatment.core.fluent.Fluent
import wastewatertreatment.core.ratios.Ratios
import wastewatertreatment.core.removals.Removals

/**
 * An object to represents primary clarifiers.
 */
object PrimaryClarifiers extends Calculations with Fluent with Ratios with Removals {

  /**
   * TSS removal = 63.00%.
   */
  val tssRemoval = 63.00

  /**
   * BOD,,5,, removal = 35.00%.
   */
  val bod5Removal = 35.00

  /**
   * TSS = 40000.00g/m^3^.
   */
  val tss = 40000.00

  /**
   * A case class to represent the default primary clarifiers.
   * tss the value of TSS removal. Default value is 63.00.
   * bod5 the value of BOD,,5,, removal. Default value is 35.00.
   * nh3n the value of NH,,3,,-N removal. Default value is 0.00.
   * tp the value of TP removal. Default value is 0.00.
   * fecalColiform the value of fecal coliform removal. Default value is 0.00.
   * enterococci the value of enterococci removal. Default value is 0.00.
   */
  val pcDefaultRemovals = Removals(tss = Some(tssRemoval),
    bod5 = Some(bod5Removal))

}
