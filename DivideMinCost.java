import java.util.*;

public class DivideMinCost {
    // Divide an Array Into Subarrays With Minimum Cost I
    public int minimumCost(int[] nums) {
        int first = nums[0];
        Arrays.sort(nums, 1, nums.length);
        return first + nums[1] + nums[2];
    }
}
