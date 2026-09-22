/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<>();

        ListNode node1 = headA;
        ListNode node2 = headB;

        while(node1 != null || node2 != null){
            if(node1 != null){
            if(set.contains(node1)) return node1;
            set.add(node1);
            node1 = node1.next;

        }
        if(node2 != null){
            if(set.contains(node2)) return node2;
            set.add(node2);
            node2 = node2.next;
        }
        }
        return null;
    }
}