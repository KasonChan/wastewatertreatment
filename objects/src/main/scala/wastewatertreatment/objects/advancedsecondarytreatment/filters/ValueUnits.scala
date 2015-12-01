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
   * BOD removal
   * @param value Default value is 70.00.
   * @param unit Default unit is '''%'''.
   */
  case class BODRemoval(value: Option[Double] = Some(bodRemoval),
                        unit: String = bodRemovalUnits.headOption.getOrElse("%")) extends ValueUnit

  /**
   * TSS removal
   * @param value Default value is 70.00.
   * @param unit Default unit is '''%'''.
   */
  case class TSSRemoval(value: Option[Double] = Some(tssRemoval),
                        unit: String = tssRemovalUnits.headOption.getOrElse("%")) extends ValueUnit

  /**
   * TOC removal
   * @param value Default value is 48.00.
   * @param unit Default unit is '''%'''.
   */
  case class TOCRemoval(value: Option[Double] = Some(tocRemoval),
                        unit: String = tocRemovalUnits.headOption.getOrElse("%")) extends ValueUnit

  /**
   * Fecal coliform removal
   * @param value Default value is 76.00.
   * @param unit Default unit is '''%'''.
   */
  case class FecalColiformRemoval(value: Option[Double] = Some(fecalColiformRemoval),
                                  unit: String = fecalColiformRemovalUnits.headOption.getOrElse("%")) extends ValueUnit

  /**
   * TP removal
   * @param value Default value is 33.00.
   * @param unit Default unit is '''%'''.
   */
  case class TPRemoval(value: Option[Double] = Some(tpRemoval),
                       unit: String = tpRemovalUnits.headOption.getOrElse("%")) extends ValueUnit

  /**
   * TKN removal
   * @param value Default value is 46.00.
   * @param unit Default unit is '''%'''.
   */
  case class TKNRemoval(value: Option[Double] = Some(tknRemoval),
                        unit: String = tknRemovalUnits.headOption.getOrElse("%")) extends ValueUnit

  /**
   * NH,,3,,-N removal
   * @param value Default value is 21.00.
   * @param unit Default unit is '''%'''.
   */
  case class NH3NRemoval(value: Option[Double] = Some(nh3nRemoval),
                         unit: String = nh3nRemovalUnits.headOption.getOrElse("%")) extends ValueUnit

}
