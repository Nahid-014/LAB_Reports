package lab3_Three;

import java.util.Scanner;
public class taskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int start = scanner.nextInt();
        System.out.print("Enter ending number: ");
        int end = scanner.nextInt();
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        int[] evenNumbers = new int[count];
        int index = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                evenNumbers[index++] = i;
            }
        }
        System.out.println("Even numbers in the given range:");
        for (int num : evenNumbers) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}