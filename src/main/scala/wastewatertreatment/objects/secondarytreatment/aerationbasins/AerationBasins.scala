package wastewatertreatment.objects.secondarytreatment.aerationbasins

import wastewatertreatment.math.Math.to2Decimals

/**
 * Created by ka-son on 10/31/15.
 */
object AerationBasins {

  /**
   * Returns theta.
   * {{{
   *   Theta = Forall / Q
   * }}}
   * @param ForallT forall time.
   * @param Q the flow.
   */
  def calTheta(ForallT: Double, Q: Double): Double = {
    require(ForallT >= 0 && Q > 0)
    val r = (BigDecimal(ForallT) / BigDecimal(Q)).toDouble
    to2Decimals(r)
  }

  /**
   * Returns BOD loading.
   * {{{
   *   BOD loading = BOD / 1000 * Q
   * }}}
   * @param BOD the value of BOD.
   * @param Q the flow.
   */
  def calBODLoading(BOD: Double, Q: Double): Double = {
    require(BOD >= 0 && Q >= 0)
    val r = (BigDecimal(BOD) / BigDecimal(1000) * BigDecimal(Q)).toDouble
    to2Decimals(r)
  }

  /**
   * BOD removal = 97.00%
   */
  val bodRemoval = 97.00

  /**
   * TSS removal = 94.00%
   */
  val tssRemoval = 94.00

  /**
   * TKN removal = 88.00%
   */
  val tknRemoval = 88.00

  /**
   * NH,,3,,-N removal = 97.00%
   */
  val nh3nRemoval = 97.00

  /**
   * Phosphorous removal = 98.00%
   */
  val phosphorousRemoval = 98.00

  /**
   * bCODs removal = 100.00%
   */
  val bCODsRemoval = 100.00

  /**
   * Forall,,anoxic,,/Forall,,total,, = 0.33
   */
  val forallAnoxicForallTotalRatio = 0.33

  /**
   * Snc = 0.50g/m^3^
   */
  val snc = 0.50

  /**
   * Xvss = 3000.00g/m^3^
   */
  val xVSS = 3000.00

  /**
   * Se(BOD) = 1.00g/m^3^
   */
  val seBOD = 1.00

  /**
   * nbVSS/VSS = 0.20
   */
  val nbvssVSSRatio = 0.20

  /**
   * Ko = 0.50g/m^3^
   */
  val kO = 0.50

  /**
   * Do = 2.0 g/m^3^
   */
  val dO = 2.00

  /**
   * fnd = 0.10
   */
  val fnd = 0.10

  /**
   * Factor of safety = 2.00
   */
  val factorOfSafety = 2.00

  /**
   * Xr = 8000.00g/m^3^
   */
  val xR = 8000.00

  /**
   * Xn = 8000.00g/m^3^
   */
  val xN = 8000.00

  /**
   * Xe = 10.00g/m^3^
   */
  val xE = 10.00

  /**
   * NOxe = 6.00g/m^3^
   */
  val noXE = 6.00

  /**
   * rbCOD = 0.30 g/m^3^
   */
  val rbCOD = 0.30

  /**
   * Heterotrophs u = 6.00d^-1^
   */
  val hU = 6.00

  /**
   * Heterotrophs Ks = 20.00g/m^3^
   */
  val hKs = 20.00

  /**
   * Heterotrophs Y = 0.40g-VSS/g-bCOD
   */
  val hY = 0.40

  /**
   * Heterotrophs Kd = 0.12d^-1^
   */
  val hKd = 0.12

  /**
   * Default heterotrophs
   */
  val heterotrophs = Heterotrophs()

  /**
   * Nitrifiers u = 0.75d^-1^
   */
  val nU = 0.75

  /**
   * Nitrifiers Ks = 0.74g/m^3^
   */
  val nKs = 0.74

  /**
   * Nitrifiers Y = 0.12g-VSS/g-bCOD
   */
  val nY = 0.12

  /**
   * Nitrifiers Kd = 0.08d^-1^
   */
  val nKd = 0.08

  /**
   * Default Nitrifiers
   */
  val nitrifiers = Nitrifiers()

}
