package stage5;

import java.util.Scanner;

public class CoffeeMachine {
    Scanner scanner = new Scanner(System.in);
    int water = 400;
    int milk = 540;
    int beans = 120;
    int cups = 9;
    int money = 550;

    public void buy() {
        System.out.println();
        System.out.print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        String choice = scanner.next();
    }

    public boolean canMakeCoffee(int waterNeed, int milkNeed, int beansNeed) {

        return false;
    }
}