package leetcode

class SortedByFreq {
    fun frequencySort(s: String): String {
        val mapChars = mutableMapOf<Char, Int>()
        for(ch in s.toCharArray()) {
            mapChars[ch] = mapChars.getOrDefault(ch, 0) + 1
        }
        val entries = mapChars.entries
            .sortedByDescending { it.value }
            .toList()
        val strBuilder = StringBuilder()
        for (entry in entries) {
            for (i in 0 until entry.value) {
                strBuilder.append(entry.key)
            }
        }
        return strBuilder.toString()
    }
}

fun main() {
    println(SortedByFreq().frequencySort("tree"))
}