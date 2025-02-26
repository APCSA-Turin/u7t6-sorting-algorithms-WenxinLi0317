package com.example.project;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import com.example.project.Insertion_Sort.InsertionSort;
public class main{
    public static void main(String[] args) {
        int[] arrA = {9,2,1};
        InsertionSort.selectionSort(arrA);
        System.out.println(Arrays.toString(arrA));
        System.out.println();
        int[] arrB = {9,2,1};
        InsertionSort.insertionSort(arrB);
        System.out.println(Arrays.toString(arrB));

    }
}