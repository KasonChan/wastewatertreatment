package wastewatertreatment.math

/**
 * Created by kasonchan on 10/26/15.
 */
object Math {

  /**
   * Returns the decimal number in X decimal places.
   * @param d the decimal number.
   */
  def toXDecimals(d: Double, x: Int = 2): Double = {
    BigDecimal(d).setScale(x, BigDecimal.RoundingMode.HALF_UP).toDouble
  }

}
