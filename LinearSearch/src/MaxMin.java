public class MaxMin {
    static void main(){
        int[] arr = {1,2,5,3,53,32, 0};
        int[][] arr2D = {{200,282,332}, {3423,751,4232}, {253,42454,22}};
        System.out.println(minNum(arr));
        System.out.println(minNum2D(arr2D));
    }
    static int minNum(int arr[]){
        int min = arr[0];
        for(int num:arr){
            if(num < min){
                min = num;
            }
        }
        return min;
    }

    static int minNum2D(int arr[][]){
        int minrow = arr[0][0];
        int mincol = arr[0][0];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j< arr[i].length; j++){
                if(arr[i][j] < mincol) {
                    mincol = arr[i][j];
                }
            }
            if(mincol < minrow){
                minrow = mincol;
            }

        }
        return minrow;
    }
}
