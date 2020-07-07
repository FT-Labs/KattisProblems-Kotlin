/*
Author : Arda
Company : PhysTech
Date : 7/7/2020
*/

fun main(args:Array<String>){

    for (q_ in 0 until readLine()!!.toInt()){

        val l : MutableMap<String, Int> = mutableMapOf()

        for (y_ in 0 until readLine()!!.toInt()){
            val s = readLine()!!.split(" ")

            if (s[0] in l.keys)
                {
                    l[s[0]] = s[1].toInt() + l[s[0]]!!
                }
            else
            {
                l[s[0]] = s[1].toInt()
            }
        }

        println(l.size)
        l.toList().sortedBy { it.first }.sortedByDescending { it.second }.forEach { (t, u) ->  println("$t $u") }
    }
}