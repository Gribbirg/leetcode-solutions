import 'dart:collection';

class ValidParentheses {
  bool isValid(String s) {
    final HashMap<String, String> bracketsMap = HashMap();
    bracketsMap.addAll({
      ')': '(',
      ']': '[',
      '}': '{'
    });
    final List<String> stack = [];

    for (final char in s.split('')) {
      if (bracketsMap.containsValue(char))
        stack.add(char);
      else
        if (stack.isEmpty || stack.removeLast() != bracketsMap[char])
          return false;
    }

    return stack.isEmpty;
  }
}

main() {
  print(ValidParentheses().isValid("()"));
  print(ValidParentheses().isValid("()[]{}"));
  print(ValidParentheses().isValid("(]"));
}
