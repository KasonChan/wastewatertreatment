package wastewatertreatment.objects.secondarytreatment.aerobicanoxicbasins

import wastewatertreatment.objects.secondarytreatment.aerobicanoxicbasins.AerobicAnoxicBasins._
import wastewatertreatment.objects.secondarytreatment.aerobicanoxicbasins.Unit._
import wastewatertreatment.valueunit.ValueUnit
import wastewatertreatment.{fluent, ratios, removals}

/**
 * Created by ka-son on 10/31/15.
 */
object ValueUnits extends fluent.ValueUnits with ratios.ValueUnits with removals.ValueUnits {

  /**
   * Forall,,T,,
   * @param unit Default unit is '''m^3^'''.
   */
  case class ForallT(value: Option[Double] = None,
                     unit: String = forallTUnits.headOption.getOrElse("m^3")) extends ValueUnit

  /**
   * Qpeak
   * @param unit Default unit is '''m^3^/d'''.
   */
  case class QPeak(value: Option[Double] = None,
                   unit: String = qPeakUnits.drop(1).headOption.getOrElse("m^3/d")) extends ValueUnit

  /**
   * Theta
   * @param unit Default unit is '''d'''.
   */
  case class Theta(value: Option[Double] = None,
                   unit: String = thetaUnits.headOption.getOrElse("d")) extends ValueUnit

