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

    public ListNode oddEvenList(ListNode head) {
        
        ListNode oddList = new ListNode(0);
        ListNode evenList = new ListNode(0);

        ListNode evenl1 = evenList;
        ListNode oddl1 = oddList;

        ListNode temp = head;
        int index = 1;
        while(temp != null) {
            if(index %2 == 0) {
                evenl1.next = temp; // 2-> 4-> 
                evenl1 = evenl1.next;
            } else {
                oddl1.next = temp; // 1 -> 3 -> 5
                oddl1 = oddl1.next;
            }
            index++;
            temp = temp.next;
        }

        oddl1.next = evenList.next;
        evenl1.next = null;  
        return  oddList.next;
    }
}