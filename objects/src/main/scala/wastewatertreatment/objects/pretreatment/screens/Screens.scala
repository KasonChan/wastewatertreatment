package wastewatertreatment.objects.pretreatment.screens

import wastewatertreatment.core.Core
import wastewatertreatment.influent.Influent
import wastewatertreatment.ratios.Ratios
import wastewatertreatment.removals.Removals

/**
 * Created by ka-son on 10/24/15.
 */
object Screens extends Core with Influent with Ratios with Removals {

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
   * tss the value of TSS removal. Default value is 27.00.
   * bod5 the value of BOD,,5,, removal. Default value is 27.00.
   * nh3n the value of NH,,3,,-N removal. Default value is 0.00.
   * tp the value of TP removal. Default value is 0.00.
   * fecalColiform the value of fecal coliform removal. Default value is 0.00.
   * enterococci the value of enterococci removal. Default value is 0.00.
   */
  val sDefaultRemovals = Removals(tss = Some(tssRemoval),
    bod5 = Some(bod5Removal))

}
