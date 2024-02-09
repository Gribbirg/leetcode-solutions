class Solution {
  int trailingZeroes(int n) {
    var res = 0;
    for (var div = 5; div <= n; div *= 5) {
      res += n ~/ div;
    }
    return res;
  }
}

main() {
  var sol = Solution();
  print(sol.trailingZeroes(3));
  print(sol.trailingZeroes(5));
  print(sol.trailingZeroes(0));
  print(sol.trailingZeroes(20));
}
