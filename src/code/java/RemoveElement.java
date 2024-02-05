package code.java;

public class RemoveElement {
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
        RemoveElement solution27 = new RemoveElement();
        int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println(solution27.removeElement(nums, 2));
        for (int el : nums) System.out.println(el);
    }
}
