package wastewatertreatment.objects.pretreatment.primaryclarifiers

import wastewatertreatment.{assumptions, core}

/**
 * Created by kasonchan on 11/9/15.
 */
object Unit extends assumptions.Units with core.Units {

  val tssRemovalUnits = percentageUnits

  val bodRemovalUnits = percentageUnits

  val phosphorusRemovalUnits = percentageUnits

}
