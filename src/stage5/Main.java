package stage5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean exit = false;
        CoffeeMachine obj = new CoffeeMachine();
        do {
            System.out.print("Write action (buy, fill, take, remaining, exit): ");
            String action = scanner.next();
        } while (exit == false);
    }
}
