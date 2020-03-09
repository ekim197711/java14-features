package switchdemo;

public class SwitchDemo {
    public static void main(String[] args) {
        trySwitch("big");
    }

    public static void trySwitch(String testme){
        var result = switch (testme){
            case "round" -> Alien.FAST;
            case "pyramid" -> 2;
            case "big" -> {
                String h = "hellow" + 14;
                yield h;
            }
            default -> 100;
        };
        System.out.println("Result is " + result + " class: " + result.getClass().getName());
    }
}
