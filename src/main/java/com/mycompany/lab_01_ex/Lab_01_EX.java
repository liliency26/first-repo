/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab_01_ex;

import java.util.Scanner;

/**
 *
 * @author leena
 */
public class Lab_01_EX {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        ArrayClass myArr = new ArrayClass(10);

        System.out.println("Enter 5 integer numbers: ");
        for (int i = 0; i < 5; i++) {
            myArr.insert(read.nextInt());
        }

        System.out.println("The set contains: ");
        myArr.display();

//        System.out.print("Search for key: ");
//        int key = read.nextInt();
//        if (myArr.find(key)) {
//            System.out.println("Found " + key);
//        } else {
//            System.out.println("Can't find " + key);
//        }
//
//        System.out.print("Delete key: ");
//        key = read.nextInt();
//        if (myArr.delete(key)) {
//            System.out.println("Deleted " + key);
//        } else {
//            System.out.println("Can't find " + key);
//        }
//
//        System.out.println("The set contains: ");
//        myArr.display();
//
//        //   display() overloaded 
//        System.out.println("Displaying part of the array (index 1 to 3): ");
//        myArr.display(1, 3);

        //HomeWorke Lab1
        System.out.print("Enter a number to insertSorted: ");
        int val = read.nextInt();
        myArr.insertSorted(val);

        System.out.println("After insertSorted: ");
        myArr.display();

        System.out.print("Enter k to rotate array: ");
        int k = read.nextInt();
        myArr.rotate(k);

        System.out.println("After rotate: ");
        myArr.display();

        
    }
}
