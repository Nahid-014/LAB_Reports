package lab1_One;

public class taskOne {
    public static void main(String[] args) {
        String name = "Fahimul Islam Nahid";
        String studentId = "E243014";
        int age = 20;
        String email = "fahimulislamnahid@gmail.com";
        String phone = "01781894796";
        String address = "Crossing, Karnaphuli, Chattogram";
        System.out.println("My Information:");
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);
        System.out.printf("\nFormatted Information:\nName: %s\nStudentID: %s\nAge: %d\nEmail: %s\nPhone: %s\nAddress: %s\n", name, studentId, age, email, phone,
        address);
    }
}