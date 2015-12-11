package yiris.objects.advancedsecondarytreatment.chlorinecontactbasins

import yiris.core.{fluent, ratios, removals}
import yiris.objects.advancedsecondarytreatment.chlorinecontactbasins.ChlorineContactBasins.bacterialRemovalRate

/**
 * An object to represents chlorine contact basins values and units.
 */
object ValueUnits extends fluent.ValueUnits with ratios.ValueUnits with removals.ValueUnits {

  /**
   * A case class to represent the default chlorine contact basins.
   * tss the value of TSS removal. Default value and unit are 0.00%.
   * bod5 the value of BOD,,5,, removal. Default value and unit are 0.00%.
   * nh3n the value of NH,,3,,-N removal. Default value and unit are 0.00%.
   * tp the value of TP removal. Default value and unit are 0.00%.
   * fecalColiform the value of fecal coliform removal. Default value and unit are 99.99%.
   * enterococci the value of enterococci removal. Default value and unit are 99.99%.
   */
  val ccbDefaultMiscRemovals = MiscellaneousRemovals(fecalColiform = FecalColiformRemoval(Some(bacterialRemovalRate)),
    enterococci = EnterococciRemoval(Some(bacterialRemovalRate)))

}
