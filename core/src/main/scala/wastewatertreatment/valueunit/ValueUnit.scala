package wastewatertreatment.valueunit

/**
 * Created by kasonchan on 10/26/15.
 */
trait ValueUnit {
  def value: Option[Double]

  def unit: String
}

object ValueUnit {

  def apply(vu: ValueUnit): String = "%.2f".format(vu.value.getOrElse(0.00)) + vu.unit

}
