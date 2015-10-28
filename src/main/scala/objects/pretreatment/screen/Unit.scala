package objects.pretreatment.screen

/**
 * Created by kasonchan on 10/25/15.
 */
object Unit {

  val massUnits = List("g")

  val volumeUnits = List("m^3")

  val dayUnits = List("d")

  val concentrationUnits =
    List(massUnits.headOption.getOrElse("g") + "/" + volumeUnits.headOption.getOrElse("m^3"))

  val flowUnits =
    List(volumeUnits.headOption.getOrElse("m^3") + "/" + dayUnits.headOption.getOrElse("d"))

  val tssRemovalUnits = List("%")

  val bod5RemovalUnits = List("%")

  val qUnits = List(flowUnits(0))

  val tssOUnits = List(concentrationUnits.headOption.getOrElse("g/m^3"))

  val tssEUnits = List(concentrationUnits.headOption.getOrElse("g/m^3"))

  val bod5OUnits = List(concentrationUnits.headOption.getOrElse("g/m^3"))

  val bod5EUnits = List(concentrationUnits.headOption.getOrElse("g/m^3"))

  /**
   * Returns a list of ratio units
   * @param mass the list of mass units
   * @param num the name of mass in the numerator
   * @param denom the name of mass in the denominator
   * @return
   */
  def generateRatioUnits(mass: List[String], num: String, denom: String): List[String] = {
    for (m <- mass)
      yield m + "-" + num + "/" + m + "-" + denom
  }

  val bod5cBOD5Units = generateRatioUnits(massUnits, "BOD5", "cBOD5")

  val codBODUnits = generateRatioUnits(massUnits, "COD", "BOD")

  val codVSSUnits = generateRatioUnits(massUnits, "COD", "VSS")

  val vssTSSUnits = generateRatioUnits(massUnits, "VSS", "TSS")

  val vsseUnits = List(concentrationUnits.headOption.getOrElse("g/m^3"))

  val cBOD5eUnits = List(concentrationUnits.headOption.getOrElse("g/m^3"))

  val bCODeUnits = List(concentrationUnits.headOption.getOrElse("g/m^3"))

  val bCODpeUnits = List(concentrationUnits.headOption.getOrElse("g/m^3"))

  val bCODsUnits = List(concentrationUnits.headOption.getOrElse("g/m^3"))

  /**
   * Returns a list of production rate units
   * @param mass the list of mass units
   * @param product the name of product
   * @param day the list of day units
   */
  def generateProductionRateUnits(mass: List[String], product: String, day: List[String]): List[String] = {
    for {
      m <- mass
      d <- day
    } yield m + "-" + product + "/" + d
  }

  val pUnits = generateProductionRateUnits(massUnits, "TSS", dayUnits)

}
