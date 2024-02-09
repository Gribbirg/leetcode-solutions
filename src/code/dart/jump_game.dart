import 'dart:math';

class Solution {
  bool canJump(List<int> nums) {
    var reach = 0;
    for (int i = 0; i < nums.length; i++) {
      if (i > reach) return false;
      reach = max(reach, i + nums[i]);
    }
    return true;
  }
}

void main() {
  var sol = Solution();
  print(sol.canJump([2, 3, 1, 1, 4]));
  print(sol.canJump([3, 2, 1, 0, 4]));
}
