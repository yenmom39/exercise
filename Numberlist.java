package test;

import java.util.Scanner;

public class Numberlist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

    
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            numbers[i] = scanner.nextInt();
        }

        
        System.out.println("Entered numbers:");
        for (int i = 0; i < n; i++) {
            System.out.println(numbers[i]);
        }

        scanner.close();
    }
}
