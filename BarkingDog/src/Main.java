public class Main {
    public static void main(String[] args) {

        System.out.println(BarkingDog.shouldWakeUp(true, 1));
        System.out.println(BarkingDog.shouldWakeUp(false, 3));
        System.out.println(BarkingDog.shouldWakeUp(true, 9));
        System.out.println(BarkingDog.shouldWakeUp(true, -10));
    }
}
