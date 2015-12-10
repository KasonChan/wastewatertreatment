package wastewatertreatment.objects.secondarytreatment.aerobicbasins

import wastewatertreatment.core.calculations.Calculations
import wastewatertreatment.core.fluent.Fluent
import wastewatertreatment.core.ratios.Ratios
import wastewatertreatment.core.removals.Removals

/**
 * An object to represents aerobic basins.
 */
object AerobicBasins extends Calculations with Fluent with Ratios with Removals {

  /**
   * TSS removal = 95.00%.
   */
  val tssRemoval = 95.00

  /**
   * BOD,,5,, removal = 97.00%.
   */
  val bod5Removal = 97.00

  /**
   * NH,,3,,-N removal = 97.00%.
   */
  val nh3nRemoval = 97.00

  /**
   * COD removal = 100.00%.
   */
  val codRemoval = 100.00

  /**
   * Xvss = 3000.00g/m^3^.
   */
  val xVSS = 3000.00

  /**
   * Se(BOD) = 1.00g/m^3^.
   */
  val seBOD = 1.00

  /**
   * Ko = 0.50g/m^3^.
   */
  val kO = 0.50

  /**
   * Do = 2.0 g/m^3^.
   */
  val dO = 2.00

  /**
   * fnd = 0.10.
   */
  val fnd = 0.10


  /**
   * Xr = 8000.00g/m^3^.
   */
  val xR = 8000.00

  /**
   * Xw = 8000.00g/m^3^.
   */
  val xW = 8000.00

  /**
   * Xe = 10.00g/m^3^.
   */
  val xE = 10.00


  /**
   * Heterotrophs u = 6.00d^-1^.
   */
  val hU = 6.00

  /**
   * Heterotrophs Ks = 20.00g/m^3^.
   */
  val hKs = 20.00

  /**
   * Heterotrophs Y = 0.40.
   */
  val hY = 0.40

  /**
   * Heterotrophs Kd = 0.12d^-1^.
   */
  val hKd = 0.12


  /**
   * Returns theta,,c,,.
   * {{{
   *   Theta c = 1 / (((u * Sne) / (Ks + Sne) * ((Do) / (Ko + Do)) - Kd)
   * }}}
   * @param U Nitrifiers u. Default value and unit are 6.00d^-1^.
   * @param Sne SeBOD. Default value and unit are 1.00g/m^3^.
   * @param Ks Heterotrophs Ks. Default value and unit are 20.00g/m^3^.
   * @param Do Default value and unit are 2.00g/m^3^.
   * @param Ko Default value and unit are 0.50g/m^3^.
   * @param Kd Heterotrophs Kd. Default value and unit are 0.12d^-1^.
   */
  def calThetaC(U: Double = hU,
                Sne: Double = seBOD,
                Ks: Double = hKs,
                Do: Double = dO,
                Ko: Double = kO,
                Kd: Double = hKd): Double = {
    require(U >= 0 && Sne >= 0 && Ks >= 0 && Do >= 0 && Ko >= 0 && Kd >= 0)
    val r = (BigDecimal(1) / BigDecimal((((U * Sne) / (Ks + Sne)) * (Do / (Ko + Do))) - Kd)).toDouble
    r
  }

  /**
   * Returns heterotrophs Xa.
   * {{{
   *   Xa Heterotrophs = (Q * Y * (BOD5o - BOD5e)) / (1 + Kd * ThetaC)
   * }}}
   * @param Q the value of flow.
   * @param Y Heterotrophs Y. Default value and unit are 0.40.
   * @param BOD5o the initial value of BOD5.
   * @param BOD5e the effluent value of BOD5.
   * @param Kd Heterotrophs Kd. Default value and unit are 0.12d^-1^.
   * @param ThetaC the value of theta,,c,,.
   */
  def calXaHeterotrophs(Q: Double,
                        Y: Double = hY,
                        BOD5o: Double,
                        BOD5e: Double,
                        Kd: Double = hKd,
                        ThetaC: Double): Double = {
    require(Q >= 0 && Y >= 0 && BOD5o >= 0 && BOD5e >= 0 && Kd >= 0 && ThetaC >= 0)
    val r = (Q * Y * (BOD5o - BOD5e)) / (1 + Kd * ThetaC)
    r
  }

  /**
   * Returns heterotrophs parts Xa.
   * {{{
   *   X app pieces and parts = ThetaC * fnd * Kd * Xa
   * }}}
   * @param ThetaC the value of theta,,c,,.
   * @param fnd Default value and unit are 0.10.
   * @param Kd Heterotrophs Kd. Default value and unit are 0.12d^-1^.
   * @param Xa the value of Xa.
   */
  def calXaHeterotrophsParts(ThetaC: Double,
                             fnd: Double = fnd,
                             Kd: Double = hKd,
                             Xa: Double): Double = {
    require(ThetaC >= 0 && fnd >= 0 && Kd >= 0 && Xa >= 0)
    val r = ThetaC * fnd * Kd * Xa
    r
  }

