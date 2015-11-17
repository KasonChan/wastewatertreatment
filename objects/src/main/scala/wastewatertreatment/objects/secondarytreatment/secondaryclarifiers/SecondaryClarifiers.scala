package wastewatertreatment.objects.secondarytreatment.secondaryclarifiers

import wastewatertreatment.assumptions.Assumptions
import wastewatertreatment.core.Core
import wastewatertreatment.massbalance.MassBalance

/**
 * Created by kasonchan on 11/9/15.
 */
object SecondaryClarifiers extends Assumptions with Core with MassBalance {

  /**
   * TSS removal = 45.00%.
   */
  val tssRemoval = 45.00

  /**
   * BOD removal = 25.00%.
   */
  val bodRemoval = 25.00

  /**
   * TSS = 8000.00g/m^3^.
   */
  val tss = 8000.00

  /**
   * P/VSS = 0.02.
   */
  val pVSSRatio = 0.02

}
