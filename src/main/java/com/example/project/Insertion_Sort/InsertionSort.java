package com.example.project.Insertion_Sort;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort {

    // PART A. implementing insertion sort
    public static int[] insertionSort(int[] elements) {
        int count =0;
        for(int i = 1; i < elements.length; i++)
        {

            int current = elements[i];
            int innerIndex = i;
            //1,3,2
            //current = element[1] = 3
            //inner = 1
            //inner >0 && ?3<1?
            //break:
            //elemnet[1]= elemnt1; no change
            //i++; current = element[2]=2; inner = 2;
            //2>0&&2<3
            //elmemnt[2]=elemnt[1];
            //1,3,3
            //index--=1
            //elemnt[1]=cuurent = 2;1,2,3
            while(innerIndex>0&&current<elements[innerIndex-1])
            {
                elements[innerIndex]=elements[innerIndex-1];
                innerIndex--;
            }
            elements[innerIndex]=current;
        }
        return elements;
    }

   
    public static void selectionSort(int[] elements) {
        int count =0;
        for (int j = 0; j < elements.length - 1; j++) {
            int minIndex = j;
            for (int k = j + 1; k < elements.length; k++) {
                count++;
                if (elements[k]< elements[minIndex]) {
                    minIndex = k;
                }
            }
           int temp = elements[j];
            elements[j]=elements[minIndex];
            elements[minIndex]=temp;
        }
        System.out.println("selection:"+count);
    }

    // PART B. sorting a 1000-word list
    public static ArrayList<String> insertionSortWordList(ArrayList<String> words) {
        for(int j = 1; j < words.size();j++)
        {
            String current = words.get(j);
            int index = j;
            while(index>0&&current.compareTo(words.get(index-1))<0)
            {
                words.set(index, words.get(index-1));
                index--;
            }
            words.set(index, current);
        }
        return words;
    }

    public static void selectionSortWordList(ArrayList<String> words) {
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
      
    }

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