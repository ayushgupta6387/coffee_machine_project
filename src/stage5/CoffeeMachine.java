package stage5;

import java.util.Scanner;

public class CoffeeMachine {

    static int water = 400;
    static int milk = 540;
    static int beans = 120;
    static int cups = 9;
    static int money = 550;

    static Boolean exit = false;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    }

    static void buy() {
        System.out.println();
        System.out.print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        String choice = scanner.next();
        switch (choice) {
            case "1": {
                if (canMakeCoffee(250, 0, 16)) {
                    water -= 250;
                    beans -= 16;
                    cups--;
                    money += 4;
                    break;
                }
            }
            case "2": {
                if (canMakeCoffee(350, 75, 20)) {
                    water -= 350;
                    milk -= 75;
                    beans -= 20;
                    cups--;
                    money += 7;
                    break;
                }
            }
            case "3": {
                if (canMakeCoffee(200, 100, 12)) {
                    water -= 200;
                    milk -= 100;
                    beans -= 12;
                    cups--;
                    money += 6;
                    break;

                }

            }
            case "back": {
                break;
            }
            default: {
                break;
            }

        }
    }

    static void fill() {
        //System.out.println("fill() called");
        System.out.println();
        System.out.print("Write how many ml of water do you want to add: ");
        int waterAdd = scanner.nextInt();
        System.out.println();
        System.out.print("Write how many ml of milk do you want to add: ");
        int milkAdd = scanner.nextInt();
        System.out.println();
        System.out.print("Write how many grams of coffee beans do you want to add: ");
        int beansAdd = scanner.nextInt();
        System.out.println();
        System.out.print("Write how many disposable cups of coffee do you want to add: ");
        int cupsAdd = scanner.nextInt();
        System.out.println();
        water += waterAdd;
        milk += milkAdd;
        beans += beansAdd;
        cups += cupsAdd;
    }

    static boolean canMakeCoffee(int waterNeed, int milkNeed, int beansNeed) {
        if (water >= waterNeed) {
            if (milk >= milkNeed) {
                if (beans >= beansNeed) {
                    System.out.println("I have enough resources, making you a coffee\n!");
                    return true;
                } else {
                    System.out.println("Sorry, not enough beans!");
                    return false;
                }

            } else {
                System.out.println("Sorry, not enough milk!");
                return false;
            }
        } else {
            System.out.println("Sorry, not enough water!");
            return false;
        }
    }
}