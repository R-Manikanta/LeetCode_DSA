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
        if (head == null || head.next == null){
            return false;
        }
        Set<ListNode> visited = new HashSet<>();

        ListNode tail = head;
        while(tail!=null){
            if (visited.contains(tail)){
                return true;
            }
            else{
                visited.add(tail);
                tail = tail.next;
            }
        }
        return false;

        
    }
}