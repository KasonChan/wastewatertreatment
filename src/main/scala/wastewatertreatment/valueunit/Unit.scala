package wastewatertreatment.valueunit

/**
 * Created by ka-son on 10/31/15.
 */
trait Unit {

  /**
   * The units of mass: '''g''', '''kg'''.
   */
  val massUnits = List("g", "kg")

  /**
   * The units of volume: '''m^3^'''.
   */
  val volumeUnits = List("m^3")

  /**
   * The units of day: '''d'''.
   */
  val dayUnits = List("d")

  /**
   * The units of percentage: '''%'''.
   */
  val percentageUnits = List("%")

  /**
   * Empty units.
   */
  val noUnits = List("")

  /**
   * Returns a list of units.
   * @param num the name of mass in the numerator.
   * @param denom the name of mass in the denominator.
   */
  def generateUs(num: List[String], denom: List[String]): List[String] = {
    for {
      n <- num
      d <- denom
    } yield n + "/" + d
  }

  /**
   * Returns a list of ratio units.
   * @param mass the list of mass units.
   * @param num the name of mass in the numerator.
   * @param denom the name of mass in the denominator.
   */
  def generateRUs(mass: List[String], num: String, denom: String): List[String] = {
    for (m <- mass)
      yield m + "-" + num + "/" + m + "-" + denom
  }

  /**
   * The units of concentration.
   * {{{
   *   Mass / Volume
   * }}}
   */
  val concentrationUnits = generateUs(massUnits, volumeUnits)

  /**
   * The units of flow.
   * {{{
   *   Volume / Day
   * }}}
   */
  val flowUnits = generateUs(volumeUnits, dayUnits)

  /**
   * Returns a list of production rate units.
   * @param mass the list of mass units.
   * @param product the name of product.
   * @param day the list of day units.
   */
  def generatePRUs(mass: List[String], product: String, day: List[String]): List[String] = {
    for {
      m <- mass
      d <- day
    } yield m + "-" + product + "/" + d
  }

}
