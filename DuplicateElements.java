import java.util.Arrays;

public class DuplicateElements {

    static void onlyDuplicates(int[] numbers,int length){
        Arrays.sort(numbers);
        System.out.println("Printing Only Duplicate Values ... ");
        for(int i=0;i<length-1;i++){
            if(numbers[i] == numbers[i+1]){
                System.out.print(numbers[i]+" ");
            }
            //to avoid couting another same element in the array
            while(i < length-1 && numbers[i] == numbers[i+1]) { // it checks if the current index < length -1 && array[i] -- array[i+1
                i++; // if yes it increments the index value. so that now all the same dupe value is checked .
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1,1,2,2,3,3,4,4,5,5,5,6,8,9};
        int length = numbers.length;
        onlyDuplicates(numbers,length);
    }
}
