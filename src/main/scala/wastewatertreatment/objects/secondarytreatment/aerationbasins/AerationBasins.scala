package wastewatertreatment.objects.secondarytreatment.aerationbasins

import wastewatertreatment.math.Math.to2Decimals

/**
 * Created by ka-son on 10/31/15.
 */
object AerationBasins {

  // in m^3 = 4967040 ft^3
  val forallT = 423819
  // in m^3/d = 368 MGD
  val qPeak = 1393027

  def calTheta(ForallT: Double = forallT, QPeak: Double = qPeak): Double = {
    require(ForallT >= 0 && QPeak > 0)
    val r = (BigDecimal(forallT) / BigDecimal(qPeak)).toDouble
    to2Decimals(r)
  }

  def calBODLoading(BOD: Double, Q: Double): Double = {
    require(BOD >= 0 && Q >= 0)
    val r = BOD / 1000 * Q
    to2Decimals(r)
  }

  val bodRemoval = 97
  val tssRemoval = 94
  val tknRemoval = 88
  val nh3nRemoval = 97
  val phosphorousRemoval = 98
  val bCOD5Removal = 100

  val forallAnoxicForallTotalRatio = 0.33
  val snc = 0.5
  val xVSS = 3000
  val seBOD = 1
  val nbvssVSSRatio = 0.2
  val kO = 0.5
  val dO = 2
  val fnd = 0.1
  val factorOfSafety = 2

  val xR = 8000
  val xN = 8000
  val xE = 10
  val noXE = 6
  val rbCOD = 0.3

}
