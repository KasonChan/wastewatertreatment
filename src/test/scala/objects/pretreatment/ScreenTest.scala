package objects.pretreatment

import objects.pretreatment.Screen._
import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by ka-son on 10/24/15.
 */
class ScreenTest extends FlatSpec with Matchers {

  "Calculations" should "correct" in {
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

    val TSSe = calTSSe(TSSo, TSSRemoval)
    TSSe equals 162.8

    val BOD5e = calBOD5e(BOD5o, BOD5Removal)
    BOD5e equals 189

    val VSSe = calVSSe(TSSe, VSS_TSS)
    VSSe equals 130

    val cBOD5e = calcBOD5e(BOD5e, BOD5_cBOD5)
    cBOD5e equals 171

    val bCODe = calbCODe(BOD5e, COD_BOD)
    bCODe equals 301

    val bCODpe = calbCODpe(VSSe, COD_VSS, VSS_TSS)
    bCODpe equals 148

    val bCODs = calbCODs(bCODe, bCODpe)
    bCODs equals 153

    val p = calP(Q, VSSe)
    p equals 1.41
  }

}
