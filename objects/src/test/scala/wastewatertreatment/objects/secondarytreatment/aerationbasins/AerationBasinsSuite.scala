package wastewatertreatment.objects.secondarytreatment.aerationbasins

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.secondarytreatment.aerationbasins.AerationBasins._

/**
 * Created by kasonchan on 11/17/15.
 */
class AerationBasinsSuite extends FlatSpec with Matchers {

  "bodRemoval" should "= 97.00" in {
    bodRemoval shouldBe 97.00
  }

  "tssRemoval" should "= 94.00" in {
    tssRemoval shouldBe 94.00
  }

  "tknRemoval" should "= 88.00" in {
    tknRemoval shouldBe 88.00
  }

  "nh3nRemoval" should "= 97.00" in {
    nh3nRemoval shouldBe 97.00
  }

  "phosphorousRemoval" should "= 98.00" in {
    phosphorousRemoval shouldBe 98.00
  }

  "bCODsRemoval" should "= 100.00" in {
    bCODsRemoval shouldBe 100.00
  }

  "forallAnoxicForallTotalRatio" should "= 0.33" in {
    forallAnoxicForallTotalRatio shouldBe 0.33
  }

  "sne" should "= 0.50" in {
    sne shouldBe 0.50
  }

  "xVSS" should "= 3000.00" in {
    xVSS shouldBe 3000.00
  }

  "seBOD" should "= 1.00" in {
    seBOD shouldBe 1.00
  }

  "kO" should "= 0.50" in {
    kO shouldBe 0.50
  }

  "dO" should "= 2.00" in {
    dO shouldBe 2.00
  }

  "fnd" should "= 0.10" in {
    fnd shouldBe 0.10
  }

  "factorOfSafety" should "= 2.00" in {
    factorOfSafety shouldBe 2.00
  }

  "tkn" should "= 45.00" in {
    tkn shouldBe 45.00
  }

  "xR" should "= 8000.00" in {
    xR shouldBe 8000.00
  }

  "xW" should "= 8000.00" in {
    xW shouldBe 8000.00
  }

  "xE" should "= 10.00" in {
    xE shouldBe 10.00
  }

  "noXE" should "= 6.00" in {
    noXE shouldBe 6.00
  }

  "hU" should "= 6.00" in {
    hU shouldBe 6.00
  }

  "hKs" should "= 20.00" in {
    hKs shouldBe 20.00
  }

  "hY" should "= 0.40" in {
    hY shouldBe 0.40
  }

  "hKd" should "= 0.12" in {
    hKd shouldBe 0.12
  }

  "nU" should "= 0.75" in {
    nU shouldBe 0.75
  }

  "nKs" should "= 0.74" in {
    nKs shouldBe 0.74
  }

  "nY" should "= 0.12" in {
    nY shouldBe 0.12
  }

  "nKd" should "= 0.08" in {
    nKd shouldBe 0.08
  }

}
