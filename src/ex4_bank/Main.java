package ex4_bank;

public class Main {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("ACC-98765", 2500.00, 3.5);
        sa.displaySummary();
    }
}
