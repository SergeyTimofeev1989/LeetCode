package twosum;

import java.util.Arrays;

public class MainTwo {
    public static void main(String[] args) {
        int[] array = {3, 2, 4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(array, target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i,j};
                }
            }
        }
        return new int[]{};
    }
}
