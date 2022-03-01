package java.easy.linkedlist;
import java.util.HashSet;
/**
 * LINKED LIST CYCLE
 * Level: Easy
 * 
 * Given head, the head of a linked list, determine if the linked list has a cycle in it.
 * Return true if there is a cycle in the linked list. Otherwise, return false.
 */
public class LinkedListCycle {
    // Brute Force Using HashMap
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public boolean bruteForceHasCycle(ListNode head) {
        HashSet<ListNode> nodeSet = new HashSet<>();
        
        if(head == null)
            return false;
        
        while(head.next != null) {
            if(nodeSet.contains(head))
                return true;
            nodeSet.add(head);
            head = head.next;
        }
        return false;
    }

    // Two Pointer Using Fast and Slow Method
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public boolean twoPointerHasCycle(ListNode head) {
        if(head == null || head.next == null)
            return false;
        
        ListNode fast = head.next;
        ListNode slow = head;
                
        while(fast != slow) {
            if(fast == null || fast.next == null)
                return false;
            fast = fast.next.next;
            slow = slow.next;
        }
        
        return true;
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
        val = x;
        next = null;
        }
    }
}
