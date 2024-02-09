import 'dart:collection';

class Solution {
  HashMap<int, int> variants = HashMap();

  int climbStairs(int n) {
    if (n <= 1)
      return 1;
    if (variants.containsKey(n))
      return variants[n]!;
    var res = climbStairs(n - 1) + climbStairs(n - 2);
    variants[n] = res;
    return res;
  }
}

main() {
  print(Solution().climbStairs(2));
  print(Solution().climbStairs(3));
  print(Solution().climbStairs(4));
  print(Solution().climbStairs(5));
  print(Solution().climbStairs(44));
  print(Solution().climbStairs(1));
}