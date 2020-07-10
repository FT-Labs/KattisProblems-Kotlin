/*
Author : Arda
Company : PhysTech
Date : 7/11/2020
*/

fun main(args:Array<String>){

    val nums = readLine()!!.split(" ").map { it.toInt() }

    if ((nums.sum()-nums.last() < nums.last()) || (nums[0]<= 0 || nums[1]<=0 || nums[2]<=0) || nums[3]<=2)
    {
        println("NO")
    }
    else
    {
        println("YES")
    }

}