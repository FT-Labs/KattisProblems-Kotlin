import java.util.*

/*
Author : Arda
Company : PhysTech
Date : 7/11/2020
*/

fun main(args:Array<String>){

    val arr = arrayListOf<Int>()
    val sc = Scanner(System.`in`)

    for (q_ in 0..8)
    {
        arr.add(sc.nextInt())
    }

    val total = arr.sum()-100


    loop@ for (i in arr.indices)
    {
        val f = arr[i]

        for (j in arr.indices)
        {
            if (i!=j)
            {
                if (arr[j]+f==total)
                {
                    arr.removeIf { it==f || it==arr[j] }
                    break@loop
                }
            }
        }
    }

    for(n in arr) println(n)


}