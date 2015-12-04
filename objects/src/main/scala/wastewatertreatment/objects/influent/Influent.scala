package wastewatertreatment.objects.influent

import wastewatertreatment.core.Core
import wastewatertreatment.influent
import wastewatertreatment.ratios.Ratios
import wastewatertreatment.removals.Removals

/**
 * Created by kasonchan on 11/6/15.
 */
object Influent extends Core with influent.Influent with Ratios with Removals
