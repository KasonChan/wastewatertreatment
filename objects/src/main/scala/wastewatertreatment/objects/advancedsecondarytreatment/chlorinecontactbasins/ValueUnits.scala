package wastewatertreatment.objects.advancedsecondarytreatment.chlorinecontactbasins

import wastewatertreatment.objects.advancedsecondarytreatment.chlorinecontactbasins.ChlorineContactBasins._
import wastewatertreatment.objects.advancedsecondarytreatment.chlorinecontactbasins.Unit._
import wastewatertreatment.valueunit.ValueUnit

/**
 * Created by kasonchan on 11/10/15.
 */
object ValueUnits {

  /**
   * Bacterial removal rate
   * @param value Default value is 99.99.
   * @param unit Default unit is '''No unit'''.
   */
  case class BacterialRemovalRate(value: Double = bacterialRemovalRate,
                                  unit: String = bacterialRemovalRateUnits.headOption.getOrElse("")) extends ValueUnit

  /**
   * Fecal coliform
   * @param unit Default unit is '''MPN/100mL'''.
   */
  case class FecalColiform(value: Double,
                           unit: String = fecalColiformUnits.headOption.getOrElse("MPN/100mL")) extends ValueUnit

  /**
   * Enterococci
   * @param unit Default unit is '''MPN/100mL'''.
   */
  case class Enterococci(value: Double,
                         unit: String = fecalColiformUnits.headOption.getOrElse("MPN/100mL")) extends ValueUnit

}
