
package OOPTASK.Task5

class Admin(name: String) : Person(name, "Admin") {
    override fun showInfo() {
        println("Администратор: $name")
    }
}
