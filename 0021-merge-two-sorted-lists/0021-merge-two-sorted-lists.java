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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null && list2==null){
            return null; 
        }
        ListNode t1= list1; //pointing to my first head of the first LL 
        ListNode t2= list2; //pointing to my second head of the second LL. 

        ListNode dNode= new ListNode(-1); // i have created a dummy node here. 
        ListNode temp= dNode;

        while(t1!=null && t2!=null){
            //jab tak dono active hai tab tak mera traversal hoga. 

            if(t1.val<t2.val){
                //my t1 is smaller na. 
                temp.next=t1;
                temp=t1; 
                t1=t1.next; 
            }

            else{
                temp.next=t2; 
                temp=t2; 
                t2=t2.next; 
            }
        }

        if(t1!=null){
            temp.next=t1;
        }

        else{
            temp.next=t2;
        }

        return dNode.next;
    }
}