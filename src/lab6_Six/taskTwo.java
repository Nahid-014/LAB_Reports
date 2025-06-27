package lab6_Six;

class Person {
    void displayInfo() {
        System.out.println("I am a person.");
    }
}
class Doctor extends Person {
    void work() {
        System.out.println("I treat patients.");
    }
}
class Teacher extends Person {
    void work() {
        System.out.println("I teach students.");
    }
}
class Cricketer extends Person {
    void work() {
        System.out.println("I play cricket.");
    }
}
public class taskTwo{
    public static void main(String[] args) {
        Doctor doc = new Doctor();
        Teacher teach = new Teacher();
        Cricketer cri = new Cricketer();
        System.out.println("Doctor:");
        doc.displayInfo();
        doc.work();
        System.out.println("\nTeacher:");
        teach.displayInfo();
        teach.work();
        System.out.println("\nCricketer:");
        cri.displayInfo();
        cri.work();
    }
}