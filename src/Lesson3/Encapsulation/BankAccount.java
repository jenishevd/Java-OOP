package Lesson3.Encapsulation;

public class BankAccount {
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    public BankAccount(String name, String accNumber, double initialBalance) {
        this.accountHolderName = name;
        this.accountNumber = accNumber;
        if (initialBalance > 0){
            this.balance = initialBalance;
        }
    }

    // Getters
    public String getAccountHolderName(){
        return accountHolderName;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    // setter for account holder name(Changing name or surname)
    public void  setAccountHolderName(String name){
        if(name == null && !name.isEmpty()){
            this.accountHolderName = name;
        }
    }

    public void deposit(double amount){
        if (amount > 0){
            this.balance += amount;
            System.out.println("✅Deposited: " + amount);
        } else {
            System.out.println("❌Invalid or insufficient funds");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && this.balance >= amount){
            this.balance -= amount;
            System.out.println("✅ Withdrawn: " + amount);
        } else {
            System.out.println("❌Invalid or insufficient funds.");
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Daniiar Zhenishev", "KG123456",  1000);

        System.out.println("👤 Holder: " + account.getAccountHolderName());
        System.out.println("💳 Account Number: " + account.getAccountNumber());
        System.out.println("💰 Initial Balance: " + account.getBalance());

        // deposit
        account.deposit(500);
        System.out.println("💰 Balance after deposit: " + account.getBalance());

        // withdraw
        account.withdraw(200);
        System.out.println("💰 Balance after withdrawal: " + account.getBalance());

        // Trying to withdraw too much
        account.withdraw(2000);
    }
}
// With encapsulation:
// - Direct modification of fields like balance or accountHolderName is prevented (e.g., account.balance = -500; ❌)
// - All access is controlled through public methods that:
//     * validate inputs,
//     * prevent invalid values,
//     * and log actions.
