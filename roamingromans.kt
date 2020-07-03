import java.util.*
import kotlin.math.round

/*
Author : Arda
Company : PhysTech
Date : 7/3/2020
*/



fun main(args : Array<String>){
    val sc = Scanner(System.`in`)
    val miles:Float = sc.nextFloat()*1000

    val rp : Float = round(miles*5280/4854)

    print(rp.toInt())
}