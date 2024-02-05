package code.java;

public class RemoveDuplicatesFromSortedArrayII {
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
        RemoveDuplicatesFromSortedArrayII solution = new RemoveDuplicatesFromSortedArrayII();
        int[] nums = new int[]{1,1,1,2,2,3};
        System.out.println(solution.removeDuplicates(nums));
        for (int el : nums) System.out.println(el);
    }
}