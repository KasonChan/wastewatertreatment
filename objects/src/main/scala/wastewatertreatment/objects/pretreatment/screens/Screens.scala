package wastewatertreatment.objects.pretreatment.screens

import wastewatertreatment.assumptions.Assumptions
import wastewatertreatment.core.Core
import wastewatertreatment.massbalance.MassBalance

/**
 * Created by ka-son on 10/24/15.
 */
object Screens extends Assumptions with Core with MassBalance {

  /**
   * TSS removal = 27.00%.
   */
  val tssRemoval = 27.00

  /**
   * BOD,,5,, removal = 27.00%.
   */
  val bod5Removal = 27.00

}
