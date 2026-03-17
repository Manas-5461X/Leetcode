
class Solution {

    public ListNode removeNodes(ListNode head) {

        Stack<Integer> st = new Stack<>();

        ListNode temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        int[] arr = new int[count];

        temp = head;
        int i = 0;

        while (temp != null) {
            arr[i] = temp.val;
            i++;
            temp = temp.next;
        }

        int[] res = new int[count];

        res[count - 1] = -1;
        st.push(arr[count - 1]);

        for (int j = count - 2; j >= 0; j--) {

            while (!st.isEmpty() && st.peek() <= arr[j]) {
                st.pop();
            }

            if (st.isEmpty()) {
                res[j] = -1;
            } else {
                res[j] = st.peek();
            }

            st.push(arr[j]);
        }

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        for (int j = 0; j < count; j++) {
            if (res[j] == -1) {
                curr.next = new ListNode(arr[j]);
                curr = curr.next;
            }
        }

        return dummy.next;
    }
}