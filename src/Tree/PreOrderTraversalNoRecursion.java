/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author Kunwar
 */
public class PreOrderTraversalNoRecursion
{
    
    private void function(TreeNode root){
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while(st.size() > 0){
            TreeNode temp = st.pop();
            System.out.print(temp.data+" ");
            if(temp.right != null)
                st.push(temp.right);
            if(temp.left != null)
                st.push(temp.left);
        }
    }
    
    public static void main(String[] args)
    {
        PreOrderTraversalNoRecursion p = new PreOrderTraversalNoRecursion();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        p.function(root);
    }
    
}
