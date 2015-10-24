package demo

import objects.pretreatment.Screen._

/**
 * Created by ka-son on 10/24/15.
 */
object Screen extends App {

  // Assumed
  val TSSRemoval = 0.27
  val BOD5Removal = 0.27
  val Q = 1090195

  // Input
  val TSSo = 223
  val BOD5o = 257.5

  // Assumptions
  val BOD5_cBOD5 = 1.1
  val COD_BOD = 1.6
  val COD_VSS = 1.42
  val VSS_TSS = 0.8

  println("Assumed")
  println(TSSRemoval)
  println(BOD5Removal)
  println(Q)

  println()

  println("Input")
  println(TSSo)
  val TSSe = calTSSe(TSSo, TSSRemoval)
  println(TSSe)
  println(BOD5o)
  val BOD5e = calBOD5e(BOD5o, BOD5Removal)
  println(BOD5e)

  println()

  println("Assumptions")
  println(BOD5_cBOD5)
  println(COD_BOD)
  println(COD_VSS)
  println(VSS_TSS)

  println()

  val VSSe = calVSSe(TSSe, VSS_TSS)
  println(VSSe)
  val cBOD5e = calcBOD5e(BOD5e, BOD5_cBOD5)
  println(cBOD5e)
  val bCODe = calbCODe(BOD5e, COD_BOD)
  println(bCODe)
  val bCODpe = calbCODpe(VSSe, COD_VSS, VSS_TSS)
  println(bCODpe)
  val bCODs = calbCODs(bCODe, bCODpe)
  println(bCODs)
  val p = calP(Q, VSSe)
  println(p)

}
