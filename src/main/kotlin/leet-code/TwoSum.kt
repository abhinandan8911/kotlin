package `leet-code`

class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val result = IntArray(2)
        for (i in 0 until nums.size) {
            val first = nums[i]
            val lookup = target - first
            for (j in i+1 until nums.size) {
                if (nums[j] == lookup) {
                    result[0] = i
                    result[1] = j
                }
            }
        }
        return result
    }
}


fun main(args: Array<String>) {
    val twoSum = TwoSum()
    val result = twoSum.twoSum(intArrayOf(2,7,11,15), 9)
    result.forEach { println(it) }
}