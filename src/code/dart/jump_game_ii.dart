import 'dart:math';

class Solution {
  int jump(List<int> nums) {
    for (int i = 1; i < nums.length; i++) {
      nums[i] = max(nums[i] + i, nums[i - 1]);
    }

    int ans = 0;

    for (int ind = 0; ind < nums.length - 1; ind = nums[ind]) {
      ans++;
    }

    return ans;
  }
}

void main() {
  var sol = Solution();
  print(sol.jump([2, 3, 1, 1, 4]));
  print(sol.jump([2, 3, 0, 1, 4]));
  print(sol.jump([1, 1, 1, 1]));
}
