fun main() {
    println("Kotlin Playground - main function")
    val nums = intArrayOf(2, 7, 11, 15)
    val target = 9
    val result = twoSumArrayAndHash(nums, target)
    println("Indices: ${result.joinToString(", ")}") // Output: Indices
}
fun twoSumOn(nums: IntArray, target: Int): IntArray {
    for (i in nums.indices) {
        for (j in i + 1 until nums.size) {
            if (nums[i] + nums[j] == target) return intArrayOf(i, j)
        }
    }
    return intArrayOf() // no solution
}

fun twoSumArrayAndHash(nums: IntArray, target: Int): IntArray {
    val map = mutableMapOf<Int, Int>() // number → index

    for ((index, num) in nums.withIndex()) {
        val complement = target - num
        if (map.containsKey(complement)) {
            return intArrayOf(map[complement]!!, index)
        }
        map[num] = index
    }

    return intArrayOf() // If no solution found
}