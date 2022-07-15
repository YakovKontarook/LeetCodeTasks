/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

        You may assume that each input would have exactly one solution, and you may not use the same element twice.

        You can return the answer in any order.

        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
*/

import java.util.HashMap;
import java.util.Map;

public class Task1 {

    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 4};
        int target = 6;
        for (int i : twoSum7ms(nums, target)) {
            System.out.println(i);
        }
    }

    public static int[] twoSum7ms(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int requiredNumber = target - nums[i];
            if(map.containsKey(requiredNumber) && map.get(requiredNumber) != i) {

                return new int[] {i, map.get(requiredNumber)};
            }
        }
        throw new IllegalArgumentException();
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            int firstNum = nums[i];
            for (int j = 1; j < nums.length; j++) {
                if (j == i) {
                    continue;
                }
                int secondNum = nums[j];
                if (target == firstNum + secondNum) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}
