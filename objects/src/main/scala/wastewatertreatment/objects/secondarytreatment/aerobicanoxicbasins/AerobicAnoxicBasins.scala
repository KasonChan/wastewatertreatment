package wastewatertreatment.objects.secondarytreatment.aerobicanoxicbasins

import wastewatertreatment.core.Core
import wastewatertreatment.fluent.Fluent
import wastewatertreatment.math.Math.toXDecimals
import wastewatertreatment.ratios.Ratios
import wastewatertreatment.removals.Removals

/**
 * Created by ka-son on 10/31/15.
 */
object AerobicAnoxicBasins extends Core with Fluent with Ratios with Removals {

  /**
   * Returns theta.
   * {{{
   *   Theta = Forall / Q
   * }}}
   * @param ForallT the value of forall,,T,,.
   * @param Q the value of flow.
   */
  def calTheta(ForallT: Double, Q: Double): Double = {
    require(ForallT >= 0 && Q > 0)
    val r = (BigDecimal(ForallT) / BigDecimal(Q)).toDouble
    toXDecimals(r)
  }

  /**
   * Returns BOD loading.
   * {{{
   *   BOD loading = BOD / 1000 * Q
   * }}}
   * @param BOD the value of BOD.
   * @param Q the value of flow.
   */
  def calBODLoading(BOD: Double, Q: Double): Double = {
    require(BOD >= 0 && Q >= 0)
    val r = (BigDecimal(BOD) / BigDecimal(1000) * BigDecimal(Q)).toDouble
    toXDecimals(r)
  }

  /**
   * TSS removal = 94.00%.
   */
  val tssRemoval = 94.00

  /**
   * BOD,,5,, removal = 97.00%.
   */
  val bod5Removal = 97.00

  /**
   * NH,,3,,-N removal = 97.00%.
   */
  val nh3nRemoval = 97.00

  /**
   * Forall,,anoxic,,/Forall,,total,, = 0.33.
   */
  val forallAnoxicForallTotalRatio = 0.33

  /**
   * Sne = 0.50g/m^3^.
   */
  val sne = 0.50

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
   * Factor of safety = 2.00.
   */
  val factorOfSafety = 2.00

  /**
   * TKN = 45.00.
   */
  val tkn = 45.00

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
   * NOxe = 6.00g/m^3^.
   */
  val noXE = 6.00

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
   * Nitrifiers u = 0.75d^-1^.
   */
  val nU = 0.75

  /**
   * Nitrifiers Ks = 0.74g/m^3^.
   */
  val nKs = 0.74

  /**
   * Nitrifiers Y = 0.12.
   */
  val nY = 0.12

  /**
   * Nitrifiers Kd = 0.08d^-1^.
   */
  val nKd = 0.08

  /**
   * Returns theta,,aerobic,,.
   * {{{
   *   Theta aerobic = Forall T - Forall Anoxic / Q
   * }}}
   * @param ForallT the value of forall,,T,,.
   * @param Q the value of flow.
   */
  def calThetaAerobic(ForallT: Double, ForallAnoxic: Double, Q: Double): Double = {
    require(ForallT >= 0 && ForallAnoxic >= 0 && Q > 0)
    val r = (BigDecimal(ForallT - ForallAnoxic) / BigDecimal(Q)).toDouble
    toXDecimals(r)
  }

  /**
   * Returns theta,,c,,.
   * {{{
   *   Theta c = 1 / (((u * Sne) / (Ks + Sne) * ((Do) / (Ko + Do)) - Kd)
   * }}}
   * @param U Nitrifiers u. Default value and unit are 0.75d^-1^.
   * @param Sne Default value and unit are 0.50g/m^3^.
   * @param Ks Nitrifiers Ks. Default value and unit are 0.74g/m^3^.
   * @param Do Default value and unit are 2.00g/m^3^.
   * @param Ko Default value and unit are 0.50g/m^3^.
   * @param Kd Nitrifiers Kd. Default value and unit are 0.08d^-1^.
   */
  def calThetaC(U: Double = nU,
                Sne: Double = sne,
                Ks: Double = nKs,
                Do: Double = dO,
                Ko: Double = kO,
                Kd: Double = nKd): Double = {
    require(U >= 0 && Sne >= 0 && Ks >= 0 && Do >= 0 && Ko >= 0 && Kd >= 0)
    val r = (BigDecimal(1) / BigDecimal((((U * Sne) / (Ks + Sne)) * (Do / (Ko + Do))) - Kd)).toDouble
    toXDecimals(r)
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
    toXDecimals(r)
  }

