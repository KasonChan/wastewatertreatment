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
   * The units of per day: '''d^-1^'''.
   */
  val perDayUnits = List("d^-1")

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
   * @param num the list of units at the numerator.
   * @param denom the list of units at the denominator.
   */
  def generateUs(num: List[String], denom: List[String]): List[String] = {
    for {
      n <- num
      d <- denom
    } yield n + "/" + d
  }

  /**
   * Returns a list of ratio units.
   * @param unit the list of units.
   * @param num the name of ratio unit at the numerator.
   * @param denom the name of ratio unit at the denominator.
   */
  def generateRUs(unit: List[String], num: String, denom: String): List[String] = {
    for (u <- unit)
      yield u + "-" + num + "/" + u + "-" + denom
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
   * @param num the list of units at the numerator.
   * @param product the name of product.
   * @param denom the list of units at the denominator.
   */
  def generatePRUs(num: List[String], product: String, denom: List[String]): List[String] = {
    for {
      n <- num
      d <- denom
    } yield n + "-" + product + "/" + d
  }

}
