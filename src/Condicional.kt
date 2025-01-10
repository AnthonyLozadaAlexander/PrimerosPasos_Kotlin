import java.util.Scanner

fun main(){
    val input = Scanner(System.`in`)
    var edad: Int = 20

    println("Condicional If\n")
    println("Ingrese su edad: ")
    edad = input.nextInt()

    if (edad >= 18){
        println("Eres mayor de edad")
    } else {
        println("Eres menor de edad")
    }

    println("---------------------------------------------------------------\n")

    println("Condicional If-Else")
    println("Ingrese un numero: ")
    var numero: Int
    numero = input.nextInt()

    if(numero > 10)
    {
        println("El numero es mayor a 10")
    }
    else if(numero < 10)
    {
        println("El numero es menor a 10")
    }else
    {
        println("El numero es igual a 10")
    }
}