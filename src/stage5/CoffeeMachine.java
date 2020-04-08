package stage5;

import java.util.Scanner;

public class CoffeeMachine {
    Scanner scanner = new Scanner(System.in);

    public void buy() {
        System.out.println();
        System.out.print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        String choice = scanner.next();

    }
}