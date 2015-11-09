package wastewatertreatment.objects.influent

import wastewatertreatment.math.Math._

/**
 * Created by kasonchan on 11/6/15.
 */
object Influent {

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
   * TN = 40.00g/m^3^
   */
  val tn = 40.00

  /**
   * Biodegradable VSS = 0.80
   */
  val bVSS = 0.80

  /**
   * Returns VSS.
   * {{{
   *   VSS = TSS * VSSTSSRatio
   * }}}
   */
  def calVSS(TSS: Double, VSSTSSRatio: Double = vssTSSRatio): Double = {
    require(TSS >= 0 && VSSTSSRatio >= 0)
    val r = TSS * VSSTSSRatio
    toXDecimals(r)
  }

  /**
   * Returns BOD,,5,,.
   * {{{
   *   BOD5 = cBOD5 * bod5CBOD5Ratio
   * }}}
   */
  def calBOD5(CBOD5: Double, BOD5CBOD5Ratio: Double = bod5cBOD5Ratio): Double = {
    require(CBOD5 >= 0 && BOD5CBOD5Ratio >= 0)
    val r = CBOD5 * BOD5CBOD5Ratio
    toXDecimals(r)
  }

}
