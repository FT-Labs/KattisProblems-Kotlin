import java.util.*
import kotlin.collections.ArrayList

/*
Author : Arda
Company : PhysTech
Date : 7/4/2020
*/

fun main(args:Array<String>){
    val sc = Scanner(System.`in`)

    val nums : ArrayList<Int> = arrayListOf()
    for (q_ in 0 until sc.nextLine().toInt()){
        nums.add(sc.nextInt())
    }

    if (nums.size == nums.get(nums.lastIndex)) println("good job")

    for (i in 1 until  nums[nums.lastIndex]+1){
        if (i !in nums){
            println(i)
        }
    }



}