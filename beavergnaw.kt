import java.util.*
import kotlin.math.pow

/*
Author : Arda
Company : PhysTech
Date : 7/9/2020
*/

fun main(args:Array<String>){
    val sc = Scanner(System.`in`)

    var d = sc.nextInt()
    var v = sc.nextInt()
    while (d!=0 && v!= 0)
    {
        println(Math.cbrt((v*-6/Math.PI)+ d.toDouble().pow(3)))
        d = sc.nextInt()
        v = sc.nextInt()
    }

}