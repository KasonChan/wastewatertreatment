package wastewatertreatment.objects.advancedsecondarytreatment.uvdisinfectionbasins

import wastewatertreatment.core.Core

/**
 * Created by kasonchan on 11/17/15.
 */
object UVDisinfectionBasins extends Core {

  /**
   * Bacterial removal rate = 99.99%.
   */
  val bacterialRemovalRate = 99.99

  /**
   * A case class to represent the default UV disinfection basins.
   * tssRemoval the value of TSS removal. Default value is 0.00.
   * bod5Removal the value of BOD,,5,, removal. Default value is 0.00.
   * nh3nRemoval the value of NH,,3,,-N removal. Default value is 0.00.
   * tpRemoval the value of TP removal. Default value is 0.00.
   * fecalColiformRemoval the value of fecal coliform removal. Default value is 99.99.
   * enterococciRemoval the value of enterococci removal. Default value is 99.99.
   */
  val uvdbDefaultRemovals = Removals(fecalColiformRemoval = Some(bacterialRemovalRate),
    enterococciRemoval = Some(bacterialRemovalRate))

}
