package wastewatertreatment.objects.secondarytreatment.aerationbasins

import wastewatertreatment.objects.secondarytreatment.aerationbasins.AerationBasins._
import wastewatertreatment.objects.secondarytreatment.aerationbasins.Unit._
import wastewatertreatment.valueunit.ValueUnit

/**
 * Created by ka-son on 10/31/15.
 */
case class ForallT(value: Double = forallT,
                   unit: String = forallTUnits.headOption.getOrElse("m^3")) extends ValueUnit

case class QPeak(value: Double = qPeak,
                 unit: String = qPeakUnits.headOption.getOrElse("m^3/d")) extends ValueUnit

case class Theta(value: Double,
                 unit: String = thetaUnits.headOption.getOrElse("d")) extends ValueUnit

case class BODLoading(value: Double,
                      unit: String = bodLoadingUnits(1)) extends ValueUnit

case class BODRemoval(value: Double = bodRemoval,
                      unit: String = bodRemovalUnits.headOption.getOrElse("%")) extends ValueUnit

case class TSSRemoval(value: Double = tssRemoval,
                      unit: String = tssRemovalUnits.headOption.getOrElse("%")) extends ValueUnit

case class TKNRemoval(value: Double = tknRemoval,
                      unit: String = tknRemovalUnits.headOption.getOrElse("%")) extends ValueUnit

case class NH3NRemoval(value: Double = nh3nRemoval,
                       unit: String = nh3nRemovalUnits.headOption.getOrElse("%")) extends ValueUnit

case class PhosphorousRemoval(value: Double = phosphorousRemoval,
                              unit: String = phosphorousRemovalUnits.headOption.getOrElse("%")) extends ValueUnit

case class BCOD5Removal(value: Double = bCOD5Removal,
                        unit: String = bCOD5RemovalUnits.headOption.getOrElse("%")) extends ValueUnit

case class ForallAnoxicForallTotalRatio(value: Double = forallAnoxicForallTotalRatio,
                                        unit: String = forallAnoxicForallTotalUnits.headOption.getOrElse("")) extends ValueUnit

case class Snc(value: Double = snc,
               unit: String = sncUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

case class Xvss(value: Double = xVSS,
                unit: String = xVSSUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

case class SeBOD(value: Double = seBOD,
                 unit: String = seBODUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

case class NbvssVSSRatio(value: Double = nbvssVSSRatio,
                         unit: String = nbVSSVSSRatioUnits.headOption.getOrElse("")) extends ValueUnit

case class Ko(value: Double = kO,
              unit: String = kOUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

case class Do(value: Double = dO,
              unit: String = dOUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

case class Fnd(value: Double = fnd,
               unit: String = fndUnits.headOption.getOrElse("")) extends ValueUnit

case class FactorOfSafety(value: Double = factorOfSafety,
                          unit: String = factorOfSafetyUnits.headOption.getOrElse("")) extends ValueUnit

case class Xr(value: Double = xR,
              unit: String = xEUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

case class Xn(value: Double = xN,
              unit: String = xNUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

case class Xe(value: Double = xE,
              unit: String = xEUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

case class NOxe(value: Double = noXE,
                unit: String = noXEUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

case class RbCOD(value: Double = rbCOD,
                 unit: String = rbCODUnits.headOption.getOrElse("g/m^3")) extends ValueUnit
