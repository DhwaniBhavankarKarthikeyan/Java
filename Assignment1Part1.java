package Assignment1Part1;

import java.util.Scanner;

public class FactorialCalculator {
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}

package Assignment1Part1;

import java.io.BufferedReader;
import java.io.Console;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Input1 {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        DataInputStream dataInputStream = new DataInputStream(System.in);

        System.out.println("Choose input method:");
        System.out.println("1. Command Line Arguments");
        System.out.println("2. Scanner");
        System.out.println("3. BufferedReader");
        System.out.println("4. DataInputStream");
        System.out.println("5. Console");

        try {
            int choice = Integer.parseInt(bufferedReader.readLine());

            switch (choice) {
                case 1:
                    if (args.length > 0) {
                        int number = Integer.parseInt(args[0]);
                        calculateAndPrintFactorial(number);
                    } else {
                        System.out.println("No command line argument provided.");
                    }
                    break;

                case 2:
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Enter a non-negative integer: ");
                    int numberScanner = scanner.nextInt();
                    calculateAndPrintFactorial(numberScanner);
                    break;

                case 3:
                    System.out.print("Enter a non-negative integer using BufferedReader: ");
                    int numberBufferedReader = Integer.parseInt(bufferedReader.readLine());
                    calculateAndPrintFactorial(numberBufferedReader);
                    break;

                case 4:
                    System.out.print("Enter a non-negative integer using DataInputStream: ");
                    int numberDataInputStream = Integer.parseInt(dataInputStream.readLine());
                    calculateAndPrintFactorial(numberDataInputStream);
                    break;

                case 5:
                    Console console = System.console();
                    if (console != null) {
                        System.out.print("Enter a non-negative integer using Console: ");
                        String inputConsole = console.readLine();
                        int numberConsole = Integer.parseInt(inputConsole);
                        calculateAndPrintFactorial(numberConsole);
                    } else {
                        System.out.println("Console is not available.");
                    }
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    private static void calculateAndPrintFactorial(int number) {
        if (number < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            long factorial = FactorialCalculator.calculateFactorial(number);
            System.out.println("Factorial of " + number + " is: " + factorial);
        }
    }
}
