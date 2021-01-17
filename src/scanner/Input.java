package scanner;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter x: ");
        int x = scanner.nextInt();

        System.out.println("Enter y: ");
        long y = scanner.nextLong();

        long sum = x + y;
        System.out.println("sum: " + sum);

        double z = sum + y;
        System.out.println("Z: " + z);
    }
}
