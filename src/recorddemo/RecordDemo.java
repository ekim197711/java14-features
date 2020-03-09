package recorddemo;

import npe.SpaceStation;

public class RecordDemo {
    public static void main(String[] args) {
        SpaceCargo cargo1 = new SpaceCargo(11, "bananas");
        SpaceCargo cargo2 = new SpaceCargo(10, "bananas");
        System.out.println(cargo1);
        System.out.println("Are they equal: " + cargo1.equals(cargo2));
    }
}
