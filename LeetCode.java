import java.util.*;
public class LeetCode {//implementation of Linked List
Node head;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public void reverse(){
    if(head==null){
        head.next=null;
        return;
    }
    Node prevNode=head;
    Node currNode=head.next;
    while(currNode!=null){
        Node nextNode=currNode.next;
        currNode.next=prevNode;
        prevNode=currNode;
        currNode=nextNode;
    }
}
        
    }

