/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.treetraversal;

/**
 *
 * @author ekaterina
 */
public class TreeTraversal {

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.add(1);
        tree.add(4);
        tree.add(20);
        tree.add(14);
        tree.add(10);
        tree.add(13);
        tree.add(21);
        tree.add(15);
        tree.add(16);
        
        tree.recPreOrder();
        System.out.println();
        tree.recInOrder();
        System.out.println();
        tree.recPostOrder();
        
    }
}