  /**
   * Returns X,,b,,.
   * {{{
   *   Xb = (Q / ForallT) * ((ThetaC * Y * (So - S)) / (1 + (Kd * ThetaC)))
   * }}}
   * @param Q the value of flow.
   * @param ForallT the value of forall,,T,,.
   * @param ThetaC the value of theta,,c,,.
   * @param Y Heterotrophs Y. Default value and unit are 0.40.
   * @param S Se(BOD). Default value and unit are 1.00g/m^3^.
   * @param Kd Heterotrophs Kd. Default value and unit are 0.12d^-1^.
   */
  def calXb(Q: Double,
            ForallT: Double,
            ThetaC: Double,
            Y: Double = hY,
            So: Double,
            S: Double = seBOD,
            Kd: Double = hKd): Double = {
    require(Q >= 0 && ForallT >= 0 && ThetaC >= 0 && Y >= 0 && So >= 0 && S >= 0 && Kd >= 0)
    val r = (Q / ForallT) * ((ThetaC * Y * (So - S)) / (1 + (Kd * ThetaC)))
    toXDecimals(r)
  }

  /**
   * Returns FMRatio.
   * {{{
   *   F/M = (Q * S) / (Forall anoxic * Xb)
   * }}}
   * @param Q the value of flow.
   * @param S the value of S.
   * @param ForallAnoxic the value of forall,,anoxic,,.
   * @param Xb the value of Xb.
   */
  def calFMRatio(Q: Double,
                 S: Double,
                 ForallAnoxic: Double,
                 Xb: Double): Double = {
    require(Q >= 0 && S >= 0 && ForallAnoxic >= 0 && Xb >= 0)
    val r = (Q * S) / (ForallAnoxic * Xb)
    toXDecimals(r)
  }

  /**
   * Returns NO3-N.
   * {{{
   *   NO3-N = TKN - Sne - 0.12 * (XaHeterotrophs + XaPartsHeterotrophs) / Q
   * }}}
   * @param TKN TKN. Default value and unit are 45.
   * @param Sne Sne. Default value and unit are 0.50g/m^3^.
   * @param XaHeterotrophs the value of Xa,,Heterotrophs,,.
   * @param XaPartsHeterotrophs the value of Xa,,Parts + Heterotrophs,,
   */
  def calNO3N(TKN: Double = tkn,
              Sne: Double = sne,
              XaHeterotrophs: Double,
              XaPartsHeterotrophs: Double,
              Q: Double): Double = {
    require(TKN >= 0 && Sne >= 0 && XaHeterotrophs >= 0 && XaPartsHeterotrophs >= 0 && Q > 0)
    val r = TKN - Sne - 0.12 * (XaHeterotrophs + XaPartsHeterotrophs) / Q
    toXDecimals(r)
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
    toXDecimals(r)
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
    toXDecimals(r)
  }

  /**
   * Returns R.
   * {{{
   *   R = Q / Qr
   * }}}
   * @param Q the value of flow.
   * @param Qr the value of Qr.
   */
  def calR(Qr: Double,
           Q: Double): Double = {
    require(Qr >= 0 && Q > 0)
    val r = Qr / Q
    toXDecimals(r)
  }

  /**
   * Returns IR.
   * {{{
   *   IR = (NO3N / NOxe) - 1 - R
   * }}}
   * @param NO3N the value of NO3N.
   * @param NOxe NOxe. Default value and unit are 6.00g/m^3^.
   * @param R the value of R.
   */
  def calIR(NO3N: Double,
            NOxe: Double = noXE,
            R: Double): Double = {
    require(NO3N >= 0 && NOxe >= 0 && R >= 0)
    val r = (NO3N / NOxe) - 1 - R
    toXDecimals(r)
  }

  /**
   * Returns NO,,removed,,.
   * {{{
   *   NOr = ((Q * IR) + (Q * R)) / NOxe
   * }}}
   * @param Q the value of flow.
   * @param IR the value of IR.
   * @param R the value of R.
   * @param NOxe NOxe. Default value and unit are 6.00g/m^3^.
   */
  def calNOr(Q: Double,
             IR: Double,
             R: Double,
             NOxe: Double = noXE): Double = {
    require(Q >= 0 && IR >= 0 && R >= 0 && NOxe > 0)
    val r = ((Q * IR) + (Q * R)) / NOxe
    toXDecimals(r)
  }

  /**
   * Returns NO,,3removed,,.
   * {{{
   *   NO3removed = ForallAnoxic * Xb * sdnr
   * }}}
   * @param ForallAnoxic the value of forall,,anoxic,,.
   * @param Xb the value of Xb.
   * @param sdnr the value of sdnr.
   */
  def calNO3Removed(ForallAnoxic: Double,
                    Xb: Double,
                    sdnr: Double): Double = {
    require(ForallAnoxic >= 0 && Xb >= 0 && sdnr >= 0)
    val r = ForallAnoxic * Xb * sdnr
    toXDecimals(r)
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
    toXDecimals(r)
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
    toXDecimals(r)
  }

