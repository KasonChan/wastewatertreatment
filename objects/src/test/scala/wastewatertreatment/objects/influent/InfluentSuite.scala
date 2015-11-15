package wastewatertreatment.objects.influent

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.math.Math.tom3d
import wastewatertreatment.objects.influent.Influent._

/**
 * Created by kasonchan on 11/8/15.
 */
class InfluentSuite extends FlatSpec with Matchers {

  "Calculation 1" should "pass" in {
    // Inputs
    val q = 368
    val tss = 223
    val cBOD5 = 234
    val nh3 = 33
    val tp = 6

    val qm3d = tom3d(q)
    qm3d shouldBe 1393030.88

    val vss = calVSS(tss)
    vss shouldBe 178.40

    val bod5 = calBOD5(cBOD5)
    bod5 shouldBe 257.40

    val bCOD = calBCOD(bod5)
    bCOD shouldBe 411.84

    val bCODp = calBCODp(vss)
    bCODp shouldBe 202.66

    val bCODs = calBCODs(bCOD, bCODp)
    bCODs shouldBe 209.18

    val p = calP(qm3d, tss)
    p shouldBe 310645886.24
  }

  "Calculation 2" should "pass" in {
    // Inputs
    val q = 368
    val tss = 223
    val cBOD5 = 234
    val nh3 = 33
    val tp = 6

    val qm3d = tom3d(q)
    qm3d shouldBe 1393030.88

    val vss = calVSS(tss, 0.8)
    vss shouldBe 178.40

    val bod5 = calBOD5(cBOD5, 1.1)
    bod5 shouldBe 257.40

    val bCOD = calBCOD(bod5, 1.6)
    bCOD shouldBe 411.84

    val bCODp = calBCODp(vss, 1.42, 0.8)
    bCODp shouldBe 202.66

    val bCODs = calBCODs(bCOD, bCODp)
    bCODs shouldBe 209.18

    val p = calP(qm3d, tss)
    p shouldBe 310645886.24
  }

}
