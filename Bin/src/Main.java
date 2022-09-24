import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int num = 13;
        bin(num);
    }
    public static void bin(int n){
        int divisor = 2;
        int[] quo = new int[10];
        int[] remainder = new int[10];
        quo[0] = n/divisor;
        quo[1] = quo[0]/divisor;
        quo[2] = quo[1]/divisor;
        quo[3] = quo[2]/divisor;

        remainder[0] = n%divisor;
        remainder[1] = quo[0]%divisor;
        remainder[2] = quo[1]%divisor;
        remainder[3] = quo[2]%divisor;
        remainder[4] = quo[3]%divisor;
        int i =0;
        while(!(quo[i] == 0)){
            quo[i] = n/2;
            i++;
            quo[1] = quo[i - 1]/2;
            quo[2] = quo[1]/2;
            quo[3] = quo[2]/2;
        }
        System.out.println(Arrays.toString(quo));
        System.out.println(Arrays.toString(remainder));
    }
}