/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Kunwar
 */
public class LevelOrderTraversal
{
    private void function(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode temp = q.poll();
            System.out.print(temp.data+" ");
            if(temp.left != null)
                q.offer(temp.left);
            if(temp.right != null)
                q.offer(temp.right);
        }
    }
    
    public static void main(String[] args)
    {
        LevelOrderTraversal l = new LevelOrderTraversal();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        l.function(root);
    }
    
}
