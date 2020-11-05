import java.lang.Double.parseDouble
import java.lang.Integer.parseInt

fun main () {
    //Task1
    println("Task1: enter a number from 1 to 7")
    fun task1 ():Int {
        var n = parseInt(readLine()!!)
        var x = 1
            for (j in 7 downTo n) {
                x *= j
            }
        x *= 2
        return x
    }
    println(task1())

    //Task2
    println("task2: enter [a; b] and function step (h)")
    fun task2 () {
        println("enter a")
        var a = parseDouble(readLine()!!)
        println("enter b")
        var b = parseDouble(readLine()!!)
        println("enter h")
        var h = parseDouble(readLine()!!)

        var y:Double
        while (a < b) {

            println("x: $a")

            y = kotlin.math.tan(a) / kotlin.math.ln(a)
            println("y: $y")
            if (a + h > b ) {
                break
            }

            a += h
        }
    }

    println(task2())


}