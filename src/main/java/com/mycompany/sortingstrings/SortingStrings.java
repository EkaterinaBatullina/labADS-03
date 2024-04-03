/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sortingstrings;

/**
 *
 * @author ekaterina
 */
import java.util.Scanner;
public class SortingStrings {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        SortedStrings sortedStrings = new SortedStrings(scanner.nextLine());
        System.out.println(sortedStrings.merge());
    }
}
