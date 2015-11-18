package wastewatertreatment.objects.advancedsecondarytreatment.uvdisinfectionbasins

import wastewatertreatment.objects.advancedsecondarytreatment.uvdisinfectionbasins.UVDisinfectionBasins._
import wastewatertreatment.objects.advancedsecondarytreatment.uvdisinfectionbasins.Unit._
import wastewatertreatment.valueunit.ValueUnit

/**
 * Created by kasonchan on 11/17/15.
 */
object ValueUnits {

  /**
   * Bacterial removal rate
   * @param value Default value is 99.99.
   * @param unit Default unit is '''No unit'''.
   */
  case class BacterialRemovalRate(value: Double = bacterialRemovalRate,
                                  unit: String = bacterialRemovalRateUnits.headOption.getOrElse("%")) extends ValueUnit

  /**
   * NTU/VSS
   * @param value Default value is 0.50.
   * @param unit Default unit is '''No unit'''.
   */
  case class NTUTSSRatio(value: Double = ntuTSSRatio,
                         unit: String = ntuTSSRatioUnits.headOption.getOrElse("")) extends ValueUnit


}
