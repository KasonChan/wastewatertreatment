package objects.pretreatment

/**
 * Created by ka-son on 10/24/15.
 */
object Screen {

  val bod5cBOD5Ratio = 1.1
  val codBODRatio = 1.6
  val codVSSRatio = 1.42
  val vssTSSRatio = 0.8

  def calTSSe(TSSo: Double, TSSRemoval: Double): Double = {
    TSSo * (100 - TSSRemoval) / 100
  }

  def calBOD5e(BOD5o: Double, BOD5Removal: Double): Double = {
    BOD5o * (100 - BOD5Removal) / 100
  }

  def calVSSe(TSSe: Double, VSS_TSS: Double = vssTSSRatio): Double = {
    TSSe * VSS_TSS
  }

  def calcBOD5e(BOD5e: Double, BOD5_cBOD5: Double = bod5cBOD5Ratio): Double = {
    BOD5e / BOD5_cBOD5
  }

  def calbCODe(BOD5e: Double, COD_BOD: Double = codBODRatio): Double = {
    BOD5e * COD_BOD
  }

  def calbCODpe(VSSe: Double, COD_VSS: Double = codVSSRatio, VSS_TSS: Double = vssTSSRatio): Double = {
    VSSe * COD_VSS * VSS_TSS
  }

  def calbCODs(bCODe: Double, bCODpe: Double): Double = {
    bCODe - bCODpe
  }

  def calP(Q: Double, VSSe: Double): Double = {
    Q * VSSe
  }

}
