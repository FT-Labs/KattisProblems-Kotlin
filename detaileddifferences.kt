import java.lang.StringBuilder

/*
Author : Arda
Company : PhysTech
Date : 7/3/2020
*/

fun main(args : Array<String>){
    for (i in 0 until readLine()!!.toInt()){

        val sb = StringBuilder()

        val line1 = readLine()!!
        val line2 = readLine()!!

        for ((x,y) in line1.zip(line2)){
            if (x==y){
                sb.append(".")
            }else{
                sb.append("*")
            }
        }

        println(line1)
        println(line2)
        println(sb)
        println()

    }
}