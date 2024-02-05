package code.java;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int count = 0;
        int n = 0;

        for (int el : nums) {
            if (count == 0) {
                n = el;
                count = 1;
            } else if (n == el) {
                count++;
            } else {
                count--;
            }
        }

        return n;
    }

    public static void main(String[] args) {
        MajorityElement solution = new MajorityElement();
        int[] nums = new int[]{2, 2, 1, 1, 1, 2, 2};
        System.out.println(solution.majorityElement(nums));
    }
}
