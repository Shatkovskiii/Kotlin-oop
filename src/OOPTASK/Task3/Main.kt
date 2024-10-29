package OOPTASK.Task3

fun main() {
    println("Введите первое число:")
    val num1 = readLine()!!.toDouble()

    println("Введите второе число:")
    val num2 = readLine()!!.toDouble()

    println("Выбор операции: 1 - сложение, 2 - вычитание, 3 - умножение, 4 - деление:")
    val operation = readLine()!!.trim()

    val mathOperations = MathOperations()
    var result = 0.0

    if (operation == "1") {
        result = mathOperations.add(num1, num2)
    } else if (operation == "2") {
        result = mathOperations.sub(num1, num2)
    } else if (operation == "3") {
        result = mathOperations.mul(num1, num2)
    } else if (operation == "4") {
        result = mathOperations.div(num1, num2)
    } else {
        println("Некорректная операция")
        return
    }

    println("Результат: $result")
}