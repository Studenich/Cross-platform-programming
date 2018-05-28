object Main {
  def main(args: Array[String]): Unit ={
    println

    val string = "London is the capital of GreatBritain"
    println(changeString(string))

    val human = Human("People", "are", "not", "animals.")
    println(checkAnimal(human))
    val canine = Canine("Lada", "Husky")
    println(checkAnimal(canine))

    println
  }

  def changeString(string:String): String = {
    def checkLength(str:String): Boolean = {
      str.length() < 10
    }
    def changeLength(str:String): String = {
      if(str.length() >= 5)
        str.substring(0, 3)
      else
        str
    }
    string.split(" ").filter(checkLength).map(changeLength).mkString(" ")
  }

  def checkAnimal(animal: Animal): String = {
    animal match {
      case Human(_, _, _, _) => animal.unapply()
      case Canine(_, _) => animal.unapply()
    }
  }

  abstract class Animal {
    def unapply(): String {}
  }

  case class Human(firstName: String, secondName: String,
                   patronymic: String, race: String) extends Animal{
    def unapply(): String =
      firstName + " " + secondName + " "+ patronymic + " " + race
  }

  case class Canine(name: String, breed: String) extends Animal {
    def unapply(): String =
      name + " " + breed
  }
}

object ChangeString{
  def changeString(string:String): String = {
    def checkLength(str:String): Boolean = {
      str.length() < 10
    }
    def changeLength(str:String): String = {
      if(str.length() >= 5)
        str.substring(0, 3)
      else
        str
    }
    string.split(" ").filter(checkLength).map(changeLength).mkString(" ")
  }
}


object Animals{
  def checkAnimal(animal: Animal): String = {
    animal match {
      case Human(_, _, _, _) => animal.unapply()
      case Canine(_, _) => animal.unapply()
    }
  }

  abstract class Animal {
    def unapply(): String{}
  }

  case class Human(firstName: String, secondName: String,
                   patronymic: String, race: String) extends Animal{
    def unapply(): String =
      firstName + " " + secondName + " "+ patronymic + " " + race
  }

  case class Canine(name: String, breed: String) extends Animal {
    def unapply(): String =
      name + " " + breed
  }
}
