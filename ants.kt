import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.max
import kotlin.math.min

/*
Author : Arda
Company : PhysTech
Date : 7/9/2020
*/

fun main(args:Array<String>){
    val sc = Scanner(System.`in`)
    for (q_ in 0 until readLine()!!.toInt())
    {
        val l = sc.nextInt()
        val numAnts = sc.nextInt()

        val tmpMin : ArrayList<Int> = arrayListOf()
        val tmpMax : ArrayList<Int> = arrayListOf()

        for(w_ in 0 until numAnts){
            val i = sc.nextInt()
            if(i<l-i) tmpMin.add(i) else tmpMin.add(l-i)
            if(i>l-i) tmpMax.add(i) else tmpMax.add(l-i)
        }


        println("${tmpMin.max()} ${tmpMax.max()}")
    }

}