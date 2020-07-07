/*
Author : Arda
Company : PhysTech
Date : 7/7/2020
*/

fun main(args:Array<String>){

    for (q_ in 0 until readLine()!!.toInt()){

        val firstLine = readLine()!!.split(" ").map { it.removeSurrounding(" ") }.toMutableList()

        while (true){
            val s = readLine()!!.split(" ").last()
            if (s=="say?") break
            firstLine.removeAll { it == s }
        }
        println(firstLine.joinToString(" "))
    }


}