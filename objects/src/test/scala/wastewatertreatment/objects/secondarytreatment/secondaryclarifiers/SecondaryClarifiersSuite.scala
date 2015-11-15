package wastewatertreatment.objects.secondarytreatment.secondaryclarifiers

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.secondarytreatment.secondaryclarifiers.SecondaryClarifiers._

/**
 * Created by kasonchan on 11/9/15.
 */
class SecondaryClarifiersSuite extends FlatSpec with Matchers {

  "Calculation 1" should "pass" in {
    val qo = 571269.64
    val qe = 90138.51
    val bod5o = 1.00
    val po = 362934.31

    val q = calQ(qo, qe)
    q shouldBe 481131.13

    val p = calP(po)
    p shouldBe 199613.87

    val tss = calTSS(p, q)
    tss shouldBe 0.41

    val vss = calVSS(tss)
    vss shouldBe 0.33

    val bod5 = calBOD5(bod5o)
    bod5 shouldBe 0.75

    val cBOD5 = calCBOD5(bod5)
    cBOD5 shouldBe 0.68

    val bCODs = 0.0

    val bCODp = calBCODp(VSS = vss)
    bCODp shouldBe 0.37

    val bCOD = bCODs + bCODp
    bCOD shouldBe 0.37

    val tpe = 0.64

    val tp = calTP(tpe, q)
    tp shouldBe 0.64
  }

  "Calculation 2" should "pass" in {
    val qo = 1193464.87
    val qe = 165103.26
    val bod5o = 0.99
    val po = 3055242.73

    val q = calQ(qo, qe)
    q shouldBe 1028361.61

    val p = calP(po)
    p shouldBe 1680383.50

    val tss = calTSS(p, q)
    tss shouldBe 1.63

    val vss = calVSS(tss)
    vss shouldBe 1.30

    val bod5 = calBOD5(bod5o)
    bod5 shouldBe 0.74

    val cBOD5 = calCBOD5(bod5)
    cBOD5 shouldBe 0.67

    val bCODs = 0.0

    val bCODp = calBCODp(VSS = vss)
    bCODp shouldBe 1.48

    val bCOD = bCODs + bCODp
    bCOD shouldBe 1.48

    val tpe = 0.24

    val tp = calTP(tpe, q)
    tp shouldBe 0.24
  }

}