  /**
   * Returns nitrifiers Xa.
   * {{{
   *   Xa Nitrifiers = (Q * Y * NO3N) / (1 + Kd * ThetaC)
   * }}}
   * @param Q the value of flow.
   * @param Y Nitrifiers Y. Default value and unit are 0.12.
   * @param NO3N the value of NO,,3,,-N.
   * @param Kd Nitrifiers Kd. Default value and unit are 0.08d^-1^.
   * @param ThetaC the value of theta,,c,,.
   */
  def calXaNitrifiers(Q: Double,
                      Y: Double = nY,
                      NO3N: Double,
                      Kd: Double = nKd,
                      ThetaC: Double): Double = {
    require(Q >= 0 && Y >= 0 && NO3N >= 0 && Kd >= 0 && ThetaC >= 0)
    val r = (Q * Y * NO3N) / (1 + Kd * ThetaC)
    toXDecimals(r)
  }

  /**
   * Returns nitrifiers parts Xa.
   * {{{
   *   X app pieces and parts = ThetaC * fnd * Kd * Xa
   * }}}
   * @param ThetaC the value of theta,,c,,.
   * @param fnd Default value and unit are 0.10.
   * @param Kd Nitrifiers Kd. Default value and unit are 0.08d^-1^.
   * @param Xa the value of Xa.
   */
  def calXaNitrifiersParts(ThetaC: Double,
                           fnd: Double = fnd,
                           Kd: Double = nKd,
                           Xa: Double): Double = {
    require(ThetaC >= 0 && fnd >= 0 && Kd >= 0 && Xa >= 0)
    val r = ThetaC * fnd * Kd * Xa
    toXDecimals(r)
  }

  /**
   * Returns Forall,,anoxic,,.
   * {{{
   *   Forall anoxic = Volumne of basins * ForallAnoxicForallTotalRatio
   * }}}
   * @param volume the volume of basins
   * @param forallAnoxicForallTotalRatio Forall,,anoxic,,/Forall,,total,,. Default value and unit are 0.33.
   */
  def calForallAnoxic(volume: Double,
                      forallAnoxicForallTotalRatio: Double = forallAnoxicForallTotalRatio): Double = {
    require(volume >= 0 && forallAnoxicForallTotalRatio >= 0)
    val r = volume * forallAnoxicForallTotalRatio
    toXDecimals(r)
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
    toXDecimals(r)
  }

  /**
   * Returns P,,Xvss,,.
   * {{{
   *   PXvss = PxBioHeterotrophs + PxBioNitrifiers + PXvsso
   * }}}
   * @param PxBioHeterotrophs the value of heterotrophs P,,XBio,,.
   * @param PxBioNitrifiers the value of nitrifiers P,,XBio,,.
   * @param PXvsso the value of P,,Xvss,,
   */
  def calPXvss(PxBioHeterotrophs: Double,
               PxBioNitrifiers: Double,
               PXvsso: Double): Double = {
    require(PxBioHeterotrophs >= 0 && PxBioNitrifiers >= 0 && PXvsso >= 0)
    val r = PxBioHeterotrophs + PxBioNitrifiers + PXvsso
    toXDecimals(r)
  }

  /**
   * Returns aeration tank volumes.
   * {{{
   *   Volume = count * length * width * depth
   * }}}
   * @param count the number of aeration tank.
   * @param length the value of length of aeration tank.
   * @param width the value of width of aeration tank.
   * @param depth the value of depth of aeration tank.
   */
  def calAerationTankVolumes(count: Double,
                             length: Double,
                             width: Double,
                             depth: Double): Double = {
    require(count >= 0 && length >= 0 && width >= 0 && depth >= 0)
    val r = count * length * width * depth
    toXDecimals(r)
  }

  /**
   * Returns fluent BOD concentration.
   * {{{
   *   So = (Lorg * Forall) / Q
   * }}}
   * @param Lorg the value of volumetric organic loading rate.
   * @param Forall the value of aeration tank volume.
   * @param Q the value of flow.
   */
  def calBOD(Lorg: Double,
             Q: Double,
             Forall: Double): Double = {
    require(Lorg >= 0 && Forall >= 0 && Q > 0)
    val r = (BigDecimal(Lorg) / 1000 / Q * 453.59 * 28.32 * Forall / 3.785 / 28.32 * 1000).toDouble
    toXDecimals(r)
  }

  /**
   * A case class to represent the default aerobic anoxic basins.
   * tss the value of TSS removal. Default value is 94.00.
   * bod5 the value of BOD,,5,, removal. Default value is 97.00.
   * nh3n the value of NH,,3,,-N removal. Default value is 97.00.
   * tp the value of TP removal. Default value is 0.00.
   * fecalColiform the value of fecal coliform removal. Default value is 0.00.
   * enterococci the value of enterococci removal. Default value is 0.00.
   */
  val aabDefaultRemovals = Removals(tss = Some(tssRemoval),
    bod5 = Some(bod5Removal),
    nh3n = Some(nh3nRemoval))

}
