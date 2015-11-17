package wastewatertreatment.objects.pretreatment.screens

import wastewatertreatment.{assumptions, core}

/**
 * Created by kasonchan on 10/25/15.
 */
object Unit extends assumptions.Units with core.Units {

  val tssRemovalUnits = percentageUnits

  val bod5RemovalUnits = percentageUnits

}
