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
    public void reorderList(ListNode head) {
        if(head==null)return ;

        ArrayList<ListNode>hehe=new ArrayList<>();
        ListNode curr=head;
        while(curr!=null){
            hehe.add(curr);
            curr=curr.next;
        }
        int i=0,j=hehe.size()-1;

        while(i<j){
            hehe.get(i).next=hehe.get(j);
            i++;

            if(i>=j)break;
            
            hehe.get(j).next=hehe.get(i);
            j--;
        }
        hehe.get(i).next=null;
        
    }
}