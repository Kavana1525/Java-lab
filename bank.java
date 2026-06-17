class Bank {

    String bankName = "SBI Bank";
    String branch = "Bangalore";

    class Account {
        int accountNumber;
        String accountHolder;
        double balance;

        Account(int accountNumber, String accountHolder, double balance) {
            this.accountNumber = accountNumber;
            this.accountHolder = accountHolder;
            this.balance = balance;
        }

        void displayAccount() {
            System.out.println("----- Bank Details -----");
            System.out.println("Bank Name: " + bankName);
            System.out.println("Branch: " + branch);

            System.out.println("\n----- Account Details -----");
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolder);
            System.out.println("Balance: " + balance);
        }
    }

    public static void main(String[] args) {

        Bank bank = new Bank();
        Bank.Account acc = bank.new Account(1001, "Brunda", 50000);

        acc.displayAccount();
    }
}
