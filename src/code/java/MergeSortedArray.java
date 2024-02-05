package code.java;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + j;

        while (j >= 0) {
            if (i >= 0 && nums1[i] >= nums2[j])
                nums1[k--] = nums1[i--];
            else
                nums1[k--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        MergeSortedArray solution = new MergeSortedArray();
        int[] nums1 = new int[] {1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[] {2, 5, 6};
        solution.merge(nums1, 3, nums2, 3);
        for (int el : nums1) System.out.println(el);
    }
}
