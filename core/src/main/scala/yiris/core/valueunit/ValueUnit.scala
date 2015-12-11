package yiris.core.valueunit

/**
 * A trait to represents a value and unit.
 */
trait ValueUnit {
  def value: Option[Double]

  def unit: String
}

/**
 * An companion object to represents a value and unit.
 */
object ValueUnit {

  def apply(vu: ValueUnit): String = "%.2f".format(vu.value.getOrElse(0.00)) + vu.unit

}
