package OOPTASK.Task7

fun main() {
    println("Введите количество автомобилей:")
    val n = readLine()!!.toInt() // читаем количество автомобилей

    for (i in 1..n) {
        println("Введите марку брички и год через пробел:")
        val input = readLine()!!.split(' ')
        val brand = input[0]
        val year = input[1].toInt()

        val car = Car(brand, year)
        car.printDetails()
    }
}
