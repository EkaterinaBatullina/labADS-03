/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.treechild;

import java.util.Stack;

/**
 *
 * @author ekaterina
 */
public class BinaryTree {
    private Node root;
    private Node current;
    private Stack stack1 = new Stack();
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
       
    public void recInOrder() {
        treatment();
        stack1.add(new Result(current.value,0,0));
        if (current.nextLeft != null) {
            stack.add(current);
            current = current.nextLeft;
            recInOrder();
        }
        delete(current); 
        if (current.nextRight != null) {
            current = current.nextRight;
            recInOrder();
        }
        else {
            if (!stack.isEmpty()) {
                current = stack.pop();
                Result result = (Result) stack1.pop();
                while (result.node != current.value) {
                    result(result);
                    result = (Result) stack1.pop();
                } 
                stack1.add(result);    
            }
            else {
                while (!stack1.isEmpty()) {
                    Result result = (Result) stack1.pop();
                    result(result);
                }
            }
        }
    }


    public void treatment() {
        for (Object e : stack1) {
            ((Result) e).value ++;
            ((Result) e).sum += current.value;
        }
    }
    
    public void result(Result result) {
        System.out.println("Узел " + result.node + " имеет " + result.value + " потомков" + ", сумма значений: " + result.sum);
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
