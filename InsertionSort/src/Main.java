import java.util.Arrays;

public class Main {

    public static void main(){
        int[] arr = {5, 3, 4, 1, 2};
        selectionSortMin(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSortMin(int[] arr){
        for(int i = 0; i<arr.length; i++){
            int firstIndex = i;
            int maxIndex = findMin(arr, firstIndex);
            swapArray(arr, firstIndex, maxIndex);

        }
    }

    static int findMin(int[] arr, int firstIndex){
        int min = firstIndex;
        for(int i = firstIndex; i < arr.length ;i++){
            if(arr[min] > arr[i]){
                min = i;
            }
        }
        return min;
    }

    static void swapArray(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


}



