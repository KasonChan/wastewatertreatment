package wastewatertreatment.objects.advancedsecondarytreatment.filters

import wastewatertreatment.core
import wastewatertreatment.objects.advancedsecondarytreatment.filters.Filters._
import wastewatertreatment.objects.advancedsecondarytreatment.filters.Unit._
import wastewatertreatment.valueunit.ValueUnit

/**
 * Created by ka-son on 11/7/15.
 */
object ValueUnits extends core.ValueUnits {

  /**
   * Daily backwash rate
   * @param unit Default unit is '''m^3^/d'''.
   */
  case class DailyBackwashRate(value: Option[Double] = Some(backwashRate),
                               unit: String = dailyBackwashRateUnits.drop(1).headOption.getOrElse("gpm/ft^2")) extends ValueUnit

  /**
   * BOD,,5,, removal
   * @param value Default value is 70.00.
   * @param unit Default unit is '''%'''.
   */
  case class BOD5Removal(value: Option[Double] = Some(bod5Removal),
                         unit: String = bod5RemovalUnits.headOption.getOrElse("%")) extends ValueUnit

  /**
   * TSS removal
   * @param value Default value is 70.00.
   * @param unit Default unit is '''%'''.
   */
  case class TSSRemoval(value: Option[Double] = Some(tssRemoval),
                        unit: String = tssRemovalUnits.headOption.getOrElse("%")) extends ValueUnit

  /**
   * Fecal coliform removal
   * @param value Default value is 76.00.
   * @param unit Default unit is '''%'''.
   */
  case class FecalColiformRemoval(value: Option[Double] = Some(bacterialRemovalRate),
                                  unit: String = bacterialRemovalRateUnits.headOption.getOrElse("%")) extends ValueUnit

  /**
   * TP removal
   * @param value Default value is 33.00.
   * @param unit Default unit is '''%'''.
   */
  case class TPRemoval(value: Option[Double] = Some(tpRemoval),
                       unit: String = tpRemovalUnits.headOption.getOrElse("%")) extends ValueUnit

  /**
   * NH,,3,,-N removal
   * @param value Default value is 21.00.
   * @param unit Default unit is '''%'''.
   */
  case class NH3NRemoval(value: Option[Double] = Some(nh3nRemoval),
                         unit: String = nh3nRemovalUnits.headOption.getOrElse("%")) extends ValueUnit

}
