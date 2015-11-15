package wastewatertreatment.massbalance

import org.scalatest.{FlatSpec, Matchers}
import wastewatertreatment.massbalance.MassBalance.solve

/**
 * Created by kasonchan on 11/15/15.
 */
class MassBalanceSuite extends FlatSpec with Matchers {

  "MX(Some(1), Some(2))" should "MX(1), Some(2), None)" in {
    MX(Some(1), Some(2)) shouldBe MX(Some(1), Some(2), None)
  }

  "MX(None, None, None)" should "MX(None, None, None)" in {
    MX(None, None, None) shouldBe MX(None, None, None)
  }

  "MX(None, None, Some(3))" should "MX(None, None, Some(3))" in {
    MX(None, None, Some(3)) shouldBe MX(None, None, Some(3))
  }

  "MX(None, Some(2), None)" should "MX(None, Some(2), None)" in {
    MX(None, Some(2), None) shouldBe MX(None, Some(2), None)
  }

  "MX(None, Some(2), Some(3))" should "MX(None, Some(2), Some(3))" in {
    MX(None, Some(2), Some(3)) shouldBe MX(None, Some(2), Some(3))
  }

  "MX(Some(1), None, None)" should "MX(Some(1), None, None)" in {
    MX(Some(1), None, None) shouldBe MX(Some(1), None, None)
  }

  "MX(Some(1), None, Some(3))" should "MX(Some(1), None, Some(3))" in {
    MX(Some(1), None, Some(3)) shouldBe MX(Some(1), None, Some(3))
  }

  "MX(Some(1), Some(2), None)" should "MX(1), Some(2), None)" in {
    MX(Some(1), Some(2), None) shouldBe MX(Some(1), Some(2), None)
  }

  "(1.5 * 3) + (4 * 2.5) = (5 * X)" should "X = 2.9" in {
    val inputs = List(MX(Some(1.5), Some(3)), MX(Some(4), Some(2.5)))
    val outputs = List(MX(Some(5), None))
    solve(inputs, outputs) shouldBe Some(2.9)
  }

  "(1.5 * 3) + (4 * 2.5) = (M * 5)" should "M = 2.9" in {
    val inputs = List(MX(Some(1.5), Some(3)), MX(Some(4), Some(2.5)))
    val outputs = List(MX(None, Some(5)))
    solve(inputs, outputs) shouldBe Some(2.9)
  }

  "(10 * 20) + (5 * 40) = (M * 15)" should "M = 26.7" in {
    val inputs = List(MX(Some(10), Some(20)), MX(Some(5), Some(40)))
    val outputs = List(MX(None, Some(15)))
    solve(inputs, outputs) shouldBe Some(26.666666666666668)
  }

  "(10 * 20) + (5 * 40) = (15 * X)" should "M = 26.7" in {
    val inputs = List(MX(Some(10), Some(20)), MX(Some(5), Some(40)))
    val outputs = List(MX(Some(15), None))
    solve(inputs, outputs) shouldBe Some(26.666666666666668)
  }

  "Solve more 1" should "pass" in {
    val inputs = List(MX(Some(1240973.21), Some(201.55), Some(27)))
    val outputs = List(MX(Some(1240973.21), None))
    solve(inputs, outputs) shouldBe Some(147.13150000000002)
  }

  "Solve more 2" should "pass" in {
    val inputs = List()
    val outputs = List()
    solve(inputs, outputs) shouldBe None
  }

  "Solve more 3" should "pass" in {
    val inputs = List(MX(Some(1), Some(2)))
    val outputs = List()
    solve(inputs, outputs) shouldBe None
  }

  "Solve more 4" should "pass" in {
    val inputs = List()
    val outputs = List(MX(Some(1), Some(2)))
    solve(inputs, outputs) shouldBe None
  }

}
