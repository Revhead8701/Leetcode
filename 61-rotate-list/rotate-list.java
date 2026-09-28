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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        ListNode fast = head;
        ListNode slow = head;

        int length = 0;
        while(fast != null){
            length++;
            fast = fast.next;
        }
        k = k%length;
        if(k == 0) return head;
        fast = head;
        for(int i = 0; i < k; i++){
            fast = fast.next;
        }
        while(fast.next != null){
            fast= fast.next;
            slow = slow.next;
        }
        ListNode newhead = slow.next;
        slow.next = null;
        fast.next = head;

        return newhead;
    }
}