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
public class UnflatteningSpecialLinkedList
{
    private void unFlatten(SpecialNode start, SpecialNode tail){
        SpecialNode curr;
        exploreAndSeparate(start);
        for(curr=start;curr.next!= null;curr=curr.next);
        tail = curr;
    }

    private void exploreAndSeparate(SpecialNode start)
    {
        SpecialNode curr = start;
        while(curr != null){
            if(curr.child != null){
                curr.child.next.prev = null;
                curr.child.prev = null;
                exploreAndSeparate(curr.child);
            }
            curr = curr.next;
        }
    }
    
    public static void main(String[] args)
    {
        UnflatteningSpecialLinkedList u = new UnflatteningSpecialLinkedList();
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
        u.unFlatten(head, tail);
        // Works
        System.out.println(head.data);
    }
    
}
