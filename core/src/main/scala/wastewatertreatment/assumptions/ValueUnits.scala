package wastewatertreatment.assumptions

import wastewatertreatment.valueunit.ValueUnit

/**
 * Created by kasonchan on 11/13/15.
 */
trait ValueUnits extends Assumptions with Units {

  /**
   * BOD,,5,,/cBOD,,5,,.
   * @param value Default value is '''1.10'''.
   * @param unit Default is '''No unit'''.
   */
  case class BOD5CBOD5Ratio(value: Double = bod5cBOD5Ratio,
                            unit: String = bod5cBOD5RatioUnits.headOption.getOrElse("")) extends ValueUnit

  /**
   * COD/BOD.
   * @param value Default value is '''1.60'''.
   * @param unit Default is '''No unit'''.
   */
  case class CODBODRatio(value: Double = codBODRatio,
                         unit: String = codBODRatioUnits.headOption.getOrElse("")) extends ValueUnit

  /**
   * COD/VSS.
   * @param value Default value is '''1.42'''.
   * @param unit Default is '''No unit'''.
   */
  case class CODVSSRatio(value: Double = codVSSRatio,
                         unit: String = codVSSRatioUnits.headOption.getOrElse("")) extends ValueUnit

  /**
   * VSS/TSS.
   * @param value Default value is '''0.80'''.
   * @param unit Default is '''No unit'''.
   */
  case class VSSTSSRatio(value: Double = vssTSSRatio,
                         unit: String = vssTSSRatioUnits.headOption.getOrElse("")) extends ValueUnit

  /**
   * TN.
   * @param value Default value is '''0.40'''.
   * @param unit Default is '''g/m^3^'''.
   */
  case class TN(value: Double = tn,
                unit: String = tnUnits.headOption.getOrElse("g/m^3")) extends ValueUnit

  /**
   * Biodegradable VSS (bVSS/VSS).
   * @param value Default value is '''0.80'''.
   * @param unit Default is '''No unit'''.
   */
  case class BVSS(value: Double = bVSS,
                  unit: String = bVSSVSSRatioUnits.headOption.getOrElse("")) extends ValueUnit

  /**
   * Non biodegradable VSS (nbVSS/VSS).
   * @param value Default value is '''0.20'''.
   * @param unit Default is '''No unit'''.
   */
  case class NbVSS(value: Double = nbVSS,
                   unit: String = nbVSSVSSRatioUnits.headOption.getOrElse("")) extends ValueUnit

}
