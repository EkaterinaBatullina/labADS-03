/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.treetraversal;

import java.util.List;
import java.util.Stack;

/**
 *
 * @author ekaterina
 */
public class Tree {
    private Node root;
    private Node current;
    private Stack<Node> stack = new Stack<>();
    
    public void add(int e) {
        if (root == null) {
            root = new Node(e);
        }
        
        else {
            current = root;
            while (true) {
                if (current.value > e) {
                    if (current.nextLeft == null) {
                        current.nextLeft = new Node(e);
                        current.nextLeft.previous = current;
                        break;
                    }
                    else {
                        current = current.nextLeft;
                    }
                }
                else {
                    if (current.nextRight == null) {
                        current.nextRight = new Node(e);
                        current.nextRight.previous = current;
                        break;
                    }
                    else {
                        current = current.nextRight;
                    }  
                } 
            }
        }
        current = root;
    }
    
   public void recPreOrder() {
        treatment();
        if (current.nextLeft != null) {
            stack.add(current);
            current = current.nextLeft;
            recPreOrder();
        }
        if (current.nextRight != null) {
            current = current.nextRight;
            recPreOrder();
        }
        else {
            if (!stack.isEmpty()) {
                current = stack.pop();          
            }
        }
    }
   
    public void recInOrder() {
        if (current.nextLeft != null) {
            stack.add(current);
            current = current.nextLeft;
            recInOrder();
        }
        treatment();
        delete(current);
        if (current.nextRight != null) {
            current= current.nextRight;
            recInOrder();
        }
        else {
            if (!stack.isEmpty()) {
                current = stack.pop();
            }
        }
    }
    
    public void recPostOrder() {
        if (current.nextLeft != null) {
            current = current.nextLeft;
            recPostOrder();
        }
        if (current.nextRight != null) {
            stack.add(current);
            current = current.nextRight;
            recPostOrder();
        }
        if (root != null) {
            treatment();
            delete(current);
        }
        if (root == current) {
            root = null;
        }
        if (!stack.isEmpty()) {
           current = stack.pop();
        }  
    }
    
    public void treatment() {
        System.out.println(current.value); 
    }
    
    public void delete(Node current) {
        if (current.previous != null) {
            if (current == current.previous.nextRight) {
                current.previous.nextRight = null;
            }
            else {
                current.previous.nextLeft = null;
            }
        }
        else {
            if (current.nextLeft != null) {
                current.nextLeft.previous = null;
            }
            if (current.nextRight != null) {
                current.nextRight.previous = null;
            }
        }
    }
    
}
