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
        Set<ListNode> visited = new HashSet<>();
        ListNode tailA = headA;
        ListNode tailB = headB;
        while(tailA!=null || tailB!=null){
            if (tailA!=null){
                if(visited.contains(tailA)){
                    return tailA;
                }
                visited.add(tailA);
                tailA = tailA.next;
            }
            if (tailB!=null){
                if(visited.contains(tailB)){
                    return tailB;
                }
                visited.add(tailB);
                tailB = tailB.next;
            }
        }
        return null;
    }

}