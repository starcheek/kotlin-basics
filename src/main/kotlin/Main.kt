fun main(args: Array<String>) {
//    stringActions()
//    numberActions()

    println(booleanActions(false))
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


