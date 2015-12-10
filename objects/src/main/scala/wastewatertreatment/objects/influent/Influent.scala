package wastewatertreatment.objects.influent

import wastewatertreatment.core.calculations.Calculations
import wastewatertreatment.core.fluent.Fluent
import wastewatertreatment.core.ratios.Ratios
import wastewatertreatment.core.removals.Removals

/**
 * An object to represents influent.
 */
object Influent extends Calculations with Fluent with Ratios with Removals
