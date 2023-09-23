public class Main {
    public static void main(String[] args) {
        int n = 5;
        //rightTriangle(n);
        //square(n);
        //lowerRightTriangle(n);
    }
    static void rightTriangle(int n){
        /*
        *
        * *
        * * *
        * * * *
         */
        for (int row = 1; row <= n; row++) {
            //for every row run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            //when one row is printed add line break
            System.out.println();
        }
    }

    static void square(int n){
        /*
        * * * *
        * * * *
        * * * *
        * * * *
        */
        for (int row = 1;row <=n; row++){
            for (int col = 1; col <= n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void lowerRightTriangle(int n){
        /*
        * * * *
        * * *
        * *
        *
        */
        for (int row = 1;row<=n;row++){
            for(int col = 1;col<= n - row + 1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}