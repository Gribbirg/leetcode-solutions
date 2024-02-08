class AddBinary {
  String addBinary(String a, String b) {
    var res = "";
    var aI = a.length - 1;
    var bI = b.length - 1;
    var add = false;
    while (aI >= 0 && bI >= 0) {
      var sum = 0;
      if (a[aI] == '1') sum++;
      if (b[bI] == '1') sum++;
      if (add) sum++;

      if (sum > 1) {
        res = (sum % 2).toString() + res;
        add = true;
      } else  {
        res = sum.toString() + res;
        add = false;
      }

      aI--;
      bI--;
    }

    while (aI >= 0) {
      var sum = 0;
      if (a[aI] == '1') sum++;
      if (add) sum++;

      if (sum == 2) {
        res = '0' + res;
        add = true;
      } else  {
        res = sum.toString() + res;
        add = false;
      }

      aI--;
    }
    while (bI >= 0) {
      var sum = 0;
      if (b[bI] == '1') sum++;
      if (add) sum++;

      if (sum == 2) {
        res = '0' + res;
        add = true;
      } else  {
        res = sum.toString() + res;
        add = false;
      }

      bI--;
    }
    if (add) {
      res = '1' + res;
    }

    return res;
  }
}

void main() {
  var sol = AddBinary();
  print(sol.addBinary("11", "1"));
  print(sol.addBinary("1010", "1011"));
  print(sol.addBinary("11", "0"));
  print(sol.addBinary("101111", "10"));
}
