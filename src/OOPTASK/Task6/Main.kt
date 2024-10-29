package OOPTASK.Task6

// Main.kt
fun main() {
    println("Введите Dog, Cat или Bird:")
    val animalName = readLine()

    var animal: Animal? = null

    if (animalName == "Dog") {
        animal = Dog()
    } else if (animalName == "Cat") {
        animal = Cat()
    } else if (animalName == "Bird") {
        animal = Bird()
    } else {
        println("Неизвестное животное.")
        return
    }

    animal.sound()
}
