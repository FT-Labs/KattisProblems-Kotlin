import kotlin.math.max

/*
Author : Arda
Company : PhysTech
Date : 7/3/2020
*/

fun main(args: Array<String>) {

    val tines = readLine()!!.split(" ").map { it.toInt() }


    if (tines[0] == 0 && tines[1] == 0) {
        print("Not a moose")
    } else if (tines[0] == tines[1]) {
        print("Even ${2 * tines[0]}")
    } else {
        print("Odd ${max(tines[0], tines[1]) * 2}")
    }

}