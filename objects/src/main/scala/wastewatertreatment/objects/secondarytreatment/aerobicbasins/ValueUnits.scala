package wastewatertreatment.objects.secondarytreatment.aerobicbasins

import wastewatertreatment.core
import wastewatertreatment.objects.secondarytreatment.aerobicbasins.AerobicBasins._
import wastewatertreatment.objects.secondarytreatment.aerobicbasins.Unit._
import wastewatertreatment.valueunit.ValueUnit

/**
 * Created by ka-son on 11/22/15.
 */
object ValueUnits extends core.ValueUnits {

  /**
   * BOD,,5,, removal
   * @param value Default value is '''97.00'''.
   * @param unit Default unit is '''%'''.
   */
  case class BOD5Removal(value: Option[Double] = Some(bod5Removal),
                         unit: String = bod5RemovalUnits.headOption.getOrElse("%")) extends ValueUnit

  /**
   * TSS removal
   * @param value Default value is '''95.00'''.
   * @param unit Default unit is '''%'''.
   */
  case class TSSRemoval(value: Option[Double] = Some(tssRemoval),
                        unit: String = tssRemovalUnits.headOption.getOrElse("%")) extends ValueUnit

  /**
   * NH,,3,,-H removal
   * @param value Default value is '''97.00'''.
   * @param unit Default unit is '''%'''.
   */
  case class NH3NRemoval(value: Option[Double] = Some(nh3nRemoval),
                         unit: String = nh3nRemovalUnits.headOption.getOrElse("%")) extends ValueUnit


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
   * U
   * @param unit Default unit is '''d^-1^'''.
   */
  case class U(value: Option[Double] = None,
               unit: String = perDayUnits.headOption.getOrElse("d^-1")) extends ValueUnit

  /**
   * Ks
   * @param value
   * @param unit Default unit is '''d^-1^'''.
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
   * Theta,,c,,
   * @param unit Default unit is '''d'''.
   */
  case class ThetaC(value: Option[Double] = None,
                    unit: String = thetaCUnits.headOption.getOrElse("d")) extends ValueUnit

}
