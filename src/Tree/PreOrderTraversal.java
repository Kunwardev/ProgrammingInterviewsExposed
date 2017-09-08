/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tree;

/**
 *
 * @author Kunwar
 */
public class PreOrderTraversal
{
    
    private void function(TreeNode root){
        if(root != null){
            System.out.print(root.data+" ");
            function(root.left);
            function(root.right);
        }
    }
    
    public static void main(String[] args)
    {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        PreOrderTraversal p = new PreOrderTraversal();
        p.function(root);
    }
    
}
