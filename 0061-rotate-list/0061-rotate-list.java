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
        
        if(head == null || k== 0) return head;
        ListNode temp = head;

        int nodeCount = 0;
        while(temp.next != null) {
            
            temp = temp.next;
            nodeCount++; // 5
        }
        // temp 5
        temp.next = head; // 5 -> 1
        k = k%(nodeCount+1);
        int jump = nodeCount-k;
        temp = head;
        while(jump != 0) {
            temp = temp.next;
            jump--;
        }

        ListNode newHead = temp.next;
        temp.next = null;
        return newHead;
    }
}