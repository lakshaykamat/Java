public class Atlas implements Bicycle{
    int speed;
    Atlas(int Speed){
        this.speed = Speed;
    }
    @Override
    public void applyBrake() {
        this.speed-=10;
    }

    @Override
    public void speedUp() {
        this.speed+=10;
    }
}
