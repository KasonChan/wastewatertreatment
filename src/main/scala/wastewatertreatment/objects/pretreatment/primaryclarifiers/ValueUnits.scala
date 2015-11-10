package wastewatertreatment.objects.pretreatment.primaryclarifiers

import wastewatertreatment.objects.pretreatment.primaryclarifiers.PrimaryClarifiers._
import wastewatertreatment.objects.pretreatment.primaryclarifiers.Unit._
import wastewatertreatment.valueunit.ValueUnit

/**
 * Created by kasonchan on 11/9/15.
 */

/**
 * TSS removal
 * @param value Default value is '''63.00'''.
 * @param unit Default unit is '''%'''.
 */
case class TSSRemoval(value: Double = tssRemoval,
                      unit: String = tssRemovalUnits.headOption.getOrElse("%")) extends ValueUnit

/**
 * BOD removal
 * @param value Default value is '''35.00'''.
 * @param unit Default unit is '''%'''.
 */
case class BODRemoval(value: Double = bodRemoval,
                      unit: String = bodRemovalUnits.headOption.getOrElse("%")) extends ValueUnit

/**
 * TSS
 * @param value Default value is '''40000.00'''.
 * @param unit Default unit is '''g/m^3^'''.
 */
case class TSS(value: Double = tss,
               unit: String = tssUnits.headOption.getOrElse("g/m^3")) extends ValueUnit
