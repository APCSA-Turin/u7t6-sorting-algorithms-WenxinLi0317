package com.example.project.Selection_Sort;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class SelectionSort {

    // PART A. implementing selection sort
    public static int[] selectionSort(int[] elements) {
        for (int i =0; i < elements.length-1; i ++)
        {
            for (int j = 0; j < elements.length-1-i; j++)
            {
                int num1 = elements[j];
                int num2 = elements[j+1];
                if(num2 < num1 )
                {
                    int temp = num1;
                    elements[j]=num2;
                    elements[j+1]=temp;
                }
            }
        }
        /*
        for (int j = 0; j < elements.length - 1; j++) {
            int minIndex = j;
            for (int k = j + 1; k < elements.length; k++) {
                //1,3,2,
                //j =0, k =1
                //min = 0
                //if element[1]=3 <element[1] 1
                //
                if (elements[k] < elements[minIndex]) {
                    minIndex = k;
                }
            }
            //temp = element[j], element[0], 1
            //elemeny[0]=element[0] = 1, 
            int temp = elements[j];
            elements[j] = elements[minIndex];
            elements[minIndex] = temp;
        }
        */
        return elements;
    }


    // PART B. sorting a 1000-word list
    public static ArrayList<String> selectionSortWordList(ArrayList<String> words) {
        for (int i =0; i < words.size()-1; i ++)
        {
            for (int j = 0; j < words.size()-1-i; j++)
            {
                String str1 = words.get(j);
                String str2= words.get(j+1);
                int compare = str1.compareTo(str2);

              
                if(compare>0)
                {
                    words.set(j, str2);
                    words.set(j+1, str1);
                }
            }
        }
        /*
        for (int j = 0; j < words.size() - 1; j++) {
            int minIndex = j;
            for (int k = j + 1; k < words.size(); k++) {
                if (words.get(k).compareTo(words.get(minIndex)) < 0) {
                    minIndex = k;
                }
            }
            String temp = words.get(j);
            words.set(j, words.get(minIndex));
            words.set(minIndex, temp);
        }
        */
        return words;
    }

    //call this method to load 1000 words into list. Use it to test Part B
    public static ArrayList<String> loadWordsInto(ArrayList<String> wordList) {
        try {
            Scanner input = new Scanner(new File("src/main/java/com/example/project/Selection_Sort/words.txt"));
            while (input.hasNext()) {
                String word = input.next();
                wordList.add(word);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return wordList;
    }
}