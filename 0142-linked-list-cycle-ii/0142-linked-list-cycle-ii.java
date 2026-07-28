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
    public ListNode detectCycle(ListNode head) {
        HashMap <ListNode, Integer> h1= new HashMap <>(); 
        ListNode temp= head; 

        while(temp!=null){
            if(h1.containsKey(temp)){
                return temp;
            }

            h1.put(temp,1);
            temp=temp.next;
        }
        return null;

    }
}