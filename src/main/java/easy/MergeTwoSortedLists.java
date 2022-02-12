package easy;

/*
21. Merge Two Sorted Lists
https://leetcode.com/problems/merge-two-sorted-lists/
 */

import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
    public List<Integer> toList() {
        return toList(List.of(), this);
    }
    public List<Integer> toList(List<Integer> acc, ListNode list) {
        List arr = new ArrayList(acc);
        arr.add(list.val);

        if (list.next == null) return arr;
        arr.addAll(toList(acc, list.next));
        return arr;
    }
}
