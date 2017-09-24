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
public class RecursiveFunctionToPrintReveseLinkedList
{
    private void function(Node head){
        if(head == null)
            return;
        function(head.next);
        System.out.print(head.data+" ");
    }
    
    public static void main(String[] args)
    {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        RecursiveFunctionToPrintReveseLinkedList r = new RecursiveFunctionToPrintReveseLinkedList();
        r.function(head);
    }
    
}
