import org.scalatest.flatspec.AnyFlatSpecLike
import org.scalatest.matchers.should.Matchers

class StubE2ESpec extends AnyFlatSpecLike with Matchers {
  "A stub" should "succeed" in {
    "foo" shouldEqual "foo"
  }

  it should "fail" in {
    0 shouldEqual 1
  }
}
