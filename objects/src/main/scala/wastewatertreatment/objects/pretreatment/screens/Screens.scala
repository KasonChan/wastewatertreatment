package wastewatertreatment.objects.pretreatment.screens

import wastewatertreatment.math.Math.toXDecimals

/**
 * Created by ka-son on 10/24/15.
 */
object Screens {

  /**
   * TSS removal = 27.00%.
   */
  val tssRemoval = 27.00

  /**
   * BOD,,5,, removal = 27.00%.
   */
  val bod5Removal = 27.00

  /**
   * BOD5,,c,,/cBOD,,5,, = 1.10.
   */
  val bod5cBOD5Ratio = 1.10

  /**
   * COD/BOD = 1.60.
   */
  val codBODRatio = 1.60

  /**
   * COD/VSS = 1.42.
   */
  val codVSSRatio = 1.42

  /**
   * VSS/TSS = 0.80.
   */
  val vssTSSRatio = 0.80

  /**
   * Minimum value = 0.00.
   */
  val minValue = 0.00

  /**
   * Maximum value = 1000000.00.
   */
  val maxValue = 1000000.00

  /**
   * Minimum percentage = 0.00%.
   */
  val minPercent = 0.00

  /**
   * Maximum percentage = 100.00%.
   */
  val maxPercent = 100.00

  /**
   * Returns TSSe.
   * {{{
   *   TSSe = TSSo * (1 - TSS removal)
   * }}}
   * @param TSSo the initial value of TSS.
   * @param TSSRemoval the percentage removal of TSS. Default value and unit are 27%.
   */
  def calTSSe(TSSo: Double, TSSRemoval: Double = tssRemoval): Double = {
    require(TSSo >= 0 && TSSRemoval >= 0)
    val r = TSSo * (100 - TSSRemoval) / 100
    toXDecimals(r)
  }

  /**
   * Returns BOD,,5,,e.
   * {{{
   *   BOD5e = BOD5o * (1 - BOD5 removal)
   * }}}
   * @param BOD5o the initial value of BOD,,5,,.
   * @param BOD5Removal the percentage removal of BOD,,5,,. Default value and unit are 27%.
   */
  def calBOD5e(BOD5o: Double, BOD5Removal: Double = bod5Removal): Double = {
    require(BOD5o >= 0 && BOD5Removal >= 0)
    val r = BOD5o * (100 - BOD5Removal) / 100
    toXDecimals(r)
  }

  /**
   * Returns VSSe.
   * {{{
   *   VSSe = TSSe * (VSS/TSS)
   * }}}
   * @param TSSe the effluent value of TSS.
   * @param vssTSSRatio VSS/TSS. Default value and unit are 0.80.
   */
  def calVSSe(TSSe: Double, vssTSSRatio: Double = vssTSSRatio): Double = {
    require(TSSe >= 0 && vssTSSRatio >= 0)
    val r = TSSe * vssTSSRatio
    toXDecimals(r)
  }

  /**
   * Returns cBOD,,5,,e.
   * {{{
   *   cBOD5e = BODe / (BOD5/cBOD5)
   * }}}
   * @param BOD5e the effluent value of BOD,,5,,.
   * @param bod5cBOD5Ratio BOD,,5,,/cBOD,,5,,. Default value and unit are 1.10.
   */
  def calcBOD5e(BOD5e: Double, bod5cBOD5Ratio: Double = bod5cBOD5Ratio): Double = {
    require(BOD5e >= 0 && bod5cBOD5Ratio >= 0 && bod5cBOD5Ratio >= 0)
    val r = BOD5e / bod5cBOD5Ratio
    toXDecimals(r)
  }

  /**
   * Returns bCODe.
   * {{{
   *   cBODe = BOD5e * COD/BOD
   * }}}
   * @param BOD5e the effluent value of BOD,,5,,.
   * @param codBODRatio COD/BOD. Default value and unit are 1.60.
   */
  def calbCODe(BOD5e: Double, codBODRatio: Double = codBODRatio): Double = {
    require(BOD5e >= 0 && codBODRatio >= 0)
    val r = BOD5e * codBODRatio
    toXDecimals(r)
  }

  /**
   * Returns bCODpe.
   * {{{
   *   bCODpe = VSSe * COD/VSS * VSS/TSS
   * }}}
   * @param VSSe the effluent value of VSS.
   * @param codVSSRatio COD/VSS. Default value and unit are 1.42.
   * @param vssTSSRatio VSS/TSS. Default value and unit are 0.80
   */
  def calbCODpe(VSSe: Double, codVSSRatio: Double = codVSSRatio, vssTSSRatio: Double = vssTSSRatio): Double = {
    require(VSSe >= 0 && codVSSRatio >= 0 && vssTSSRatio >= 0)
    val r = VSSe * codVSSRatio * vssTSSRatio
    toXDecimals(r)
  }

  /**
   * Returns cBODs.
   * {{{
   *   cBODs = bCODe - bCODpe
   * }}}
   * @param bCODe the effluent value of bCODe.
   * @param bCODpe the effluent value of bCODpe.
   */
  def calbCODs(bCODe: Double, bCODpe: Double): Double = {
    require(bCODe >= 0 && bCODpe >= 0)
    val r = bCODe - bCODpe
    toXDecimals(r)
  }

  /**
   * Returns P.
   * {{{
   *   P = Q * VSSe
   * }}}
   * @param Q the value of flow.
   * @param VSSe the effluent of VSS.
   */
  def calP(Q: Double, VSSe: Double): Double = {
    require(Q >= 0 && VSSe >= 0)
    val r = Q * VSSe
    toXDecimals(r)
  }

}
