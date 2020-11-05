import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import kotlin.math.cos
import kotlin.math.sqrt

fun main() {
    val eps = 0.000001
    fun sqr(v: Double) = v * v

    fun var1calcR(a: Double, b: Double, x: Double): Double {
        return sqr(x) * (x + 1) / b - sqr(kotlin.math.sin(x + a))
    }

    fun var1calcS(a: Double, b: Double, x: Double): Double {
        fun cube(p: Double) = p * p * p
        val xb = cube(x) + 3 * sqr(x) * b + 3 * x * sqr(b) + cube(b)

        return sqrt(x * b / a) + sqr(cos(xb))
    }

    println(var1calcR(0.7, 0.05, 0.5))
    println(var1calcS(0.7, 0.05, 0.5))

    @Test
    @Tag("var1")

    fun test() {
        assertEquals(6.631303,  var1calcR(0.7,0.05,0.5), eps)
        assertEquals(1.161556,  var1calcS(0.7,0.05,0.5), eps)
    }
    println(test())
}
