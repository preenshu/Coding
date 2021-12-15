package com.prep.sort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int inputArray[] = {4,7,2,9,1,5,8,0,6};
        SelectionSort selectionSort = new SelectionSort();

        System.out.println("input: "+ Arrays.toString(inputArray));
        System.out.println("sorted int: "+ Arrays.toString(selectionSort.sort(inputArray)));

    }

    public int[] sort(int[] input){
        /*
        pick a number, may be first element and compare it with the next index number
        if the number is smaller, then update the variable and do it with rest of the list
        once found the smallest number, swap it to the first index
        now start the same process with second element and so on
        * */

        for (int i=0; i<input.length; i++){
            int smallestNumber;
            int smallestNumberPosition;
            smallestNumber = input[i];
            smallestNumberPosition = i;

            for (int j=i; j<input.length; j++){
                if (smallestNumber > input[j]){
                    smallestNumber = input[j];
                    smallestNumberPosition = j;
                }
            }
            int swapElement = input[i];
            input[i] = smallestNumber;
            input[smallestNumberPosition] = swapElement;
        }

        return input;
    }
}
