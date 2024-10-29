package OOPTASK.Task1
class Person1 {
    var name: String = ""

    fun printName() {
        println("Имя: " + name)
    }
}


fun main() {
    println("Введите количество людей:")
    val n = readLine()!!.toInt()

    val people = ArrayList<Person1>() // список людей

    for (i in 1..n) {
        println("Введите имя человека:")
        val name = readLine()!!
        val person = Person1()
        person.name = name
        people.add(person) // добав в список
    }

    println("Список:")

    for (i in 0 until people.size) { // подбор через индекст
        people[i].printName()
    }
}
