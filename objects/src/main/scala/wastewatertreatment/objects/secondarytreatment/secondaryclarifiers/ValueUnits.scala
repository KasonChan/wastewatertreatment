package wastewatertreatment.objects.secondarytreatment.secondaryclarifiers

import wastewatertreatment.assumptions.Assumptions.vssTSSRatio
import wastewatertreatment.objects.secondarytreatment.secondaryclarifiers.SecondaryClarifiers._
import wastewatertreatment.objects.secondarytreatment.secondaryclarifiers.Unit._
import wastewatertreatment.valueunit.ValueUnit

/**
 * Created by kasonchan on 11/9/15.
 */
object ValueUnits {

  /**
   * TSS removal
   * @param value Default value is '''45.00'''.
   * @param unit Default unit is '''%'''.
   */
  case class TSSRemoval(value: Double = tssRemoval,
                        unit: String = tssRemovalUnits.headOption.getOrElse("%")) extends ValueUnit

  /**
   * BOD removal
   * @param value Default value is '''25.00'''.
   * @param unit Default unit is '''%'''.
   */
  case class BODRemoval(value: Double = bodRemoval,
                        unit: String = bodRemovalUnits.headOption.getOrElse("%")) extends ValueUnit

  /**
   * TSS
   * @param value Default value is '''8000.00'''.
   * @param unit Default unit is '''g/m^3^'''.
   */
  case class TSS(value: Double = tss,
                 unit: String = tssUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

  /**
   * P/VSS
   * @param value Default value is '''0.02'''.
   * @param unit Default unit is '''No unit'''.
   */
  case class PVSSRatio(value: Double = pVSSRatio,
                       unit: String = pVSSRatioUnits.headOption.getOrElse("")) extends ValueUnit

  /**
   * Q
   * @param unit Default unit is '''m^3^/d'''.
   */
  case class Q(value: Double,
               unit: String = qUnits.drop(1).headOption.getOrElse("m^3/d")) extends ValueUnit

  /**
   * VSS/TSS
   * @param value Default value is '''0.80'''.
   * @param unit Default unit is '''No unit'''.
   */
  case class VSSTSSRatio(value: Double = vssTSSRatio,
                         unit: String = vssTSSRatioUnits.headOption.getOrElse("")) extends ValueUnit

  /**
   * VSS
   * @param unit Default unit is '''g/m^3^'''.
   */
  case class VSS(value: Double,
                 unit: String = vssUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

  /**
   * BOD,,5,,
   * @param unit Default unit is '''g/m^3^'''.
   */
  case class BOD5(value: Double,
                  unit: String = bod5Units.headOption.getOrElse("g/m^3")) extends ValueUnit

  /**
   * cBOD,,5,,
   * @param unit Default unit is '''g/m^3^'''.
   */
  case class CBOD5(value: Double,
                   unit: String = cBOD5Units.headOption.getOrElse("g/m^3")) extends ValueUnit

  /**
   * bCODs
   * @param unit Default unit is '''g/m^3^'''.
   */
  case class BCODs(value: Double,
                   unit: String = bCODsUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

  /**
   * bCODp
   * @param unit Default unit is '''g/m^3^'''.
   */
  case class BCODp(value: Double,
                   unit: String = bCODpUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

  /**
   * bCOD
   * @param unit Default unit is '''g/m^3^'''.
   */
  case class BCOD(value: Double,
                  unit: String = bCODUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

  /**
   * P
   * @param unit Default unit is '''g-TSS/d'''.
   */
  case class P(value: Double,
               unit: String = pUnits.headOption.getOrElse("g-TSS/d")) extends ValueUnit

  /**
   * TP
   * @param unit Default unit is '''g/m^3^'''.
   */
  case class TP(value: Double,
                unit: String = tpUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

}
