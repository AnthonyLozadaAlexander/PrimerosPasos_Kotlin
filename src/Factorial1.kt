import java.util.Scanner

fun main(){

    var num: Int
    var factorial: Int
    val input = Scanner(System.`in`)

    println("Ingrese el numero factorial: ")
    factorial = input.nextInt()

    println("Ingrese el numero factorial denuevo: ")
    num = input.nextInt()

    for (i in factorial downTo 1)
    {
        factorial = (factorial - 1)
        println("$num x $factorial")
        num = (num * factorial)
        println("= $num")
    }

}
