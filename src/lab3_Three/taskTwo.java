package lab3_Three;

import java.util.Scanner;
public class taskTwo {
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int start = scanner.nextInt();
        System.out.print("Enter ending number: ");
        int end = scanner.nextInt();
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        int[] primeNumbers = new int[count];
        int index = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primeNumbers[index++] = i;
            }
        }
        System.out.println("Prime numbers in the given range:");
        for (int num : primeNumbers) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}