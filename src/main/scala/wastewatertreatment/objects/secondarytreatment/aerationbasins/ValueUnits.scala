package wastewatertreatment.objects.secondarytreatment.aerationbasins

import wastewatertreatment.objects.secondarytreatment.aerationbasins.AerationBasins._
import wastewatertreatment.objects.secondarytreatment.aerationbasins.Unit._
import wastewatertreatment.valueunit.ValueUnit

/**
 * Created by ka-son on 10/31/15.
 */

/**
 * Forall,,T,,
 * @param unit Default unit is '''m^3^'''.
 */
case class ForallT(value: Double,
                   unit: String = forallTUnits.headOption.getOrElse("m^3")) extends ValueUnit

/**
 * Qpeak
 * @param unit Default unit is '''m^3^/d'''.
 */
case class QPeak(value: Double,
                 unit: String = qPeakUnits.headOption.getOrElse("m^3/d")) extends ValueUnit

/**
 * Theta
 * @param unit Default unit is '''d'''.
 */
case class Theta(value: Double,
                 unit: String = thetaUnits.headOption.getOrElse("d")) extends ValueUnit

/**
 * Q
 * @param unit Default unit is '''m^3^/d'''.
 */
case class Q(value: Double,
             unit: String = qUnits.headOption.getOrElse("m^3/d")) extends ValueUnit

/**
 * BOD
 * @param unit Default unit is '''g/m^3^'''.
 */
