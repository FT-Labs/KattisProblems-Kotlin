import java.util.*
import kotlin.collections.ArrayList

/*
Author : Arda
Company : PhysTech
Date : 7/3/2020
*/

fun main(args:Array<String>){

    var n = readLine()!!.toInt()
    val sc = Scanner(System.`in`)

    while (n!=0){
        val l1 : ArrayList<Int> = arrayListOf()
        val l2 : ArrayList<Int> = arrayListOf()

        for (i in 0 until n) l1.add(sc.nextInt())
        for (i in 0 until n) l2.add(sc.nextInt())

        val l3 = l1.withIndex().map { it.value to it.index }.sortedBy { it.first }
        l2.sort()

        for (i in l3.sortedBy { it.second }){
            println(l2[l3.indexOf(Pair(i.first,i.second))])
        }

        println()

        n = sc.nextInt()
    }


}