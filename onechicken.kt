import java.util.*

/*
Author : Arda
Company : PhysTech
Date : 7/10/2020
*/

fun main(args:Array<String>){

    val sc = Scanner(System.`in`)

    val r = sc.nextInt()
    val q = sc.nextInt()

    val m = q-r

    if (m<0){
        if (m<-1) println("Dr. Chaz needs ${-m} more pieces of chicken!")
        else println("Dr. Chaz needs ${-m} more piece of chicken!")
    }
    else
    {
        if (m==1) println("Dr. Chaz will have ${m} piece of chicken left over!")
        else println("Dr. Chaz will have ${m} pieces of chicken left over!")
    }


}