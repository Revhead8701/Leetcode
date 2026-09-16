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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        if(fast == null && fast.next == null) return true;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode newHead = reverseLInkedList(slow.next);
        ListNode node = head;
        while(newHead != null){
            if(node.val != newHead.val) return false;
            node = node.next;
            newHead = newHead.next;
        }
        return true;


    }

    public ListNode reverseLInkedList(ListNode head){
        if(head == null || head.next == null) return head;

        ListNode newHead = reverseLInkedList(head.next);

        ListNode curr = head.next;
        curr.next = head;
        head.next = null;
        return newHead;
    
    }
}