  /**
   * Returns P,,Xbio,,.
   * {{{
   *   P X Bio = Xa + Xapp + Xo
   * }}}
   * @param Xa the value of Xa.
   * @param Xapp the value of Xapp.
   * @param Xo the initial value of X.
   */
  def calPXBio(Xa: Double, Xapp: Double, Xo: Double = 0.00): Double = {
    require(Xa >= 0 && Xapp >= 0)
    val r = Xa + Xapp + Xo
    r
  }

  /**
   * Returns P,,Xvsso,,.
   * {{{
   *   PXvsso = Q * VSS * nbvssVSSRatio
   * }}}
   * @param Q the value of flow.
   * @param VSS the value of VSS.
   * @param nbvssVSSRatio nbVSS/VSS. Default value and unit are 0.20.
   */
  def calPXvsso(Q: Double,
                VSS: Double,
                nbvssVSSRatio: Double = nbvssVSSRatio): Double = {
    require(Q >= 0 && VSS >= 0 && nbvssVSSRatio >= 0)
    val r = Q * VSS * nbvssVSSRatio
    r
  }

  /**
   * Returns P,,Xvss,,.
   * {{{
   *   PXvss = PxBioHeterotrophs + PxBioNitrifiers + PXvsso
   * }}}
   * @param PxBioHeterotrophs the value of heterotrophs P,,XBio,,.
   * @param PXvsso the value of P,,Xvss,,
   */
  def calPXvss(PxBioHeterotrophs: Double,
               PXvsso: Double): Double = {
    require(PxBioHeterotrophs >= 0 && PXvsso >= 0)
    val r = PxBioHeterotrophs + PXvsso
    r
  }

  /**
   * Returns Qw.
   * {{{
   *   Qw = (((Theta * Xvss) / ThetaC) - (Q * Xe)) / (Xw - Xe)
   * }}}
   * @param Theta the value of theta.
   * @param Xvss Xvss. Default value and unit are 3000.00g/m^3^.
   * @param ThetaC the value of theta,,c,,.
   * @param Q the value of flow.
   * @param Xe Xe. Default value and unit are 10.00g/m^3^.
   * @param Xw Xw. Default value and unit are 8000.00g/m^3^.
   */
  def calQw(Theta: Double,
            Xvss: Double = xVSS,
            ThetaC: Double,
            Q: Double,
            Xe: Double = xE,
            Xw: Double = xW): Double = {
    require(Theta >= 0 && Xvss >= 0 && ThetaC >= 0 && Q >= 0 && Xe >= 0 && Xw >= 0)
    val r = (((Theta * Xvss) / ThetaC) - (Q * Xe)) / (Xw - Xe)
    r
  }

  /**
   * Returns Qr.
   * {{{
   *   Qr = ((Q - Qw) * Xe + (Qw * Xw) - (Q * Xvss)) / (Xvss - Xr)
   * }}}
   * @param Q the value of flow.
   * @param Qw the value of Qw.
   * @param Xe Xe. Default value and unit are 10.00g/m^3^.
   * @param Xw Xw. Default value and unit are 8000.00g/m^3^.
   * @param Xvss Xvss. Default value and unit are 3000.00g/m^3^.
   * @param Xr Xr. Default value and unit are 3000.00g/m^3^.
   */
  def calQr(Q: Double,
            Qw: Double,
            Xe: Double = xE,
            Xw: Double = xW,
            Xvss: Double = xVSS,
            Xr: Double = xR): Double = {
    require(Q >= 0 && Qw >= 0 && Xe >= 0 && Xw >= 0 && Xvss >= 0 && Xr >= 0)
    val r = (((Q - Qw) * Xe) + (Qw * Xw) - (Q * Xvss)) / (Xvss - Xr)
    r
  }

  /**
   * A case class to represent the default aerobic basins.
   * tss the value of TSS removal. Default value is 95.00.
   * bod5 the value of BOD,,5,, removal. Default value is 97.00.
   * nh3n the value of NH,,3,,-N removal. Default value is 97.00.
   * tp the value of TP removal. Default value is 0.00.
   * fecalColiform the value of fecal coliform removal. Default value is 0.00.
   * enterococci the value of enterococci removal. Default value is 0.00.
   */
  val abDefaultRemovals = Removals(tss = Some(tssRemoval),
    bod5 = Some(bod5Removal),
    nh3n = Some(nh3nRemoval))

}
