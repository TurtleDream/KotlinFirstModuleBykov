// Задание 3: Преобразование
fun main(){
    // Преобразуйте  var five: Char = '5' в String, Byte, Short, Int, Double, FLoat и Long
    var five: Char = '5'

    // P.S. Добавил проверки на типы. P.P.S При простом вызове этой функции переменная не меняет тип, нужно бы засовывать в temp переменную
    println(five.toString() is String);
    println(five.toByte() is Byte);
    println(five.toShort() is Short);
    println(five.toInt() is Int);
    println(five.toDouble() is Double);
    println(five.toFloat() is Float);
    println(five.toLong() is Long);
}