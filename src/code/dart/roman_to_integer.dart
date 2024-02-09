class RomanToInteger {
  static const romanMap = {
    "I": 1,
    "V": 5,
    "X": 10,
    "L": 50,
    "C": 100,
    "D": 500,
    "M": 1000
  };

  int romanToInt(String s) {
    var res = romanMap[s[s.length - 1]]!;

    for (int i = s.length - 2; i >= 0; i--) {
      if (romanMap[s[i]]! < romanMap[s[i + 1]]!) {
        res -= romanMap[s[i]]!;
      } else {
        res += romanMap[s[i]]!;
      }
    }

    return res;
  }
}

void main() {
  var sol = RomanToInteger();
  print(sol.romanToInt("III"));
  print(sol.romanToInt("LVIII"));
  print(sol.romanToInt("MCMXCIV"));
}
