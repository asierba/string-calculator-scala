import org.scalatest.{FlatSpec, Matchers}

class StringCalculatorSpec extends FlatSpec with Matchers {

  def calculate(value: String): Int = {
    value.split(",|\n")
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

  it should "be more than 2 numbers" in {
    calculate("1,2,3") should equal(6)
  }

  it should "sum numbers separated by break line character and commas" in {
    calculate("1\n2,3") should equal(6)
  }
}
