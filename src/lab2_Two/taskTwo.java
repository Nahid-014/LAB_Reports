package lab2_Two;

import java.util.Scanner;
public class taskTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the fist number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter an Operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);
        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();
        double result;
        switch (operator) {
            case '+': result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-': result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*': result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2!= 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error! Division by zero.");
                }
                break;
            default: System.out.println("Invalid operator!");
        }
        sc.close();
    }
}
