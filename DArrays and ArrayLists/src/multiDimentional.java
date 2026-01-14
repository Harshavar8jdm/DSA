import java.util.Scanner;

public class multiDimentional {
    static void main(){
        Scanner scanner = new Scanner(System.in);
        /*
        * 1 2 3
        * 4 5 6
        * 7 8 9
        * */


       // int[][] arr = new int[3][];  // [row][columns] columns are not mandatory
       int[][] arr = {
               {1, 2, 3},
               {4, 5, 6},
               {7, 8, 9}
       };

       int[][] arrDiffCols = {
               {1, 2, 3}, //0th
               {4, 5},  //1st
               {6, 7, 8, 9}, //2nd
               {11, 10, 13, 1, 15}  //3rd
       };


       //input

        int[][] arr2D = new int[3][3];

        /*for (int row = 0; row < arr2D.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                arr[row][col]= scanner.nextInt();
            }
        }*/

        for (int i = 0; i < arrDiffCols.length; i++) {
            for (int j = 0; j < arrDiffCols[i].length; j++) {
                System.out.print(arrDiffCols[i][j] + "\t");

            }
            System.out.println("\n");

        }





    }
}
