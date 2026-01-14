fun main() {
    println("Kotlin Playground - main function")
    val result = isAnagram("carrace","racecar")
    val resultOptimised = isAnagramOptimised("carrace","racecar")
    println("Contains Duplicate: $result") // Output: Contains Duplicate: true
        println("Contains Duplicate:resultOptimised = $resultOptimised") // Output: Contains Duplicate: true
}

fun isAnagram(s: String, t: String): Boolean {
    if(s.length != t.length) return false
    val sHashMap = mutableMapOf<Char,Int>()
    val tHashMap = mutableMapOf<Char,Int>()
    for(i in 0 until s.length){
        sHashMap[s[i]] = sHashMap.getOrDefault(s[i],0)+1
        tHashMap[t[i]] = tHashMap.getOrDefault(t[i],0)+1
    }
    return sHashMap == tHashMap
}

fun isAnagramOptimised(s:String,t:String):Boolean{
    if(s.length != t.length) return false
    val count = IntArray(26)
    for(i in s.indices){
        count[s[i] - 'a']++
        count[t[i] - 'a']--
    }
    return count.all{it==0}
}