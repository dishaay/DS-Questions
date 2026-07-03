/*
Definition of singly linked list:
class ListNode{
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
}
*/
class Node{
    int data; 
    Node next; 

    public Node(int data){
        this.data=data; 
        this.next=null; 
    }
}

class Solution {
    public ListNode insertAtHead(ListNode head, int data) {
        //step 1: is to  create a new node. 
        ListNode newNode= new ListNode(data); 

        if(head==null){
            head=newNode;
            return head;
        }
        newNode.next= head; 
        head=newNode;
        
        return head;
    }
}
