public class InfiniteSortedArray {
    public static void main(String[] args){
        //position of an element in an infinitely sorted array
        int[] arr = {2,3,5,6,7,8,10,11,12,15,20,23,30};
        int target = 15;
        //brute force method: Linear Search
        /*for(int i = 0;  i < Integer.MAX_VALUE; i++){
            if(target == arr[i]){
                System.out.println(i);
                break;
            }
        }
         */
        System.out.println(ans(arr, target));





    }

    static int ans(int arr[], int target){
        int start = 0;
        int end = 1;
        int boxSize = 2;
        while(target > arr[end]){
            int newStart = end + 1;
            end = end + (end - start + 1)*2;
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }
    static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

}
