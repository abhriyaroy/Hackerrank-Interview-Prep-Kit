package array

import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

// Complete the minimumBribes function below.
fun minimumBribes(q: Array<Int>): Unit {
    var count = 0
    for(i in q.size-1 downTo 0){
        if(q[i]!=i+1){
            if(i-1>=0 && q[i-1]==i+1){
                count++
                swap(q, i-1, i)
            }
            else if (i-2>=0 && q[i-2]==i+1){
                count+=2
                swap(q, i-2, i-1)
                swap(q,  i-1, i)
            } else {
                println("Too chaotic")
                return
            }
        }
    }
    println(count)
}

fun swap(q: Array<Int>, a: Int, b: Int){
    val tmp = q[a]
    q[a] = q[b]
    q[b]=tmp
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val n = scan.nextLine().trim().toInt()

        val q = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

        minimumBribes(q)
    }
}
