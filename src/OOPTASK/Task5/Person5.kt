
package OOPTASK.Task5

open class Person(val name: String, val role: String) {
    open fun showInfo() {
        println("Имя: $name, Роль: $role")
    }
}
