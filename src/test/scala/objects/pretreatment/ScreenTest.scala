package objects.pretreatment

import objects.pretreatment.Screen._
import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by ka-son on 10/24/15.
 */
class ScreenTest extends FlatSpec with Matchers {

  "Calculations" should "correct" in {
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

    val tssE = calTSSe(tssO, tssRemoval)
    tssE equals 162.8

    val bod5E = calBOD5e(bod5O, bod5Removal)
    bod5E equals 189

    val vssE = calVSSe(tssE, vss_tss)
    vssE equals 130

    val cBOD5e = calcBOD5e(bod5E, bod5_cbod5)
    cBOD5e equals 171

    val bCODe = calbCODe(bod5E, cod_bod)
    bCODe equals 301

    val bCODpe = calbCODpe(vssE, cod_vss, vss_tss)
    bCODpe equals 148

    val bCODs = calbCODs(bCODe, bCODpe)
    bCODs equals 153

    val p = calP(q, vssE)
    p equals 1.41
  }

}