case class BOD(value: Double,
               unit: String = bodUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

/**
 * BOD loading
 * @param unit Default unit is '''kg-BOD/d'''.
 */
case class BODLoading(value: Double,
                      unit: String = bodLoadingUnits(1)) extends ValueUnit

/**
 * BOD removal
 * @param value Default value is '''97.00'''.
 * @param unit Default unit is '''%'''.
 */
case class BODRemoval(value: Double = bodRemoval,
                      unit: String = bodRemovalUnits.headOption.getOrElse("%")) extends ValueUnit

/**
 * TSS removal
 * @param value Default value is '''94.00'''.
 * @param unit Default unit is '''%'''.
 */
case class TSSRemoval(value: Double = tssRemoval,
                      unit: String = tssRemovalUnits.headOption.getOrElse("%")) extends ValueUnit

/**
 * TKN removal
 * @param value Default value is '''88.00'''.
 * @param unit Default unit is '''%'''.
 */
case class TKNRemoval(value: Double = tknRemoval,
                      unit: String = tknRemovalUnits.headOption.getOrElse("%")) extends ValueUnit

/**
 * NH,,3,,-H removal
 * @param value Default value is '''97.00'''.
 * @param unit Default unit is '''%'''.
 */
case class NH3NRemoval(value: Double = nh3nRemoval,
                       unit: String = nh3nRemovalUnits.headOption.getOrElse("%")) extends ValueUnit

/**
 * Phosphorous removal
 * @param value Default value is '''98.00'''.
 * @param unit Default unit is '''%'''.
 */
case class PhosphorousRemoval(value: Double = phosphorousRemoval,
                              unit: String = phosphorousRemovalUnits.headOption.getOrElse("%")) extends ValueUnit

/**
 * bCODs removal
 * @param value Default value is '''100.00'''.
 * @param unit Default unit is '''%'''.
 */
case class BCODsRemoval(value: Double = bCODsRemoval,
                        unit: String = bCODsRemovalUnits.headOption.getOrElse("%")) extends ValueUnit

/**
 * Forall,,anoxic,,/Forall,,total,,
 * @param unit Default is '''No unit'''.
 */
case class ForallAnoxicForallTotalRatio(value: Double = forallAnoxicForallTotalRatio,
                                        unit: String = forallAnoxicForallTotalUnits.headOption.getOrElse("")) extends ValueUnit

/**
 * Sne
 * @param value Default value is '''0.50'''.
 * @param unit Default unit is '''g/m^3^'''.
 */
case class Sne(value: Double = sne,
               unit: String = sneUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

/**
 * Xvss
 * @param value Default value is '''3000.00'''.
 * @param unit Default unit is '''g/m^3^'''.
 */
case class Xvss(value: Double = xVSS,
                unit: String = xVSSUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

/**
 * Se(BOD)
 * @param value Default value is '''1.00'''.
 * @param unit Default unit is '''g/m^3^'''.
 */
case class SeBOD(value: Double = seBOD,
                 unit: String = seBODUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

/**
 * nbvss/VSS
 * @param value Default value is '''0.20'''.
 * @param unit Default is '''No unit'''.
 */
case class NbvssVSSRatio(value: Double = nbvssVSSRatio,
                         unit: String = nbVSSVSSRatioUnits.headOption.getOrElse("")) extends ValueUnit

/**
 * Ko
 * @param value Default value is '''0.50'''.
 * @param unit Default unit is '''g/m^3^'''.
 */
case class Ko(value: Double = kO,
              unit: String = kOUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

/**
 * Do
 * @param value Default value is '''2.00'''.
 * @param unit Default unit is '''g/m^3^'''.
 */
case class Do(value: Double = dO,
              unit: String = dOUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

/**
 * fnd
 * @param value Default value is '''0.10'''.
 */
case class Fnd(value: Double = fnd,
               unit: String = fndUnits.headOption.getOrElse("")) extends ValueUnit

/**
 * Factor of safety
 * @param value Default value is '''2.00'''.
 * @param unit Default is '''No unit'''.
 */
case class FactorOfSafety(value: Double = factorOfSafety,
                          unit: String = factorOfSafetyUnits.headOption.getOrElse("")) extends ValueUnit

/**
 * Xr
 * @param value Default value is '''8000.00'''.
 * @param unit Default unit is '''g/m^3^'''.
 */
case class Xr(value: Double = xR,
              unit: String = xEUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

/**
 * Xn
 * @param value Default value is '''8000.00'''.
 * @param unit Default unit is '''g/m^3^'''.
 */
case class Xn(value: Double = xN,
              unit: String = xNUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

/**
 * Xe
 * @param value Default value is '''10.00'''.
 * @param unit Default unit is '''g/m^3^'''.
 */
case class Xe(value: Double = xE,
              unit: String = xEUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

/**
 * NOxe
 * @param value Default value is '''6.00'''.
 * @param unit Default unit is '''g/m^3^'''.
 */
case class NOxe(value: Double = noXE,
                unit: String = noXEUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

/**
 * rbCOD
 * @param value Default value is '''0.30'''.
 * @param unit Default unit is '''g/m^3^'''.
 */
case class RbCOD(value: Double = rbCOD,
                 unit: String = rbCODUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

/**
 * U
 * @param unit Default unit is '''d^-1^'''.
 */
case class U(value: Double,
             unit: String = perDayUnits.headOption.getOrElse("d^-1")) extends ValueUnit

/**
 * Ks
 * @param value
 * @param unit Default unit is '''d^-1^'''.
 */
case class Ks(value: Double,
              unit: String = kSUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

/**
 * Y
 * @param unit Default is '''No unit'''.
 */
case class Y(value: Double,
             unit: String = yUnits.headOption.getOrElse("")) extends ValueUnit

/**
 * Kd
 * @param unit Default unit is '''d^-1^'''.
 */
case class Kd(value: Double,
              unit: String = perDayUnits.headOption.getOrElse("d^-1")) extends ValueUnit

/**
 * Heterotrophs
 * @param u Default value and unit are 6.00d^-1^.
 * @param kS Default value and unit are 20.0g/m^3^.
 * @param y Default value and unit are 0.40.
 * @param kD Default value and unit are 0.12d^-1^.
 */
case class Heterotrophs(u: U = U(hU),
                        kS: Ks = Ks(hKs),
                        y: Y = Y(hY),
                        kD: Kd = Kd(hKd))

/**
 * Nitrifiers
 * @param u Default value and unit are 0.75d^-1^.
 * @param kS Default value and unit are 0.74g/m^3^.
 * @param y Default value and unit are 0.12.
 * @param kD Default value and unit are 0.08d^-1^.
 */
case class Nitrifiers(u: U = U(nU),
                      kS: Ks = Ks(nKs),
                      y: Y = Y(nY),
                      kD: Kd = Kd(nKd))

/**
 * Forall,,anoxic,,
 * @param unit Default unit is '''m^3^'''.
 */
case class ForallAnoxic(value: Double,
                        unit: String = forallAnoxicUnits.headOption.getOrElse("m^3")) extends ValueUnit

/**
 * Theta,,aerobic,,
 * @param unit Default unit is '''d'''.
 */
case class ThetaAerobic(value: Double,
                        unit: String = thetaAerobicUnits.headOption.getOrElse("d")) extends ValueUnit

/**
 * Theta,,c,,
 * @param unit Default unit is '''d'''.
 */
case class ThetaC(value: Double,
                  unit: String = thetaCUnits.headOption.getOrElse("d")) extends ValueUnit

/**
 * S
 * @param unit Default unit is '''g-BOD/m^3^'''.
 */
case class S(value: Double,
             unit: String = sUnits.headOption.getOrElse("g-BOD/m^3")) extends ValueUnit

/**
 * X,,active biomass,,
 * @param unit Default unit is '''g/d'''.
 */
case class XActiveBiomass(value: Double,
                          unit: String = xActiveBiomassUnits.headOption.getOrElse("g/d")) extends ValueUnit

/**
 * X,,app pieces and parts,,
 * @param unit Default unit is '''g/d'''.
 */
case class XAppPiecesAndParts(value: Double,
                              unit: String = xAppPiecesAndPartsUnits.headOption.getOrElse("g/d")) extends ValueUnit

/**
 * P,,XBio,,
 * @param unit Default unit is '''g/d'''.
 */
case class PXBio(value: Double,
                 unit: String = pXBioUnits.headOption.getOrElse("g/d")) extends ValueUnit

/**
 * X,,b,,
 * @param unit Default unit is '''g/m^3^'''.
 */
case class Xb(value: Double,
              unit: String = xBUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

/**
 * F/M
 * @param unit Default unit is '''No unit'''.
 */
case class FMRatio(value: Double,
                   unit: String = fmRatioUnits.headOption.getOrElse("")) extends ValueUnit

/**
 * SDNR
 * @param unit Default unit is '''No unit'''.
 */
case class SDNR(value: Double,
                unit: String = sdnrUnits.headOption.getOrElse("")) extends ValueUnit

/**
 * NOr
 * @param unit Default unit is '''g/d'''.
 */
case class NOr(value: Double,
               unit: String = noRUnits.headOption.getOrElse("g/d")) extends ValueUnit
