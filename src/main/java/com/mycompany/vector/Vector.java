/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vector;

/**
 *
 * @author ekaterina
 */
import java.util.Scanner;
public class Vector {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(" ");
        Heap heap = new Heap(array.length);
        for (int i = 0; i < array.length; ++i) {
           heap.add(array[i]);
        }
        for (int i = 0; i < array.length; ++i) {
           array[i] = heap.minDel();
           System.out.print(array[i] + " ");
       }
        
       
    }
}
