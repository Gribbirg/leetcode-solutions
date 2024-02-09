import 'dart:collection';

class ClimbingStairs {
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
  print(ClimbingStairs().climbStairs(2));
  print(ClimbingStairs().climbStairs(3));
  print(ClimbingStairs().climbStairs(4));
  print(ClimbingStairs().climbStairs(5));
  print(ClimbingStairs().climbStairs(44));
  print(ClimbingStairs().climbStairs(1));
}