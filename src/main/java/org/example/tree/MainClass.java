package org.example.tree;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree=new BinarySearchTree();
        Scanner sc=new Scanner(System.in);
        binarySearchTree.insert(sc);
        binarySearchTree.display();
        binarySearchTree.prettyDisplay();
    }
}
