package wastewatertreatment.core.ratios

import wastewatertreatment.core.valueunit.ValueUnit

/**
 * A trait contains all default ratio values and units.
 */
trait ValueUnits extends Ratios with Units {

  /**
   * BOD,,5,,/cBOD,,5,,.
   * @param value Default value is '''1.10'''.
   * @param unit Default is '''No unit'''.
   */
  case class BOD5CBOD5Ratio(value: Option[Double] = Some(bod5cBOD5Ratio),
                            unit: String = bod5cBOD5RatioUnits.headOption.getOrElse("")) extends ValueUnit

  /**
   * COD/BOD.
   * @param value Default value is '''1.60'''.
   * @param unit Default is '''No unit'''.
   */
  case class CODBODRatio(value: Option[Double] = Some(codBODRatio),
                         unit: String = codBODRatioUnits.headOption.getOrElse("")) extends ValueUnit

  /**
   * COD/VSS.
   * @param value Default value is '''1.42'''.
   * @param unit Default is '''No unit'''.
   */
  case class CODVSSRatio(value: Option[Double] = Some(codVSSRatio),
                         unit: String = codVSSRatioUnits.headOption.getOrElse("")) extends ValueUnit

  /**
   * VSS/TSS.
   * @param value Default value is '''0.80'''.
   * @param unit Default is '''No unit'''.
   */
  case class VSSTSSRatio(value: Option[Double] = Some(vssTSSRatio),
                         unit: String = vssTSSRatioUnits.headOption.getOrElse("")) extends ValueUnit

  /**
   * Biodegradable VSS (bVSS/VSS).
   * @param value Default value is '''0.80'''.
   * @param unit Default is '''No unit'''.
   */
  case class BVSSVSSRatio(value: Option[Double] = Some(bvssVSSRatio),
                          unit: String = bvssVSSRatioUnits.headOption.getOrElse("")) extends ValueUnit

  /**
   * Non biodegradable VSS (nbVSS/VSS).
   * @param value Default value is '''0.20'''.
   * @param unit Default is '''No unit'''.
   */
  case class NBVSSVSSRatio(value: Option[Double] = Some(nbvssVSSRatio),
                           unit: String = nbvssVSSRatioUnits.headOption.getOrElse("")) extends ValueUnit

  /**
   * NTU/TSS.
   * @param value Default value is '''0.50'''.
   * @param unit Default is '''No unit'''.
   */
  case class NTUTSSRatio(value: Option[Double] = Some(ntuTSSRatio),
                         unit: String = ntuTSSRatioUnits.headOption.getOrElse("")) extends ValueUnit

  /**
   * P/VSS.
   * @param value Default value is '''0.02'''.
   * @param unit Default is '''No unit'''.
   */
  case class PVSSRatio(value: Option[Double] = Some(pVSSRatio),
                       unit: String = pVSSRatioUnits.headOption.getOrElse("")) extends ValueUnit

  /**
   * Miscellaneous ratios
   * @param bod5CBOD5 the value of BOD,,5,,/cBOD. Default value and units are 1.10.
   * @param codBOD the value of COD/BOD. Default value and units are 1.60.
   * @param codVSS the value of COD/VSS. Default value and units are 1.42.
   * @param vssTSS the value of VSS/TSS. Default value and units are 0.80.
   * @param bvssVSS the value of bVSS/VSS. Default value and units are 0.80.
   * @param nbvssVSS the value of nbVSS/VSS. Default value and units are 0.20.
   * @param ntuTSS the value of NTU/VSS. Default value and units are 0.50.
   * @param pVSS the value of P/VSS. Default value and units are 0.02.
   */
  case class MiscellaneousRatios(bod5CBOD5: BOD5CBOD5Ratio = BOD5CBOD5Ratio(),
                                 codBOD: CODBODRatio = CODBODRatio(),
                                 codVSS: CODVSSRatio = CODVSSRatio(),
                                 vssTSS: VSSTSSRatio = VSSTSSRatio(),
                                 bvssVSS: BVSSVSSRatio = BVSSVSSRatio(),
                                 nbvssVSS: NBVSSVSSRatio = NBVSSVSSRatio(),
                                 ntuTSS: NTUTSSRatio = NTUTSSRatio(),
                                 pVSS: PVSSRatio = PVSSRatio())

}
