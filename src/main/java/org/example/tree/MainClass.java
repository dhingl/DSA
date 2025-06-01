package org.example.tree;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Tree tree =new Tree();
        Scanner sc=new Scanner(System.in);
        tree.insert(sc);
        tree.display();
        tree.prettyDisplay();
    }
}
