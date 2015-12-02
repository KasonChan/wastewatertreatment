package wastewatertreatment.objects.advancedsecondarytreatment.filters

import wastewatertreatment.core.Core

/**
 * Created by ka-son on 11/7/15.
 */
object Filters extends Core {

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
   * BOD,,5,, removal = 70.00%.
   */
  val bod5Removal = 70.00

  /**
   * NH,,3,,-N removal = 21.00%.
   */
  val nh3nRemoval = 21.00

  /**
   * TP removal = 33.00%.
   */
  val tpRemoval = 33.00

  /**
   *
   * Bacterial removal rate = 76.00%.
   */
  val bacterialRemovalRate = 76.00

  /**
   * A case class to represent the default filters.
   * tssRemoval the value of TSS removal. Default value is 70.00.
   * bod5Removal the value of BOD,,5,, removal. Default value is 70.00.
   * nh3nRemoval the value of NH,,3,,-N removal. Default value is 21.00.
   * tpRemoval the value of TP removal. Default value is 33.00.
   * fecalColiformRemoval the value of fecal coliform removal. Default value is 76.00.
   * enterococciRemoval the value of enterococci removal. Default value is 76.00.
   */
  val fDefaultRemovals = Removals(tssRemoval = Some(tssRemoval),
    bod5Removal = Some(bod5Removal),
    nh3nRemoval = Some(nh3nRemoval),
    tpRemoval = Some(tpRemoval),
    fecalColiformRemoval = Some(bacterialRemovalRate),
    enterococciRemoval = Some(bacterialRemovalRate))

}
