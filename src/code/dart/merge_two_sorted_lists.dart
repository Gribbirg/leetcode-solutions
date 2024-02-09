import 'structures/ListNode.dart';

class Solution {
  ListNode? mergeTwoLists(ListNode? list1, ListNode? list2) {
    if (list1 == null) return list2;
    if (list2 == null) return list1;

    ListNode? node1 = list1;
    ListNode? node2 = list2;
    ListNode resNode;

    if (node1.val <= node2.val) {
      resNode = node1;
      node1 = node1.next;
    } else {
      resNode = node2;
      node2 = node2.next;
    }

    ListNode? resList = resNode;

    while (node1 != null && node2 != null) {
      if (node1.val <= node2.val) {
        resNode.next = node1;
        resNode = node1;
        node1 = node1.next;
      } else {
        resNode.next = node2;
        resNode = node2;
        node2 = node2.next;
      }
    }

    if (node1 != null) resNode.next = node1;
    if (node2 != null) resNode.next = node2;

    return resList;
  }
}

main() {
  print(Solution().mergeTwoLists(
      ListNode(1, ListNode(2, ListNode(4))),
      ListNode(1, ListNode(3, ListNode(4)))));
  print(Solution().mergeTwoLists(
      ListNode(1, ListNode(2, ListNode(4))),
      ListNode(1, ListNode(8, ListNode(9)))));
  print(Solution().mergeTwoLists(null, null));
  print(Solution().mergeTwoLists(null, ListNode(0)));
}
