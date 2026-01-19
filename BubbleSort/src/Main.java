import java.util.Arrays;

public class Main {
    static void main(String[] args) {
        //int[] arr = {3, 1, 5, 4, 2};
        int[] arr = {1,2,3,4,5};
        boolean swapped;

        for(int i = 0; i < arr.length; i++){
            swapped = false;
            for(int j = 1; j < arr.length - i; j++){
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            // if you did not swap for a particular value of i
            // it means the array is sorted, then break from the loop
            if(!swapped){
                break;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
