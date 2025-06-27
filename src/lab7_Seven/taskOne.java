package lab7_Seven;

public class taskOne {
    static int addition(int a, int b) {
        return a + b;
    }
    static double addition(double a, double b) {
        return a + b;
    }
    static int addition(int x, int y, int z) {
        return x + y + z;
    }
    public static void main(String[] args) {
        System.out.println("Using the first method");
        System.out.println(addition(10, 4));
        System.out.println("\nUsing the second method");
        System.out.println(addition(24.5, 4.7));
        System.out.println("\nUsing the third method");
        System.out.println(addition(7, 21, 14));
    }
}