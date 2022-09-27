public class Main {
    public static void main(String[] args) {
        //Bicycle bike = new Bicycle();
        Atlas atlas = new Atlas(30);
        atlas.speedUp();
        System.out.println(atlas.speed);

        atlas.applyBrake();
        atlas.applyBrake();
        atlas.speedUp();
        System.out.println(atlas.speed);
    }
}