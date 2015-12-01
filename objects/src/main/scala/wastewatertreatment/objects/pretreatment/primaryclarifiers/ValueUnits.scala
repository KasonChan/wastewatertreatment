package wastewatertreatment.objects.pretreatment.primaryclarifiers

import wastewatertreatment.core
import wastewatertreatment.objects.pretreatment.primaryclarifiers.PrimaryClarifiers._
import wastewatertreatment.objects.pretreatment.primaryclarifiers.Unit._
import wastewatertreatment.valueunit.ValueUnit

/**
 * Created by kasonchan on 11/9/15.
 */
object ValueUnits extends core.ValueUnits {

  /**
   * TSS removal
   * @param value Default value is '''63.00'''.
   * @param unit Default unit is '''%'''.
   */
  case class TSSRemoval(value: Option[Double] = Some(tssRemoval),
                        unit: String = tssRemovalUnits.headOption.getOrElse("%")) extends ValueUnit

  /**
   * BOD removal
   * @param value Default value is '''35.00'''.
   * @param unit Default unit is '''%'''.
   */
  case class BODRemoval(value: Option[Double] = Some(bodRemoval),
                        unit: String = bodRemovalUnits.headOption.getOrElse("%")) extends ValueUnit

  /**
   * Phosphorus removal
   * @param value Default value is '''0.00'''.
   * @param unit Default unit is '''%'''.
   */
  case class PhosphorousRemoval(value: Option[Double] = Some(phosphorusRemoval),
                                unit: String = phosphorusRemovalUnits.headOption.getOrElse("%")) extends ValueUnit

}
