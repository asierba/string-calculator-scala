import org.scalatest.{FlatSpec, Matchers}

class StringCalculatorSpec extends FlatSpec with Matchers {

  def calculate(value: String): Int = 0

  it should "be 0 for empty string" in {
    calculate("") should equal(0)
  }
}
