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
    public ListNode deleteMiddle(ListNode head) {
        
        if(head == null || head.next == null) return null;

        ListNode temp = head;
        int n = 0;
        while(temp.next != null) {
            temp = temp.next;
            n++;
        }

        n = (n+1)/2;
        temp = head;
        ListNode prev = null;

        while(n != 0) {
            prev = temp;
            temp = temp.next;
            n--;
        }

        if(temp == null) {
            prev.next = null;
        } else {
           prev.next = temp.next;
        }
        
        return head;
    }
}