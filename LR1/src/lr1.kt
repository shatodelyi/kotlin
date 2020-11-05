import java.lang.Math.pow
import kotlin.math.ln
import kotlin.math.pow
import kotlin.math.sin
import kotlin.math.sqrt

fun main() {

    //1.1.а
    fun task__1_1_a(z: Double): Double {
        val mod = Math.abs(2 * z)
        val lg = ln(mod)

        val pow1 = pow(z, 2.0)
        val arc = Math.atan(pow1 * 2)

        val top = lg + arc


        val sum = z + 1
        val pow2 = pow(sum, 2.0)
        val mul = 3 * pow2

        val pow3 = pow(10.0, 6.0)
        val mul2 = 2.1 * pow3

        val bot = mul + mul2

        val res = top / bot
        return(res)
    }

    println("1.1.a: " + task__1_1_a(1.0))



    //1.1.б

    fun task__1_1_b(x: Double, z: Double, b: Double): Boolean {

        val lg1 = ln(x + z)
        val first = lg1 > 0

        val second = 0 < b < 2

        val res = first && second
        return(res)
    }
    println("1.1.б: " + task__1_1_b(1.0, 2.0, 0.5))

    //1.2

    fun task__1_2(x:Double, a:Double):Double {

        //1
        fun sqrt():Double {
            val sin = sin(x)
            val sqrt = sqrt(sin)
            return sqrt
        }

        //2
        fun sqrt1():Double {
            val sqrt = sqrt(x)
            return sqrt
        }

        //3
        val first = 2.0 / 3.0 / x / a

        //4
        val second = sqrt() / 2 * sqrt1()

        //5
        val third = 1.0e-6.pow(1 / 7)

        //6
        val res = x + first + second + third
        return res
    }
    println("1.2: " + task__1_2(1.0, 2.0))

    fun task__1_3(xa:Int, ya:Int, xb:Int, yb:Int):Double {
        val t5xa = 5 * xa
        val t5ya = 5 * ya

        val t10xb = 10 * xb
        val t10yb = 10 * yb

        val t5a = t5xa + t10xb.toDouble()
        val t10b = t5ya + t10yb.toDouble()

        fun pow1 ():Double {
            val pow= pow(t5a, 2.toDouble())
            return pow
        }

        fun pow2 ():Double {
            val pow= pow(t10b, 2.toDouble())
            return pow
        }

        val res = sqrt(pow1() + pow2())
        return res
    }

    println("1.3 Модуль вектору 5a+10b: " + task__1_3(3, 2, 0, -1))
}

private operator fun Boolean.compareTo(second: Int): Int {
    return(second)
}