package models

data class Knight(var position: String, val color: Color, var isTaken: Boolean) {

    var eatenFiguresCount = 0
        private set

    fun move() {
        println("Your knight at $position moved!")
    }

    fun eatFigure(anotherKnight: Knight) {
        println("You are trying to eat knight at position ${anotherKnight.position}")
        eatenFiguresCount++ // eatenFigureCount = eatenFigureCount + 1
    }

    enum class Color(val stringValue: String, rgb: String) {
        WHITE("white", "FFF"),
        BLACK("black", "000")
    }
}
