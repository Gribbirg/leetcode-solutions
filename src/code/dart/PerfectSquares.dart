import 'dart:math';

class PerfectSquares {
  int numSquares(int n) {
    List<int> dp = List<int>.filled(n + 1, 100000);
    dp[0] = 0;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j * j <= i; j++) {
        dp[i] = min(dp[i], dp[i - j * j] + 1);
      }
    }
    return dp[n];
  }
}

main() {
  var sol = PerfectSquares();
  print(sol.numSquares(12));
  print(sol.numSquares(13));
}
