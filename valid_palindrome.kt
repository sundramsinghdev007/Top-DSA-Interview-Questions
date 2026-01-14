/***
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, 
it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

***/ 
fun main() {
    println("Kotlin Playground - main function")
    val result = isPalindrome("A man, a plan, a canal: Panama")
    println("Is Pailindrome: $result") // Output: Contains Duplicate: true
}

fun isPalindrome(s: String): Boolean {
    var result = ""
    for(i in s){
        if(i.isLetterOrDigit()){
            result = result + result.lowercase()
        }
    }
    return result == result.reversed()
}