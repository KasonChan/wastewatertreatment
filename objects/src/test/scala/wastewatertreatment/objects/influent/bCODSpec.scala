package wastewatertreatment.objects.influent

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.objects.influent.Influent._

/**
 * Created by kasonchan on 11/8/15.
 */
class bCODSpec extends FlatSpec with Matchers {

  "calBCOD(-1, -1)" should "fail" in {
    intercept[java.lang.IllegalArgumentException] {
      calBCOD(-1, -1)
    }
  }

  "calBCOD(0, 0)" should "= 0.0" in {
    calBCOD(0, 0) shouldBe 0
  }

  "calBCOD(bod5, 1.6)" should "= 411.84" in {
    val bod5 = 257.40
    val codBODRatio = 1.6
    calBCOD(bod5, codBODRatio) shouldBe 411.84
  }

  "calBCOD(bod5)" should "= 411.84" in {
    val bod5 = 257.40
    calBCOD(bod5) shouldBe 411.84
  }

}
