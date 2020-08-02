package array

import java.util.*

// Complete the rotLeft function below.
fun rotLeft(a: Array<Int>, d: Int): Array<Int> {
    val rotateBy = d%a.size
    val arr = Array(a.size){0}
    var pos = 0
    for(i in rotateBy until a.size){
        arr[pos] = a[i]
        pos++
    }
    for(i in 0 until rotateBy){
        arr[pos] = a[i]
        pos++
    }

    return arr
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nd = scan.nextLine().split(" ")

    val n = nd[0].trim().toInt()

    val d = nd[1].trim().toInt()

    val a = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = rotLeft(a, d)

    println(result.joinToString(" "))
}
