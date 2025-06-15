package org.example.binarysearchtree;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree=new BinarySearchTree();
        binarySearchTree.populate(new int[] {3,6,1,8,36});
        binarySearchTree.display();
        binarySearchTree.preOrder();
        System.out.println("In order");
        binarySearchTree.inOrder();
        System.out.println("Post Order");
        binarySearchTree.postOrder();
    }
}
