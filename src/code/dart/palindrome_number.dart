class Solution {
  bool isPalindrome(int x) {
    if (x < 0) return false;
    int n = x;
    int rev = 0;
    while (n > 0) {
      rev = rev * 10 + n % 10;
      n ~/= 10;
    }
    return rev == x;
  }
}

main() {
  var sol = Solution();
  print(sol.isPalindrome(121));
  print(sol.isPalindrome(-121));
  print(sol.isPalindrome(10));
}
