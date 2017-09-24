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
public class SpecialNode
{
    int data;
    SpecialNode prev, next, child;
    
    public SpecialNode(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
        this.child= null;
    }
}
