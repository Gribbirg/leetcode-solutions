package problem189;

public class Solution {
    public void rotate(int[] nums, int k) {
        int j;
        for (int i = nums.length - 1; i >= 0; i--) {
            j = i - k;
            if (j < 0) j += nums.length;
            nums[i] = nums[j];
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1,2,3,4,5,6,7};
        solution.rotate(nums, 3);
        for (int el : nums) System.out.println(el);
    }
}
