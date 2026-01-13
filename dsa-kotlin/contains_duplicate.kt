fun main() {
    println("Kotlin Playground - main function")
    val nums = intArrayOf(1, 2, 3, 1)
    val result = containsDuplicate(nums)
    println("Contains Duplicate: $result") // Output: Contains Duplicate: true
}

fun containsDuplicate(num: IntArray):Boolean { 
    val mutableSet = mutableSetOf<Int>()
    for(n in num){
        if(mutableSet.contains(n)){
            return true
        }else{
            mutableSet.add(n)
        }
    }
    return false
}