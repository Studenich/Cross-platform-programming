import org.scalatest.FunSuite

class Test extends FunSuite {
  test("Multiplication of matrix") {
    val someMatrix1: Array[Array[Int]] = Array(Array(1, 2, 3), Array(4, 5, 6), Array(4, 3, 2))
    val someMatrix2: Array[Array[Int]] = Array(Array(1, 2, 3), Array(4, 5, 6), Array(4, 3, 2))
    val expected: Array[Array[Int]] = Array(Array(21, 21, 21), Array(48, 51, 54), Array(24, 29, 34))

    assert(Main.matrixMul(someMatrix1, someMatrix2) === expected)
  }

  test("Reversing") {
    assert(Main.reverseList(List("First", "Second", "Third")) === List("Third", "Second", "First"))
  }

  test("thirdTask") {
    assert(Main.delWordsWithoutPlusPlus(List("D","C++","F#","Scala","++C","++")) === List("C++", "++"))
  }
}


