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
public class HeightOfTree
{
    private int function(TreeNode root){
        if(root == null)
            return 0;
        return 1+Math.max(function(root.left), function(root.right));
    }
    
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        HeightOfTree h = new HeightOfTree();
        System.out.println(h.function(root));
        
    }
}
