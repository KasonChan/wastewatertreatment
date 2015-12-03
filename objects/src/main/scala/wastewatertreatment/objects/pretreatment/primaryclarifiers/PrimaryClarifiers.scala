package wastewatertreatment.objects.pretreatment.primaryclarifiers

import wastewatertreatment.core.Core
import wastewatertreatment.removals.Removals

/**
 * Created by kasonchan on 11/9/15.
 */
object PrimaryClarifiers extends Core {

  /**
   * TSS removal = 63.00%.
   */
  val tssRemoval = 63.00

  /**
   * BOD,,5,, removal = 35.00%.
   */
  val bod5Removal = 35.00

  /**
   * TSS = 40000.00g/m^3^.
   */
  val tss = 40000.00

  /**
   * A case class to represent the default primary clarifiers.
   * tssRemoval the value of TSS removal. Default value is 63.00.
   * bod5Removal the value of BOD,,5,, removal. Default value is 35.00.
   * nh3nRemoval the value of NH,,3,,-N removal. Default value is 0.00.
   * tpRemoval the value of TP removal. Default value is 0.00.
   * fecalColiformRemoval the value of fecal coliform removal. Default value is 0.00.
   * enterococciRemoval the value of enterococci removal. Default value is 0.00.
   */
  val pcDefaultRemovals = Removals(tssRemoval = Some(tssRemoval),
    bod5Removal = Some(bod5Removal))

}
