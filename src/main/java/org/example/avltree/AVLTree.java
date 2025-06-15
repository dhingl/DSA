package org.example.avltree;


import javax.swing.plaf.PanelUI;

public class AVLTree {
    private class Node
    {
    private int height;
    private int value;
    private Node left;
    private Node right;

    public  Node(int value)
    {
        this.value=value;
    }

    public int getValue()
    {
        return  this.value;
    }
    }
    private Node root;


    public AVLTree()
    {

    }

    public int getHeight(Node node)
    {
        if(node==null)
        {
            return 0;
        }
        return node.height;
    }

    public boolean isEmpty()
    {
        return root==null;
    }

    public void display()
    {
        display(root, "Root Node :");
    }

    private void display(AVLTree.Node node, String message) {
        if(node==null)
            return;
        System.out.println(message + node.value);
        display(node.left,"Left child of "+node.getValue()+" :-");
        display(node.right,"Right Child of"+node.getValue()+" :-");
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
        node.height=(Math.max(getHeight(node.left),getHeight(node.right)))+1;
        return rotate(node);
    }

    private Node rotate(Node node) {
        if(getHeight(node.left)-getHeight(node.right)>1)
        {
            //left heavy
            if(getHeight(node.left.left) - getHeight(node.left.right)>0) {
                //left left
                return rightRotate(node);
            }

            if(getHeight(node.left.left)- getHeight(node.left.right)<0)
            {
                //left right
                node.left=leftRotate(node.left);
                return rightRotate(node);
            }
        }

        if(getHeight(node.left)-getHeight(node.right)<-1)
        {
            //right heavt
            if(getHeight(node.right.left) - getHeight(node.right.right)<0) {
                //right right
                return leftRotate(node);
            }

            if(getHeight(node.right.left)- getHeight(node.right.right)>0)
            {
                //right left
                node.right=rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;

    }

    private Node rightRotate(Node node) {
        Node c=node.left;
       Node t3=   c.right;
       c.right=node;
       node.left=t3;
       node.height=Math.max(getHeight(node.left),getHeight(node.right))+1;
        c.height=Math.max(getHeight(c.left),getHeight(c.right))+1;
       return  c;
    }

    private Node leftRotate(Node node) {
        Node C=node.right;
        Node t=node.right.left;
        C.left=node;
        node.right=t;
        node.height=Math.max(getHeight(node.left),getHeight(node.right))+1;
        C.height=Math.max(getHeight(C.left),getHeight(C.right))+1;
        return C;
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
