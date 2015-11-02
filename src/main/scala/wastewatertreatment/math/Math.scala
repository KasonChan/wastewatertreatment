package wastewatertreatment.math

/**
 * Created by kasonchan on 10/26/15.
 */
object Math {

  /**
   * Returns the decimal number in two decimal places.
   * @param d the decimal number.
   */
  def to2Decimals(d: Double): Double = {
    BigDecimal(d).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
  }

}
