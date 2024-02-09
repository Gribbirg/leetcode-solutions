class LargestDivisibleSubset {
  List<int> largestDivisibleSubset(List<int> nums) {
    nums.sort();

    var groupSize = List.filled(nums.length, 1);
    var prevElement = List.filled(nums.length, -1);
    var maxIndex = 0;

    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < i; j++) {
        if (nums[i] % nums[j] == 0) {
          if (groupSize[i] < 1 + groupSize[j]) {
            groupSize[i] = 1 + groupSize[j];
            prevElement[i] = j;
          }
        }
      }
      if (groupSize[i] > groupSize[maxIndex]) maxIndex = i;
    }

    var res = <int>[];
    while (maxIndex != -1) {
      res.insert(0, nums[maxIndex]);
      maxIndex = prevElement[maxIndex];
    }
    return res;
  }
}

void main() {
  var sol = LargestDivisibleSubset();
  print(sol.largestDivisibleSubset([1, 2, 3]));
  print(sol.largestDivisibleSubset([1, 2, 4, 8]));
}
