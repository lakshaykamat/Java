public class Main {
    public static void main(String[] args) {
        Planets myPlanets1 = Planets.EARTH;
        Planets myPlanets2 = Planets.MARS;
        //System.out.println(myPlanets);
        canILiveHere(myPlanets1);
        canILiveHere(myPlanets2);
    }
    static void canILiveHere(Planets planet){
        if(planet.equals(Planets.EARTH)){
            System.out.println("You Can on Live here :)");
            System.out.println("Planet Number #"+planet.planetNumber);
        }else{
            System.out.println("You Cannot Live here :(");
            System.out.println("Planet Number #"+planet.planetNumber);
        }
    }
}