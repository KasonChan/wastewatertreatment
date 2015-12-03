package wastewatertreatment.removals

import wastewatertreatment.valueunit.ValueUnit

/**
 * Created by kasonchan on 12/2/15.
 */
trait ValueUnits extends Units {

  /**
   * TSS removal.
   * @param unit Default is '''No unit'''.
   */
  case class TSSRemoval(value: Option[Double] = None,
                        unit: String = tssRemovalUnits.headOption.getOrElse("")) extends ValueUnit

  /**
   * BOD5 removal.
   * @param unit Default is '''No unit'''.
   */
  case class BOD5Removal(value: Option[Double] = None,
                         unit: String = bod5RemovalUnits.headOption.getOrElse("")) extends ValueUnit

  /**
   * NH3N removal.
   * @param unit Default is '''No unit'''.
   */
  case class NH3NRemoval(value: Option[Double] = None,
                         unit: String = nh3nRemovalUnits.headOption.getOrElse("")) extends ValueUnit

  /**
   * TP removal.
   * @param unit Default is '''No unit'''.
   */
  case class TPRemoval(value: Option[Double] = None,
                       unit: String = tpRemovalUnits.headOption.getOrElse("")) extends ValueUnit

  /**
   * Fecal coliform removal.
   * @param unit Default is '''No unit'''.
   */
  case class FecalColiformRemoval(value: Option[Double] = None,
                                  unit: String = fecalColiformRemovalUnits.headOption.getOrElse("")) extends ValueUnit

  /**
   * Enterococci removal.
   * @param unit Default is '''No unit'''.
   */
  case class EnterococciRemoval(value: Option[Double] = None,
                                unit: String = enterococciRemovalUnits.headOption.getOrElse("")) extends ValueUnit

  /**
   * Miscellaneous removals
   * @param tssRemoval the value of TSS removal. Default value and units are 0.
   * @param bod5Removal the value of BOD,,5,, removal. Default value and units are 0.
   * @param nh3nRemoval the value of NH,,3,,-N removal. Default value and units are 0.
   * @param tpRemoval the value of TP removal. Default value and units are 0.
   * @param fecalColiformRemoval the value of fecal coliform removal. Default value and units are 0.
   * @param enterococciRemoval the value of enterococci removal. Default value and units are 0.
   */
  case class MiscellaneousRemovals(tssRemoval: TSSRemoval = TSSRemoval(),
                                   bod5Removal: BOD5Removal = BOD5Removal(),
                                   nh3nRemoval: NH3NRemoval = NH3NRemoval(),
                                   tpRemoval: TPRemoval = TPRemoval(),
                                   fecalColiformRemoval: FecalColiformRemoval = FecalColiformRemoval(),
                                   enterococciRemoval: EnterococciRemoval = EnterococciRemoval())

}
