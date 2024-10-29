// Main.kt
package OOPTASK.Task4

fun main() {
    println("напиши чтобы гитара играла:")
    val command = readLine()?.trim()?.lowercase()

    if (command == "play") {
        val guitar = Guitar()
        guitar.play()
    } else {
        println("неизвестная команда.")
    }
}
