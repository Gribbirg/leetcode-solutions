import 'structures/ListNode.dart';

class AddTwoNumbers {
  ListNode? addTwoNumbers(ListNode? l1, ListNode? l2, [bool add = false]) {
    if (l1 == null && l2 == null && !add) {
      return null;
    }
    int sum =
        (add ? 1 : 0) + (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0);
    return ListNode(sum % 10, addTwoNumbers(l1?.next, l2?.next, sum >= 10));
  }
}

main() {
  print(AddTwoNumbers().addTwoNumbers(ListNode(2, ListNode(4, ListNode(3))),
      ListNode(5, ListNode(6, ListNode(4)))));
  print(AddTwoNumbers().addTwoNumbers(ListNode(0), ListNode(0)));
  print(AddTwoNumbers().addTwoNumbers(
      ListNode(
          9,
          ListNode(9,
              ListNode(9, ListNode(9, ListNode(9, ListNode(9, ListNode(9))))))),
      ListNode(9, ListNode(9, ListNode(9, ListNode(9))))));
  print(AddTwoNumbers().addTwoNumbers(ListNode(1, ListNode(2, ListNode(4))),
      ListNode(1, ListNode(3, ListNode(4)))));
}
