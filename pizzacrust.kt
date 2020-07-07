import java.util.*
import kotlin.math.pow
/*
Author : Arda
Company : PhysTech
Date : 7/7/2020
*/

fun main(args:Array<String>){
    val sc = Scanner(System.`in`)

    val rad = sc.nextInt()
    val c = sc.nextInt()

    println("%.6f".format((rad-c).toFloat().pow(2)/rad.toFloat().pow(2)*100))
}