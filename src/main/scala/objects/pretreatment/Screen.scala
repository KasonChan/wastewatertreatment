package objects.pretreatment

/**
 * Created by ka-son on 10/24/15.
 */
object Screen {

  val bod5_cBOD5 = 1.1
  val cod_bod = 1.6
  val cod_vss = 1.42
  val vss_tss = 0.8

  def calTSSe(TSSo: Double, TSSRemoval: Double): Double = {
    TSSo * (1 - TSSRemoval)
  }

  def calBOD5e(BOD5o: Double, BOD5Removal: Double): Double = {
    BOD5o * (1 - BOD5Removal)
  }

  def calVSSe(TSSe: Double, vss_tss: Double = vss_tss): Double = {
    TSSe * vss_tss
  }

  def calcBOD5e(BOD5e: Double, bod5_cBOD5: Double = bod5_cBOD5): Double = {
    BOD5e / bod5_cBOD5
  }

  def calbCODe(BOD5e: Double, cod_bod: Double = cod_bod): Double = {
    BOD5e * cod_bod
  }

  def calbCODpe(VSSe: Double, cod_vss: Double = cod_vss, vss_tss: Double = vss_tss): Double = {
    VSSe * cod_vss * vss_tss
  }

  def calbCODs(bCODe: Double, bCODpe: Double): Double = {
    bCODe - bCODpe
  }

  def calP(Q: Double, VSSe: Double): Double = {
    Q * VSSe
  }

}
