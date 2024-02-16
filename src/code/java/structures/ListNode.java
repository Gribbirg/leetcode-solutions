package code.java.structures;

import java.util.ArrayList;
import java.util.List;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode(List<Integer> list) {
        this(new ArrayList<>(list));
    }

    public ListNode(ArrayList<Integer> list) {
        this.val = list.removeFirst();
        if (!list.isEmpty())
            this.next = new ListNode(list);
    }

    @Override
    public String toString() {
        if (next != null)
            return val + ", " + next;
        else
            return Integer.toString(val);
    }
}
