package stage3;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int water = 200;
        int milk = 50;
        int beans = 15;
        System.out.print("Write how many ml of water the coffee machine has: ");
        int waterLevel = scanner.nextInt();
        System.out.print("Write how many ml of milk the coffee machine has: ");
        int milkLevel = scanner.nextInt();
        System.out.print("Write how many grams of coffee beans the coffee machine has: ");
        int beanLevel = scanner.nextInt();
        System.out.print("Write how many cups of coffee you will need: ");
        int cupsNeed = scanner.nextInt();
    }
}