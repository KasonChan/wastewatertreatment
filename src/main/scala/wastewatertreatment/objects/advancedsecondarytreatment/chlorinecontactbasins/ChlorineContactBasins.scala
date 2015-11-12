package wastewatertreatment.objects.advancedsecondarytreatment.chlorinecontactbasins

import wastewatertreatment.math.Math.toXDecimals

/**
 * Created by kasonchan on 11/10/15.
 */
object ChlorineContactBasins {

  /**
   * Bacterial removal rate = 99.99%.
   */
  val bacterialRemovalRate = 99.99

  /**
   * Returns fecal coliform.
   * {{{
   *   FecalColiforme =  FecalColiformo - (FecalColiformo * BacterialRemovalRate)
   * }}}
   * @param fecalColiformo the value of fecal coliform at influent.
   * @param bacterialRemovalRate Bacterial removal rate. Default value and unit are 99.99%.
   */
  def calFecalColiform(fecalColiformo: Double, bacterialRemovalRate: Double = bacterialRemovalRate): Double = {
    require(fecalColiformo >= 0 && bacterialRemovalRate >= 0)
    val r = fecalColiformo - (fecalColiformo * bacterialRemovalRate / 100)
    toXDecimals(r)
  }

  /**
   * Returns enterococci.
   * {{{
   *   Enterococcie =  Enterococcio - (Enterococcio * BacterialRemovalRate)
   * }}}
   * @param enterococcio the value of enterococci at influent.
   * @param bacterialRemovalRate Bacterial removal rate. Default value and unit are 99.99%.
   */
  def calEnterococci(enterococcio: Double, bacterialRemovalRate: Double = bacterialRemovalRate): Double = {
    require(enterococcio >= 0 && bacterialRemovalRate >= 0)
    val r = enterococcio - (enterococcio * bacterialRemovalRate / 100)
    toXDecimals(r)
  }

}
