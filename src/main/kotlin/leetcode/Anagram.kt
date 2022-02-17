package leetcode

class Anagram {
    fun isAnagram(s: String, t: String): Boolean {
        val sSorted = s.toCharArray().sorted()
        val tSorted = t.toCharArray().sorted()
        return sSorted == tSorted
    }
}