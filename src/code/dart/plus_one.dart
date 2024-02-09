class Solution {
  List<int> plusOne(List<int> digits) {
    int sum;
    var i = digits.length - 1;
    do {
      sum = ++digits[i];
      digits[i] = sum % 10;
      i--;
    } while (sum == 10 && i >= 0);
    if (sum == 10) digits.insert(0, 1);
    return digits;
  }
}

main() {
  var sol = Solution();
  print(sol.plusOne([1, 2, 3]));
  print(sol.plusOne([4, 3, 2, 1]));
  print(sol.plusOne([9]));
}
