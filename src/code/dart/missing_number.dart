class Solution {
  int missingNumber(List<int> nums) =>
      nums.length * (nums.length + 1) ~/ 2 -
      nums.reduce((value, element) => value + element);
}

void main() {
  var sol = Solution();
  print(sol.missingNumber([3, 0, 1]));
  print(sol.missingNumber([0, 1]));
  print(sol.missingNumber([9, 6, 4, 2, 3, 5, 7, 0, 1]));
}
