package leetcode

class LongestSubstring {
    fun lengthOfLongestSubstring(s: String): Int {
        val charValue = s.toCharArray()
        var i = 0
        var maxLength = 0
        while (i < charValue.size) {
            val setOfChars = mutableSetOf<Char>()
            setOfChars.add(charValue[i])
            var j = i + 1
            while (j < charValue.size) {
                if (!setOfChars.contains(charValue[j])) {
                    setOfChars.add(charValue[j])
                    j++
                }
                else {
                    break
                }
            }
            maxLength = maxLength.coerceAtLeast(setOfChars.size)
            i++
        }
        return maxLength
    }

}

fun main(args: Array<String>) {
    val longestSubstring = LongestSubstring()
    println(longestSubstring.lengthOfLongestSubstring("abcabcbb"))
}