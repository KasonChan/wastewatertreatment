package wastewatertreatment.helper

/**
 * Created by kasonchan on 10/26/15.
 */
object Helper {

  def to2Decimals(d: Double): Double = {
    BigDecimal(d).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
  }

}
