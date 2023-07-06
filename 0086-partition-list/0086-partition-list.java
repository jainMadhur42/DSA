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
    public ListNode partition(ListNode head, int x) {

            ListNode l1 = new ListNode(0);
            ListNode l2 = new ListNode(0);


            ListNode left = l1;
            ListNode right = l2;

            ListNode temp = head;

            while(temp != null) {
                if(temp.val >= x) {
                    right.next = temp;
                    right = right.next;
                } else {
                    left.next = temp;
                    left = left.next;
                }
                temp = temp.next;
            }
            left.next = l2.next;
            right.next = null;
            return l1.next;
    }
}