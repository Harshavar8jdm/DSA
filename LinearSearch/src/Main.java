public class Main {
    static void main(){
        int[] arr = {1, 6, 2, 3, 7};
        System.out.println(linearSearch(arr, 7));
        System.out.println(linearSearch2(arr,7));

    }
    //Search in an array: return index if the target is found
    //otherwise if item not found return -1
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            System.out.println("This is an empty array!");
            return -1;
        }
        // run a for loop
        for(int i = 0; i< arr.length; i++){

            //Check for element evry index
            if(arr[i] == target){
                return i;
            }
        }
        //this line will execute if none of the return statements above are executed
        //hence the target is not found
        return -1;
    }

    static boolean linearSearch2(int[] arr, int target){
        for(int num:arr){
            if(num == target){
                return true;
            }
        }
        return false;

    }

}
