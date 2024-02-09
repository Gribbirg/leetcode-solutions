class Solution {
  bool isSubsequence(String s, String t) {
    var j = 0;
    for (var i = 0; i < s.length; i++) {
      for(;j < t.length && s[i] != t[j]; j++);
      if (j == t.length) return false;
      j++;
    }
    return true;
  }
}

main() {
  var sol = Solution();
  print(sol.isSubsequence("abc", "ahbgdc"));
  print(sol.isSubsequence("axc", "ahbgdc"));
  print(sol.isSubsequence("", ""));
}
