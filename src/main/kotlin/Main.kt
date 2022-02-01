import common.isGreaterThan
import common.showColorWithPosition
import models.Knight

val isMain = false
val number = 23

fun main(args: Array<String>) {
//    stringActions()
//    numberActions()
    // println(booleanActions(false))

    // Classes and objects
    var blackKnight = Knight("A2", Knight.Color.BLACK, false)
    blackKnight.move() // call method of a class through object
    val whiteKnight = Knight("F5", Knight.Color.WHITE, false)
    println(blackKnight.eatenFiguresCount)
    blackKnight.eatFigure(whiteKnight)
    println(blackKnight.position)
    blackKnight = whiteKnight
    blackKnight.position = "E3" // under the hood calls setPosition("E3")
    println(blackKnight.position)
//    blackKnight.eatenFiguresCount = 0 // trying to change the value of a 'val' property
    println(blackKnight.eatenFiguresCount)

    // data class things
    val anotherBlackKnight = blackKnight.copy(position = "F4")
    val numberOne = 42
    val numberTwo = 42
    println(numberOne == numberTwo)
    println(blackKnight == anotherBlackKnight)
    println(numberOne)
    println(blackKnight.toString())
    println(anotherBlackKnight.toString())
    println(blackKnight.color.stringValue)

    // Extensions
    println(42.isGreaterThan(69))
    blackKnight.showColorWithPosition()
    whiteKnight.showColorWithPosition()
}

fun stringActions() {
    val str = "abcd"
    println(str.uppercase())
    println(str + " is first letters")
}

fun numberActions() {
    val num1 = 16
    val num2 = 5.00

    println(num1.toDouble())
    println(num2.toInt())
}

fun booleanActions(isActive: Boolean): String {
    val firstOne = true
    val secondOne = false

    if ((firstOne && isActive) || secondOne) {
        return "Exectued"
    }

    return "Did not execute"
}
