package npe;

public class NullpointerExceptionDemo {

    public static void main(String[] args) {
        refuel(new SpaceStation());
    }

    public static void refuel(SpaceStation spaceStation){
        spaceStation.spaceship.fuel = 99;
    }


}
