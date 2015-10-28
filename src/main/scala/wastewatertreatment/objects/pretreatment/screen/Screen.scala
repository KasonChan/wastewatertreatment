package wastewatertreatment.objects.pretreatment.screen

import wastewatertreatment.helper.Helper.to2Decimals

/**
 * Created by ka-son on 10/24/15.
 */
object Screen {

  val bod5cBOD5Ratio = 1.1
  val codBODRatio = 1.6
  val codVSSRatio = 1.42
  val vssTSSRatio = 0.8

  val minValue = 0.0
  val maxValue = 1000000.0

  val minPercent = 0.0
  val maxPercent = 100.0

  def calTSSe(TSSo: Double, TSSRemoval: Double): Double = {
    require(TSSo >= 0 && TSSRemoval >= 0)
    val r = TSSo * (100 - TSSRemoval) / 100
    to2Decimals(r)
  }

  def calBOD5e(BOD5o: Double, BOD5Removal: Double): Double = {
    require(BOD5o >= 0 && BOD5Removal >= 0)
    val r = BOD5o * (100 - BOD5Removal) / 100
    to2Decimals(r)
  }

  def calVSSe(TSSe: Double, VSS_TSS: Double = vssTSSRatio): Double = {
    require(TSSe >= 0 && VSS_TSS >= 0)
    val r = TSSe * VSS_TSS
    to2Decimals(r)
  }

  def calcBOD5e(BOD5e: Double, BOD5_cBOD5: Double = bod5cBOD5Ratio): Double = {
    require(BOD5e >= 0 && BOD5_cBOD5 >= 0 && bod5cBOD5Ratio >= 0)
    val r = BOD5e / BOD5_cBOD5
    to2Decimals(r)
  }

  def calbCODe(BOD5e: Double, COD_BOD: Double = codBODRatio): Double = {
    require(BOD5e >= 0 && COD_BOD >= 0)
    val r = BOD5e * COD_BOD
    to2Decimals(r)
  }

  def calbCODpe(VSSe: Double, COD_VSS: Double = codVSSRatio, VSS_TSS: Double = vssTSSRatio): Double = {
    require(VSSe >= 0 && COD_VSS >= 0 && VSS_TSS >= 0)
    val r = VSSe * COD_VSS * VSS_TSS
    to2Decimals(r)
  }

  def calbCODs(bCODe: Double, bCODpe: Double): Double = {
    require(bCODe >= 0 && bCODpe >= 0)
    val r = bCODe - bCODpe
    to2Decimals(r)
  }

  def calP(Q: Double, VSSe: Double): Double = {
    require(Q >= 0 && VSSe >= 0)
    val r = Q * VSSe
    to2Decimals(r)
  }

}
