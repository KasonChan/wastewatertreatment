package wastewatertreatment.objects.advancedsecondarytreatment.uvdisinfectionbasins

import wastewatertreatment.core.Core
import wastewatertreatment.massbalance.MassBalance

/**
 * Created by kasonchan on 11/17/15.
 */
object UVDisinfectionBasins extends Core with MassBalance {

  /**
   * Bacterial removal rate = 99.99%.
   */
  val bacterialRemovalRate = 99.99

  /**
   * NTU/TSS = 0.50.
   */
  val ntuTSSRatio = 0.50

  /**
   * Returns NTU.
   * {{{
   *   NTU = TSS * NTU/TSS
   * }}}
   * @param TSS the effluent value of TSS.
   * @param ntuTSSRatio NTU/TSS. Default value and unit are 0.50.
   */
  def calNTU(TSS: Double,
             ntuTSSRatio: Double = ntuTSSRatio): Double = {
    require(TSS >= 0 && ntuTSSRatio >= 0)
    val r = TSS * ntuTSSRatio
    r
  }

}
