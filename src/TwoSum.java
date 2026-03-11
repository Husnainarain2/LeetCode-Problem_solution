import java.util.HashMap;
class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){

            int complement = target - nums[i];

            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }

 public    static void main(String[] args) {
        TwoSum solution = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.

// Example 1:
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return
// [0, 1].
// Example 2:
// Input: nums = [3,2,4], target = 6
// Output: [1,2]
// Example 3:
// Input: nums = [3,3], target = 6
// Output: [0,1]



//its have a time complexity of O(n) because we traverse the array once, and each lookup in the hash map is O(1). The space complexity is also O(n) in the worst case, if all elements are unique and stored in the hash map.

// in other case nested loop approach will have a time complexity of O(n^2) because we would be checking each pair of numbers in the array, and the space complexity would be O(1) since we are not using any additional data structures.


//class Solution {
//
//    public int[] twoSum(int[] nums, int target) {
//
//        for(int i = 0; i < nums.length; i++) {
//
//            for(int j = i + 1; j < nums.length; j++) {
//
//                if(nums[i] + nums[j] == target) {
//
//                    return new int[]{i, j};
//                }
//            }
//        }
//
//        return new int[]{};
//    }
//}