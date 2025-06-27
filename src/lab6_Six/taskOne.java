package lab6_Six;

class Grandfather {
    void company() {
        System.out.println("Grandfather owns a company.");
    }
}
class Father extends Grandfather {
    void car() {
        System.out.println("Father owns a car.");
    }
}
class Son extends Father {
    void hobby() {
        System.out.println("Son plays eFootball.");
    }
}
public class taskOne {
    public static void main(String[] args) {
        Son son = new Son();
        son.company();
        son.car();
        son.hobby();
    }

}