import java.util.HashSet;
public class TwoSumOptimized {
    public static boolean twoSumOptimized(int[] nums, int target) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            int needed = target - num;
            if (seen.contains(needed)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}