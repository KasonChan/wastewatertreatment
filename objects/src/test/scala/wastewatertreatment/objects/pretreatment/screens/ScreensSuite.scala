package wastewatertreatment.objects.pretreatment.screens

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by ka-son on 10/24/15.
 */
class ScreensSuite extends FlatSpec with Matchers {

  "Calculation 1" should "pass" in {
    // Assumed
    val tssRemoval = 27
    val bod5Removal = 27

    // Inputs
    val q = 1090195
    val tssO = 223
    val bod5O = 257.5
  }

}
