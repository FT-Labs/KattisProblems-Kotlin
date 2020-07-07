import java.lang.Exception
import java.lang.StringBuilder

/*
Author : Arda
Company : PhysTech
Date : 7/7/2020
*/

fun main(args:Array<String>){

    while (true)
    {
        try {
            val s = readLine()!!.split(" ").toMutableList()


            for (i in s.indices)
            {
                if  (s[i][0]=='a' || s[i][0] =='o' || s[i][0]== 'i'|| s[i][0] == 'e' || s[i][0] == 'u'|| s[i][0] == 'y')
                {
                    s[i] = "${s[i]}yay"
                }
                else
                {
                    var sub = 0
                    for (q in s[i].indices)
                    {
                        if (!(s[i][q]=='a' || s[i][q] =='o' || s[i][q]== 'i'|| s[i][q] == 'e' || s[i][q] == 'u'|| s[i][q] == 'y'))
                        {
                            sub = q
                        }
                        else
                        {
                            break
                        }
                    }
                    s[i] = "${s[i].substring(sub+1)}${s[i].substring(0,sub+1)}ay"
                }
            }


            println(s.joinToString(" "))
        }
        catch (e : Exception)
        {
            break
        }
    }


}