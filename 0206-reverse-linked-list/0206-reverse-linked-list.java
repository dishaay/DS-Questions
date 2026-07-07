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
    public ListNode reverseList(ListNode head) {
         ListNode temp = head; 
        ListNode prev= null; 
        ListNode front; 
        while(temp!=null){
            front= temp.next; //I am about to destroy u 
            temp.next= prev; //now its officially destroyed. 
            prev= temp;
            temp=front; 
        }
        
        return prev;
    }
}