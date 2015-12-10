package wastewatertreatment.core.removals

import wastewatertreatment.core.valueunit.ValueUnit

/**
 * Created by kasonchan on 12/2/15.
 */
trait ValueUnits extends Units {

  /**
   * TSS removal.
   * @param unit Default is '''%'''.
   */
  case class TSSRemoval(value: Option[Double] = None,
                        unit: String = tssRemovalUnits.headOption.getOrElse("%")) extends ValueUnit

  /**
   * BOD5 removal.
   * @param unit Default is '''%'''.
   */
  case class BOD5Removal(value: Option[Double] = None,
                         unit: String = bod5RemovalUnits.headOption.getOrElse("%")) extends ValueUnit

  /**
   * NH3N removal.
   * @param unit Default is '''%'''.
   */
  case class NH3NRemoval(value: Option[Double] = None,
                         unit: String = nh3nRemovalUnits.headOption.getOrElse("%")) extends ValueUnit

  /**
   * TP removal.
   * @param unit Default is '''%'''.
   */
  case class TPRemoval(value: Option[Double] = None,
                       unit: String = tpRemovalUnits.headOption.getOrElse("%")) extends ValueUnit

  /**
   * Fecal coliform removal.
   * @param unit Default is '''%'''.
   */
  case class FecalColiformRemoval(value: Option[Double] = None,
                                  unit: String = fecalColiformRemovalUnits.headOption.getOrElse("%")) extends ValueUnit

  /**
   * Enterococci removal.
   * @param unit Default is '''%'''.
   */
  case class EnterococciRemoval(value: Option[Double] = None,
                                unit: String = enterococciRemovalUnits.headOption.getOrElse("%")) extends ValueUnit

  /**
   * Bacterial removal rate
   * @param value Default value is 99.99.
   * @param unit Default unit is '''No unit'''.
   */
  case class BacterialRemovalRate(value: Option[Double] = None,
                                  unit: String = bacterialRemovalRateUnits.headOption.getOrElse("%")) extends ValueUnit

  /**
   * Miscellaneous removals
   * @param tss the value of TSS removal. Default value and units are 0.
   * @param bod5 the value of BOD,,5,, removal. Default value and units are 0.
   * @param nh3n the value of NH,,3,,-N removal. Default value and units are 0.
   * @param tp the value of TP removal. Default value and units are 0.
   * @param fecalColiform the value of fecal coliform removal. Default value and units are 0.
   * @param enterococci the value of enterococci removal. Default value and units are 0.
   */
  case class MiscellaneousRemovals(tss: TSSRemoval = TSSRemoval(),
                                   bod5: BOD5Removal = BOD5Removal(),
                                   nh3n: NH3NRemoval = NH3NRemoval(),
                                   tp: TPRemoval = TPRemoval(),
                                   fecalColiform: FecalColiformRemoval = FecalColiformRemoval(),
                                   enterococci: EnterococciRemoval = EnterococciRemoval())

}
