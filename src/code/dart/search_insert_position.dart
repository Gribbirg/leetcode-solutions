class Solution {
  int searchInsert(List<int> nums, int target) =>
      binarySearch(nums, 0, nums.length, target);

  int binarySearch(List<int> nums, int from, int to, int target) {
    var middle = (from + to) ~/ 2;

    if (from == to)
      return from;
    else if (nums[middle] == target)
      return middle;
    else if (nums[middle] < target)
      return binarySearch(nums, middle + 1, to, target);
    else
      return binarySearch(nums, from, middle, target);
  }
}

main() {
  var sol = Solution();
  print(sol.searchInsert([1, 3, 5, 6], 5));
  print(sol.searchInsert([1, 3, 5, 6], 2));
  print(sol.searchInsert([1, 3, 5, 6], 7));
  print(sol.searchInsert([1, 3, 5, 6], 0));
}
