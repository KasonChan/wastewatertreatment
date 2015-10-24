package objects.pretreatment

/**
 * Created by ka-son on 10/24/15.
 */
object Screen {

  val BOD5_cBOD5 = 1.1
  val COD_BOD = 1.6
  val COD_VSS = 1.42
  val VSS_TSS = 0.8

  def calTSSe(TSSo: Double, TSSRemoval: Double): Double = {
    TSSo * (1 - TSSRemoval)
  }

  def calBOD5e(BOD5o: Double, BOD5Removal: Double): Double = {
    BOD5o * (1 - BOD5Removal)
  }

  def calVSSe(TSSe: Double, VSS_TSS: Double = VSS_TSS): Double = {
    TSSe * VSS_TSS
  }

  def calcBOD5e(BOD5e: Double, BOD5_cBOD5: Double = BOD5_cBOD5): Double = {
    BOD5e / BOD5_cBOD5
  }

  def calbCODe(BOD5e: Double, COD_BOD: Double = COD_BOD): Double = {
    BOD5e * COD_BOD
  }

  def calbCODpe(VSSe: Double, COD_VSS: Double = COD_VSS, VSS_TSS: Double = VSS_TSS): Double = {
    VSSe * COD_VSS * VSS_TSS
  }

  def calbCODs(bCODe: Double, bCODpe: Double): Double = {
    bCODe - bCODpe
  }

  def calP(Q: Double, VSSe: Double): Double = {
    Q * VSSe
  }

}
