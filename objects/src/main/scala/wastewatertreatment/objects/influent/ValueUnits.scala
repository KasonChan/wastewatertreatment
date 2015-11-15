package wastewatertreatment.objects.influent

import wastewatertreatment.objects.influent.Unit._
import wastewatertreatment.valueunit.ValueUnit

/**
 * Created by kasonchan on 11/6/15.
 */
object ValueUnits {

  /**
   * Q.
   * @param unit Default is '''MGD'''.
   */
  case class Q(value: Double,
               unit: String = qUnits.headOption.getOrElse("MGD")) extends ValueUnit

  /**
   * TSS.
   * @param unit Default is '''g/m^3^'''.
   */
  case class TSS(value: Double,
                 unit: String = tssUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

  /**
   * cBOD,,5,,.
   * @param unit Default is '''g/m^3^'''.
   */
  case class CBOD5(value: Double,
                   unit: String = cBOD5Units.headOption.getOrElse("g/m^3")) extends ValueUnit

  /**
   * NH,,3,,.
   * @param unit Default is '''g/m^3^'''.
   */
  case class NH3(value: Double,
                 unit: String = nh3Units.headOption.getOrElse("g/m^3")) extends ValueUnit

  /**
   * TP.
   * @param unit Default is '''g/m^3^'''.
   */
  case class TP(value: Double,
                unit: String = tpUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

  /**
   * VSS.
   * @param unit Default is '''g/m^3^'''.
   */
  case class VSS(value: Double,
                 unit: String = vssUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

  /**
   * BOD,,5,,.
   * @param unit Default is '''g/m^3^'''.
   */
  case class BOD5(value: Double,
                  unit: String = vssUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

  /**
   * cBOD.
   * @param unit Default is '''g/m^3^'''.
   */
  case class BCOD(value: Double,
                  unit: String = bCODUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

  /**
   * bCODp.
   * @param unit Default is '''g/m^3^'''.
   */
  case class BCODp(value: Double,
                   unit: String = bCODpUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

  /**
   * bCODs.
   * @param unit Default is '''g/m^3^'''.
   */
  case class BCODs(value: Double,
                   unit: String = bCODsUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

  /**
   * P.
   * @param unit Default is '''g-TSS/d'''.
   */
  case class P(value: Double,
               unit: String = bCODsUnits.headOption.getOrElse("g-TSS/d")) extends ValueUnit

}
