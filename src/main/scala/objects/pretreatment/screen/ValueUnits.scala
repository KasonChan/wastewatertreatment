package objects.pretreatment.screen

import valueunit.ValueUnit

/**
 * Created by kasonchan on 10/26/15.
 */
case class TSSRemoval(value: Double,
                      unit: String = "%") extends ValueUnit

case class BOD5Removal(value: Double,
                       unit: String = "%") extends ValueUnit

case class Q(value: Double,
             unit: String = "m^3/d") extends ValueUnit

case class TSSo(value: Double,
                unit: String = "g^3/m^3") extends ValueUnit

case class TSSe(value: Double,
                unit: String = "g^3/m^3") extends ValueUnit

case class BOD5o(value: Double,
                 unit: String = "g^3/m^3") extends ValueUnit

case class BOD5e(value: Double,
                 unit: String = "g^3/m^3") extends ValueUnit

case class BOD5CBOD5(value: Double,
                     unit: String = "g-BOD5/g-cBOD5") extends ValueUnit

case class CODBODRatio(value: Double,
                       unit: String = "g-COD/g-BOD") extends ValueUnit

case class CODVSSRation(value: Double,
                        unit: String = "g-COD/g-VSS") extends ValueUnit


case class VSSTSSRatio(value: Double,
                       unit: String = "g-VSS/g-TSS") extends ValueUnit

case class VSSe(value: Double,
                unit: String = "g^3/m^3") extends ValueUnit

case class CBOD5e(value: Double,
                  unit: String = "g^3/m^3") extends ValueUnit

case class BCODe(value: Double,
                 unit: String = "g^3/m^3") extends ValueUnit

case class BCODpe(value: Double,
                  unit: String = "g^3/m^3") extends ValueUnit

case class BCODs(value: Double,
                 unit: String = "g^3/m^3") extends ValueUnit

case class P(value: Double,
             unit: String = "g-TSS/d") extends ValueUnit
