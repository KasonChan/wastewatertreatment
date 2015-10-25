package io

/**
 * Created by kasonchan on 10/25/15.
 */
object Output {

  def apply(value: Double, unit: String): Unit = {
    println("%.2f".format(value) + unit)
  }

}
