package code.java;

import code.java.structures.ListNode;

import java.util.List;

public class RemoveDuplicatesFromSortedListII {
    public ListNode deleteDuplicates(ListNode head) {

        if (head == null || head.next == null) return head;

        while (head.val == head.next.val) {
            head = findClosetWithOtherValue(head);
            if (head == null || head.next == null) return head;
        }

        ListNode current = head.next;
        ListNode previous = head;

        while (current.next != null) {
            if (current.val == current.next.val) {
                current = findClosetWithOtherValue(current);
                previous.next = current;
                if (current == null) break;
            } else {
                previous = current;
                current = current.next;
            }
        }

        return head;
    }

    private ListNode findClosetWithOtherValue(ListNode head) {
        int val = head.val;
        while (head != null && head.val == val)
            head = head.next;
        return head;
    }

    public static void main(String[] args) {
        var sol = new RemoveDuplicatesFromSortedListII();

        System.out.println(sol.deleteDuplicates(new ListNode(List.of(1, 2, 3, 3, 4, 4, 5, 5))));
        System.out.println(sol.deleteDuplicates(new ListNode(List.of(1, 1, 1, 2, 3))));
        System.out.println(sol.deleteDuplicates(new ListNode(List.of(1, 1, 2, 2))));
    }
}
