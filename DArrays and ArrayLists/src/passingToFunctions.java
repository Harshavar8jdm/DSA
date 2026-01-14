import java.util.Scanner;

public class passingToFunctions {
    static void main(){
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        change(arr);
        for(int num:arr){
            System.out.println(num);
        }
    }
    static void change(int[] arr){
        arr[3] = 90;
    }
}
