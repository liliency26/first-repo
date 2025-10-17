/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_01_ex;

/**
 *
 * @author leena
 */
public class ArrayClass {

    private int[] arr;
    private int nElems; // عدد العناصر الفعلية

    // constructor
    public ArrayClass(int maxSize) {
        arr = new int[maxSize];
        nElems = 0;
    }

    // إدخال عنصر
    public void insert(int value) {
        arr[nElems++] = value;
    }

    // عرض جميع العناصر
    public void display() {
        for (int j = 0; j < nElems; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
    }

    // البحث عن عنصر
    public boolean find(int searchKey) {
        for (int j = 0; j < nElems; j++) {
            if (arr[j] == searchKey) {
                return true;
            }
        }
        return false;
    }

    // حذف عنصر
    public boolean delete(int value) {
        for (int j = 0; j < nElems; j++) {
            if (arr[j] == value) {
                for (int k = j; k < nElems - 1; k++) {
                    arr[k] = arr[k + 1];
                }
                nElems--;
                return true;
            }
        }
        return false;
    }

    // Overloaded method → عرض جزء محدد من المصفوفة
    public void display(int start, int end) {
        if (start < 0 || end > nElems || start >= end) {
            System.out.println("Invalid range!");
            return;
        }
        for (int j = start; j < end; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
    }

    //HomeWorke Lab1
    
    public void rotate(int k) {
        if (nElems == 0) {
            return;
        }
        k = k % nElems;
        if (k == 0) {
            return;
        }

        int[] result = new int[nElems];
        for (int i = 0; i < k; i++) {
            result[i] = arr[nElems - k + i];
        }
        for (int i = 0; i < nElems - k; i++) {
            result[i + k] = arr[i];
        }
        System.arraycopy(result, 0, arr, 0, nElems);
    }

    public void insertSorted(int key) {
        if (nElems == arr.length) {
            System.out.println("Array is full, can't insert.");
            return;
        }
        int i;
        for (i = nElems - 1; (i >= 0 && arr[i] > key); i--) {
            arr[i + 1] = arr[i];
        }
        arr[i + 1] = key;
        nElems++;
    }

}
