package yiris.core.fluent

/**
 * A trait to represents the default fluent.
 */
trait Fluent {

  /**
   * A case class to represents the default fluent.
   * @param flow the value of flow. Default value is 0.00.
   * @param tss the value of TSS. Default value is 0.00.
   * @param vss the value of VSS. Default value is 0.00.
   * @param bod5 the value of bod5. Default value is 0.00.
   * @param cBOD5 the value of cBOD5. Default value is 0.00.
   * @param bCOD the value of bCOD. Default value is 0.00.
   * @param bCODs the value of bCODs. Default value is 0.00.
   * @param bCODp the value of bCODp. Default value is 0.00.
   * @param nh3n the value NH,,3,,-N. Default value is 0.00.
   * @param tp the value of TP. Default value is 0.00.
   * @param p the value of P. Default value is 0.00.
   * @param fecalColiform the value of fecal coliform. Default value is 0.00.
   * @param enterococci the value of enterococci. Default value is 0.00.
   * @param turbidity the value of turbidity. Default value is 0.00.
   */
  case class Fluent(flow: Option[Double] = None,
                    tss: Option[Double] = None,
                    vss: Option[Double] = None,
                    bod5: Option[Double] = None,
                    cBOD5: Option[Double] = None,
                    bCOD: Option[Double] = None,
                    bCODs: Option[Double] = None,
                    bCODp: Option[Double] = None,
                    nh3n: Option[Double] = None,
                    tp: Option[Double] = None,
                    p: Option[Double] = None,
                    fecalColiform: Option[Double] = None,
                    enterococci: Option[Double] = None,
                    turbidity: Option[Double] = None)

}