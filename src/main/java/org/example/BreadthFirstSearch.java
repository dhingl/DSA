package org.example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class BreadthFirstSearch {

    class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data)
        {
            this.data=data;
        }
    }
    TreeNode root;
    void bfsTraversal()
    {
        if (root==null)
            return;

        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
    while (!queue.isEmpty())
    {
        TreeNode currentNode  = queue.poll();
        System.out.println(" Node "+currentNode.data);
        if(currentNode.left!=null)
        {
            queue.add(currentNode.left);
        }

        if(currentNode.right!=null)
        {
            queue.add(currentNode.right);
        }
    }
    }
}
