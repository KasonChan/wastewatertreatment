package wastewatertreatment.core

import wastewatertreatment.assumptions.Assumptions
import wastewatertreatment.valueunit.ValueUnit

/**
 * Created by kasonchan on 11/16/15.
 */
trait ValueUnits extends Assumptions with Units {

  /**
   * Q.
   * @param unit Default is '''m^3^/d'''.
   */
  case class Q(value: Double,
               unit: String = qUnits.drop(1).headOption.getOrElse("m^3/d")) extends ValueUnit

  /**
   * TSS.
   * @param unit Default is '''g/m^3^'''.
   */
  case class TSS(value: Double,
                 unit: String = tssUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

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
                  unit: String = bod5Units.headOption.getOrElse("g/m^3")) extends ValueUnit

  /**
   * cBOD,,5,,.
   * @param unit Default is '''g/m^3^'''.
   */
  case class CBOD5(value: Double,
                   unit: String = cBOD5Units.headOption.getOrElse("g/m^3")) extends ValueUnit

  /**
   * bCOD.
   * @param unit Default is '''g/m^3^'''.
   */
  case class BCOD(value: Double,
                  unit: String = bCODUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

  /**
   * bCODs.
   * @param unit Default is '''g/m^3^'''.
   */
  case class BCODs(value: Double,
                   unit: String = bCODsUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

  /**
   * bCODp.
   * @param unit Default is '''g/m^3^'''.
   */
  case class BCODp(value: Double,
                   unit: String = bCODpUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

  /**
   * NH,,3,,-N.
   * @param unit Default is '''g/m^3^'''.
   */
  case class NH3N(value: Double,
                  unit: String = nh3nUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

  /**
   * TP.
   * @param unit Default is '''g/m^3^'''.
   */
  case class TP(value: Double,
                unit: String = tpUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

  /**
   * P.
   * @param unit Default is '''g-TSS/d'''.
   */
  case class P(value: Double,
               unit: String = pUnits.headOption.getOrElse("g-TSS/d")) extends ValueUnit

  /**
   * Fecal Coliform.
   * @param unit Default is '''MPN/100mL'''.
   */
  case class FecalColiform(value: Double,
                           unit: String = fecalColiformUnits.headOption.getOrElse("MPN/100mL")) extends ValueUnit

  /**
   * Enterococci.
   * @param unit Default is '''MPN/100mL'''.
   */
  case class Enterococci(value: Double,
                         unit: String = fecalColiformUnits.headOption.getOrElse("MPN/100mL")) extends ValueUnit

  /**
   * Turbidity.
   * @param unit Default is '''MPN/100mL'''.
   */
  case class Turbidity(value: Double,
                       unit: String = hazeUnits.headOption.getOrElse("MPN/100mL")) extends ValueUnit

}
