package wastewatertreatment.objects.secondarytreatment.secondaryclarifiers

import wastewatertreatment.core.calculations.Calculations
import wastewatertreatment.core.fluent.Fluent
import wastewatertreatment.core.ratios.Ratios
import wastewatertreatment.core.removals.Removals

/**
 * An object to represents secondary clarifiers.
 */
object SecondaryClarifiers extends Calculations with Fluent with Ratios with Removals {

  /**
   * TSS removal = 45.00%.
   */
  val tssRemoval = 45.00

  /**
   * BOD,,5,, removal = 25.00%.
   */
  val bod5Removal = 25.00

  /**
   * TSS = 8000.00g/m^3^.
   */
  val tss = 8000.00

  /**
   * A case class to represent the default secondary clarifiers.
   * tss the value of TSS removal. Default value is 45.00.
   * bod5 the value of BOD,,5,, removal. Default value is 25.00.
   * nh3n the value of NH,,3,,-N removal. Default value is 0.00.
   * tp the value of TP removal. Default value is 0.00.
   * fecalColiform the value of fecal coliform removal. Default value is 0.00.
   * enterococci the value of enterococci removal. Default value is 0.00.
   */
  val scDefaultRemovals = Removals(tss = Some(tssRemoval),
    bod5 = Some(bod5Removal))

}
