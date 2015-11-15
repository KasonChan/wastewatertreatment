package wastewatertreatment.massbalance

/**
  * Created by kasonchan on 11/14/15.
  */
case class MX(M: Option[Double], X: Option[Double], Removal: Option[Double] = None)

object MassBalance {

  private def multiplySum(inputs: List[MX]): Double = {
    inputs.foldLeft(0.0) {
      (m, n) => m + (n.M.getOrElse(0.0) * n.X.getOrElse(0.0) * ((100 - n.Removal.getOrElse(0.0)) / 100))
    }
  }

  private def group(puts: List[MX]): Either[Double, (MX, Double)] = {
    val spanned = puts span {
      mx => !mx.M.isDefined || !mx.X.isDefined
    }

    spanned match {
      case (List(), t) => Left(multiplySum(t))
      case (h, t) => Right(h.head, multiplySum(t))
    }
  }

  def solve(inputs: List[MX], outputs: List[MX]): Double = {
    val i = group(inputs)
    val o = group(outputs)

    println(i)
    println(o)

    o match {
      case Left(l) => 0.0
      case Right(r) => r match {
        case (mx, sum) =>
          (mx.M, mx.X, mx.Removal) match {
            case (Some(x), None, _) => (i.left.getOrElse(0.0) - sum) / x
            case (None, Some(x), _) => (i.left.getOrElse(0.0) - sum) / x
            case _ => 0.0
          }
        case _ => 0.0
      }
      case _ => 0.0
    }
  }

}
