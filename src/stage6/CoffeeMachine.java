package stage6;

import java.util.Scanner;

public class CoffeeMachine {
    Scanner scanner = new Scanner(System.in);
    int water = 400;
    int milk = 540;
    int beans = 120;
    int cups = 9;
    int money = 550;
    boolean exit = false;

    public void buy() {
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

    public void fill() {
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

    public void take() {
        System.out.println("I gave you $" + money);
        money = 0;
    }

    public void remaining() {
        System.out.println();
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println("$" + money + " of money");
        System.out.println();
    }

    public boolean canMakeCoffee(int waterNeed, int milkNeed, int beansNeed) {
        if (water >= waterNeed && milk >= milkNeed && beans >= beansNeed) {
            System.out.println("I have enough resources, making you a coffee!");
            return true;
        } else if (water < waterNeed) {
            System.out.println("Sorry, not enough water!");
            return true;
        } else if (milk < milkNeed) {
            System.out.println("Sorry, not enough milk!");
        } else {
            System.out.println("Sorry, not enough beans!");
        }
        return false;
    }
}