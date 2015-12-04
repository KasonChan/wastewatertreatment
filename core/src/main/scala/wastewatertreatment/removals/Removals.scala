package wastewatertreatment.removals

/**
 * A trait to represents all the default removals.
 */
trait Removals {

  /**
   * A case class to represents all the default removals.
   * @param tss the value of TSS removal. Default value is 0.00.
   * @param bod5 the value of BOD,,5,, removal. Default value is 0.00.
   * @param nh3n the value of NH,,3,,-N removal. Default value is 0.00.
   * @param tp the value of TP removal. Default value is 0.00.
   * @param fecalColiform the value of fecal coliform removal. Default value is 0.00.
   * @param enterococci the value of enterococci removal. Default value is 0.00.
   */
  case class Removals(tss: Option[Double] = None,
                      bod5: Option[Double] = None,
                      nh3n: Option[Double] = None,
                      tp: Option[Double] = None,
                      fecalColiform: Option[Double] = None,
                      enterococci: Option[Double] = None)

}