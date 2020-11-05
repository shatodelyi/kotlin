package main
import kotlin.math.sign


fun main () {

    fun sqr(v: Double) = v * v

    fun task1(n:Int):Int {
        val t = 17 * n
        var x = t
        if (t < 10 || t > 30) {
            x = 3
        } else if (t <= 20) {
            x = 0
        } else {

        }
        return x
    }

    println("task1: ${task1(1)}")

    fun task2 (x:Double, y:Double): Boolean {

        //triangle
        val v1 = (.0 - x)*(.0 - .0)-(-4.0 - .0)*(.0 - y)
        val v2 = (-4.0 - x)*(-4.0 - .0)-(.0 - -4.0)*(.0 - y)
        val v3 = (.0 - x)*(.0 - -4.0)-(.0 - .0)*(-4.0 - y)

        val s1 = sign(v1)
        val s2 = sign(v2)
        val s3 = sign(v3)

        //println(s1)
        //println(s2)
        //println(s3)

        //square & ring

        return (x in 0.0..4.0) && (y in 0.0..4.0) && //square
                (sqr(x - 0) + sqr(y - 0) >= sqr(2.0)) || //ring
                (s1 + s2 + s3 in 2.0..3.0 || x in -4.0..0.0 && y == 0.0 ||
                        y in -4.0..0.0 && x == 0.0 || x == 0.0 && y ==0.0) //triangle
    }
    println("task2: ${task2(0.0, -2.0)}")


    fun task3(x:Double):Double {
        return when {
            x < 0.0 -> { -x }
            x > 0.0 -> {sqr(-x)}
            else -> x
        }
    }

    println("task3: ${task3(1.0)}")
}

