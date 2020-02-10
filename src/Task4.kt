// Задание 4: Приветствие пользователя
// Напишите программу, запрашивающую имя пользователя и выводящую приветствие пользователя в консоль, после ввода имени.
fun main(){
    println("Представтесь, пожалуйста:")

    val inputString: String = readLine().toString()
    val userName = if(inputString.isNotEmpty()) inputString else "Незнакомец"

    println("Приветствую тебя, $userName")
}