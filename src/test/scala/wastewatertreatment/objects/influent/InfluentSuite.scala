package wastewatertreatment.objects.influent

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.math.Math.tom3d

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
  }

}
