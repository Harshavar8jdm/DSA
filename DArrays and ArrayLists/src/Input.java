import java.util.Scanner;

public class Input {
    static void main(){
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i = 0; i<arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        for(int num : arr){
            System.out.println(num);
        }




    }
}
