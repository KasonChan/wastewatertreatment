package wastewatertreatment.objects.advancedsecondarytreatment.filters

import wastewatertreatment.core.Core
import wastewatertreatment.massbalance.MassBalance

/**
 * Created by ka-son on 11/7/15.
 */
object Filters extends Core with MassBalance {

  /**
   * Backwash rate = 6.00gpm/ft^2^.
   */
  val backwashRate = 6.00

  /**
   * Returns daily backwash rate.
   * {{{
   *   Daily backwash rate = backwashRate * area * time * counts
   * }}}
   * @param backwashRate the backwash rate. Default value and unit are 6gpm/ft^2^.
   * @param area the area of sand filters.
   * @param time the duration of a backwash.
   * @param counts the backwash count in a day.
   */
  def calDailyBackwashRate(backwashRate: Double = backwashRate,
                           area: Double,
                           time: Double,
                           counts: Double): Double = {
    require(backwashRate >= 0 && area >= 0 && time >= 0 && counts >= 0)
    val r = backwashRate * area * 0.00378541 * time * counts
    r
  }

  /**
   * TSS removal = 70.00%.
   */
  val tssRemoval = 70.00

  /**
   * BOD removal = 70.00%.
   */
  val bodRemoval = 70.00

  /**
   * TOC removal = 48.00%.
   */
  val tocRemoval = 48.00

  /**
   *
   * Fecal coliform removal = 76.00%.
   */
  val fecalColiformRemoval = 76.00

  /**
   * TP removal = 33.00%.
   */
  val tpRemoval = 33.00

  /**
   * TKN removal = 46.00%.
   */
  val tknRemoval = 46.00

  /**
   * NH,,3,,-N removal = 21.00%.
   */
  val nh3nRemoval = 21.00

}
