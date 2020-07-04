/*
Author : Arda
Company : PhysTech
Date : 7/4/2020
*/
import kotlin.math.PI
import kotlin.math.pow

fun main(args:Array<String>){

    val radius = readLine()!!.toDouble()
    val ratio : Double = (2/ PI).pow(0.5)

    val euclidArea = radius.pow(2)* PI
    val taxicabArea = (radius*ratio).pow(2)* PI

    println("%.6f".format(euclidArea))
    println("%.6f".format(taxicabArea))
}