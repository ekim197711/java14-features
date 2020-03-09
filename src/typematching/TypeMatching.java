package typematching;

public class TypeMatching {

    public static void main(String[] args) {
     SpaceShip spaceShip = new SpaceShip();
     Bird bird = new Bird();
     useTheFlyingObject(spaceShip);
     useTheFlyingObject(bird);

    }

    public static void useTheFlyingObject(FlyingObject flyingObject){
        if (flyingObject instanceof Bird bird){
            bird.sayTweet();
        }
        else if (flyingObject instanceof SpaceShip spaceShip){
            spaceShip.landOnMars();
        }
    }
}
