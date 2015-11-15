package wastewatertreatment.assumptions

/**
 * Created by kasonchan on 11/13/15.
 */
object Assumptions {

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
   * TN = 40.00g/m^3^.
   */
  val tn = 40.00

  /**
   * Biodegradable VSS (bVSS/VSS) = 0.80.
   */
  val bVSS = 0.80

  /**
   * Non biodegradable VSS (nbVSS/VSS) = 0.20.
   */
  val nbVSS = 1 - bVSS

}
