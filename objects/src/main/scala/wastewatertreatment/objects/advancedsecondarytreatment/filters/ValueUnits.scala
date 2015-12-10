package wastewatertreatment.objects.advancedsecondarytreatment.filters

import wastewatertreatment.core.valueunit.ValueUnit
import wastewatertreatment.core.{fluent, ratios, removals}
import wastewatertreatment.objects.advancedsecondarytreatment.filters.Filters._
import wastewatertreatment.objects.advancedsecondarytreatment.filters.Unit._

/**
 * Created by ka-son on 11/7/15.
 */
object ValueUnits extends fluent.ValueUnits with ratios.ValueUnits with removals.ValueUnits {

  /**
   * Daily backwash rate
   * @param unit Default unit is '''m^3^/d'''.
   */
  case class DailyBackwashRate(value: Option[Double] = Some(backwashRate),
                               unit: String = dailyBackwashRateUnits.drop(1).headOption.getOrElse("gpm/ft^2")) extends ValueUnit

  /**
   * A case class to represent the default filters.
   * tss the value of TSS removal. Default value and unit are 70.00%.
   * bod5 the value of BOD,,5,, removal. Default value and unit are 70.00%.
   * nh3n the value of NH,,3,,-N removal. Default value and unit are 21.00%.
   * tp the value of TP removal. Default value and unit are 33.00%.
   * fecalColiform the value of fecal coliform removal. Default value and unit are 76.00%.
   * enterococci the value of enterococci removal. Default value and unit are 76.00%.
   */
  val fDefaultMiscRemovals = MiscellaneousRemovals(tss = TSSRemoval(Some(tssRemoval)),
    bod5 = BOD5Removal(Some(bod5Removal)),
    nh3n = NH3NRemoval(Some(nh3nRemoval)),
    tp = TPRemoval(Some(tpRemoval)),
    fecalColiform = FecalColiformRemoval(Some(bacterialRemovalRate)),
    enterococci = EnterococciRemoval(Some(bacterialRemovalRate)))

}
