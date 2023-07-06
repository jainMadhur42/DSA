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
        
        if(head == null) return false;

        ListNode slowPointer = head; // 3
        ListNode fastPointer = head.next; // 2

        while(fastPointer != slowPointer) {
            
            if(fastPointer == null || fastPointer.next == null) {
                return false;
            }

            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }
        return true;
    }
}