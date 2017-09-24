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
public class FlatteningSpecialLinkedList
{
    public SpecialNode flatten(SpecialNode head, SpecialNode tail){
        SpecialNode curr_node = head;
        while(curr_node != null){
            if(curr_node.child != null)
                tail = append(tail, curr_node.child);
            curr_node = curr_node.next;
        }
        return head;
    }    

    private SpecialNode append(SpecialNode tail, SpecialNode child)
    {
        tail.next = child;
        child.prev = tail;
        SpecialNode curr;
        for(curr=child;curr.next!=null;curr=curr.next);
        return curr;
    }
    
    public static void main(String[] args)
    {
        SpecialNode head = new SpecialNode(5);
        head.child = new SpecialNode(6);
        head.child.next = new SpecialNode(25);
        head.child.next.prev = head.child;
        head.next = new SpecialNode(33);
        head.next.prev = head;
        head.next.next = new SpecialNode(17);
        head.next.next.prev = head.next;
        SpecialNode tail = head.next.next;
        FlatteningSpecialLinkedList f = new FlatteningSpecialLinkedList();
        head = f.flatten(head, tail);
        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }      
    }
}