package objects.pretreatment.screen

import objects.pretreatment.screen.Unit._
import valueunit.ValueUnit

/**
 * Created by kasonchan on 10/26/15.
 */
case class TSSRemoval(value: Double,
                      unit: String = tssRemovalUnits.head) extends ValueUnit

case class BOD5Removal(value: Double,
                       unit: String = bod5RemovalUnits.head) extends ValueUnit

case class Q(value: Double,
             unit: String = qUnits.head) extends ValueUnit

case class TSSo(value: Double,
                unit: String = tssOUnits.head) extends ValueUnit

case class TSSe(value: Double,
                unit: String = tssEUnits.head) extends ValueUnit

case class BOD5o(value: Double,
                 unit: String = bod5OUnits.head) extends ValueUnit

case class BOD5e(value: Double,
                 unit: String = bod5EUnits.head) extends ValueUnit

case class VSSe(value: Double,
                unit: String = vsseUnits.head) extends ValueUnit

case class CBOD5e(value: Double,
                  unit: String = cBOD5eUnits.head) extends ValueUnit

case class BCODe(value: Double,
                 unit: String = bCODeUnits.head) extends ValueUnit

case class BCODpe(value: Double,
                  unit: String = bCODpeUnits.head) extends ValueUnit

case class BCODs(value: Double,
                 unit: String = bCODsUnits.head) extends ValueUnit

case class P(value: Double,
             unit: String = pUnits.head) extends ValueUnit
