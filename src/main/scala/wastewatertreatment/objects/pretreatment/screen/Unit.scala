package wastewatertreatment.objects.pretreatment.screen

/**
 * Created by kasonchan on 10/25/15.
 */
object Unit {

  val massUnits = List("g")

  val volumeUnits = List("m^3")

  val dayUnits = List("d")

  /**
   * Returns a list of units
   * @param num the name of mass in the numerator
   * @param denom the name of mass in the denominator
   */
  def generateUs(num: List[String], denom: List[String]): List[String] = {
    for {
      n <- num
      d <- denom
    } yield n + "/" + d
  }

  val concentrationUnits = generateUs(massUnits, volumeUnits)

  val flowUnits = generateUs(volumeUnits, dayUnits)

  val tssRemovalUnits = List("%")

  val bod5RemovalUnits = List("%")

  val qUnits = flowUnits

  val tssOUnits = concentrationUnits

  val tssEUnits = concentrationUnits

  val bod5OUnits = concentrationUnits

  val bod5EUnits = concentrationUnits

  /**
   * Returns a list of ratio units
   * @param mass the list of mass units
   * @param num the name of mass in the numerator
   * @param denom the name of mass in the denominator
   */
  def generateRUs(mass: List[String], num: String, denom: String): List[String] = {
    for (m <- mass)
      yield m + "-" + num + "/" + m + "-" + denom
  }

  val bod5cBOD5Units = generateRUs(massUnits, "BOD5", "cBOD5")

  val codBODUnits = generateRUs(massUnits, "COD", "BOD")

  val codVSSUnits = generateRUs(massUnits, "COD", "VSS")

  val vssTSSUnits = generateRUs(massUnits, "VSS", "TSS")

  val vsseUnits = concentrationUnits

  val cBOD5eUnits = concentrationUnits

  val bCODeUnits = concentrationUnits

  val bCODpeUnits = concentrationUnits

  val bCODsUnits = concentrationUnits

  /**
   * Returns a list of production rate units
   * @param mass the list of mass units
   * @param product the name of product
   * @param day the list of day units
   */
  def generatePRUs(mass: List[String], product: String, day: List[String]): List[String] = {
    for {
      m <- mass
      d <- day
    } yield m + "-" + product + "/" + d
  }

  val pUnits = generatePRUs(massUnits, "TSS", dayUnits)

}
