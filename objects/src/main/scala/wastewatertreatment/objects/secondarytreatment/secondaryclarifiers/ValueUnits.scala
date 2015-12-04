package wastewatertreatment.objects.secondarytreatment.secondaryclarifiers

import wastewatertreatment.objects.secondarytreatment.secondaryclarifiers.SecondaryClarifiers._
import wastewatertreatment.{influent, ratios, removals}

/**
 * Created by kasonchan on 11/9/15.
 */
object ValueUnits extends influent.ValueUnits with ratios.ValueUnits with removals.ValueUnits {

  /**
   * A case class to represent the default secondary clarifiers.
   * tss the value of TSS removal. Default value and units are 45.00%.
   * bod5 the value of BOD,,5,, removal. Default value and units are 25.00%.
   * nh3n the value of NH,,3,,-N removal. Default value and units are 0.00%.
   * tp the value of TP removal. Default value and units are 0.00%.
   * fecalColiform the value of fecal coliform removal. Default value and units are 0.00%.
   * enterococci the value of enterococci removal. Default value and units are 0.00%.
   */
  val scDefaultMiscRemovals = MiscellaneousRemovals(tss = TSSRemoval(Some(tssRemoval)),
    bod5 = BOD5Removal(Some(bod5Removal)))

}
