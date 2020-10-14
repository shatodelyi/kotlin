import java.lang.Math.*
import kotlin.math.ln

fun main() {

    //1.1.а
    val z = 1.toDouble()
    val mod = abs(2 * z)
    val lg = ln(mod)

    val pow1 = pow(z, 2.0)
    val arc = atan(pow1 * 2)

    val top = lg + arc


    val sum = z + 1
    val pow2 = pow(sum, 2.0)
    val mul = 3 * pow2

    val pow3 = pow(10.0, 6.0)
    val mul2 = 2.1 * pow3

    val bot = mul + mul2


    val res = top / bot
    println("1.1.a: " + res)


    //1.1.б

    val x = 1.toDouble()
    val z1 = 2.toDouble()

    val lg1 = ln(x + z1)
    val first = lg1 > 0

    val b = 0.5
    val second = 0 < b < 2


    val res1 = first && second
    println("1.1.б: " + res1)
}

private operator fun Boolean.compareTo(second: Int): Int {
return(second)
}




