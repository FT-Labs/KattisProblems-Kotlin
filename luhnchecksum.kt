
import java.util.*


/*
Author : Arda
Company : PhysTech
Date : 7/7/2020
*/


fun main(args: Array<String>) {

    val n = readLine()!!.toInt()
    for (i in 0 until n) {
        val q = readLine()!!
        var total = 0
        for (j in q.indices) {
            if (j % 2 == q.length % 2) {
                var add = (q[j].toInt() - 48) * 2
                if (add > 9) {
                    val p = add % 10
                    add = Math.floorDiv(add, 10)
                    add += p
                }
                total += add
            }
            else {
                total += q[j].toInt() - 48
            }
        }
        if (total % 10 == 0)  println("PASS")  else   println("FAIL")
        }
    }





