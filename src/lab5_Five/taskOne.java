package lab5_Five;

class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;
    static String bankName = "Islami Bank";
    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    void displayAccountInfo() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
    static void showBankName() {
        System.out.println("Bank Name: " + bankName);
    }
}
public class taskOne {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(804, "Nahid", 14000);
        BankAccount account2 = new BankAccount(810, "Fahim", 3900);
        account1.displayAccountInfo();
        System.out.println();
        account2.displayAccountInfo();
        BankAccount.showBankName();
    }
}