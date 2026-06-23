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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode lPrev=dummy,curr=head;

        for(int i=0;i<left-1;i++){
            lPrev=curr;
            curr=curr.next;

        }    

        ListNode prev=null;

        for(int i=0;i<right-left+1;i++){
            ListNode tempNext=curr.next;
            curr.next=prev;
            prev=curr;
            curr=tempNext;

        }

        lPrev.next.next=curr;
        lPrev.next=prev;

        return dummy.next;  
    }
}