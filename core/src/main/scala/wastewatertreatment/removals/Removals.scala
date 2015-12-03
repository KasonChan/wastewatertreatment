package wastewatertreatment.removals

/**
 * A case class to represents all the default removals.
 * @param tssRemoval the value of TSS removal. Default value is 0.00.
 * @param bod5Removal the value of BOD,,5,, removal. Default value is 0.00.
 * @param nh3nRemoval the value of NH,,3,,-N removal. Default value is 0.00.
 * @param tpRemoval the value of TP removal. Default value is 0.00.
 * @param fecalColiformRemoval the value of fecal coliform removal. Default value is 0.00.
 * @param enterococciRemoval the value of enterococci removal. Default value is 0.00.
 */
case class Removals(tssRemoval: Option[Double] = None,
                    bod5Removal: Option[Double] = None,
                    nh3nRemoval: Option[Double] = None,
                    tpRemoval: Option[Double] = None,
                    fecalColiformRemoval: Option[Double] = None,
                    enterococciRemoval: Option[Double] = None)
