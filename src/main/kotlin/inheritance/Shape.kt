package inheritance

import kotlin.math.pow
import kotlin.math.sqrt

abstract class Shape {
    abstract val sides: Int
    abstract fun area(): Double
    abstract fun perimeter(): Double

    open fun printInfo() {
        println("Sides: $sides")
        println("Area: ${area()}")
        println("Perimeter: ${perimeter()}")
    }
}

open class Rectangle(
    val a: Double = 5.0,
    val b: Double = 5.0,
) : Shape() {
    final override val sides = 4
    override fun area(): Double = a * b
    override fun perimeter(): Double = 2 * a + 2 * b

    val name = "Rectangle"

    override fun printInfo() {
        println("Name: $name")
        super.printInfo()
    }

    override fun toString(): String {
        return super.toString()
    }
}

class Square(a: Double = 5.00) : Rectangle(a, a)

class EqualTriangle(
    val name: String = "Equal Triangle",
    val a: Double = 5.00,
) : Shape() {
    override val sides = 3
    override fun area(): Double = a.toDouble().pow(2) * sqrt(0.75)
    override fun perimeter(): Double = a * 3.0
}

// DO NOT DO THIS IN A REAL APPLICATION
fun main() {
    val shapes = listOf(Rectangle(), Square(), EqualTriangle(), 5)

    shapes.forEach { item ->
        when (item) {
            is Rectangle -> {
                println("It is a rectangle")
            }
            is EqualTriangle -> {
                println("It is an equal triangle")
            }
            is Shape -> {
                println("It is a shape")
            }
        }
    }

//    val rectangle: Shape = Rectangle()
//    rectangle.printInfo()
//
//    when (rectangle) {
//        is Rectangle -> rectangle.name
//    }
}
