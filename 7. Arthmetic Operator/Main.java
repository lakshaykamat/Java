import org.w3c.dom.TypeInfo;

public class Main{
    public static void main(String[] args){
       double result = (double)10/(double)9;
       int x = 1;
       System.out.println("X = "+ x);
       x++; //x = x + 1
       System.out.println("X increment to "+ x);
       System.out.println("Double = " + result);
       int random = (int)Math.round(Math.random() * 2) + 1;
       System.out.println(random);
       if(random == 1){
        System.out.println("Number is One");
       }else if(random == 2){
        System.out.println("Number is Two");
       }else{
        System.out.println("Number is Three");
       }
    }
}