/**
 * MERGE TWO SORTED LISTS
 * Level: Easy
 * 
 * You are given the heads of two sorted linked lists list1 and list2.
 * Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
 * Return the head of the merged linked list
 */
package java.easy.linkedlist;
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

// Two Pointer Solution
// Time Complexity: O(n + m)
// Space Complexity: O(n + m)
public class MergeSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode pointer = new ListNode(0);
        ListNode dummyHead = pointer;
        
        while(list1 != null || list2 != null) {
            if(list2 == null || (list1 != null && list1.val <= list2.val)) {
                pointer.next = new ListNode(list1.val);
                pointer = pointer.next;
                list1 = list1.next;
            } else {
                pointer.next = new ListNode(list2.val);
                pointer = pointer.next;
                list2 = list2.next;
            }
        }
        
        
        return dummyHead.next;
    }
}
