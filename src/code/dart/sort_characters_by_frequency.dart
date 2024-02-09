import 'dart:collection';

class Solution {
  String frequencySort(String s) {
    var map = HashMap<String, int>();
    for (var char in s.split('')) {
      map.update(char, (value) => value += 1, ifAbsent: () => 1);
    }

    var resMap = Map.fromEntries(map.entries.toList()..sort((a, b) => b.value.compareTo(a.value)));
    
    var res = "";
    resMap.forEach((key, value) {
      for (var i = 0; i < value; i++)
        res += key;
    });
    return res;
  }
}

main() {
  var sol = Solution();
  print(sol.frequencySort("tree"));
  print(sol.frequencySort("cccaaa"));
  print(sol.frequencySort("Aabb"));
}