package leetcode

// https://leetcode.com/explore/interview/card/bloomberg/69/linked-list/385/

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class AddTwoNumbers {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode {
        var first = l1
        var second = l2
        var firstVal = first?.`val` ?: 0
        var secondVal = second?.`val` ?: 0
        var sumValue = firstVal + secondVal
        var resultValue = sumValue % 10
        var carryValue = sumValue / 10
        val result = ListNode(resultValue)
        var travelResult = result
        while (first?.next != null || second?.next != null || carryValue > 0) {
            first = first?.next
            second = second?.next
            firstVal = first?.`val` ?: 0
            secondVal = second?.`val` ?: 0
            sumValue = firstVal + secondVal + carryValue
            resultValue = sumValue % 10
            carryValue = sumValue / 10
            val nextNode = ListNode(resultValue)
            travelResult.next = nextNode
            travelResult = nextNode
        }
        return result
    }
}

fun main() {
    val list1 = intArrayOf(9, 9, 9, 9, 9, 9, 9)
    val list2 = intArrayOf(9, 9, 9, 9)
    val result = AddTwoNumbers().addTwoNumbers(createLinkedList(list1), createLinkedList(list2))
    printLinkedList(result)
}

fun printLinkedList(linkedList: ListNode?) {
    var result = linkedList
    while (result != null) {
        if (result.next != null) {
            print(result.`val`.toString() + "->")
        } else {
            print(result.`val`)
        }
        result = result.next
    }
}

fun createLinkedList(arr: IntArray): ListNode? {
    var node: ListNode? = null
    for (num in arr) {
        if (node != null) {
            var traversalNode = node
            while (traversalNode?.next != null) {
                traversalNode = traversalNode.next
            }
            traversalNode?.next = ListNode(num)
        } else {
            node = ListNode(num)
        }
    }
    return node
}