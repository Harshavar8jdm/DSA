public class Boxes {
    public static void main(String[] args){
        //filledBox(12);
        //System.out.println();
        //hollowBox(12);
        //slopingTriangle(6);
        //slopingNumTriangle(6);
        //slopingRowTriangle(5);
        //reverseSlopingTriangle(6);
        //reverseNumTriangle(5);
        //triangleCentered(90);
        //triangleCenteredReversed(10);
        //diamond(5);
        //halfDiamond(6);
        //binarySlopingTriangle(6);
        //numberCollar(9);
        //numIncrementTriangle(5);
        //characterTriangle(22);
        //characterTriangleReversed(26);
        //singleCharacterTriangle(3);
        //characterTriangleCentered(5);
    }

    static void filledBox(int n){

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){

                System.out.print("*");

            }
            System.out.println(" ");
        }
    }

    static void hollowBox(int n){
        for(int i = 0; i < n; i++){
            if(i == 0 || i == n-1){
                int k = n;
                while(k != 0){
                    System.out.print("*");
                    k--;
                }
            }
            else{
                for (int j = 0; j < n; j++) {
                    if(j == 0 || j == n-1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    static void slopingTriangle(int n){
        for(int i = 1; i <= n ; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void slopingNumTriangle(int n){
        for(int i = 1; i <= n ; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void slopingRowTriangle(int n){
        for(int i = 1; i <= n ; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    static void reverseSlopingTriangle(int n){
        for(int i = n ; i > 0; i--){
            for(int j = i; j > 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void reverseNumTriangle(int n){
        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();

        }
    }
    static void triangleCentered(int n){
        for(int i = 0; i<=n ;i++){
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");

            }
            for(int j = 0; j < (2*i)-1 ; j++){
                System.out.print("*");
            }

            for(int j = 0; j < (n-i-1); j++){
                System.out.print(" ");
            }
            System.out.println("");
        }

    }

    static void triangleCenteredReversed(int n){

        for(int i = n; i >= 0; i--){
            for(int j = 0; j < n-i-1; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < (2*i)+1; j++){
                System.out.print("*");
            }
            for(int j = 0; j < n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println("");
        }

    }

    static void diamond(int n){
        //int cols = (2*n) + 1;
        //int spaces = n - i - 1;
        //int stars = (2*i) +1;



        for(int i = 0; i<=n ;i++){
            for(int j = 0; j < n-i-1; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < (2*i)+1; j++){
                System.out.print("*");
            }
            for(int j = 0; j< n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println("");
        }

        for(int i = n; i>=0 ;i--){
            for(int j = 0; j < n-i-1; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < (2*i)+1; j++){
                System.out.print("*");
            }
            for(int j = 0; j< n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println("");
        }


    }

    static void halfDiamond(int n){
        for(int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = n; i>0 ; i--){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void binarySlopingTriangle(int n){
        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j = 0; j<=i; j++){
                if(count % 2 == 0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
                count++;
            }
            System.out.println("");
        }

    }

    static void numberCollar(int n){
        int spaces = n + 2;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
            for(int j = 1; j<=((2*n)-(2*i));  j++){
                System.out.print(" ");
            }

            for(int j = i; j>0; j--){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    static void numIncrementTriangle(int n){
        int count = 1;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println("");
        }
    }

    static void characterTriangle(int n){
        if(n >26){
            System.out.println("Not Possible");
            return;
        }
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                System.out.print(characters.charAt(j));
            }
            System.out.println();
        }
    }

    static void characterTriangleReversed(int n){
        if(n >26){
            System.out.println("Not Possible");
            return;
        }
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i = n-1; i >= 0; i--){
            for(int j = 0; j <= i; j++){
                System.out.print(characters.charAt(j));
            }
            System.out.println();
        }
    }

    static void singleCharacterTriangle(int n){
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(characters.charAt(i));
            }
            System.out.println();
        }
    }

    static void characterTriangleCentered(int n){
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int plus = 0;
        for(int i = 0; i <= n; i++){
            for(int j = 0; j < n - i - 1; j++){ //(2*i)+1
                System.out.print(" ");
            }
            for(int j = 0; j < ((2*i)+1)/2 ; j++){
                //System.out.print(characters.charAt(j));

            }


            for(int j = 0; j< n - i - 1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }



}


