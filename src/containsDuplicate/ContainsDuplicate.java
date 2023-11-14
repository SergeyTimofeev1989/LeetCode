package containsDuplicate;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] array = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(containsDuplicate(array));
    }

    public static boolean containsDuplicate(int[] nums) {
        boolean isContains = false;
        Set<Integer> set = new HashSet<>();
        for (Integer num : nums) {
            if (set.contains(num)) {
                isContains = true;
                break;
            } else {
                set.add(num);
                isContains = false;
            }
        }
        return isContains;
    }
}
