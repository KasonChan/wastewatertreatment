package wastewatertreatment.objects.secondarytreatment.secondaryclarifiers

import wastewatertreatment.core.Core
import wastewatertreatment.removals.Removals

/**
 * Created by kasonchan on 11/9/15.
 */
object SecondaryClarifiers extends Core {

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
   * P/VSS = 0.02.
   */
  val pVSSRatio = 0.02

  /**
   * A case class to represent the default secondary clarifiers.
   * tssRemoval the value of TSS removal. Default value is 45.00.
   * bod5Removal the value of BOD,,5,, removal. Default value is 25.00.
   * nh3nRemoval the value of NH,,3,,-N removal. Default value is 0.00.
   * tpRemoval the value of TP removal. Default value is 0.00.
   * fecalColiformRemoval the value of fecal coliform removal. Default value is 0.00.
   * enterococciRemoval the value of enterococci removal. Default value is 0.00.
   */
  val scDefaultRemovals = Removals(tssRemoval = Some(tssRemoval),
    bod5Removal = Some(bod5Removal))

}
