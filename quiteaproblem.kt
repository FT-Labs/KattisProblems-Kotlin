import java.lang.Exception

/*
Author : Arda
Company : PhysTech
Date : 7/7/2020
*/

fun main(args:Array<String>){

    while (true)
    {
        try {
            val s = readLine()!!.toLowerCase()
            if (s.contains("problem")) println("yes") else println("no")
        }
        catch (e : Exception)
        {
            break
        }
    }
}