import java.util.Arrays;

public class DupeValuesTwice {

     static void onlyDupes2Times(int[] numbers, int length) {
         Arrays.sort(numbers);
        System.out.println("Printing Dupes occurs only twice ...");
        for (int i=0;i<length-1;i++){
            int count = 0;
            if(numbers[i] == numbers[i+1]){
                count ++;
            }
            while(i < length-1  && numbers[i] == numbers[i+1]){
                i++;
                count++;
            }
            if(count == 2){
                System.out.print(numbers[i]+" ");
            }
        }
    }
    public static void main(String[] args) {

        int[] numbers = {1,1,1,2,2,3,3,4,4,5,6,6,7,7,5};
        int length = numbers.length;
        onlyDupes2Times(numbers,length);

    }
}
