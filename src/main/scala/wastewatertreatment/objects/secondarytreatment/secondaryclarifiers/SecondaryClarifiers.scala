package wastewatertreatment.objects.secondarytreatment.secondaryclarifiers

import wastewatertreatment.assumptions.Assumptions.vssTSSRatio
import wastewatertreatment.math.Math.toXDecimals

/**
 * Created by kasonchan on 11/9/15.
 */
object SecondaryClarifiers {

  /**
   * TSS removal = 45.00%.
   */
  val tssRemoval = 45.00

  /**
   * BOD removal = 25.00%.
   */
  val bodRemoval = 25.00

  /**
   * TSS = 8000.00g/m^3^.
   */
  val tss = 8000.00

  /**
   * P/VSS = 0.02.
   */
  val pVSSRatio = 0.02

  /**
   * Returns Q.
   * {{{
   *   Q = Qo - Qe
   * }}}
   * @param Qo the influent value of Q.
   * @param Qe the effluent value of Q.
   */
  def calQ(Qo: Double, Qe: Double): Double = {
    require(Qo >= 0 && Qe >= 0)
    val r = Qo - Qe
    toXDecimals(r)
  }

  /**
   * Returns TSS.
   * {{{
   *   TSS = P / Q
   * }}}
   * @param P the effluent value of P.
   * @param Q the effluent value of Q.
   */
  def calTSS(P: Double, Q: Double): Double = {
    require(Q >= 0 && P > 0)
    val r = P / Q
    toXDecimals(r)
  }

  /**
   * Returns VSS.
   * {{{
   *   VSS = TSS * vssTSSRatio
   * }}}
   * @param TSS the effluent value of TSS.
   * @param vssTSSRatio VSS/TSS. Default value and unit are 0.80.
   */
  def calVSS(TSS: Double, vssTSSRatio: Double = vssTSSRatio): Double = {
    require(TSS >= 0 && vssTSSRatio > 0)
    val r = TSS * vssTSSRatio
    toXDecimals(r)
  }

  /**
   * Returns BOD,,5,,.
   * {{{
   *   BOD5 = BOD5o - (BOD5o * BOD removal)
   * }}}
   * @param BOD5o the influent value of BOD,,5,,.
   * @param bodRemoval the value of BOD removal. Default value and unit are 0.25.
   */
  def calBOD5(BOD5o: Double, bodRemoval: Double = bodRemoval): Double = {
    require(BOD5o >= 0 && bodRemoval >= 0)
    val r = BOD5o - (BOD5o * bodRemoval / 100)
    toXDecimals(r)
  }

  /**
   * Returns P.
   * {{{
   *   P = Po - (Po * TSS removal)
   * }}}
   * @param Po the influent value of P.
   * @param tssRemoval the value of TSS removal.
   */
  def calP(Po: Double, tssRemoval: Double = tssRemoval): Double = {
    require(Po >= 0 && tssRemoval >= 0)
    val r = Po - (Po * tssRemoval / 100)
    toXDecimals(r)
  }

}
