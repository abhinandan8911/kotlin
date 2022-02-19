package leetcode

class FirstUniqChar {
    fun firstUniqChar(s: String): Int {
        val chars = s.toCharArray()
        for (i in chars.indices) {
            val present = chars[i]
            var found = false
            for (j in chars.indices) {
                val next = chars[j]
                if (next == present && j != i) {
                    found = true
                    break
                }
            }
            if(!found) {
                return i
            }
        }
        return -1
    }
}

fun main() {
    println(FirstUniqChar().firstUniqChar("eycode"))
}