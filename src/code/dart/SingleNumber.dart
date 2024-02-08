class SingleNumber {
  int singleNumber(List<int> nums) {
    int res = 0;
    nums.forEach((element) {
      res ^= element;
    });
    return res;
  }
}

void main() {
  var sol = SingleNumber();
  print(sol.singleNumber([2, 2, 1]));
  print(sol.singleNumber([4, 1, 2, 1, 2]));
  print(sol.singleNumber([1]));
}
