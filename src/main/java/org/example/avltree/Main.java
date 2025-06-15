package org.example.avltree;

public class Main {
    public static void main(String[] args) {
        AVLTree avlTree=new AVLTree();
        avlTree.populate(new int []{1,2,3,4,5,6});
        avlTree.display();
    }
}
