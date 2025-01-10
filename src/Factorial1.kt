fun main(){
    class Factorial {
        fun main(){
            var num: Int
            var factorial: Int
            var i: Int
            println("Ingrese el numero factorial: ")
            factorial = readLine()?.toInt() ?: 0

            println("Ingrese el numero factorial denuevo: ")
            num = readLine()?.toInt() ?: 0

            for (i in 1.. factorial)
            {
                factorial = (factorial - 1)
                println("$i x $factorial")
                num = (num * factorial)
                println("= $num")

            }
        }
    }
}