/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */ // there are 3 steps , first step is to find the middle of my linked list, then reverse the second half, and then find if its palindrome or not and then reverse it again and send the true. 
class Solution {
    public boolean isPalindrome(ListNode head) {
        //find the middle. 
        ListNode fast= head; 
        ListNode slow=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next; 
            fast=fast.next.next; 
        }

        //2nd step is to reverse my second half of the LL. 

        ListNode newHead= reverseLL(slow.next); 

        //find the palindrome. 
        ListNode first= head;
        ListNode second= newHead;
        while(second!=null){
            if(first.val!=second.val){
                return false; 
            }

            first=first.next; 
            second=second.next; 
        }

        reverseLL(newHead); 

        return true;
    }

    public static ListNode reverseLL(ListNode head){
        ListNode curr= head; 
        ListNode prev= null; 

        if(head==null || head.next==null){
            return head; 
        }
        while(curr!=null){
            ListNode front= curr.next; 
            curr.next=prev; 
            prev= curr; 
            curr=front; 
        }

        return prev; 
    }
}