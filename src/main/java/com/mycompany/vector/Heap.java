/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vector;

/**
 *
 * @author ekaterina
 */
public class Heap {
    private String[] array;
    private int capacity;
    
    public Heap(int size) {
         
        array = new String[size];
        capacity = 0;
        
    }
    
    public void add(String string) {
        
        array[capacity] = string;
        int i = capacity;
        capacity++;
        while (i != 0 && compare(array[i], array[(i - 1) / 2])) {
            swap(i, ((i - 1) / 2));
            i = (i - 1) / 2;
        }
        
    }
    
    public boolean compare(String string1, String string2) {
        
        boolean result = true;
        if (string1.compareTo(string2) >= 0) {
            result = false;
        }
        return result;
        
    }
    
    public void swap(int index1, int index2) {
        
        String string = array[index1];
        array[index1] = array[index2];
        array[index2] = string;
        
    }
    
    public String minDel() {
        
        String result = array[0];
        if (capacity - 1 != 0) {
            swap (0, capacity - 1);
            capacity--; 
            array[capacity] = null;
            int index1 = 0, index2 = 2 * index1 + 1;
            if (index2 + 1 < capacity && compare(array[index2 + 1], array[index2])) {
                index2++;
            }
            while ((2*index1 < capacity && array[index2] != null) && compare(array[index2], array[index1])) {
                swap(index1, index2);
                index1 = index2;
                index2 = index1 * 2 + 1;
                if (index2 + 1 < capacity && compare(array[index2 + 1], array[index2])) {
                    index2++;
                }
            }
        }
        return result;
    }
    
}
