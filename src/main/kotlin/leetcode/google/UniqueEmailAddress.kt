package leetcode.google

// https://leetcode.com/explore/interview/card/google/67/sql-2/3044/
class UniqueEmailAddress {
    fun numUniqueEmails(emails: Array<String>): Int {
        val emailSet = mutableSetOf<String>()
        for (email in emails) {
            val emailPart = email.split("@")
            val local = emailPart[0]
            val domain = emailPart[1]
            var parsedLocal = local.replace(".", "")
            parsedLocal = parsedLocal.substringBefore('+')
            emailSet.add("$parsedLocal@$domain")
        }
        return emailSet.size
    }
}

fun main() {
    val strings =
        arrayOf("test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com")
    println(UniqueEmailAddress().numUniqueEmails(strings))
}