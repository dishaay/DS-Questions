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
        //brute force.
        ListNode temp= head; 
        //now this temp will traverse the whole linked list in finding the length of the linked list. 
        int n=0; 

        if(temp==null || temp.next==null){
            return null;
        } //if my linked list is empty. 
        
        while(temp!=null){
            n++; 
            temp=temp.next; 
        }

        int res= n/2; 
        //second traversal to find the middle. 
        temp=head; 
        while(temp!=null){
            res--;

            if(res==0){
                temp.next=temp.next.next;
                break; 
            }
            temp=temp.next;
        }
        return head; 

    }
}