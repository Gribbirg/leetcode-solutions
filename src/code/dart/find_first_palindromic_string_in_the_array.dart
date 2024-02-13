class Solution {
  String firstPalindrome(List<String> words) {
    for (var s in words) {
      if (_isPalindrome(s)) return s;
    }
    return "";
  }

  bool _isPalindrome(String s) {
    var start = 0, end = s.length - 1;

    while (start < end) {
      if (s[start++] != s[end--]) return false;
    }

    return true;
  }
}

void main() {
  var sol = Solution();
  print(sol.firstPalindrome(["abc", "car", "ada", "racecar", "cool"]));
  print(sol.firstPalindrome(["notapalindrome", "racecar"]));
  print(sol.firstPalindrome(["def", "ghi"]));
}
