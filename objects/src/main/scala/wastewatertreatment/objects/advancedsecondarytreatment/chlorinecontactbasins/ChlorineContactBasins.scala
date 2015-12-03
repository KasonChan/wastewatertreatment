package wastewatertreatment.objects.advancedsecondarytreatment.chlorinecontactbasins

import wastewatertreatment.core.Core
import wastewatertreatment.removals.Removals

/**
 * Created by kasonchan on 11/10/15.
 */
object ChlorineContactBasins extends Core {

  /**
   * Bacterial removal rate = 99.99%.
   */
  val bacterialRemovalRate = 99.99

  /**
   * A case class to represent the default chlorine contact basins.
   * tssRemoval the value of TSS removal. Default value is 0.00.
   * bod5Removal the value of BOD,,5,, removal. Default value is 0.00.
   * nh3nRemoval the value of NH,,3,,-N removal. Default value is 0.00.
   * tpRemoval the value of TP removal. Default value is 0.00.
   * fecalColiformRemoval the value of fecal coliform removal. Default value is 99.99.
   * enterococciRemoval the value of enterococci removal. Default value is 99.99.
   */
  val ccbDefaultRemovals = Removals(fecalColiformRemoval = Some(bacterialRemovalRate),
    enterococciRemoval = Some(bacterialRemovalRate))

}
