package wastewatertreatment.objects.influent

import wastewatertreatment.core.calculations.Calculations
import wastewatertreatment.core.fluent
import wastewatertreatment.core.ratios.Ratios
import wastewatertreatment.core.removals.Removals

/**
 * Created by kasonchan on 11/6/15.
 */
object Influent extends Calculations with wastewatertreatment.core.fluent.Fluent with Ratios with Removals
