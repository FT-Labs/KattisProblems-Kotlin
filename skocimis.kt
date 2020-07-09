import kotlin.math.max

/*
Author : Arda
Company : PhysTech
Date : 7/9/2020
*/

fun main(args:Array<String>){

    val kangs = readLine()!!.split(" ").map { it.toInt() }

    val mx = max(kangs[1]-kangs[0],kangs[2]-kangs[1])

    println(mx-1)


}