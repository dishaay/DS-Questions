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
        HashMap <ListNode,Integer> hm= new HashMap<>(); //I created a hashmap 
        ListNode temp = head ; 

        while(temp!=null){
            //first i will check if my hashmap contains that node or not? 
            if(hm.containsKey(temp)){
                return true; 
            }//its a loop! 

            hm.put(temp,1);//i will put that node in my hashmap. 
            temp=temp.next;//and i will move ahead. 
        }

        return false; //and if nothing works, that means it was a linear linked list!
    }
}