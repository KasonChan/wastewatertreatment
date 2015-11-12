package wastewatertreatment.objects.secondarytreatment.secondaryclarifiers

import wastewatertreatment.math.Math._

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
   * Returns P.
   * {{{
   *   P = Po - Pe
   * }}}
   * @param Po the influent value of P.
   * @param Pe the effluent value of P.
   */
  def calP(Po: Double, Pe: Double): Double = {
    require(Po >= 0 && Pe >= 0)
    val r = Po - Pe
    toXDecimals(r)
  }

}
