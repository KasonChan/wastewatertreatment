package demo

import io.Output
import objects.pretreatment.Screen._
import valueunit.Unit._

/**
 * Created by ka-son on 10/24/15.
 */
object Screen extends App {

  // Assumed
  val tssRemoval = 0.27
  val bod5Removal = 0.27
  val q = 1090195

  // Input
  val tssO = 223
  val bod5O = 257.5

  println("Assumed")
  Output(tssRemoval, tssRemovalUnits.head)
  Output(bod5Removal, bod5RemovalUnits.head)
  Output(q, qUnits.head)

  println()

  println("Input")
  Output(tssO, tssOUnits.head)
  val tssE = calTSSe(tssO, tssRemoval)
  Output(tssE, tssEUnits.head)
  Output(bod5O, bod5OUnits.head)
  val bod5E = calBOD5e(bod5O, bod5Removal)
  Output(bod5E, bod5EUnits.head)

  println()

  println("Assumptions")
  Output(bod5cBOD5Ratio, bod5cBOD5Units.head)
  Output(codBODRatio, codBODUnits.head)
  Output(codVSSRatio, codVSSUnits.head)
  Output(vssTSSRatio, vssTSSUnits.head)

  println()

  val vssE = calVSSe(tssE, vssTSSRatio)
  Output(vssE, vsseUnits.head)
  val cBOD5e = calcBOD5e(bod5E, bod5cBOD5Ratio)
  Output(cBOD5e, cBOD5eUnits.head)
  val bCODe = calbCODe(bod5E, codBODRatio)
  Output(bCODe, bCODeUnits.head)
  val bCODpe = calbCODpe(vssE, codVSSRatio, vssTSSRatio)
  Output(bCODpe, bCODpeUnits.head)
  val bCODs = calbCODs(bCODe, bCODpe)
  Output(bCODs, bCODsUnits.head)
  val p = calP(q, vssE)
  Output(p, pUnits.head)

}
