class Solution {
  int _check(String s, int start, int end) {
    int res = 0;

    while (start >= 0 && end < s.length && s[start--] == s[end++]) {
      res++;
    }

    return res;
  }

  int countSubstrings(String s) {
    int res = 0;

    for (var i = 0; i < s.length; i++) {
      res += _check(s, i, i);
      res += _check(s, i, i + 1);
    }

    return res;
  }
}

void main() {
  var sol = Solution();
  print(sol.countSubstrings("abc"));
  print(sol.countSubstrings("aaa"));
}
