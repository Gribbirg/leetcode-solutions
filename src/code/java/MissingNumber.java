package code.java;

import java.util.Arrays;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        return nums.length * (nums.length + 1) / 2 - Arrays.stream(nums).sum();
    }

    public static void main(String[] args) {
        var sol = new MissingNumber();
        System.out.println(sol.missingNumber(new int[]{3, 0, 1}));
        System.out.println(sol.missingNumber(new int[]{0, 1}));
        System.out.println(sol.missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
    }
}
