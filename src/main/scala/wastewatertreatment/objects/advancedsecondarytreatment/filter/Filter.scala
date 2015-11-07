package wastewatertreatment.objects.advancedsecondarytreatment.filter

import wastewatertreatment.math.Math._

/**
 * Created by ka-son on 11/7/15.
 */
object Filter {

  /**
   * Backwash rate = 6.00gpm/ft^2^
   */
  val backwashRate = 6.00

  /**
   * Returns daily backwash rate.
   * {{{
   *   Daily backwash rate = BackwashRate * AreaOfSandfilters * Times
   * }}}
   */
  def calDailyBackwashRate(BackwashRate: Double,
                           AreaOfSandfilters: Double,
                           TimesOfBackwash: Double,
                           Times: Double): Double = {
    require(BackwashRate >= 0 && AreaOfSandfilters >= 0 && Times >= 0)
    val r = BackwashRate * AreaOfSandfilters * 0.00378541 * TimesOfBackwash * Times
    toXDecimals(r)
  }

}
