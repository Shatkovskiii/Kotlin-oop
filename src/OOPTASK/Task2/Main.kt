package OOPTASK.Task2

fun main() {
    println("Введите количество студентов:")
    val n = readLine()!!.toInt()

    for (i in 1..n) {
        println("Введите имя и ID через пробел:")
        val input = readLine()!!.split(" ")
        val student = Student()
        student.setName(input[0])
        student.assignStudentId(input[1].toInt())
        student.printStudentDetails()
    }
}
