package problem27;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= val) {
                j++;
            } else {
                nums[i - j] = nums[i];
            }
        }
        return nums.length - j;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println(solution.removeElement(nums, 2));
        for (int el : nums) System.out.println(el);
    }
}
