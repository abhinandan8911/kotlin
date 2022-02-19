package leetcode

class MoveZeroes {
    fun moveZeroes(nums: IntArray): Unit {
        for (i in nums.indices) {
            if (nums[i] == 0) {
                var j = i+1
                while (j < nums.size && nums[j] == 0) {
                    j++
                }
                if (j < nums.size) {
                    nums[i] = nums[j]
                    nums[j] = 0
                }
            }
        }
    }
}