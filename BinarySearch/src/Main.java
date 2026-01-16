public class Main {
    public static void main(String[] args){
        int[] arr = {2,4,5,7,10, 23, 38, 45, 89};
        int start = 0;
        int end = arr.length - 1;
        int target = 89;
        int flag = 0;
        while(start<=end){
            int mid = (start+end)/2;
            if(target > arr[mid]){
                start = mid + 1;
            }

            else if(target < arr[mid]){
                end = mid -1;
            }
            else{
                flag = 1;
                break;
            }


        }

        System.out.println(flag);
    }
}
