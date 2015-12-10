package wastewatertreatment.objects.advancedsecondarytreatment.uvdisinfectionbasins

import wastewatertreatment.core.calculations.Calculations
import wastewatertreatment.core.fluent.Fluent
import wastewatertreatment.core.ratios.Ratios
import wastewatertreatment.core.removals.Removals

/**
 * An object to represents uv disinfection basins.
 */
object UVDisinfectionBasins extends Calculations with Fluent with Ratios with Removals {

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
