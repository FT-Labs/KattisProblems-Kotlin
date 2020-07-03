/*
Author : Arda
Company : PhysTech
Date : 7/3/2020
*/

fun main(args:Array<String>){
    val line = readLine()!!

    var days = 0

    for (i in line.indices step 3){
        val cnt = "per".zip(line.substring(i,i+3).toLowerCase()).count { it.first != it.second }
        days += cnt

    }

    print(days)
}