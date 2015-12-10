package wastewatertreatment.core.ratios

/**
 * A trait to represents all the default ratios.
 */
trait Ratios {

  /**
   * BOD5,,c,,/cBOD,,5,, = 1.10.
   */
  val bod5cBOD5Ratio = 1.10

  /**
   * COD/BOD = 1.60.
   */
  val codBODRatio = 1.60

  /**
   * COD/VSS = 1.42.
   */
  val codVSSRatio = 1.42

  /**
   * VSS/TSS = 0.80.
   */
  val vssTSSRatio = 0.80

  /**
   * Biodegradable VSS (bVSS/VSS) = 0.80.
   */
  val bvssVSSRatio = 0.80

  /**
   * Non biodegradable VSS (nbVSS/VSS) = 0.20.
   */
  val nbvssVSSRatio = 0.20

  /**
   * NTU/TSS = 0.50.
   */
  val ntuTSSRatio = 0.50

  /**
   * P/VSS = 0.02.
   */
  val pVSSRatio = 0.02

  /**
   * A case class to represents all the default ratios.
   * @param bod5cBOD5 the value of BOD,,5,,/cBOD,,5,,. Default value is 1.10.
   * @param codBOD the value of COD/BOD. Default value is 1.60.
   * @param codVSS the value of COD/VSS. Default value is 1.42.
   * @param vssTSS the value of VSS/TSS. Default value is 0.80.
   * @param bvssVSS the value of bVSS/VSS. Default value is 0.80.
   * @param nbvssVSS the value of nbVSS/VSS. Default value is 0.20.
   * @param ntuTSS the value of NTU/TSS. Default value is 0.50.
   * @param pVSS the value of P/VSS. Default value is 0.02.
   */
  case class Ratios(bod5cBOD5: Option[Double] = Some(bod5cBOD5Ratio),
                    codBOD: Option[Double] = Some(codBODRatio),
                    codVSS: Option[Double] = Some(codVSSRatio),
                    vssTSS: Option[Double] = Some(vssTSSRatio),
                    bvssVSS: Option[Double] = Some(bvssVSSRatio),
                    nbvssVSS: Option[Double] = Some(nbvssVSSRatio),
                    ntuTSS: Option[Double] = Some(ntuTSSRatio),
                    pVSS: Option[Double] = Some(pVSSRatio))

}