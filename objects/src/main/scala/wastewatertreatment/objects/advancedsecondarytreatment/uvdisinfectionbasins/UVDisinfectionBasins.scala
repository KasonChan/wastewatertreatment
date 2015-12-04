package wastewatertreatment.objects.advancedsecondarytreatment.uvdisinfectionbasins

import wastewatertreatment.core.Core
import wastewatertreatment.influent.Influent
import wastewatertreatment.ratios.Ratios
import wastewatertreatment.removals.Removals

/**
 * Created by kasonchan on 11/17/15.
 */
object UVDisinfectionBasins extends Core with Influent with Ratios with Removals {

  /**
   * Bacterial removal rate = 99.99%.
   */
  val bacterialRemovalRate = 99.99

  /**
   * A case class to represent the default UV disinfection basins.
   * tss the value of TSS removal. Default value is 0.00.
   * bod5 the value of BOD,,5,, removal. Default value is 0.00.
   * nh3n the value of NH,,3,,-N removal. Default value is 0.00.
   * tp the value of TP removal. Default value is 0.00.
   * fecalColiform the value of fecal coliform removal. Default value is 99.99.
   * enterococci the value of enterococci removal. Default value is 99.99.
   */
  val uvdbDefaultRemovals = Removals(fecalColiform = Some(bacterialRemovalRate),
    enterococci = Some(bacterialRemovalRate))

}
