class SummaryRanges {
  List<String> summaryRanges(List<int> nums) {
    List<String> res = [];
    if (nums.isEmpty) return res;

    var startIndex = 0;
    int i;

    for (i = 0; i < nums.length - 1; i++) {
      if (nums[i + 1] != nums[i] + 1) {
        res.add(startIndex == i ? nums[i].toString() : "${nums[startIndex]}->${nums[i]}");
        startIndex = i + 1;
      }
    }

    res.add(startIndex == i ? nums[i].toString() : "${nums[startIndex]}->${nums[i]}");

    return res;
  }
}

main() {
  var sol = SummaryRanges();
  print(sol.summaryRanges([0,1,2,4,5,7]));
  print(sol.summaryRanges([0,2,3,4,6,8,9]));
}
