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
public class LowestCommonAncestor
{
    private TreeNode function(TreeNode root, TreeNode n1, TreeNode n2){
        if(root == null)
            return null;
        if(root == n1 || root == n2)
            return root;
        TreeNode left = function(root.left, n1, n2);
        TreeNode right = function(root.right, n1, n2);
        if(left == null && right == null)
            return null;
        if(left != null && right != null)
            return root;
        return left != null ? left : right;
    }
    
    public static void main(String[] args)
    {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        LowestCommonAncestor l = new LowestCommonAncestor();
        System.out.println(l.function(root, root.left, root.left.left).data);
    }
    
}
