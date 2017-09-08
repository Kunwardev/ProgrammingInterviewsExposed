/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tree;

import java.util.Stack;

/**
 *
 * @author Kunwar
 */
public class PostOrderTraversalNoRecursion
{
    private void function(TreeNode root){
        Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();
        st1.push(root);
        while(!st1.isEmpty()){
            TreeNode temp = st1.pop();
            st2.push(temp);
            if(temp.left != null)
            st1.push(temp.left);
            if(temp.right != null)
            st1.push(temp.right);
        }
        while(!st2.isEmpty()){
            System.out.print(st2.pop().data+" ");
        }
    }
    
    public static void main(String[] args)
    {
        PostOrderTraversalNoRecursion p = new PostOrderTraversalNoRecursion();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        p.function(root);
    }
    
}
