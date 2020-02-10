package at.co.sbs.gh.learning.scala

object EchoArg {
  def main(args: Array[String]) {
    println("Imperative Arg Print         :")
    printImperative(args)

    println()

    println("Functional For Arg Print     :")
    printFunctionalFor(args)

    println()

    println("Functional Foreach Arg Print :")
    printFunctionalForeach(args)
  }

  def printImperative(args: Array[String]) {
    var i = 0
    while (i < args.length) {
      print(args(i))
      print (" ")
      i += 1
    }
    println()
  }

  def printFunctionalFor(args: Array[String]) {
    for (arg <- args) {
      print(arg)
      print (" ")
    }
    println()
  }

  def printFunctionalForeach(args: Array[String]) {
    args.foreach((arg: String) => print(arg + " "))
    println()
  }
}
