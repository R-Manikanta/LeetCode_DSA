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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null){
            return null;
        }
        if (head.next == null){
            return head;
        }
        ListNode tail1 = head;
        ListNode tail2 = head.next;
        while(tail2!=null){
            if(tail1.val != tail2.val){
                tail1.next = tail2;
                tail1 = tail1.next;
            }
            tail2 = tail2.next; 
        }
        tail1.next = null;
        return head;
    }
}