package wastewatertreatment.objects.pretreatment.screen

import wastewatertreatment.math.Math.to2Decimals

/**
 * Created by ka-son on 10/24/15.
 */
object Screen {

  /**
   * Tss removal = 27.00%
   */
  val tssRemoval = 27.00

  /**
   * BOD,,5,, removal = 27.00%
   */
  val bod5Removal = 27.00

  /**
   * BOD5,,c,,/cBOD,,5,, = 1.10
   */
  val bod5cBOD5Ratio = 1.10

  /**
   * COD/BOD = 1.60
   */
  val codBODRatio = 1.60

  /**
   * COD/VSS = 1.42
   */
  val codVSSRatio = 1.42

  /**
   * VSS/TSS = 0.80
   */
  val vssTSSRatio = 0.80

  /**
   * Minimum value = 0.00
   */
  val minValue = 0.00

  /**
   * Maximum value = 1000000.00
   */
  val maxValue = 1000000.00

  /**
   * Minimum percentage = 0.00
   */
  val minPercent = 0.00

  /**
   * Maximum percentage = 100.00
   */
  val maxPercent = 100.00

  /**
   * Returns TSSe.
   * {{{
   *   TSSe = TSSo * (1 - TSS removal)
   * }}}
   * @param TSSo the initial value of TSS.
   * @param TSSRemoval the percentage removal of TSS.
   */
  def calTSSe(TSSo: Double, TSSRemoval: Double = tssRemoval): Double = {
    require(TSSo >= 0 && TSSRemoval >= 0)
    val r = TSSo * (100 - TSSRemoval) / 100
    to2Decimals(r)
  }

  /**
   * Returns BOD,,5,,e.
   * {{{
   *   BOD5e = BOD5o * (1 - BOD5 removal)
   * }}}
   * @param BOD5o the initial value of BOD,,5,,.
   * @param BOD5Removal the percentage removal of BOD,,5,,.
   */
  def calBOD5e(BOD5o: Double, BOD5Removal: Double = bod5Removal): Double = {
    require(BOD5o >= 0 && BOD5Removal >= 0)
    val r = BOD5o * (100 - BOD5Removal) / 100
    to2Decimals(r)
  }


  /**
   * Returns VSSe.
   * {{{
   *   VSSe = TSSe * (VSS/TSS)
   * }}}
   * @param TSSe the effluent value of TSS.
   * @param VSS_TSS the mass ratio of VSS to TSS.
   */
  def calVSSe(TSSe: Double, VSS_TSS: Double = vssTSSRatio): Double = {
    require(TSSe >= 0 && VSS_TSS >= 0)
    val r = TSSe * VSS_TSS
    to2Decimals(r)
  }

  /**
   * Returns cBOD,,5,,e.
   * {{{
   *   cBOD5e = BODe / (BOD5/cBOD5)
   * }}}
   * @param BOD5e the effluent value of BOD,,5,,.
   * @param BOD5_cBOD5 the mass ratio of BOD,,5,, to cBOD,,5,,.
   */
  def calcBOD5e(BOD5e: Double, BOD5_cBOD5: Double = bod5cBOD5Ratio): Double = {
    require(BOD5e >= 0 && BOD5_cBOD5 >= 0 && bod5cBOD5Ratio >= 0)
    val r = BOD5e / BOD5_cBOD5
    to2Decimals(r)
  }

  /**
   * Returns bCODe.
   * {{{
   *   cBODe = BOD5e * COD/BOD
   * }}}
   * @param BOD5e the effluent value of BOD,,5,,.
   * @param COD_BOD the mass ratio of COD to BOD.
   */
  def calbCODe(BOD5e: Double, COD_BOD: Double = codBODRatio): Double = {
    require(BOD5e >= 0 && COD_BOD >= 0)
    val r = BOD5e * COD_BOD
    to2Decimals(r)
  }

  /**
   * Returns bCODpe.
   * {{{
   *   bCODpe = VSSe * COD/VSS * VSS/TSS
   * }}}
   * @param VSSe the effluent value of VSS.
   * @param COD_VSS the mass ratio of COD to VSS.
   * @param VSS_TSS the mass ratio of VSS to TSS.
   */
  def calbCODpe(VSSe: Double, COD_VSS: Double = codVSSRatio, VSS_TSS: Double = vssTSSRatio): Double = {
    require(VSSe >= 0 && COD_VSS >= 0 && VSS_TSS >= 0)
    val r = VSSe * COD_VSS * VSS_TSS
    to2Decimals(r)
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
    to2Decimals(r)
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
    to2Decimals(r)
  }

}
