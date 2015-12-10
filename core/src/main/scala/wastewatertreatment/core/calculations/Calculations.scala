package wastewatertreatment.core.calculations

import equations.massbalance.MassBalance.{MX, solveMX}
import equations.monooperation.MonoOperation.solveM
import wastewatertreatment.core.fluent.Fluent
import wastewatertreatment.core.ratios.Ratios
import wastewatertreatment.core.removals.Removals

/**
 * Created by kasonchan on 11/15/15.
 */
trait Calculations extends Fluent with Ratios with Removals {

  /**
   * Returns the value of effluent constituent.
   * {{{
   *   Qo * Xo + ... = Qe * Xe + ...
   * }}}
   * @param inputs the list of inputs.
   * @param outputs the list of outputs.
   */
  def calMX(inputs: List[MX], outputs: List[MX]): Option[Double] = {
    inputs.headOption.getOrElse(MX(None, None, None)) match {
      case MX(_, x: Option[Double], None) => x
      case MX(_, _, Some(_)) => solveMX(inputs, outputs)
      case _ => None
    }
  }

  /**
   * Returns VSS or TSS.
   * {{{
   *   VSS = TSS * vssTSSRatio
   * }}}
   * @param VSS the initial value of VSS. Default value is 0.00.
   * @param TSS the initial value of TSS. Default value is 0.00.
   * @param vssTSS VSS/TSS. Default value and unit are 0.80.
   */
  def calVSSTSS(VSS: Option[Double] = None,
                TSS: Option[Double] = None,
                vssTSS: Option[Double] = Some(vssTSSRatio)): Option[Double] = {
    require(VSS.getOrElse(0.0) >= 0 &&
      TSS.getOrElse(0.0) >= 0 &&
      vssTSS.getOrElse(0.0) >= 0)
    val r = solveM(List(VSS), List(TSS, vssTSS), 'multiple)
    r
  }

  /**
   * Returns cBOD,,5,, or BOD,,5,,.
   * {{{
   *   cBOD5 * bod5cBOD5Ratio = BOD5
   * }}}
   * @param cBOD5 the initial value of cBOD,,5,,. Default value is 0.00.
   * @param bod5cBOD5 BOD,,5,,/cBOD,,5,,. Default value and unit are 1.10.
   * @param BOD5 the initial value of BOD,,5,,. Default value is 0.00.
   */
  def calcBOD5BOD5(cBOD5: Option[Double] = None,
                   bod5cBOD5: Option[Double] = Some(bod5cBOD5Ratio),
                   BOD5: Option[Double] = None): Option[Double] = {
    require(cBOD5.getOrElse(0.0) >= 0 &&
      bod5cBOD5.getOrElse(0.0) > 0 &&
      BOD5.getOrElse(0.0) >= 0)
    val r = solveM(List(cBOD5, bod5cBOD5), List(BOD5), 'multiple)
    r
  }

  /**
   * Returns bCOD or BOD,,5,,.
   * {{{
   *   bCOD = BOD5 * codBODRatio
   * }}}
   * @param bCOD the initial value of bCOD. Default value is 0.00.
   * @param BOD5 the initial value of BOD,,5,,. Default value is 0.00
   * @param codBOD COD/BOD. Default value and unit are 1.60.
   */
  def calbCODBOD5(bCOD: Option[Double] = None,
                  BOD5: Option[Double] = None,
                  codBOD: Option[Double] = Some(codBODRatio)): Option[Double] = {
    require(bCOD.getOrElse(0.0) >= 0 &&
      BOD5.getOrElse(0.0) >= 0 &&
      codBOD.getOrElse(0.0) >= 0)
    val r = solveM(List(bCOD), List(BOD5, codBOD), 'multiple)
    r
  }

  /**
   * Returns bCODp or VSS.
   * {{{
   *   bCODp = VSS * codVSSRatio * bvssVSSRatio
   * }}}
   * @param bCODp the initial value of cBODp. Default value is 0.00.
   * @param VSS the initial value of VSS. Default value is 0.00
   * @param codVSS COD/VSS. Default value and unit are 1.42.
   * @param bvssVSS bVSS/VSS. Default value and unit are 0.80.
   */
  def calbCODpVSS(bCODp: Option[Double] = None,
                  VSS: Option[Double] = None,
                  codVSS: Option[Double] = Some(codVSSRatio),
                  bvssVSS: Option[Double] = Some(bvssVSSRatio)): Option[Double] = {
    require(bCODp.getOrElse(0.0) >= 0 &&
      VSS.getOrElse(0.0) >= 0 &&
      codVSS.getOrElse(0.0) >= 0 &&
      bvssVSS.getOrElse(0.0) >= 0)
    val r = solveM(List(bCODp), List(VSS, codVSS, bvssVSS), 'multiple)
    r
  }

  /**
   * Returns bCODs or bCOD or bCODp.
   * {{{
   *   bCODs = bCOD - bCODp
   * }}}
   * @param bCODs the initial value of bCOD. Default value is 0.00.
   * @param bCOD the initial value of bCOD. Default value is 0.00.
   * @param bCODp the initial value of bCODp. Default value is 0.00.
   */
  def calbCODsbCODpbCOD(bCODs: Option[Double] = None,
                        bCODp: Option[Double] = None,
                        bCOD: Option[Double] = None): Option[Double] = {
    require(bCODs.getOrElse(0.0) >= 0 &&
      bCODp.getOrElse(0.0) >= 0 &&
      bCOD.getOrElse(0.0) >= 0)
    val r = solveM(List(bCODs, bCODp), List(bCOD), 'add)
    r
  }

  /**
   * Returns P, Q or TSS.
   * {{{
   *   P = Q * TSS
   * }}}
   * @param P the initial value of Q. Default value is 0.00.
   * @param Q the initial value of Q. Default value is 0.00.
   * @param TSS the initial value of TSS. Default value is 0.00.
   */
  def calPQTSS(P: Option[Double] = None,
               Q: Option[Double] = None,
               TSS: Option[Double] = None): Option[Double] = {
    require(P.getOrElse(0.0) >= 0 &&
      Q.getOrElse(0.0) >= 0 &&
      TSS.getOrElse(0.0) >= 0)
    val r = solveM(List(P), List(Q, TSS), 'multiple)
    r
  }

  /**
   * Returns percentage value.
   * {{{
   *   X = X * percentage
   * }}}
   * @param X the initial value of X.
   * @param percentage the percentage of the effluent of X.
   */
  def calXPercentage(X: Option[Double] = None,
                     percentage: Option[Double]): Option[Double] = {
    require(X.getOrElse(0.0) >= 0 &&
      percentage.getOrElse(0.0) >= 0)
    val r = solveM(List(None, Some(100)), List(X, percentage), 'multiple)
    r
  }

  /**
   * Returns NTU or TSS.
   * {{{
   *   NTU = TSS * NTU/TSS
   * }}}
   * @param NTU the effluent value of NTU. Default value is 0.00.
   * @param TSS the effluent value of TSS. Default value is 0.00.
   * @param ntuTSS NTU/TSS. Default value and unit are 0.50.
   */
  def calNTUTSS(NTU: Option[Double] = None,
                TSS: Option[Double] = None,
                ntuTSS: Option[Double] = Some(ntuTSSRatio)): Option[Double] = {
    require(NTU.getOrElse(0.0) >= 0 &&
      TSS.getOrElse(0.0) >= 0 &&
      ntuTSS.getOrElse(0.0) >= 0)
    val r = solveM(List(NTU), List(TSS, ntuTSS), 'multiple)
    r
  }

  def cal(influents: List[Fluent],
          effluents: List[Fluent],
          ratios: Ratios,
          removals: Removals): (List[Fluent], List[Fluent]) = {
    effluents.length match {
      case 1 =>
        val influent = influents(0)

        val qo = influent.flow
        val tsso = influent.tss
        val vsso = influent.vss match {
          case None => calVSSTSS(TSS = tsso, vssTSS = ratios.vssTSS)
          case s@Some(x) => s
        }
        val bod5o = influent.bod5 match {
          case None => calcBOD5BOD5(cBOD5 = influent.cBOD5, bod5cBOD5 = ratios.bod5cBOD5)
          case s@Some(x) => s
        }
        val cBOD5o = influent.cBOD5
        val bCODo = influent.bCOD match {
          case None => calbCODBOD5(BOD5 = bod5o, codBOD = ratios.codBOD)
          case s@Some(x) => s
        }
        val bCODpo = influent.bCODp match {
          case None => calbCODpVSS(VSS = vsso, codVSS = ratios.codVSS, bvssVSS = ratios.bvssVSS)
          case s@Some(x) => s
        }
        val bCODso = influent.bCODs match {
          case None => calbCODsbCODpbCOD(bCODp = bCODpo, bCOD = bCODo)
          case s@Some(x) => s
        }
        val nh3no = influent.nh3n
        val tpo = influent.tp
        val po = influent.p match {
          case None => calPQTSS(Q = qo, TSS = tsso)
          case s@Some(x) => s
        }
        val fecalColiformo = influent.fecalColiform
        val enterococcio = influent.enterococci
        val turbido = influent.turbidity match {
          case None => calNTUTSS(TSS = tsso, ntuTSS = ratios.ntuTSS)
          case s@Some(x) => s
        }

        val i = Fluent(qo,
          tsso,
          vsso,
          bod5o,
          cBOD5o,
          bCODo,
          bCODso,
          bCODpo,
          nh3no,
          tpo,
          po,
          fecalColiformo,
          enterococcio,
          turbido)

        val qe = qo
        val tsse = calMX(List(MX(qo, tsso, removals.tss)),
          List(MX(qe, None)))
        val vsse = calVSSTSS(TSS = tsse, vssTSS = ratios.vssTSS)
        val bod5e = calMX(List(MX(qo, bod5o, removals.bod5)),
          List(MX(qe, None)))
        val cBOD5e = calcBOD5BOD5(BOD5 = bod5e, bod5cBOD5 = ratios.bod5cBOD5)
        val bCODe = calbCODBOD5(BOD5 = bod5e, codBOD = ratios.codBOD)
        val bCODpe = calbCODpVSS(VSS = vsse, codVSS = ratios.codVSS, bvssVSS = ratios.bvssVSS)
        val bCODse = calbCODsbCODpbCOD(bCODp = bCODpe, bCOD = bCODe)
        val nh3ne = calMX(List(MX(qo, nh3no, removals.nh3n)),
          List(MX(qe, None)))
        val tpe = calMX(List(MX(qo, tpo, removals.tp)),
          List(MX(qe, None)))
        val pe = calPQTSS(Q = qe, TSS = tsse)
        val fecalColiforme = calMX(List(MX(qo, fecalColiformo, removals.fecalColiform)),
          List(MX(qe, None)))
        val enterococcie = calMX(List(MX(qo, enterococcio, removals.enterococci)),
          List(MX(qe, None)))
        val turbide = calNTUTSS(TSS = tsse, ntuTSS = ratios.ntuTSS)

        val e = Fluent(qe,
          tsse,
          vsse,
          bod5e,
          cBOD5e,
          bCODe,
          bCODse,
          bCODpe,
          nh3ne,
          tpe,
          pe,
          fecalColiforme,
          enterococcie,
          turbide)

        (List(i), List(e))
      case _ =>
        (List(), List())
    }
  }

}
