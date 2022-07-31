import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = { 15, 2, 2, 94, 5};
        System.out.println(numbers.length);
        //Prints length of a array
        System.out.println(Arrays.toString(numbers));

        //Multi dimessional array
        int[][] arr = new int [3][2];
        arr[0][0] = 5;
        System.out.println(Arrays.deepToString(arr));
    }
}