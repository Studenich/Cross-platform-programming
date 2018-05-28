import org.scalatest.FunSuite

class Test extends FunSuite {
  test("First task test"){
    val string = "London is the capital of GreatBritain"
    val answer = "Lon is the cap of"
    assert(ChangeString.changeString(string) === answer)
  }

  test("Second task human test"){
    val human = Animals.Human("People", "are", "not", "animals.")
    val answer = "People are not animals."
    assert(Animals.checkAnimal(human) === answer )
  }

  test("Second task canine test"){
    val canine = Animals.Canine("Lada", "Husky")
    val answer = "Lada Husky"
    assert(Animals.checkAnimal(canine) === answer)
  }

}