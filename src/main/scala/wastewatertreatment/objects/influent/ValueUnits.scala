package wastewatertreatment.objects.influent

import wastewatertreatment.objects.influent.Influent._
import wastewatertreatment.objects.influent.Unit._
import wastewatertreatment.valueunit.ValueUnit

/**
 * Created by kasonchan on 11/6/15.
 */

/**
 * Q
 * @param unit Default is '''MGD'''.
 */
case class Q(value: Double,
             unit: String = qUnits.headOption.getOrElse("MGD")) extends ValueUnit

/**
 * TSS
 * @param unit Default is '''g/m^3^'''.
 */
case class TSS(value: Double,
               unit: String = tssUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

/**
 * cBOD,,5,,
 * @param unit Default is '''g/m^3^'''.
 */
case class CBOD5(value: Double,
                 unit: String = cBOD5Units.headOption.getOrElse("g/m^3")) extends ValueUnit

/**
 * NH,,3,,
 * @param unit Default is '''g/m^3^'''.
 */
case class NH3(value: Double,
               unit: String = nh3Units.headOption.getOrElse("g/m^3")) extends ValueUnit

/**
 * TP
 * @param unit Default is '''g/m^3^'''.
 */
case class TP(value: Double,
              unit: String = tpUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

/**
 * BOD,,5,,/cBOD,,5,,
 * @param value Default value is '''1.10'''.
 * @param unit Default is '''No unit'''.
 */
case class BOD5CBOD5Ratio(value: Double = bod5cBOD5Ratio,
                          unit: String = bod5cBOD5RatioUnits.headOption.getOrElse("")) extends ValueUnit

/**
 * COD/BOD
 * @param value Default value is '''1.60'''.
 * @param unit Default is '''No unit'''.
 */
case class CODBODRatio(value: Double = codBODRatio,
                       unit: String = codBODRatioUnits.headOption.getOrElse("")) extends ValueUnit

/**
 * COD/VSS
 * @param value Default value is '''1.42'''.
 * @param unit Default is '''No unit'''.
 */
case class CODVSSRatio(value: Double = codVSSRatio,
                       unit: String = codVSSRatioUnits.headOption.getOrElse("")) extends ValueUnit

/**
 * VSS/TSS
 * @param value Default value is '''0.80'''.
 * @param unit Default is '''No unit'''.
 */
case class VSSTSSRatio(value: Double = vssTSSRatio,
                       unit: String = vssTSSRatioUnits.headOption.getOrElse("")) extends ValueUnit

/**
 * TN
 * @param value Default value is '''0.40'''.
 * @param unit Default is '''g/m^3^'''.
 */
case class TN(value: Double = tn,
              unit: String = tnUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

/**
 * Biodegradable VSS
 * @param value Default value is '''0.80'''.
 * @param unit Default is '''No unit'''.
 */
case class BVSS(value: Double = bVSS,
                unit: String = bVSSUnits.headOption.getOrElse("")) extends ValueUnit

/**
 * VSS
 * @param unit Default is '''g/m^3^'''.
 */
case class VSS(value: Double,
               unit: String = vssUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

/**
 * BOD,,5,,
 * @param unit Default is '''g/m^3^'''.
 */
case class BOD5(value: Double,
                unit: String = vssUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

/**
 * cBOD
 * @param unit Default is '''g/m^3^'''.
 */
case class BCOD(value: Double,
                unit: String = bCODUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

/**
 * bCODp
 * @param unit Default is '''g/m^3^'''.
 */
case class BCODp(value: Double,
                 unit: String = bCODpUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

/**
 * bCODs
 * @param unit Default is '''g/m^3^'''.
 */
case class BCODs(value: Double,
                 unit: String = bCODsUnits.headOption.getOrElse("g/m^3")) extends ValueUnit
