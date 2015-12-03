package wastewatertreatment.objects.pretreatment.screens

import wastewatertreatment.core.Core
import wastewatertreatment.removals.Removals

/**
 * Created by ka-son on 10/24/15.
 */
object Screens extends Core {

  /**
   * TSS removal = 27.00%.
   */
  val tssRemoval = 27.00

  /**
   * BOD,,5,, removal = 27.00%.
   */
  val bod5Removal = 27.00

  /**
   * A case class to represent the default screens.
   * tssRemoval the value of TSS removal. Default value is 27.00.
   * bod5Removal the value of BOD,,5,, removal. Default value is 27.00.
   * nh3nRemoval the value of NH,,3,,-N removal. Default value is 0.00.
   * tpRemoval the value of TP removal. Default value is 0.00.
   * fecalColiformRemoval the value of fecal coliform removal. Default value is 0.00.
   * enterococciRemoval the value of enterococci removal. Default value is 0.00.
   */
  val sDefaultRemovals = Removals(tssRemoval = Some(tssRemoval),
    bod5Removal = Some(bod5Removal))

}
