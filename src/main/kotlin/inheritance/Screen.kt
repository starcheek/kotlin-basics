package inheritance

interface UIElement {
    fun display()
}

enum class ConsoleColor(val charCode: String) {
    RED("\u001b[31m"),
    BLUE("\u001b[34m"),
    DEFAULT(""),
    RESET("\u001b[0m"),
}

class Screen(
    vararg val elements: UIElement
) {
    fun display() {
        elements.forEach { it.display() }
    }

    fun showStructure(
        textBeforeDisplay: String = "",
        elementsToShowStructureFor: Array<out UIElement> = elements
    ) {
        elementsToShowStructureFor.forEach { element ->
            print(textBeforeDisplay)
            when (element) {
                is Header -> print("Header")
                is Text -> print("Text")
                is Divider -> print("Divider")
                is Section -> {
                    println("Section")
                    showStructure("- ",element.children)
                }
            }
            println() // First task: see if you can fix this println() bug
            // Second task: Add swimming animals, cold-blooded animals and just add more species subtypes to the Animal file
            // Third creative task: weapon - ranged weapon, melee weapon, maces, sword, so on and so forth
        }
    }
}

open class Text(var text: String, var color: ConsoleColor = ConsoleColor.DEFAULT) : UIElement {
    override fun display() {
        println("${color.charCode}$text${ConsoleColor.RESET.charCode}")
    }
}

class Header(text: String) : Text(text.uppercase()) {
    override fun display() {
        super.display()
        repeat(text.length) {
            print("-")
        }
        println()
    }
}

// ----------
// header
// text
// ----------

class Section(vararg val children: UIElement) : UIElement {
    override fun display() {
        Divider().display()
        children.forEach { it.display() }
        Divider().display()
    }
}

class Divider : UIElement {
    override fun display() {
        println("------------------------------")
    }
}

// ISOLATED EXAMPLE, DO NOT HAVE MULTIPLE MAINS
fun main() {
    val screen = Screen(
        Header("Our Application"),
        Text("Hello World!", ConsoleColor.RED),
        Text("Hello World again!"),
        Section(
            Header("Experimenting"),
            Text("Oh no I am trapped"),
        ),
        Text("Footer")
    )

    screen.showStructure()
}
