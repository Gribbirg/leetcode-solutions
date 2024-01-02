package Problem_26;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] >= nums[i]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(solution.removeDuplicates(nums));
        for (int el : nums) System.out.println(el);
    }
}