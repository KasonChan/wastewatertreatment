package wastewatertreatment.objects.secondarytreatment.aerationbasins

import wastewatertreatment.math.Math.to2Decimals

/**
 * Created by ka-son on 10/31/15.
 */
object AerationBasins {

  // in m^3 = 4967040 ft^3
  val aT = 423819
  // in m^3/d = 368 MGD
  val qPeak = 1393027

  def calTheta(At: Double = aT, QPeak: Double = qPeak): Double = {
    require(At >= 0 && QPeak > 0)

    (At, QPeak) match {
      case (0.0, 0.0) =>
        to2Decimals(0.00)
      case (_, _) =>
        val r = (BigDecimal(aT) / BigDecimal(qPeak)).toDouble
        to2Decimals(r)
    }
  }

  def calBODLoading(BOD: Double, Q: Double): Double = {
    require(BOD >= 0 && Q >= 0)
    val r = BOD / 1000 * Q
    to2Decimals(r)
  }

}
