package OOPTASK.Task2

class Student : Person() {
    var studentId: Int = 0

    fun assignStudentId(newId: Int) {
        studentId = newId
    }

    fun printStudentDetails() {
        printName() // выводим имя
        println("Студенческий ID: $studentId")
    }
}
