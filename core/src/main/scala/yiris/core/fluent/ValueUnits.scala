package yiris.core.fluent

import yiris.core.valueunit.ValueUnit

/**
 * A trait contains all default fluent values and units.
 */
trait ValueUnits extends Units {

  /**
   * Q.
   * @param unit Default is '''m^3^/d'''.
   */
  case class Q(value: Option[Double] = None,
               unit: String = qUnits.drop(1).headOption.getOrElse("m^3/d")) extends ValueUnit

  /**
   * TSS.
   * @param unit Default is '''g/m^3^'''.
   */
  case class TSS(value: Option[Double] = None,
                 unit: String = tssUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

  /**
   * VSS.
   * @param unit Default is '''g/m^3^'''.
   */
  case class VSS(value: Option[Double] = None,
                 unit: String = vssUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

  /**
   * BOD,,5,,.
   * @param unit Default is '''g/m^3^'''.
   */
  case class BOD5(value: Option[Double] = None,
                  unit: String = bod5Units.headOption.getOrElse("g/m^3")) extends ValueUnit

  /**
   * cBOD,,5,,.
   * @param unit Default is '''g/m^3^'''.
   */
  case class CBOD5(value: Option[Double] = None,
                   unit: String = cBOD5Units.headOption.getOrElse("g/m^3")) extends ValueUnit

  /**
   * bCOD.
   * @param unit Default is '''g/m^3^'''.
   */
  case class BCOD(value: Option[Double] = None,
                  unit: String = bCODUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

  /**
   * bCODs.
   * @param unit Default is '''g/m^3^'''.
   */
  case class BCODs(value: Option[Double] = None,
                   unit: String = bCODsUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

  /**
   * bCODp.
   * @param unit Default is '''g/m^3^'''.
   */
  case class BCODp(value: Option[Double] = None,
                   unit: String = bCODpUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

  /**
   * NH,,3,,-N.
   * @param unit Default is '''g/m^3^'''.
   */
  case class NH3N(value: Option[Double] = None,
                  unit: String = nh3nUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

  /**
   * TP.
   * @param unit Default is '''g/m^3^'''.
   */
  case class TP(value: Option[Double] = None,
                unit: String = tpUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

  /**
   * P.
   * @param unit Default is '''g-TSS/d'''.
   */
  case class P(value: Option[Double] = None,
               unit: String = pUnits.headOption.getOrElse("g-TSS/d")) extends ValueUnit

  /**
   * Fecal Coliform.
   * @param unit Default is '''MPN/100mL'''.
   */
  case class FecalColiform(value: Option[Double] = None,
                           unit: String = fecalColiformUnits.headOption.getOrElse("MPN/100mL")) extends ValueUnit

  /**
   * Enterococci.
   * @param unit Default is '''MPN/100mL'''.
   */
  case class Enterococci(value: Option[Double] = None,
                         unit: String = fecalColiformUnits.headOption.getOrElse("MPN/100mL")) extends ValueUnit

  /**
   * Turbidity.
   * @param unit Default is '''MPN/100mL'''.
   */
  case class Turbidity(value: Option[Double] = None,
                       unit: String = hazeUnits.headOption.getOrElse("MPN/100mL")) extends ValueUnit

  /**
   * Miscellaneous fluent
   * @param flow the value of flow. Default value and unit are 0m^3^/d.
   * @param tss the value of TSS. Default value and unit are 0g/m^3^.
   * @param vss the value of VSS. Default value and unit are 0g/m^3^.
   * @param bod5 the value of bod5. Default value and unit are 0g/m^3^.
   * @param cBOD5 the value of cBOD5. Default value and unit are 0g/m^3^.
   * @param bCOD the value of bCOD. Default value and unit are 0g/m^3^.
   * @param bCODs the value of bCODs. Default value and unit are 0g/m^3^.
   * @param bCODp the value of bCODp. Default value and unit are 0g/m^3^.
   * @param nh3n the value NH,,3,,-N. Default value and unit are 0g/m^3^.
   * @param tp the value of TP. Default value and unit are 0g/m^3^.
   * @param p the value of P. Default value and unit are 0g-TSS/d
   * @param fecalColiform the value of fecal coliform.  Default value and unit are 0MPN/100mL.
   * @param enterococci the value of enterococci. Default value and unit are 0MPN/100mL.
   * @param turbidity the value of turbidity. Default value and unit are 0MPN/100mL.
   */
  case class MiscellaneousFluent(flow: Q = Q(),
                                 tss: TSS = TSS(),
                                 vss: VSS = VSS(),
                                 bod5: BOD5 = BOD5(),
                                 cBOD5: CBOD5 = CBOD5(),
                                 bCOD: BCOD = BCOD(),
                                 bCODs: BCODs = BCODs(),
                                 bCODp: BCODp = BCODp(),
                                 nh3n: NH3N = NH3N(),
                                 tp: TP = TP(),
                                 p: P = P(),
                                 fecalColiform: FecalColiform = FecalColiform(),
                                 enterococci: Enterococci = Enterococci(),
                                 turbidity: Turbidity = Turbidity())

}
