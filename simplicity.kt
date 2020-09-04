/*
Author : Arda
Company : PhysTech
Date : 9/5/2020
*/

fun main(args: Array<String>) {
    val s = readLine()!!

    var charCount: HashMap<Char, Int> = hashMapOf()

    for (ch in s) {
        if (ch in charCount.keys) {
            charCount[ch] = charCount[ch]!! + 1
        } else {
            charCount[ch] = 1
        }
    }

    val chLength = charCount.size

    if (chLength <= 2) {
        println(0)
    } else {
        val subtractNeeded = chLength - 2

        val newMap = charCount.toList().sortedBy { (_, value) -> value }.toMap()

        var cnt = 0
        var total = 0
        for ((key, value) in newMap) {

            total += 1
            cnt += value

            if (total == subtractNeeded) break

        }

        println(cnt)
    }
}
