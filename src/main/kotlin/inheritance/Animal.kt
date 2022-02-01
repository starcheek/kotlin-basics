package inheritance

open class Animal {
    open val name = "Animal"

    open fun eat() {
        println("Animal is eating")
    }
    open fun sleep() {
        println("Animal is sleeping")
    }
}

interface Predator {
    fun hunt()
}

interface FlyingAnimal {
    fun fly()
}

class Eagle : Animal(), Predator, FlyingAnimal {
    override val name: String
        get() = super.name

    override fun eat() {
        super.eat()
    }

    override fun sleep() {
        super.sleep()
    }

    override fun hunt() {
        TODO("Not yet implemented")
    }

    override fun fly() {
        TODO("Not yet implemented")
    }
}

class Cat : Animal(), Predator {
    override val name = "Cat"

    override fun hunt() {
        TODO("Not yet implemented")
    }

    override fun eat() {
        super.eat()
        println("Cat is eating fish happily")
    }

    override fun sleep() {
        println("Cat is happily sleeping on your laptop")
    }
}

class Dog : Animal() {
    override val name = "Dog"

    override fun eat() {
        println("Dog is eating")
    }

    override fun sleep() {
        println("Dog is sleeping and not barking")
    }
}

fun main() {
    val kingdom = mutableListOf<Animal>(Dog(), Cat())

    kingdom.forEach { animal ->
        animal.eat()
    }

    val predators = mutableListOf<Predator>(Cat(), Eagle())
    predators.first().hunt()
}
