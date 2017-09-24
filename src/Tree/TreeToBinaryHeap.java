/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tree;

import java.util.Arrays;

/**
 *
 * @author Kunwar
 */
public class TreeToBinaryHeap
{
    
    private int size(TreeNode root){
        if(root == null)
            return 0;
        return size(root.left)+1+size(root.right);
    }
    
    private int[] serialize(TreeNode root){
        int count = size(root);
        int[] data = new int[count];
        traverse(root, data, 0);
        for(int i: data)
            System.out.print(i+" ");
        Arrays.sort(data);
        return data;
    }
    
    public static void main(String[] args)
    {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        TreeToBinaryHeap t = new TreeToBinaryHeap();
        t.serialize(root);
    }

    private void traverse(TreeNode root, int[] data, int i)
    {
        if(root == null)
            return ;
        data[i] = root.data;
        i++;
        traverse(root.left, data, i);
        if(root.left == null)
            traverse(root.right, data, i);
        else
            traverse(root.right, data, i+1);
    }
    
}
