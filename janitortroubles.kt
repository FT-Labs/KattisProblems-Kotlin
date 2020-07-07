import kotlin.math.sqrt
import kotlin.math.cos
import kotlin.math.pow
import kotlin.math.PI
/*
Author : Arda
Company : PhysTech
Date : 7/7/2020
*/


fun main(args:Array<String>){

    val nums = readLine()!!.split(" ").map { it.toInt() }

    val s = nums.sum()/2.0
    //Second part (The cos one) is'nt needed, bc cosPI/2 is always zero. However, i wanted to write the full formula.
    //It's called Bretschneider's formula.
    val area = sqrt(nums.map{ it -> s-it }.reduce { acc, d -> acc*d } - nums.reduce { acc, i -> acc * i }* cos(PI/2).pow(2))

    println(area)



}