class ListNode {
  int val;
  ListNode? next;

  ListNode([this.val = 0, this.next]);

  @override
  String toString() {
    if (next != null)
      return "${val}, ${next.toString()}";
    else
      return val.toString();
  }
}