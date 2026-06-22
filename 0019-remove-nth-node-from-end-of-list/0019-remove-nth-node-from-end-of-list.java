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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ArrayList<ListNode>hehe=new ArrayList<>();
        ListNode curr=head;
        while(curr!=null){
            hehe.add(curr);
            curr=curr.next;
        }

        int idx=hehe.size()-n;

        if(idx==0){
            return head.next;
        }
        
        hehe.get(idx-1).next=hehe.get(idx).next;
        
        return head;
    }
}