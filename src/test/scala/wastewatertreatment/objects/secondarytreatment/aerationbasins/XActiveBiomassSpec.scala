package wastewatertreatment.objects.secondarytreatment.aerationbasins

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.secondarytreatment.aerationbasins.AerationBasins._

/**
 * Created by kasonchan on 11/3/15.
 */
class XActiveBiomassSpec extends FlatSpec with Matchers {

  "calXActiveBiomass(-1, -1, -1, -1, -1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calXActiveBiomass(-1, -1, -1, -1, -1, -1)
    }
  }

  "calXActiveBiomass(0, 0, 0, 0, 0, 0)" should "= 0" in {
    calXActiveBiomass(0, 0, 0, 0, 0, 0) shouldBe 0
  }

  "calXActiveBiomass(958414, S = 119, ThetaC = 6.18)" should "= 2.597447221E7" in {
    calXActiveBiomass(958414, S = 119, ThetaC = 6.18) shouldBe 2.597447221E7
  }

}
