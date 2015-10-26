package io

import objects.pretreatment.screen.TSSRemoval
import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by kasonchan on 10/26/15.
 */
class OutputTest extends FlatSpec with Matchers {

  "OutputTest(TSSRemoval(27))" should "27.00%" in {
    Output(TSSRemoval(27)) shouldBe "27.00%"
  }

}
