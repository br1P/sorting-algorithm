import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] Array = {7,4,56,2,34};
        System.out.println(Arrays.toString(Array));
        //Sorting algorithms: Learn all sorting algorithms Insertion sort, Selection sort, Bubble sort, Merge sort, Quicksort. Write a sorting algorithm:
        //Bruno Pruzsiani - Insertion sort
            for(int i = 1; i< Array.length; i++) {
                int key = Array[i];
                int j = i-1;

                while(j>=0 && Array[j] > key){
                    Array[j + 1] = Array[j];
                    j = j - 1;
                }
                Array[j + 1] = key;
            }
        System.out.println(Arrays.toString(Array));

    }



}