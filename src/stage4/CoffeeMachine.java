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
    }

    static public void display() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(money + " of money");
    }

}

