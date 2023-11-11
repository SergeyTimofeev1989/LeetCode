package twosum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 10, 3};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    result[0] = j;
                    result[1] = i;
                }
            }
        }
        return result;
    }
}