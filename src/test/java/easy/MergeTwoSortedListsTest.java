package easy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MergeTwoSortedListsTest {

    MergeTwoSortedLists m = new MergeTwoSortedLists();

    @Test
    public void testListNodeToList() {
        ListNode t1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3))));
        assertEquals(List.of(1, 2, 3, 3), t1.toList());
        assertEquals(List.of(0), new ListNode(0).toList());
        assertEquals(List.of(0), new ListNode().toList());
    }

    @Test
    public void testMergeTwoLists() {
        assertEquals(
                List.of(1, 1, 2, 3, 4, 4),
                m.mergeTwoLists(
                        new ListNode(1, new ListNode(2, new ListNode(4))),
                        new ListNode(1, new ListNode(3, new ListNode(4)))).toList());

        assertEquals(
                new ListNode(0).toList(),
                m.mergeTwoLists(null, new ListNode(0)).toList());

        assertEquals(
                null,
                m.mergeTwoLists(null, null));
    }
}