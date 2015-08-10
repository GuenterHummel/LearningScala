package at.co.sbs.gh.scalakungfu

/**
 * Created with IntelliJ IDEA.
 * User: GH
 * Date: 07.11.13
 * Time: 00:01
 * To change this template use File | Settings | File Templates.
 */
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