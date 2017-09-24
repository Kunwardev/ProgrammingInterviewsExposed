/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LinkedLists;

/**
 *
 * @author Kunwar
 */
public class PalindromeLinkedList
{
    private Node reverse(Node head){
        Node curr = head, prev = null, next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    
    private boolean function(Node head){
        Node slow = head, midnode;
        Node prev = null;
        Node fast = head;
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast != null){
            midnode = slow;
            slow = slow.next;
        }
        slow = reverse(slow);
        prev.next = null;
        while(slow != null){
            if(head.data != slow.data)
                return false;
            head = head.next;
            slow = slow.next;
        }
        return true;
    }
    
    public static void main(String[] args)
    {
        PalindromeLinkedList p = new PalindromeLinkedList();
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);
        System.out.println(p.function(head));
    }
    
}
