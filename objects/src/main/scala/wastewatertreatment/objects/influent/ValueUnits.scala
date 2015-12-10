package wastewatertreatment.objects.influent

import wastewatertreatment.core.{fluent, ratios, removals}

/**
 * An object to represents influent values and units.
 */
object ValueUnits extends fluent.ValueUnits with ratios.ValueUnits with removals.ValueUnits