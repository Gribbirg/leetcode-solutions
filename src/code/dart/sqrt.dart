class Solution {
  int mySqrt(int x) {
    return binaryFindSqrt(0, x ~/ 2 + 1, x);
  }

  int binaryFindSqrt(int from, int to, int x) {
    var middle = (from + to) ~/ 2;
    var middleValue = middle * middle;
    if (middleValue == x) return middle;
    else if (from == to) return from - 1;
    else if (middleValue < x) return binaryFindSqrt(middle + 1, to, x);
    else return binaryFindSqrt(from, middle, x);
  }
}

main() {
  var sol = Solution();
  print(sol.mySqrt(4));
  print(sol.mySqrt(16));
  print(sol.mySqrt(8));
  print(sol.mySqrt(2));
  print(sol.mySqrt(10));
}
