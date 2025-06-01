package org.example.tree;

import java.util.Scanner;

public class Tree {

    public Tree()
    {

    }
    private class Node
    {
        private int value;
        Node left;
        Node right;
       public Node(int value)
       {
           this.value=value;
       }
    }
    private Node root;


    public void insert(Scanner sc)
    {
        System.out.println("Enter the root node");
        int value=sc.nextInt();
        root=new Node(value);
        populate(root, sc);
    }

    private void populate(Node node, Scanner sc) {
        System.out.println("Do You want to insert left child of : "+node.value);
        boolean left= sc.nextBoolean();
        if(left)
        {
            System.out.println("enter left value : ");
            int leftValue=sc.nextInt();
            node.left=new Node(leftValue);
            populate(node.left,sc);

        }
        System.out.println("Do You want to insert right child of "+node.value);
        boolean right= sc.nextBoolean();
        if(right)
        {
            System.out.println("enter right value : ");
         int rightValue=sc.nextInt();
            node.right=new Node(rightValue);
            populate(node.right,sc);
        }
    }

    public  void display()
    {
        display(root, "");
    }

    private void display(Node node, String indent) {
        if(node==null)
        {
            return;
        }
        System.out.println(indent+node.value);
        display(node.left,indent+" ");
        display(node.right,indent+" ");
    }
    
    public void prettyDisplay()
    {
        prettyDisplay(root,0);
    }

    private void prettyDisplay(Node node, int level) {
        if(node==null)
        {
            return;
        }
        prettyDisplay(node.right,level+1);
        if(level!=0) {
            for(int i=0;i<level-1;i++) {
                System.out.print("@\t\t");
            }

            System.out.println("|------>" + node.value);
        }else{
            System.out.println(node.value);
        }
        prettyDisplay(node.left,level+1);
    }


}
