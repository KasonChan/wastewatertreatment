package io

import valueunit.ValueUnit

/**
 * Created by kasonchan on 10/25/15.
 */
object Output {

  def apply(vu: ValueUnit): String = "%.2f".format(vu.value) + vu.unit

}
