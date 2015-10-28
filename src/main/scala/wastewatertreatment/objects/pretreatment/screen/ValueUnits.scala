package wastewatertreatment.objects.pretreatment.screen

import wastewatertreatment.objects.pretreatment.screen.Unit._
import wastewatertreatment.valueunit.ValueUnit

/**
 * Created by kasonchan on 10/26/15.
 */
case class TSSRemoval(value: Double,
                      unit: String = tssRemovalUnits.headOption.getOrElse("%")) extends ValueUnit

case class BOD5Removal(value: Double,
                       unit: String = bod5RemovalUnits.headOption.getOrElse("%")) extends ValueUnit

case class Q(value: Double,
             unit: String = qUnits.headOption.getOrElse("m^3/d")) extends ValueUnit

case class TSSo(value: Double,
                unit: String = tssOUnits.headOption.getOrElse("g^3/m^3")) extends ValueUnit

case class TSSe(value: Double,
                unit: String = tssEUnits.headOption.getOrElse("g^3/m^3")) extends ValueUnit

case class BOD5o(value: Double,
                 unit: String = bod5OUnits.headOption.getOrElse("g^3/m^3")) extends ValueUnit

case class BOD5e(value: Double,
                 unit: String = bod5EUnits.headOption.getOrElse("g^3/m^3")) extends ValueUnit

case class BOD5CBOD5Ratio(value: Double,
                          unit: String = bod5cBOD5Units.headOption.getOrElse("g-BOD5/g-cBOD5")) extends ValueUnit

case class CODBODRatio(value: Double,
                       unit: String = codBODUnits.headOption.getOrElse("g-COD/g-BOD")) extends ValueUnit

case class CODVSSRatio(value: Double,
                       unit: String = codVSSUnits.headOption.getOrElse("g-COD/g-VSS")) extends ValueUnit


case class VSSTSSRatio(value: Double,
                       unit: String = vssTSSUnits.headOption.getOrElse("g-VSS/g-TSS")) extends ValueUnit

case class VSSe(value: Double,
                unit: String = vsseUnits.headOption.getOrElse("g^3/m^3")) extends ValueUnit

case class CBOD5e(value: Double,
                  unit: String = cBOD5eUnits.headOption.getOrElse("g^3/m^3")) extends ValueUnit

case class BCODe(value: Double,
                 unit: String = bCODeUnits.headOption.getOrElse("g^3/m^3")) extends ValueUnit

case class BCODpe(value: Double,
                  unit: String = bCODpeUnits.headOption.getOrElse("g^3/m^3")) extends ValueUnit

case class BCODs(value: Double,
                 unit: String = bCODsUnits.headOption.getOrElse("g^3/m^3")) extends ValueUnit

case class P(value: Double,
             unit: String = pUnits.headOption.getOrElse("g-TSS/d")) extends ValueUnit
