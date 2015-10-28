package valueunit

/**
 * Created by kasonchan on 10/26/15.
 */
trait ValueUnit {
  def value: Double

  def unit: String
}

object ValueUnit {

  def apply(vu: ValueUnit): String = "%.2f".format(vu.value) + vu.unit

}
