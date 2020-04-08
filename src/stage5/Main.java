package stage5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean loop = false;
        CoffeeMachine obj = new CoffeeMachine();
        while (!loop) {
            System.out.print("Write action (buy, fill, take, remaining, exit): ");
            String action = scanner.next();
            switch (action) {
                case "buy":
                    obj.buy();
                    break;
                case "fill":
                    obj.fill();
                    break;
                case "take":
                    obj.take();
                    break;
                case "remaining":
                    obj.remaining();
                    break;
                case "exit":
                    loop = true;
                    break;
            }
        }
    }
}
