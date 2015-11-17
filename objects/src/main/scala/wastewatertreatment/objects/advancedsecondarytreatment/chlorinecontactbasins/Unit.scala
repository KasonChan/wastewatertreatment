package wastewatertreatment.objects.advancedsecondarytreatment.chlorinecontactbasins

import wastewatertreatment.{assumptions, core}

/**
 * Created by kasonchan on 11/10/15.
 */
object Unit extends assumptions.Units with core.Units {

  val bacterialRemovalRateUnits = noUnits

  val enterococci = List("MPN/100mL")

}
