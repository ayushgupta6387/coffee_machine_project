package stage2;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int water = 200;
        int milk = 50;
        int beans = 15;
        System.out.print("Write how many cups of coffee you will need: ");
        int cups = scanner.nextInt();
        System.out.println("For " + cups + " cups of coffee you will need: ");
        System.out.println((cups * water) + " ml of water");
    }
}
