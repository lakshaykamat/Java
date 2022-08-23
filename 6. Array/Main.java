import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = { 15, 2, 2, 94, 5};
        System.out.println(numbers.length);
        //Prints length of a array
        System.out.print("Array to String ");
        System.out.println(Arrays.toString(numbers));
        //converted array to string and then prints to console
        System.out.println("Array item "+numbers[0]);
        
        System.out.println(" ");
        
        //Multi dimessional array
        int[][] arr = new int [3][2];
        
        arr[0][0] = 0;
        arr[0][1] = 1;
        
        arr[1][0] = 2;
        arr[1][1] = 3;
        
        arr[2][0] = 4;
        arr[2][1] = 5;
        //converted array to string and then prints to console
        System.out.println(Arrays.deepToString(arr));
        System.out.println(arr.length);//prints total rows that is 3
    }
}