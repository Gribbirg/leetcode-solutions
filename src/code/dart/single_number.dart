class Solution {
  int singleNumber(List<int> nums) {
    int res = 0;
    nums.forEach((element) {
      res ^= element;
    });
    return res;
  }
}

void main() {
  var sol = Solution();
  print(sol.singleNumber([2, 2, 1]));
  print(sol.singleNumber([4, 1, 2, 1, 2]));
  print(sol.singleNumber([1]));
}
