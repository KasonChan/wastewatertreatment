package wastewatertreatment.objects.secondarytreatment.aerationbasins

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.secondarytreatment.aerationbasins.AerationBasins._

/**
 * Created by kasonchan on 11/3/15.
 */
class AerationBasinsXAppPiecesAndParts extends FlatSpec with Matchers {

  "calXAppPiecesAndParts(-1, -1, -1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calXAppPiecesAndParts(-1, -1, -1, -1)
    }
  }

  "calXAppPiecesAndParts(0, 0, 0, 0)" should "= 0" in {
    calXAppPiecesAndParts(0, 0, 0, 0) shouldBe 0
  }

  "calXAppPiecesAndParts(6.18, Xa = 2.597447221E7)" should "= 1926266.86" in {
    calXAppPiecesAndParts(6.18, Xa = 2.597447221E7) shouldBe 1926266.86
  }

}
