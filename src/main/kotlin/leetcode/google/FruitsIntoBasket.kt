package leetcode.google

// https://leetcode.com/explore/interview/card/google/67/sql-2/3046/

class FruitsIntoBasket {
    fun totalFruit(fruits: IntArray): Int {
        var maxCount = 0
        val fruitSet = mutableSetOf<Int>()
        var i = 0
        while (i < fruits.size) {
            var count = 0
            fruitSet.clear()
            fruitSet.add(fruits[i])
            count++
            var j = i + 1
            while (j < fruits.size) {
                fruitSet.add(fruits[j])
                if (fruitSet.size <= 2) {
                    count++
                    j++
                } else {
                    break
                }
            }
            maxCount = maxCount.coerceAtLeast(count)
            if (maxCount == fruits.size) {
                return maxCount
            }
            i++
        }
        return maxCount
    }
}

fun main() {
    println(FruitsIntoBasket().totalFruit(intArrayOf(1, 2, 1)))
}