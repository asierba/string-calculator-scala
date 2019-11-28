import org.scalatest.{FlatSpec, Matchers}

class MySpec extends FlatSpec with Matchers {

  it should "be true" in {
    true should equal(true)
  }
}
