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
   * @param TSS the initial value of TSS.
   * @param VSSTSSRatio VSS/TSS, Default value and unit are 0.80.
   */
  def calVSS(TSS: Double, VSSTSSRatio: Double = vssTSSRatio): Double = {
    require(TSS >= 0 && VSSTSSRatio >= 0)
    val r = TSS * VSSTSSRatio
    toXDecimals(r)
  }

  /**
   * Returns BOD,,5,,.
   * {{{
   *   BOD5 = CBOD5 * BOD5CBOD5Ratio
   * }}}
   * @param CBOD5 the initial value of cBOD,,5,,.
   * @param BOD5CBOD5Ratio BOD,,5,,/cBOD,,5,, Default value and unit are 1.10.
   */
  def calBOD5(CBOD5: Double, BOD5CBOD5Ratio: Double = bod5cBOD5Ratio): Double = {
    require(CBOD5 >= 0 && BOD5CBOD5Ratio >= 0)
    val r = CBOD5 * BOD5CBOD5Ratio
    toXDecimals(r)
  }

  /**
   * Returns bCOD.
   * {{{
   *   bCOD = BOD5 * CODBODRatio
   * }}}
   * @param BOD5 the initial value of VSS.
   * @param CODBODRatio COD/BOD. Default value and unit are 1.60.
   */
  def calBCOD(BOD5: Double, CODBODRatio: Double = codBODRatio): Double = {
    require(BOD5 >= 0 && CODBODRatio >= 0)
    val r = BOD5 * CODBODRatio
    toXDecimals(r)
  }

  /**
   * Returns bCODp.
   * {{{
   *   bCODp = VSS * CODVSSRatio * BVSS
   * }}}
   * @param VSS the initial value of VSS.
   * @param CODVSSRatio COD/VSS. Default value and unit are 1.42.
   * @param BVSS biodegradable VSS. Default value and unit are 0.80.
   */
  def calBCODp(VSS: Double,
               CODVSSRatio: Double = codVSSRatio,
               BVSS: Double = bVSS): Double = {
    require(VSS >= 0 && CODVSSRatio >= 0 && BVSS >= 0)
    val r = VSS * CODVSSRatio * BVSS
    toXDecimals(r)
  }

}
