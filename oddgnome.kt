import java.util.*

/*
Author : Arda
Company : PhysTech
Date : 7/4/2020
*/

fun main(args:Array<String>){
    val sc = Scanner(System.`in`)

    for (q_ in 0 until sc.nextLine().toInt()){
        sc.nextInt()

        var firstNum = sc.nextInt()
        sc.skip(" ")
        val group = sc.nextLine().split(" ").map { it.toInt() }
        var cnt = 1

        for (i in group){
           if (firstNum+1==i){
               firstNum = i
               cnt ++
           }else{
               println(cnt+1)
               break
           }
        }

    }

}