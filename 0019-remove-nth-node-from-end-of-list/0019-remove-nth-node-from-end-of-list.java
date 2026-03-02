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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int count = 0;
        ListNode temp = head;

        if (temp == null || temp.next == null)
            return null;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        int m = count - n; // m = nth node from end or mth node from starting
        if (m == 0) {
            return head.next;
        }

        temp = head;
        int i = 0;
        while (i < m - 1 && temp.next != null) {
            temp = temp.next;
            i++;
        }

        temp.next = temp.next.next;

        return head;

    }
}