class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode prev = new ListNode(0);
        prev.next = head;

       

        ListNode slow = prev;
        ListNode fast = head;

        for (int i = 1; i < n; i++) {
            fast = fast.next;
        }


        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return prev.next;
    }
}