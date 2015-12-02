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
   * BOD,,5,, removal
   * @param value Default value is '''35.00'''.
   * @param unit Default unit is '''%'''.
   */
  case class BOD5Removal(value: Option[Double] = Some(bod5Removal),
                         unit: String = bod5RemovalUnits.headOption.getOrElse("%")) extends ValueUnit

}
