package main.scala
import scala.annotation.tailrec

object Main {
  def main(args: Array[String]): Unit = {
    val listOfNumbers_1 = List[Double](1.1, 1.1, 1.1, 1.1, 1.1)
    println(getListSumTailrec(listOfNumbers_1))
    println(getListSumRec(listOfNumbers_1))

    val listOfNumbers_2 = List[Int](1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(listOfNumbers_2 filter((i: Int) => isPrimeNumbers(i)))
    println(listOfNumbers_2 filter((i: Int) => isPrimeNumberTailrec(i)))
  }

  def getListSumTailrec(listOfNumbers: List[Double]): Double = {
    val sizeOfList = listOfNumbers.length

    @tailrec
    def accumulator(acc: Double, listOfNumbers: List[Double], sizeOfList: Int): Double = {
      if (sizeOfList != 0)
        accumulator(acc + listOfNumbers(sizeOfList - 1), listOfNumbers, sizeOfList - 1)
      else
        acc
    }

    accumulator(0, listOfNumbers, sizeOfList)
  }

  def getListSumRec(listOfNumbers: List[Double]): Double = {

    val sizeOfList = listOfNumbers.length

    def accumulator(listOfNumbers: List[Double], sizeOfList: Int): Double = {
      if (sizeOfList != 0)
        listOfNumbers(sizeOfList - 1) + accumulator(listOfNumbers, sizeOfList - 1)
      else
        0
    }

    accumulator(listOfNumbers, sizeOfList)
  }

  def isPrimeNumbers(number :Int): Boolean = {
    number != 1 && (2 until number).forall(number % _ != 0)
  }

  def isPrimeNumberTailrec(number: Int):Boolean = {
    @tailrec
    def isPrimeNested(number: Int, i: Int): Boolean = {
      (number % i != 0) && ((i * i > number) || isPrimeNested(number, i + 1))
    }
    (number == 2) || (number > 2) && isPrimeNested(number, 2)
  }
}
