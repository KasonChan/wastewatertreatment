package wastewatertreatment.objects.secondarytreatment.secondaryclarifiers

import wastewatertreatment.{assumptions, core}

/**
 * Created by kasonchan on 11/9/15.
 */
object Unit extends assumptions.Units with core.Units {

  val tssRemovalUnits = percentageUnits

  val bodRemovalUnits = percentageUnits

  val pVSSRatioUnits = noUnits

}
