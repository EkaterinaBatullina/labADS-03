/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sortingstrings;

/**
 *
 * @author ekaterina
 */
public class SortedStrings {
    private String[] array;
    
    public SortedStrings(String string) {
        
        array = string.split(" ");
        
    }
    
    public String merge() {
        
        String result = "";
        int[] indexArray = new int[array.length];
        int i = 0;
        while (indexArray[i] < array[i].length()) {
            int indexOfMinEl = i;
            for (int j = i; j < array.length; j++) {
                if (indexArray[j] != array[j].length()) {
                    if (array[indexOfMinEl].charAt(indexArray[indexOfMinEl]) > array[j].charAt(indexArray[j])) {
                        indexOfMinEl = j;
                    }
                }
            }
            result += array[indexOfMinEl].charAt(indexArray[indexOfMinEl]);
            indexArray[indexOfMinEl]++;
            if (indexArray[i] == array[i].length()) {
                if (i + 1 < array.length) {
                    i++;
                }
            }  
        }
        return result;
        
    }
}
