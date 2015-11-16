package wastewatertreatment.massbalance

/**
 * Created by kasonchan on 11/14/15.
 */
case class MX(M: Option[Double], X: Option[Double], Removal: Option[Double] = None)

object MassBalance {

  /**
   * Returns the sum of multiplication of the mass balances.
   * @param inputs the list of mass balances.
   */
  private def multiplySum(inputs: List[MX]): Double = {
    inputs.foldLeft(0.0) {
      (m, n) => m + (n.M.getOrElse(0.0) * n.X.getOrElse(0.0) * ((100 - n.Removal.getOrElse(0.0)) / 100))
    }
  }

  /**
   * Returns the tuple of mass balance with unknown and grouped sum of
   * multiplication of the mass balances.
   * Otherwise, returns 0.0.
   * @param puts the list of mass balances.
   */
  private def group(puts: List[MX]): Either[Option[Double], (MX, Option[Double])] = {
    val spanned = puts match {
      case List() => None
      case l: List[MX] =>
        val r = l partition {
          mx => !mx.M.isDefined || !mx.X.isDefined
        }
        println(r)
        Some(r)
    }

    spanned match {
      case None => Left(None)
      case Some(x) => x match {
        case (List(), t) => Left(Some(multiplySum(t)))
        case (h, t) =>
          h.size match {
            case 1 => Right(h.head, Some(multiplySum(t)))
            case _ => Left(None)
          }
      }
    }
  }

  /**
   * Solves the equation of mass balances and returns the result; otherwise
   * returns 0.0.
   * @param inputs the list of mass balances on the left hand side of equation.
   * @param outputs the list of mass balances on the right hand side of equation.
   */
  def solve(inputs: List[MX], outputs: List[MX]): Option[Double] = {
    val i = group(inputs)
    val o = group(outputs)

    println(i)
    println(o)

    (i, o) match {
      case (Left(l), Left(r)) => None
      case (Left(l), Right(r)) => r match {
        case (mx, sum) =>
          (mx.M, mx.X, mx.Removal) match {
            case (Some(x), None, _) =>
              val result = (l.getOrElse(0.0) - sum.getOrElse(0.0)) / x
              Some(result)
            case (None, Some(x), _) =>
              val result = (l.getOrElse(0.0) - sum.getOrElse(0.0)) / x
              Some(result)
            case _ => None
          }
      }
      case (Right(l), Left(r)) => l match {
        case (mx, sum) =>
          (mx.M, mx.X, mx.Removal) match {
            case (Some(x), None, _) =>
              val result = (r.getOrElse(0.0) - sum.getOrElse(0.0)) / x
              Some(result)
            case (None, Some(x), _) =>
              val result = (r.getOrElse(0.0) - sum.getOrElse(0.0)) / x
              Some(result)
            case _ => None
          }
      }
      case (Right(l), Right(r)) => None
    }
  }

}
