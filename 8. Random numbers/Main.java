import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random random = new Random();
       int num = random.nextInt(3) + 1;
       System.out.println(num);
    }
}
