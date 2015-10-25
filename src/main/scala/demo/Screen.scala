package demo

import objects.pretreatment.Screen._

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

  // Assumptions
  val bod5_cbod5 = 1.1
  val cod_bod = 1.6
  val cod_vss = 1.42
  val vss_tss = 0.8

  println("Assumed")
  println(tssRemoval)
  println(bod5Removal)
  println(q)

  println()

  println("Input")
  println(tssO)
  val tssE = calTSSe(tssO, tssRemoval)
  println(tssE)
  println(bod5O)
  val bod5E = calBOD5e(bod5O, bod5Removal)
  println(bod5E)

  println()

  println("Assumptions")
  println(bod5_cbod5)
  println(cod_bod)
  println(cod_vss)
  println(vss_tss)

  println()

  val vssE = calVSSe(tssE, vss_tss)
  println(vssE)
  val cBOD5e = calcBOD5e(bod5E, bod5_cbod5)
  println(cBOD5e)
  val bCODe = calbCODe(bod5E, cod_bod)
  println(bCODe)
  val bCODpe = calbCODpe(vssE, cod_vss, vss_tss)
  println(bCODpe)
  val bCODs = calbCODs(bCODe, bCODpe)
  println(bCODs)
  val p = calP(q, vssE)
  println(p)

}
