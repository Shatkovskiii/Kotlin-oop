
package OOPTASK.Task5

fun main() {
    println("введите имя и роль Moder или Admin):")
    val (name, role) = readLine()!!.split(" ")

    val person: Person = when (role) {
        "Moderator" -> Moderator(name)
        "Admin" -> Admin(name)
        else -> {
            println("Неизвестная роль.")
            return
        }
    }

    person.showInfo() // вывод информации
}
