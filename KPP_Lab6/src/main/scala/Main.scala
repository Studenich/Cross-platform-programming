/**
  * The second Scala lab.
  *
  * Tasks:
  * 1 - 29
  * 2 - 10
  * 3 - 1
  */

object Main {
  def main(args: Array[String]): Unit = {
    //First task
    println("Multiplication of matrix:")
    val someMatrix1: Array[Array[Int]] = Array(Array(1, 2, 3), Array(4, 5, 6), Array(4, 3, 2))
    val someMatrix2: Array[Array[Int]] = Array(Array(1, 2, 3), Array(4, 5, 6), Array(4, 3, 2))
    printMatrix(matrixMul(someMatrix1, someMatrix2), 3, 3)
    println

    //Second task
    println("Reversing:")
    val strings: List[String] = List("First", "Second", "Third")
    println("Source:\t\t" + strings)
    println("Reversed:\t" + reverseList(strings))
    println

    //Third task
    println("Plus-plus domination:")
    val languages: List[String] = List("Scala", "C++", "Python", "F#")
    println("Source:\t\t" + languages)
    println("Filtered:\t" + delWordsWithoutPlusPlus(languages))
  }

  //First task
  def printMatrix (matrix: Array[Array[Int]], row: Int, column: Int): Unit = {
    for (i <- 0 until row) {
      for (j <- 0 until column)
        print(matrix(i)(j) + " ")
      println()
    }
  }

  def matrixMul(matrix1: Array[Array[Int]], matrix2: Array[Array[Int]]): Array[Array[Int]] = {
    val resMatrix: Array[Array[Int]] = Array(Array(0, 0, 0), Array(0, 0, 0), Array(0, 0, 0))

    for (i <- 0 until 3)
      for (j <- 0 until 3) {
        for (k <- 0 until 3)
          resMatrix(i)(j) += matrix1(i)(k) * matrix2(k)(j)
      }
    resMatrix
  }

  //Second task
  def reverseList(list: List[String]): List[String] = {
    list.foldLeft(List[String]()) {
      (right, newList) => newList :: right
    }
  }

  //Third task
  def delWordsWithoutPlusPlus(list: List[String]) : List[String] = {
    list.filter((word: String) => word.takeRight(2) == "++")
  }
}
