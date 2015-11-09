package wastewatertreatment.objects.advancedsecondarytreatment.filter

import wastewatertreatment.math.Math._

/**
 * Created by ka-son on 11/7/15.
 */
object Filter {

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
    toXDecimals(r)
  }

}
