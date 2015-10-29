package wastewatertreatment.math

/**
 * Created by kasonchan on 10/26/15.
 */
object Math {

  def to2Decimals(d: Double): Double = {
    BigDecimal(d).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
  }

}
