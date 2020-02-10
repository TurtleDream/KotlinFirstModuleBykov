// Задание 6: Сравнение
// Напишите программу, которая запрашивает у пользователя два числа в переменные “a” и “b”. Проверьте больше ли "a" чем "b" и получите результат в виде переменой типа boolean.
fun main(){
    println("Введите число a:")
    val a = readLine().toString().toDouble()

    println("Введите число b:")
    val b = readLine().toString().toDouble()

    // P.S. Запихнул в переменную только из-за условия.
    val result = a > b
    println(result)
}