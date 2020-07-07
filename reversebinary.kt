/*
Author : Arda
Company : PhysTech
Date : 7/7/2020
*/

fun main(args:Array<String>){
    val a = (Integer.toBinaryString(readLine()!!.toInt())).reversed()

    println(Integer.parseInt(a,2))
}