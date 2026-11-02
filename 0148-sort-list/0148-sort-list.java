/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        
        if (head == null || head.next == null) return head;

        // Find middle of list
        ListNode mid = getMiddle(head);
        ListNode secondHalf = mid.next;
        mid.next = null; // split into two halves

        // Recursively sort both halves
        ListNode left = sortList(head);
        ListNode right = sortList(secondHalf);

        // Merge sorted halves
        return merge(left, right);
    }

    private ListNode getMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Merge two sorted lists
    private ListNode merge(ListNode A, ListNode B) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (A != null && B != null) {
            if (A.val <= B.val) {
                curr.next = A;
                A = A.next;
            } else {
                curr.next = B;
                B = B.next;
            }
            curr = curr.next;
        }

        if (A != null) curr.next = A;
        if (B != null) curr.next = B;

        return dummy.next; 
    }
}