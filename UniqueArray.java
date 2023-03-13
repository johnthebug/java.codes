import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqueArray {

    static void removeDuplicates(int[] numbers, int length){
        Arrays.sort(numbers); // sorting array
        long start = System.nanoTime();
        int j=0;
        for(int i=0;i<length-1;i++){
            if(numbers[i] != numbers[i+1]){
                numbers[j++] = numbers[i];
            }
        }
        numbers[j++] = numbers[length-1];
        long end = System.nanoTime();
        System.out.println("Using Constant space ...");
        for(int i=0;i<j;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println("\n Time taken to Remove Duplicate : "+ (end - start)+" nano seconds ");
    }

    static void sort(int[] array,int length){
        long start = System.nanoTime();
        for(int i=0;i< length;i++){
            int minIndex = i;
            for(int j=i+1;j< length;j++){
                if(array[j] < array[minIndex]){
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        long end = System.nanoTime();
        for(int num : array){
            System.out.print(num+" ");
        }
        System.out.println("\n Time taken to sort : "+ (end - start)+" nano seconds ");
    }

    static void removeDuplicatesUsingTempArray(int[] number,int length){
        long start = System.nanoTime();
        int[] values = new int[number.length];
        int j=0;
        for(int i=0;i<length-1;i++){
            if(number[i] != number[i+1]){
                values[j++] = number[i];
            }
        }
        values[j++] = number[length - 1];
        long end = System.nanoTime();
        System.out.println("\n Using Auxillary space ...");
        for(int i=0;i<j;i++){
            System.out.print(values[i]+" ");
        }
        System.out.println("\n Time taken to remove duplicate : "+ (end - start)+" nano seconds ");
    }

    public static void main(String[] args) {
        int[] numbers1 = { 51, 22, 69, 57, 46, 77, 85, 9, 33, 48, 2, 99, 88, 73, 41, 68, 5, 30, 92, 13 }; //unsorted array
        int[] numbers = {1, 2, 2, 4, 5, 5, 5, 7, 7, 8, 9, 9, 9, 11, 11, 11, 11, 13, 15, 15};
        int length = numbers.length;
        sort(numbers,length);
        removeDuplicatesUsingTempArray(numbers,length);
        removeDuplicates(numbers,length); //using constant space
    }
}
