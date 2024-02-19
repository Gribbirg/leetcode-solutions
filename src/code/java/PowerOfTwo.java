package code.java;

public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        var sol = new PowerOfTwo();
        System.out.println(sol.isPowerOfTwo(1));
        System.out.println(sol.isPowerOfTwo(3));
        System.out.println(sol.isPowerOfTwo(16));
        System.out.println(sol.isPowerOfTwo(-10));
    }
}
