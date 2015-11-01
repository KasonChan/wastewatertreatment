package wastewatertreatment.objects.secondarytreatment.aerationbasins

import wastewatertreatment.objects.secondarytreatment.aerationbasins.AerationBasins._
import wastewatertreatment.objects.secondarytreatment.aerationbasins.Unit._
import wastewatertreatment.valueunit.ValueUnit

/**
 * Created by ka-son on 10/31/15.
 */
case class AT(value: Double = aT,
              unit: String = aTUnits.headOption.getOrElse("m^3")) extends ValueUnit

case class QPeak(value: Double = qPeak,
                 unit: String = qPeakUnits.headOption.getOrElse("m^3/d")) extends ValueUnit

case class Theta(value: Double,
                 unit: String = thetaUnits.headOption.getOrElse("d")) extends ValueUnit

case class BODLoading(value: Double,
                      unit: String = bodLoadingUnits(1)) extends ValueUnit
