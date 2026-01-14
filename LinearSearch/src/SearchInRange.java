public class SearchInRange {
    static void main(){
        int arr[] = {1,4,2,6,3};
        int target = 2;
        int start = 1;
        int end = 4;
        System.out.println("Index: "+searchInRange(arr, target, start, end));

    }
    static int searchInRange(int[] arr, int target ,int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for(int i = start; i <=end; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
