class LongestCommonPrefix {
  String longestCommonPrefix(List<String> strs) {
    var prefix = strs[0];
    for (int i = 1; i < strs.length; i++) {
      while (!strs[i].startsWith(prefix)) {
        prefix = prefix.substring(0, prefix.length - 1);
        if (prefix.isEmpty) return prefix;
      }
    }
    return prefix;
  }
}

void main() {
  var sol = LongestCommonPrefix();
  print(sol.longestCommonPrefix(["flower", "flow", "flight"]));
  print(sol.longestCommonPrefix(["dog", "racecar", "car"]));
}
