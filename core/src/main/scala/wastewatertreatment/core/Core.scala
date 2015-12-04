package wastewatertreatment.core

import wastewatertreatment.ratios.Ratios

/**
 * Created by kasonchan on 11/15/15.
 */
trait Core extends Ratios {

  /**
   * Returns VSS.
   * {{{
   *   VSS = TSS * vssTSSRatio
   * }}}
   * @param TSS the initial value of TSS.
   * @param vssTSSRatio VSS/TSS. Default value and unit are 0.80.
   */
  def calVSS(TSS: Double,
             vssTSSRatio: Double = vssTSSRatio): Double = {
    require(TSS >= 0 && vssTSSRatio >= 0)
    val r = TSS * vssTSSRatio
    r
  }

  /**
   * Returns cBOD,,5,,.
   * {{{
   *   cBOD5 = BOD / bod5cBOD5Ratio
   * }}}
   * @param BOD5e the effluent value of BOD,,5,,.
   * @param bod5cBOD5Ratio BOD,,5,,/cBOD,,5,,. Default value and unit are 1.10.
   */
  def calcBOD5(BOD5e: Double,
               bod5cBOD5Ratio: Double = bod5cBOD5Ratio): Double = {
    require(BOD5e >= 0 && bod5cBOD5Ratio >= 0 && bod5cBOD5Ratio > 0)
    val r = BOD5e / bod5cBOD5Ratio
    r
  }

  /**
   * Returns bCOD.
   * {{{
   *   bCOD = BOD5 * codBODRatio
   * }}}
   * @param BOD5 the initial value of BOD,,5,,.
   * @param codBODRatio COD/BOD. Default value and unit are 1.60.
   */
  def calbCOD(BOD5: Double,
              codBODRatio: Double = codBODRatio): Double = {
    require(BOD5 >= 0 && codBODRatio >= 0)
    val r = BOD5 * codBODRatio
    r
  }

  /**
   * Returns bCODp.
   * {{{
   *   bCODp = VSS * codVSSRatio * bvssVSSRatio
   * }}}
   * @param VSS the initial value of VSS.
   * @param codVSSRatio COD/VSS. Default value and unit are 1.42.
   * @param bvssVSSRatio biodegradable VSS. Default value and unit are 0.80.
   */
  def calbCODp(VSS: Double,
               codVSSRatio: Double = codVSSRatio,
               bvssVSSRatio: Double = bvssVSSRatio): Double = {
    require(VSS >= 0 && codVSSRatio >= 0 && bvssVSSRatio >= 0)
    val r = VSS * codVSSRatio * bvssVSSRatio
    r
  }

  /**
   * Returns bCODs.
   * {{{
   *   bCODs = bCOD - bCODp
   * }}}
   * @param bCOD the initial value of bCOD.
   * @param bCODp the initial value of bCODp.
   */
  def calbCODs(bCOD: Double,
               bCODp: Double): Double = {
    require(bCOD >= 0 && bCODp >= 0)
    val r = bCOD - bCODp
    r
  }

  /**
   * Returns P.
   * {{{
   *   P = Q * TSS
   * }}}
   * @param Q the initial value of Q.
   * @param TSS the initial value of TSS.
   */
  def calP(Q: Double,
           TSS: Double): Double = {
    require(Q >= 0 && TSS >= 0)
    val r = Q * TSS
    r
  }

  /**
   * Returns percentage value.
   * {{{
   *   X = X * percentage
   * }}}
   * @param X the initial value of X.
   * @param percentage the percentage of the effluent of X.
   */
  def calXPercentage(X: Double,
                     percentage: Double): Double = {
    require(X >= 0 && percentage >= 0)
    val r = X * percentage / 100
    r
  }

  /**
   * Returns Q.
   * {{{
   *   Q = P / TSS
   * }}}
   * @param P the initial value of P.
   * @param TSS the initial value of TSS.
   */
  def calQ(P: Double,
           TSS: Double): Double = {
    require(P >= 0 && TSS > 0)
    val r = P / TSS
    r
  }

  /**
   * Returns TSS.
   * {{{
   *   TSS = P / Q
   * }}}
   * @param P the initial value of P.
   * @param Q the initial value of Q.
   */
  def calTSS(P: Double,
             Q: Double): Double = {
    require(P >= 0 && Q > 0)
    val r = P / Q
    r
  }

  /**
   * Returns NTU.
   * {{{
   *   NTU = TSS * NTU/TSS
   * }}}
   * @param TSS the effluent value of TSS.
   * @param ntuTSSRatio NTU/TSS. Default value and unit are 0.50.
   */
  def calNTU(TSS: Double,
             ntuTSSRatio: Double = ntuTSSRatio): Double = {
    require(TSS >= 0 && ntuTSSRatio >= 0)
    val r = TSS * ntuTSSRatio
    r
  }

}
