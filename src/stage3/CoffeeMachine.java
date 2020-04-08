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
        int cupsWater = 0;
        int cupsMilk = 0;
        int cupsBeans = 0;
        if (waterLevel > water) {
            cupsWater = waterLevel / water;
            if (milkLevel > milk) {
                cupsMilk = milkLevel / milk;
            }
            if (beanLevel > beans) {
                cupsBeans = beanLevel / beans;
            }
        }
        int cupsMax = Math.min(Math.min(cupsWater, cupsMilk), cupsBeans);
        if (cupsNeed > cupsMax) {
            System.out.println("No, I can make only " + cupsMax + " cup(s) of coffee");
        } else if (cupsNeed < cupsMax) {
            System.out.println("Yes, I can make that amount of coffee (and even "
                    + (cupsMax - cupsNeed) + " more than that");
        } else {
            System.out.println("Yes, I can make that amount of coffee");
        }
    }
}