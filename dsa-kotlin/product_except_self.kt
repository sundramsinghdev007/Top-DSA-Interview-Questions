/***
Given an integer array nums, return an array output where output[i] is the product of all the elements of nums except nums[i].

Each product is guaranteed to fit in a 32-bit integer.

Follow-up: Could you solve it in 
O
(
n
)
O(n) time without using the division operation?

Example 1:

Input: nums = [1,2,4,6]

Output: [48,24,12,8]
Example 2:

Input: nums = [-1,0,1,2,3]

Output: [0,-6,0,0,0]
Constraints:

2 <= nums.length <= 1000
-20 <= nums[i] <= 20
***/
fun main(){
        println("Kotlin Playground - main function")
    val result = productExceptSelf(intArrayOf(-1,0,1,2,3)).asList()
    println("Is productExceptSelf: $result") // Output: Contains groupAnagrams List of string list
}

fun productExceptSelf(nums: IntArray): IntArray {
    val resultArray = IntArray(nums.size){ 1 }
  for(i in 0 until nums.size){
      var sum = 1
        for(j in 0 until nums.size){
            if(j!=i){
                sum*=nums[j]
            }
        }
        resultArray[i]=sum
    }
    return resultArray
}

fun productExceptSelfOpimisedSolution(nums: IntArray): IntArray {
    val n = nums.size
    val result = IntArray(n)

    // First pass: Calculate the product of all elements to the left of each index.
    var leftProduct = 1
    for (i in 0 until n) {
        result[i] = leftProduct
        leftProduct *= nums[i]
    }

    // Second pass: Calculate the product of all elements to the right
    // and multiply it with the existing left product.
    var rightProduct = 1
    for (i in n - 1 downTo 0) {
        result[i] *= rightProduct
        rightProduct *= nums[i]
    }

    return result
}