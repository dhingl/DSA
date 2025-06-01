package org.example.binarysearchtree;

import java.util.SortedMap;

public class BinarySearchTree {
    private class Node{
        private int height;
        private int value;
        private Node left;
        private Node right;

        public Node(int value)
        {
            this.value=value;
        }

        public  int getValue()
        {
            return this.value;
        }

    }

    private Node root;
    public  BinarySearchTree()
    {

    }
    public  int getHeight(Node node)
    {
        if(node==null)
        {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty()
    {
        return  root==null;
    }


    public void display()
    {
        display(root, "Root Node :");
    }

    private void display(Node node, String message) {
        if(node==null)
            return;
        System.out.println(message + node.value);
        display(node.left,"Left child of "+node.getValue());
        display(node.right,"Right Child of"+node.getValue());
    }

    public  void insert(int value)
    {
       root= insert(value,root);
    }

    private Node insert(int value,Node node) {
        if(node==null)
        {
            node= new Node(value);
            return node;
        }
        if(value<node.getValue())
        {
            node.left=insert(value,node.left);
        }
        if(value>node.getValue())
        {
            node.right=insert(value,node.right);
        }
        return node;
    }

    public void populate(int[] nums)
    {
        for(int a:nums)
        {
            this.insert(a);
            System.out.println("Inserted "+a);
        }
    }

    public  void preOrder()
    {
        preOrder(root);
    }

    private void preOrder(Node node) {
        if (node==null)
        {
            return;
        }
        System.out.println("Node "+ node.getValue());
        preOrder(node.left);
        preOrder(node.right);
    }


    public  void inOrder()
    {
        inOrder(root);
    }

    private void inOrder(Node node) {
        if (node==null)
        {
            return;
        }
        inOrder(node.left);
        System.out.println("Node "+ node.getValue());

        inOrder(node.right);
    }

    public  void postOrder()
    {
        postOrder(root);
    }

    private void postOrder(Node node) {
        if (node==null)
        {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println("Node "+ node.getValue());

    }


}
