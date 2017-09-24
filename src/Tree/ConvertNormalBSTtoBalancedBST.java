/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tree;

import java.util.ArrayList;

/**
 *
 * @author Kunwar
 */
public class ConvertNormalBSTtoBalancedBST
{
    
    private Integer[] convertToArray(TreeNode root){
        ArrayList<Integer> al = new ArrayList<>();
        convertToArrayUtil(root, al);
        Integer[] data = al.toArray(new Integer[al.size()]);
        return data;
    }

    private void convertToArrayUtil(TreeNode root, ArrayList<Integer> al)
    {
        if(root != null){
            convertToArrayUtil(root.left, al);
            al.add(root.data);
            convertToArrayUtil(root.right, al);
        }
    }
    
    private void inOrder(TreeNode root){
        if(root != null){
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    }
    
    public static void main(String[] args)
    {
        ConvertNormalBSTtoBalancedBST c = new ConvertNormalBSTtoBalancedBST();
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(8);
        root.left.left = new TreeNode(7);
        root.left.left.left = new TreeNode(6);
        root.left.left.left.left = new TreeNode(5);
        Integer[] data =c.convertToArray(root);
        TreeNode ans = c.function(data, 0, data.length-1);
        c.inOrder(ans);
    }

    private TreeNode function(Integer[] data, int left, int right)
    {
        if(left <= right){
            int mid = (left+right)/2;
            TreeNode root = new TreeNode(data[mid]);
            root.left = function(data, left, mid-1);
            root.right = function(data, mid+1, right);
            return root;
        }
        return null;
    }
    
}
