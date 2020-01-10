import org.scalatest.{FlatSpec, Matchers}

class StringCalculatorSpec extends FlatSpec with Matchers {

  def calculate(value: String): Int = if (value == "") 0 else value.toInt

  it should "be 0 for empty string" in {
    calculate("") should equal(0)
  }

  it should "be same for unique number" in {
    calculate("1") should equal(1)
    calculate("2") should equal(2)
  }
}
