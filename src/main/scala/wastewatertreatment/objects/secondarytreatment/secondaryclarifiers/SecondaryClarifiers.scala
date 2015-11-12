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