  /**
   * BOD
   * @param unit Default unit is '''g/m^3^'''.
   */
  case class BOD(value: Option[Double] = None,
                 unit: String = bodUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

  /**
   * BOD loading
   * @param unit Default unit is '''kg-BOD/d'''.
   */
  case class BODLoading(value: Option[Double] = None,
                        unit: String = bodLoadingUnits(1)) extends ValueUnit

  /**
   * Forall,,anoxic,,/Forall,,total,,
   * @param unit Default is '''No unit'''.
   */
  case class ForallAnoxicForallTotalRatio(value: Option[Double] = Some(forallAnoxicForallTotalRatio),
                                          unit: String = forallAnoxicForallTotalUnits.headOption.getOrElse("")) extends ValueUnit

  /**
   * Sne
   * @param value Default value is '''0.50'''.
   * @param unit Default unit is '''g/m^3^'''.
   */
  case class Sne(value: Option[Double] = Some(sne),
                 unit: String = sneUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

  /**
   * Xvss
   * @param value Default value is '''3000.00'''.
   * @param unit Default unit is '''g/m^3^'''.
   */
  case class Xvss(value: Option[Double] = Some(xVSS),
                  unit: String = xVSSUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

  /**
   * Se(BOD)
   * @param value Default value is '''1.00'''.
   * @param unit Default unit is '''g/m^3^'''.
   */
  case class SeBOD(value: Option[Double] = Some(seBOD),
                   unit: String = seBODUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

  /**
   * Ko
   * @param value Default value is '''0.50'''.
   * @param unit Default unit is '''g/m^3^'''.
   */
  case class Ko(value: Option[Double] = Some(kO),
                unit: String = kOUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

  /**
   * Do
   * @param value Default value is '''2.00'''.
   * @param unit Default unit is '''g/m^3^'''.
   */
  case class Do(value: Option[Double] = Some(dO),
                unit: String = dOUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

  /**
   * fnd
   * @param value Default value is '''0.10'''.
   */
  case class Fnd(value: Option[Double] = Some(fnd),
                 unit: String = fndUnits.headOption.getOrElse("")) extends ValueUnit

  /**
   * Factor of safety
   * @param value Default value is '''2.00'''.
   * @param unit Default is '''No unit'''.
   */
  case class FactorOfSafety(value: Option[Double] = Some(factorOfSafety),
                            unit: String = factorOfSafetyUnits.headOption.getOrElse("")) extends ValueUnit

  /**
   * TKN
   * @param value Default value is '''45.00'''.
   * @param unit Default is '''No unit'''.
   */
  case class TKN(value: Option[Double] = Some(tkn),
                 unit: String = tknUnits.headOption.getOrElse("")) extends ValueUnit

  /**
   * Xr
   * @param value Default value is '''8000.00'''.
   * @param unit Default unit is '''g/m^3^'''.
   */
  case class Xr(value: Option[Double] = Some(xR),
                unit: String = xEUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

  /**
   * Xw
   * @param value Default value is '''8000.00'''.
   * @param unit Default unit is '''g/m^3^'''.
   */
  case class Xw(value: Option[Double] = Some(xW),
                unit: String = xWUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

  /**
   * Xe
   * @param value Default value is '''10.00'''.
   * @param unit Default unit is '''g/m^3^'''.
   */
  case class Xe(value: Option[Double] = Some(xE),
                unit: String = xEUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

  /**
   * NOxe
   * @param value Default value is '''6.00'''.
   * @param unit Default unit is '''g/m^3^'''.
   */
  case class NOxe(value: Option[Double] = Some(noXE),
                  unit: String = noXEUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

  /**
   * rbCOD
   * @param unit Default unit is '''g/m^3^'''.
   */
  case class RbCOD(value: Option[Double] = None,
                   unit: String = rbCODUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

  /**
   * U
   * @param unit Default unit is '''d^-1^'''.
   */
  case class U(value: Option[Double] = None,
               unit: String = perDayUnits.headOption.getOrElse("d^-1")) extends ValueUnit

  /**
   * Ks
   * @param unit Default unit is '''g/m^3^'''.
   */
  case class Ks(value: Option[Double] = None,
                unit: String = kSUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

  /**
   * Y
   * @param unit Default is '''No unit'''.
   */
  case class Y(value: Option[Double] = None,
               unit: String = yUnits.headOption.getOrElse("")) extends ValueUnit

  /**
   * Kd
   * @param unit Default unit is '''d^-1^'''.
   */
  case class Kd(value: Option[Double] = None,
                unit: String = perDayUnits.headOption.getOrElse("d^-1")) extends ValueUnit

  /**
   * Heterotrophs
   * @param u Default value and unit are 6.00d^-1^.
   * @param kS Default value and unit are 20.0g/m^3^.
   * @param y Default value and unit are 0.40.
   * @param kD Default value and unit are 0.12d^-1^.
   */
  case class Heterotrophs(u: U = U(Some(hU)),
                          kS: Ks = Ks(Some(hKs)),
                          y: Y = Y(Some(hY)),
                          kD: Kd = Kd(Some(hKd)))

  /**
   * Nitrifiers
   * @param u Default value and unit are 0.75d^-1^.
   * @param kS Default value and unit are 0.74g/m^3^.
   * @param y Default value and unit are 0.12.
   * @param kD Default value and unit are 0.08d^-1^.
   */
  case class Nitrifiers(u: U = U(Some(nU)),
                        kS: Ks = Ks(Some(nKs)),
                        y: Y = Y(Some(nY)),
                        kD: Kd = Kd(Some(nKd)))

  /**
   * Forall,,anoxic,,
   * @param unit Default unit is '''m^3^'''.
   */
  case class ForallAnoxic(value: Option[Double] = None,
                          unit: String = forallAnoxicUnits.headOption.getOrElse("m^3")) extends ValueUnit

  /**
   * Theta,,aerobic,,
   * @param unit Default unit is '''d'''.
   */
  case class ThetaAerobic(value: Option[Double] = None,
                          unit: String = thetaAerobicUnits.headOption.getOrElse("d")) extends ValueUnit

  /**
   * Theta,,c,,
   * @param unit Default unit is '''d'''.
   */
  case class ThetaC(value: Option[Double] = None,
                    unit: String = thetaCUnits.headOption.getOrElse("d")) extends ValueUnit

  /**
   * S
   * @param unit Default unit is '''g-BOD/m^3^'''.
   */
  case class S(value: Option[Double] = None,
               unit: String = sUnits.headOption.getOrElse("g-BOD/m^3")) extends ValueUnit

  /**
   * P,,XBio,,
   * @param unit Default unit is '''g/d'''.
   */
  case class PXBio(value: Option[Double] = None,
                   unit: String = pXBioUnits.headOption.getOrElse("g/d")) extends ValueUnit

  /**
   * X,,b,,
   * @param unit Default unit is '''g/m^3^'''.
   */
  case class Xb(value: Option[Double] = None,
                unit: String = xBUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

  /**
   * F/M
   * @param unit Default unit is '''No unit'''.
   */
  case class FMRatio(value: Option[Double] = None,
                     unit: String = fmRatioUnits.headOption.getOrElse("")) extends ValueUnit

  /**
   * SDNR
   * @param unit Default unit is '''No unit'''.
   */
  case class SDNR(value: Option[Double] = None,
                  unit: String = sdnrUnits.headOption.getOrElse("")) extends ValueUnit

  /**
   * NO3-N
   * @param unit Default unit is '''g/m^3^'''.
   */
  case class NO3N(value: Option[Double] = None,
                  unit: String = no3nUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

  /**
   * Qw
   * @param unit Default unit is '''m^3^/d'''.
   */
  case class Qw(value: Option[Double] = None,
                unit: String = qWUnits.drop(1).headOption.getOrElse("m^3/d")) extends ValueUnit

  /**
   * Qr
   * @param unit Default unit is '''m^3^/d'''.
   */
  case class Qr(value: Option[Double] = None,
                unit: String = qRUnits.drop(1).headOption.getOrElse("m^3/d")) extends ValueUnit

  /**
   * R
   * @param unit Default unit is '''No unit'''.
   */
  case class R(value: Option[Double] = None,
               unit: String = rUnits.headOption.getOrElse("")) extends ValueUnit

  /**
   * IR
   * @param unit Default unit is '''No unit'''.
   */
  case class IR(value: Option[Double] = None,
                unit: String = iRUnits.headOption.getOrElse("")) extends ValueUnit

  /**
   * NOr
   * @param unit Default unit is '''g/d'''.
   */
  case class NOr(value: Option[Double] = None,
                 unit: String = noRUnits.headOption.getOrElse("g/d")) extends ValueUnit

  /**
   * NO,,3,, removed
   * @param unit Default unit is '''g/d'''.
   */
  case class NO3Removed(value: Option[Double] = None,
                        unit: String = no3RemovedUnits.headOption.getOrElse("g/d")) extends ValueUnit

  /**
   * Xa Heterotrophs
   * @param unit Default unit is '''g/d'''.
   */
  case class XaHeterotrophs(value: Option[Double] = None,
                            unit: String = xAHeterotrophsUnits.headOption.getOrElse("g/d")) extends ValueUnit

  /**
   * Xa Heterotrophs Parts
   * @param unit Default unit is '''g/d'''.
   */
  case class XaHeterotrophsParts(value: Option[Double] = None,
                                 unit: String = xAHeterotrophsUnits.headOption.getOrElse("g/d")) extends ValueUnit

  /**
   * P,,XBio,, Heterotrophs
   * @param unit Default unit is '''g/d'''.
   */
  case class PxBioHeterotrophs(value: Option[Double] = None,
                               unit: String = pXBioHeterotrophisUnits.headOption.getOrElse("g/d")) extends ValueUnit

  /**
   * Xa Nitrifiers
   * @param unit Default unit is '''g/d'''.
   */
  case class XaNitrifiers(value: Option[Double] = None,
                          unit: String = xANitrifiersUnits.headOption.getOrElse("g/d")) extends ValueUnit

  /**
   * Xa Nitrifiers Parts
   * @param unit Default unit is '''g/d'''.
   */
  case class XaNitrifiersParts(value: Option[Double] = None,
                               unit: String = xANitrifiersPartsUnits.headOption.getOrElse("g/d")) extends ValueUnit

  /**
   * P,,XBio,, Nitrifiers
   * @param unit Default unit is '''g/d'''.
   */
  case class PxBioNitrifiers(value: Option[Double] = None,
                             unit: String = pXBioNitrifiersUnits.headOption.getOrElse("g/d")) extends ValueUnit

  /**
   * P,,Xvss,,
   * @param unit Default unit is '''g/d'''.
   */
  case class PXvss(value: Option[Double] = None,
                   unit: String = pXvssUnits.headOption.getOrElse("g/d")) extends ValueUnit

  /**
   * A case class to represent the default aerobic anoxic basins.
   * tss the value of TSS removal. Default value and units are 94.00%.
   * bod5 the value of BOD,,5,, removal. Default value and units are 97.00%.
   * nh3n the value of NH,,3,,-N removal. Default value and units are 97.00%.
   * tp the value of TP removal. Default value and units are 0.00%.
   * fecalColiform the value of fecal coliform removal. Default value and units are 0.00%.
   * enterococci the value of enterococci removal. Default value and units are 0.00%.
   */
  val aabDefaultRemovals = MiscellaneousRemovals(tss = TSSRemoval(Some(tssRemoval)),
    bod5 = BOD5Removal(Some(bod5Removal)),
    nh3n = NH3NRemoval(Some(nh3nRemoval)))
}
