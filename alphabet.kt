import java.lang.Exception
import java.lang.StringBuilder
import kotlin.math.max

/*
Author : Arda
Company : PhysTech
Date : 7/8/2020
*/

fun main(args:Array<String>){


    val line = readLine()!!.toString()

    val alphabet: StringBuilder = StringBuilder()
    ('a'..'z').forEach { alphabet.append(it) }


    //Longest common subsequence,dp-problem.
    //If you don't understand the code, look for coin change problem on youtube.

    val mat   = Array(alphabet.length+1){IntArray(line.length+1)}



    for (i in 1..alphabet.length)
    {
        for (j in 1..line.length)
        {
            if (alphabet[i-1] == line[j-1])
            {
                mat[i][j] = 1 + mat[i-1][j-1]
            }
            else
            {
                mat[i][j] = max(mat[i-1][j],mat[i][j-1])
            }
        }
    }


    println(26-mat[mat.size-1][mat[0].size-1])
}