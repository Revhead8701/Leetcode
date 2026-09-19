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
        if(head == null || head.next == null) return head;

        ListNode middle = findMiddle(head);
        ListNode right = middle.next;
        middle.next = null;
        ListNode left = head;

        left = sortList(left);
        right = sortList(right);

        return mergeTwoLL(left,right);
    }

    public static ListNode mergeTwoLL(ListNode leftHead, ListNode rightHead){

        ListNode dummmy = new ListNode();
        ListNode temp = dummmy;

        while(leftHead != null && rightHead != null){
            if(leftHead.val < rightHead.val){
                temp.next = leftHead;
                temp = leftHead;
                leftHead = leftHead.next;
            }
            else{
                temp.next = rightHead;
                temp = rightHead;
                rightHead= rightHead.next;
            }
            
        }
        if(leftHead != null) temp.next = leftHead;
        else temp.next= rightHead;

            return  dummmy.next;
    }


    public static ListNode findMiddle(ListNode head){
        if(head == null || head.next == null) return head;

        ListNode fast= head;
        ListNode slow = head;

        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}