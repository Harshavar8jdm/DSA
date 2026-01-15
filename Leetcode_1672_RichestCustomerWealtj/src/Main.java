import java.util.*;
public class Main {
    public static void main(String[] args){
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for(int i = 1; i < n+1 ; i++){
            if(i == 1 || i == n){
                for(int j = 1; j<n ; j++){
                    System.out.print("*");
                }
            }
            else{}
        }
        scanner.close();
    }
}
