/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.treechild;

/**
 *
 * @author ekaterina
 */
public class TreeChild {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.add(1);
        tree.add(4);
        tree.add(20);
        tree.add(14);
        tree.add(10);
        tree.add(13);
        tree.add(21);
        tree.add(15);
        tree.add(16);
        tree.recInOrder();
    }
}
