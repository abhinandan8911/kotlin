package leetcode

class StringCompression {
    fun compress(chars: CharArray): Int {
        val strBuilder = StringBuilder()
        var i = 0
        while (i < chars.size) {
            var present = chars[i]
            var j = i
            var count = 0
            while (j < chars.size) {
                val next = chars[j]
                if (next == present) {
                    count++
                    j++
                }
                else {
                    break
                }
            }
            strBuilder.append(present)
            if (count > 1) {
                strBuilder.append(count)
            }
            i += count
        }
        val result = strBuilder.toString().toCharArray()
        for (index in result.indices) {
            chars[index] = result[index]
        }
        return result.size
    }
}