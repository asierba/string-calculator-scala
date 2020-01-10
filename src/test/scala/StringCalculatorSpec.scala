import org.scalatest.{FlatSpec, Matchers}

class StringCalculatorSpec extends FlatSpec with Matchers {

  def calculate(value: String): Int = {
    value.split(",")
      .filter(!_.isEmpty)
      .map(_.toInt)
      .sum
  }

  it should "be 0 for empty string" in {
    calculate("") should equal(0)
  }

  it should "be same for unique number" in {
    calculate("1") should equal(1)
    calculate("2") should equal(2)
  }

  it should "be sum two numbers" in {
    calculate("1,2") should equal(3)
  }

  it should "be sum three numbers" in {
    calculate("1,2,3") should equal(6)
  }
}
