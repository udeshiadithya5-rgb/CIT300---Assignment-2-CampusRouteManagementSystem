package util;

import java.util.Scanner;

/**
 * InputValidator - Handles all user input validation
 * Owner: Adithya (23DA2-0366)
 * Package: util
 */
public class InputValidator {
    private static Scanner scanner = new Scanner(System.in);

    // Get valid integer input within range
    public static int getIntInput(String prompt, int min, int max) {
        int value;
        while (true) {
            System.out.print(prompt);
            try {
                String input = scanner.nextLine().trim();
                value = Integer.parseInt(input);
                if (value < min || value > max) {
                    System.out.println("! Invalid! Enter between " + min + " and " + max);
                    continue;
                }
                return value;
            } catch (NumberFormatException e) {
                System.out.println("! Invalid input! Please enter a number.");
            }
        }
    }

    // Get any integer
    public static int getIntInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("! Invalid input! Please enter a number.");
            }
        }
    }

    // Get non-empty string
    public static String getStringInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();
            if (!input.isEmpty()) return input;
            System.out.println("! Input cannot be empty!");
        }
    }

    // Get shared scanner
    public static Scanner getScanner() {
        return scanner;
    }
}