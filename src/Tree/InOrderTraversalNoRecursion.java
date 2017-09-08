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
public class InOrderTraversalNoRecursion
{
    private void function(TreeNode root){
        Stack<TreeNode> st = new Stack<>();
        TreeNode current = root;
        while(current != null){
            st.push(current);
            current = current.left;
        }
        
        while(st.size() > 0){
            TreeNode temp = st.pop();
            System.out.print(temp.data+" ");
            if(temp.right != null){
                temp = temp.right;
                while(temp != null){
                    st.push(temp);
                    temp = temp.left;
                }
            }
        }
    }
    
    public static void main(String[] args)
    {
        InOrderTraversalNoRecursion i = new InOrderTraversalNoRecursion();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        i.function(root);
    }
    
}
