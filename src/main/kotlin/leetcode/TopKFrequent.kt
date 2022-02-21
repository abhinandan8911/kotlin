package leetcode

//https://leetcode.com/explore/interview/card/bloomberg/72/sorting-and-searching/2936/
class TopKFrequent {
    fun topKFrequent(words: Array<String>, k: Int): List<String> {
        words.sort()
        val wordMap = linkedMapOf<String, Int>()
        for(word in words) {
            wordMap[word] = wordMap.getOrDefault(word, 0) + 1
        }
        return wordMap.entries
            .sortedByDescending { it.value }
            .take(k)
            .map { it.key }
    }
}

fun main() {
    println(TopKFrequent().topKFrequent(arrayOf("i","love","leetcode","i","love","coding"), 3))
}