package fra.module

class Solution {
    fun majorityElement(nums: IntArray): Int {
        val n: Int = nums.size
        var map = mutableMapOf<Int, Int>()
        for (value in nums) {
            map.merge(value, 1, Int::plus)
            val v: Int = map.get(value) ?: 0
            if (v > n/2) return value
        }
        return -1
    }
}