class Solution {
  static const romanMap = {
    1000: "M",
    900: "CM",
    500: "D",
    400: "CD",
    100: "C",
    90: "XC",
    50: "L",
    40: "XL",
    10: "X",
    9: "IX",
    5: "V",
    4: "IV",
    1: "I",
  };

  String intToRoman(int num) {
    var res = "";
    for (var enter in romanMap.entries) {
      for (; num >= enter.key; num -= enter.key) {
        res += enter.value;
      }
    }
    return res;
  }
}

void main() {
  var sol = Solution();
  print(sol.intToRoman(3));
  print(sol.intToRoman(58));
  print(sol.intToRoman(1994));
}
