package yiris.core.math

/**
 * An object contains basic math calculation such as unit conversions and
 * round-up functions.
 */
object Math {

  /**
   * Returns the decimal number in X decimal places.
   * @param d the decimal number.
   */
  def toXDecimals(d: Double, x: Int = 2): Double = {
    BigDecimal(d).setScale(x, BigDecimal.RoundingMode.HALF_UP).toDouble
  }

  /**
   * Returns the option of decimal number in X decimal places.
   * @param d the option of decimal number.
   */
  def toXODecimals(d: Option[Double], x: Int = 2): Option[Double] = {
    d match {
      case Some(s) => Some(BigDecimal(s).setScale(x, BigDecimal.RoundingMode.HALF_UP).toDouble)
      case None => None
    }
  }

  /**
   * Returns the value of flow measurement in m^3^/d.
   * {{{
   *   d * 3785.41
   * }}}
   * @param d the value of flow in MGD.
   */
  def tom3d(d: Double): Double = {
    val r = d * 3785.41
    toXDecimals(r)
  }

}
