package Problem_80;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        for (int el : nums) {
            if (j < 2 || nums[j - 2] != el) {
                nums[j++] = el;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1,1,1,2,2,3};
        System.out.println(solution.removeDuplicates(nums));
        for (int el : nums) System.out.println(el);
    }
}