import java.lang.Exception

/*
Author : Arda
Company : PhysTech
Date : 7/7/2020
*/

fun main(args: Array<String>) {

    var n = readLine()!!
    var vals: MutableMap<String, Int> = mutableMapOf()
    while (true) {
        try {
            val data = n.split(" ")
            if (data[0] == "clear") {
                vals = mutableMapOf()
            } else if (data[0] == "def") {
                vals[data[1].removeSurrounding(" ")] = data[2].toInt()
            } else if (data[0] == "calc") {
                var total = 0
                val arr: ArrayList<String> = arrayListOf()
                val sign: ArrayList<String> = arrayListOf()
                for (i in 1 until data.size - 1) {
                    if (data[i].contains("+") || data[i].contains("-")) {
                        sign.add(data[i])
                    } else {
                        arr.add(data[i])
                    }
                }
                try {
                    for (i in 0 until arr.size - 1 step 2) {

                            val q = sign.removeAt(0)
                            if (q == "+") {
                                total += vals[arr[i]]!! + vals[arr[i + 1]]!!
                            } else if (q == "-") {
                                total += vals[arr[i]]!! - vals[arr[i + 1]]!!
                            }

                    }
                    if(arr.size%2!=0){
                        if (sign.removeAt(0) == "+") {
                            total += vals[arr[arr.lastIndex]]!!

                        } else {
                            total -= vals[arr[arr.lastIndex]]!!
                        }
                    }

                    var ans = "unknown"

                    if (total in vals.values) {
                        ans = vals.filterValues { it == total }.keys.toString()
                    }
                    println("${data.subList(1, data.size).joinToString(" ")} ${ans.removeSurrounding("[", "]")}")
                } catch (e: Exception) {
                    var ans = "unknown"
                    if (total in vals.values) {
                        ans = vals.filterValues { it == total }.keys.toString()
                    }
                    println("${data.subList(1, data.size).joinToString(" ")} ${ans.removeSurrounding("[", "]")}")
                }
            }

            n = readLine()!!

        } catch (e: Exception) {
            break
        }
    }


}