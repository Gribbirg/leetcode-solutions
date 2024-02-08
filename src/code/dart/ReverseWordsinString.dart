class ReverseWordsInString {
  String reverseWords(String s) =>
      (s.split(' ')..removeWhere((element) => element.isEmpty))
          .reversed
          .join(" ");
}

void main() {
  var sol = ReverseWordsInString();
  print(sol.reverseWords("the sky is blue"));
  print(sol.reverseWords("  hello world  "));
  print(sol.reverseWords("a good   example"));
}
