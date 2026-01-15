/***
Given an array of strings strs, group all anagrams together into sublists. You may return the output in any order.

An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.

Example 1:

Input: strs = ["act","pots","tops","cat","stop","hat"]

Output: [["hat"],["act", "cat"],["stop", "pots", "tops"]]
Example 2:

Input: strs = ["x"]

Output: [["x"]]
Example 3:

Input: strs = [""]

Output: [[""]]
Constraints:

1 <= strs.length <= 1000.
0 <= strs[i].length <= 100
strs[i] is made up of lowercase English letters.

***/
fun main(){
        println("Kotlin Playground - main function")
    val result = groupAnagrams(arrayOf("act","pots","tops","cat","stop","hat"))
    println("Is groupAnagrams: $result") // Output: Contains groupAnagrams List of string list
}

fun groupAnagrams(strs: Array<String>): List<List<String>> {
    if(strs.isEmpty() || strs.size==1) return ArrayList<ArrayList<String>>()
	val map = HashMap<String, MutableList<String>>()	
    for (str in strs) {
        // 1. Convert to char array and sort to generate key
        val charArray = str.toCharArray()
        charArray.sort()
        val sortedKey = String(charArray)

        // 2. Add string to the correct group in the map
        // 'getOrPut' creates the ArrayList if the key doesn't exist yet
        map.getOrPut(sortedKey) { ArrayList() }.add(str)
    }
    // 3. Return the grouped lists
    return ArrayList(map.values)
}