package common

import models.Knight

fun Int.isGreaterThan(number: Int): Boolean {
    return this > number
}

fun Knight.showColorWithPosition() {
    println("Color is $color and position is $position")
}
