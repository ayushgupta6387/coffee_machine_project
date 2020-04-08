package stage4;

import java.util.Scanner;

public class CoffeeMachine {
    static int water = 1200;
    static int milk = 540;
    static int beans = 120;
    static int cups = 9;
    static int money = 550;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        display();
        String action = scanner.nextLine();
        switch (action) {
            case "buy": {
                System.out.print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
                int task = scanner.nextInt();
                System.out.println();
                switch (task) {
                    case 1: {
                        water -= 250;
                        beans -= 16;
                        cups--;
                        money += 4;
                        break;
                    }
                }
            }
        }
    }

    static public void display() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(money + " of money");
        System.out.println();
        System.out.print("Write action (buy, fill, take): ");
    }

}

