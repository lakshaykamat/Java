public class Main {
    public static void main(String[] args) throws InterruptedException {
        //System.out.println(Thread.activeCount());
        //System.out.println(Thread.currentThread().getName());
        //System.out.println(Thread.currentThread().getPriority());
        for (int i=3;i>=1;i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("GO!");
    }
}