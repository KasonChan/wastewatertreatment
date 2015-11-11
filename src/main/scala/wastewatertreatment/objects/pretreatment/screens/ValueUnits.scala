package wastewatertreatment.objects.pretreatment.screens

import wastewatertreatment.objects.pretreatment.screens.Screens.{bod5Removal, bod5cBOD5Ratio, codBODRatio, codVSSRatio, tssRemoval, vssTSSRatio}
import wastewatertreatment.objects.pretreatment.screens.Unit._
import wastewatertreatment.valueunit.ValueUnit

/**
 * Created by kasonchan on 10/26/15.
 */

/**
 * TSS removal
 * @param value Default value is '''27.00'''.
 * @param unit Default unit is '''%'''.
 */
case class TSSRemoval(value: Double = tssRemoval,
                      unit: String = tssRemovalUnits.headOption.getOrElse("%")) extends ValueUnit

/**
 * BOD,,5,, removal
 * @param value Default value is '''27.00'''.
 * @param unit Default unit is '''%'''.
 */
case class BOD5Removal(value: Double = bod5Removal,
                       unit: String = bod5RemovalUnits.headOption.getOrElse("%")) extends ValueUnit

/**
 * Q
 * @param unit Default unit is '''m^3^/d'''.
 */
case class Q(value: Double,
             unit: String = qUnits.drop(1).headOption.getOrElse("m^3/d")) extends ValueUnit

/**
 * TSSo
 * @param unit Default unit is '''g/m^3^'''.
 */
case class TSSo(value: Double,
                unit: String = tssOUnits.headOption.getOrElse("g^3/m^3")) extends ValueUnit

/**
 * TSSe
 * @param unit Default unit is '''g/m^3^'''.
 */
case class TSSe(value: Double,
                unit: String = tssEUnits.headOption.getOrElse("g^3/m^3")) extends ValueUnit

/**
 * BOD,,5,,o
 * @param unit Default unit is '''g/m^3^'''.
 */
case class BOD5o(value: Double,
                 unit: String = bod5OUnits.headOption.getOrElse("g^3/m^3")) extends ValueUnit

/**
 * BOD,,5,,e
 * @param unit Default unit is '''g/m^3^'''.
 */
case class BOD5e(value: Double,
                 unit: String = bod5EUnits.headOption.getOrElse("g^3/m^3")) extends ValueUnit

/**
 * BOD,,5,,/cBOD,,5,,
 * @param value Default value is '''1.10'''.
 * @param unit Default is '''No unit'''.
 */
case class BOD5CBOD5Ratio(value: Double = bod5cBOD5Ratio,
                          unit: String = bod5cBOD5Units.headOption.getOrElse("")) extends ValueUnit

/**
 * COD/BOD
 * @param value Default value is '''1.60'''.
 * @param unit Default is '''No unit'''.
 */
case class CODBODRatio(value: Double = codBODRatio,
                       unit: String = codBODUnits.headOption.getOrElse("")) extends ValueUnit

/**
 * COD/VSS
 * @param value Default value is '''1.42'''.
 * @param unit Default is '''No unit'''.
 */
case class CODVSSRatio(value: Double = codVSSRatio,
                       unit: String = codVSSUnits.headOption.getOrElse("")) extends ValueUnit

/**
 * VSS/TSS
 * @param value Default value is '''0.80'''.
 * @param unit Default is '''No unit'''.
 */
case class VSSTSSRatio(value: Double = vssTSSRatio,
                       unit: String = vssTSSUnits.headOption.getOrElse("")) extends ValueUnit

/**
 * VSSe
 * @param unit Default unit is '''g/m^3^'''.
 */
case class VSSe(value: Double,
                unit: String = vsseUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

/**
 * cBOD,,5,,e
 * @param unit Default unit is '''g/m^3^'''.
 */
case class CBOD5e(value: Double,
                  unit: String = cBOD5eUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

/**
 * bCODe
 * @param unit Default unit is '''g/m^3^'''.
 */
case class BCODe(value: Double,
                 unit: String = bCODeUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

/**
 * bCODpe
 * @param unit Default unit is '''g/m^3^'''.
 */
case class BCODpe(value: Double,
                  unit: String = bCODpeUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

/**
 * bCODs
 * @param unit Default unit is '''g/m^3^'''.
 */
case class BCODs(value: Double,
                 unit: String = bCODsUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

/**
 * P
 * @param unit Default unit is '''g-TSS/d'''.
 */
case class P(value: Double,
             unit: String = pUnits.headOption.getOrElse("g-TSS/d")) extends ValueUnit
