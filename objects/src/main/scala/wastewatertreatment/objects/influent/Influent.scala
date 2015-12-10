package wastewatertreatment.objects.influent

import wastewatertreatment.calculations.Calculations
import wastewatertreatment.fluent
import wastewatertreatment.ratios.Ratios
import wastewatertreatment.removals.Removals

/**
 * Created by kasonchan on 11/6/15.
 */
object Influent extends Calculations with fluent.Fluent with Ratios with Removals
