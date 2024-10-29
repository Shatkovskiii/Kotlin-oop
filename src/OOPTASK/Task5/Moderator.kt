
package OOPTASK.Task5

class Moderator(name: String) : Person(name, "Moderator") {
    override fun showInfo() {
        println("Модератор: $name")
    }
}
