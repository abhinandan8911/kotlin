package leetcode
//https://leetcode.com/explore/interview/card/bloomberg/508/heap-queue-stack/384/
class ValidParenthesis {
    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()
        for (ch in s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.addLast(ch)
            }
            else if (stack.isNotEmpty()) {
                val popped = stack.removeLast()
                val matched = when(ch) {
                    ')' -> popped == '('
                    '}' -> popped == '{'
                    ']' -> popped == '['
                    else -> false
                }
                if (!matched) {
                    return false
                }
            }
            else {
                return false
            }
        }
        return stack.isEmpty()
    }
}

fun main() {
    println(ValidParenthesis().isValid("["))
}