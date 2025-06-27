package lab2_Two;

import java.util.Scanner;
public class taskOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Mark: ");
        int num = sc.nextInt();
        if (num>0 && num<40) {
            System.out.println("Your Grade is: F");
        } else if (num>=40 && num<45) {
            System.out.println("Your Grade is: D");
        } else if (num>=45 && num<50) {
            System.out.println("Your Grade is: C");
        } else if (num>=50 && num<55) {
            System.out.println("Your Grade is: C+");
        } else if (num>=55 && num<60) {
            System.out.println("Your Grade is: B-");
        } else if (num>=60 && num<65) {
            System.out.println("Your Grade is: B");
        } else if (num>=65 && num<70) {
            System.out.println("Your Grade is: B+");
        } else if (num>=70 && num<75) {
            System.out.println("Your Grade is: A-");
        } else if (num>=75 && num<80) {
            System.out.println("Your Grade is: A");
        } else if (num>=80 && num<=100) {
            System.out.println("Your Grade is: A+");
        }
        sc.close();
    }
}