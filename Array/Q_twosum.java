import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numToIndex.containsKey(complement)) {
                return new int[] { numToIndex.get(complement), i };
            }
            numToIndex.put(nums[i], i);
        }
        
        throw new IllegalArgumentException("No solution found");
    }
}

public class Q_twosum {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        
        Solution solution = new Solution();
        int[] result = solution.twoSum(nums, target);
        
        System.out.println("Indices of the two numbers that add up to the target:");
        System.out.println(result[0] + ", " + result[1]);
    }
}
