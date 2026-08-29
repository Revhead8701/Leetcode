/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        Map<ListNode,Integer> map = new HashMap<>();
        ListNode node = head;
        int index = 0;
        while(node != null){
            if(map.containsKey(node)){
                return true;
            }else{
                map.put(node,index);
                node = node.next;
                index++;
            }
        }
        return false;
    }
}